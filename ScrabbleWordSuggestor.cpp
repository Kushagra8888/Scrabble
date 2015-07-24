#include <iostream>
#include <map>
#include <string>
#include <fstream>
#include <sstream>
#include <algorithm>
#include <vector>
#include <cmath>
#include <set>


using namespace std;

const int MAX_RACK_LENGTH = 7;

const int ALPHABET_SCORE[] = {1,3,3,2, 1,4,2,4, 1,8,5,1,3, 1,1,3,10, 1,1,1,1, 4,4,8,4, 10};

class ScrabbleWordSuggestor {

public:
    map< string, vector<string> > sowpods;
    map< int, vector<string> > scored_list;
    set < pair<string,int> > POWERSET_RACKS;

public:
    string RACK_STRING;

    ScrabbleWordSuggestor(string rack, ifstream& sowpodsFile) {
        generateSowpodsMap(sowpodsFile);
    }

    void generateSowpodsMap(ifstream &file) {
        string word;
        while(getline(file, word)) {
            if ( word.length() <=  MAX_RACK_LENGTH ) {
                insertInMap(getSortedString(word), word);
            }
        }
    }

    void insertInMap(string key, string value) {
        map<string, vector<string> >::iterator it = sowpods.begin();

        if( sowpods.count(key) ) {
            it = sowpods.find( key );
            (it->second).push_back(value);
        }

        else {
            vector<string> newVector;
            newVector.push_back(value);
            sowpods.insert ( std::pair<string, vector<string> >( key, newVector) );
        }
    }

    string getSortedString(string word) {
        std::string sortedWord = word;
        std::sort(sortedWord.begin(), sortedWord.end());
        return sortedWord;
    }



};
int main()
{
    ifstream file;
    string FILENAME = "sowpods.txt";
    string line = "";
    try {
		file.open(FILENAME.c_str());
		ScrabbleWordSuggestor scrabble("apple", file);

    }
	catch (std::ifstream::failure e) {
    	std::cerr << "Exception opening/reading/closing file\n";
  	}

    return 0;
}
