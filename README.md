<h3>Input:</h3>
<ol>
<li>Letters in the rack as String</li>
<li>Number of top values(i.e, top n values) </li>
</ol>

<h3>Approach</h3>
<ol>
<li>From the dictionary of words, create a map with sorted word as key and list of anagrams as value.</li>
<li>Given the input rack of words, form all possible sets (power set of rack). Eg: for {a,b,c}, power set is {{},{a},{b},{c},{ab},{bc},{ac},{abc}}.</li>
<h4>Dealing with blank tiles</h4>
<li>To handle the spaces, also form a power set considering the different combinations of blank spaces replaced. Eg: for {a,b,c, }, power set is
{{a*}, {b*}, {c*}, {ab*}, {bc*}, {ac*}, {abc*}}.</li>
<li>Now, compare the rack with the keys in the map and find the words with maximum score.</li>
<li>The words that match the rack letters are stored in a list in descending order of their scores.</li>
<li>In case of blank tiles, Find a vector of pairs that contains all words that can be generated from the rack (which may contain any number of blank tiles) with their scores.<br />
Once the words are found, subtract the score of the character that was actually a blank tile.<br />
And  get the top n words.<br /></li>
</ol>

Team 1 will be handling the core functionality of finding the first five words with maximum score which can be generated from a given rack.<br />
Team 2 will handle the cases where spaces are also generated as inputs in the rack.


<h3>Added Constraints</h3>
Team 3 will deal with the additional constraints. <br/>
<ol>
<li>Get words with a specified length</li>
<li>Get words that contain specified letters</li>
</ol>
