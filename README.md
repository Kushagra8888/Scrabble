<h3>Input:</h3>
<ol>
<li>Letters in the rack as String</li>
<li>Number of top values(i.e, top n values) </li>
</ol>

<h3>Approach</h3>
<ol>
<li>Create a list of words(representedd by a class which holds it's score and the word itself)</li>
<li>Sort the list based on descending order of the scores <br /></li>
<li>Letters in the rack are compared with the list of words sorted based on their scores</li>
<li>The first "n" dictionary words that match the rack letters are stored in a list.</li>
<li>Team 1 returns this list as their output</li>
</ol>

<h3>Dealing with blank tiles</h3>
Team2:<br />
  Find a vector of pairs that contains all words that can be generated from the rack (which may contain any number of blank tiles) with their scores.<br />
  Once the words are found, subtract the score of the character that was actually a blank tile.<br />
  get the top n words.<br />

<h3>Added Constraints</h3>
Team 3 will deal with the additional constraints. <br/>
<ol>
<li>Get words with a specified length</li>
<li>Get words that contain specified letters</li>
</ol>
