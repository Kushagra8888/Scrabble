#Scrabble Best Word Finder

From a rack letters finds the highest scoring word that could me made out of the letters in the rack.

##Input:

-   Letters in the rack as String

##Output:

-   Number of top values(i.e, top n values)


##Data Structures

- A map called anagramCollections, with key => sorted word (String) , value => the list of anagrams that can be made out of that word. (List of Strings)
- A map called wordsOfLength, with key => wordLength (number) , value => the list of words of that length


##Core (Team1)

1. Read the dictionary file and populate the two maps.
2. Take a rack of letters as input.
3. Generate a power set of this set of letters.
4. For each set in the power set, sort the word formed by the letters in the set and check if it is present in anagramCollections.
5. If present store the the sorted word.
6. Find the n highest scoring words.


##Dealing with blank tiles (Team 2)

Find a vector of pairs that contains all words that can be generated from the rack (which may contain any number of blank tiles) with their scores.<br />
Once the words are found, subtract the score of the character that was actually a blank tile.<br />
get the top n words.

##Added Constraints (Team 3)

Team 3 will deal with the additional constraints.
Get words with a specified length
Get words that contain specified letters