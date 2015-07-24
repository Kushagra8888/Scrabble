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

};
int main()
{
    ifstream file;
    string FILENAME = "sowpods.txt";
    string line = "";
    try {
		file.open(FILENAME.c_str());
		if (file.is_open()) {
            while ( getline (file,line) ) {
                // TODO sort the letters of the word
                // add to map
            }
            file.close();
        }
    }
	catch (std::ifstream::failure e) {
    	std::cerr << "Exception opening/reading/closing file\n";
  	}

    return 0;
}
