#include<iostream>
#include<map>
#include<algorithm>
#include<set>
#include<vector>
using namespace std;

class ScrabbleWordSuggestor {

public:
    map< string, vector<string> > sowpods;
    map< int, vector<string> > wordsOfLength;

      void generatePowerSetOfRack( string rack, set<string>& power_set ) {
        int set_size = rack.length();
        unsigned int pow_set_size = pow(2, set_size);
        int counter, j;
        string subset;
        int multiplicationFactor;

        for(counter = 1; counter < pow_set_size; counter++) {
            subset = "";


            for(j = 0; j < set_size; j++) {
                multiplicationFactor = pow (2, j);
                if(counter & (1 * multiplicationFactor))
                    subset += rack[j];
            }
            power_set.insert(subset);
        }
    }

};
int main()
{
	
	// map<>
	// getchar();
	return 0;
}
