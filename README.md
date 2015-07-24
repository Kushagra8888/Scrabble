Input:<br />
Letters in the rack as String<br />
Number of top values(i.e, top n values) <br />

Create a list of words(representedd by a class which holds it's score and the word itself)<br />
Sort the list based on descending order of the scores <br />
Letters in the rack are compared with the list of words sorted based on their scores<br />
The first "n" dictionary words that match the rack letters are stored in a list.<br />
Team 1 returns this list as their output<br />

Team2:<br />
  Find a vector of pairs that contains all words that can be generated from the rack (which may contain spaces) with their     scores.<br />
  Once the words are found, subtract the score of the character that was actually a blank tile.<br />
  get the top n words.<br />
