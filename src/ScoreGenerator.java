//package Day6.Scrabble.src;

import java.util.ArrayList;

/**
 * Created by test on 7/25/2015.
 */
public class ScoreGenerator {

    int individualCharScores[];

    public ScoreGenerator(){
        individualCharScores = new int[]{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    }

    public int getScoreForTheWord(String word){
        int score = 0;

        for (int i = 0; i < word.length(); i++) {
            score = score + individualCharScores[word.charAt(i) - 'a'];
        }
        return score;
    }

    public ArrayList<wordScorePair> getScoreofWordList(ArrayList<String> wordList){

        ArrayList<wordScorePair> wordScoreList = new ArrayList<>();

        for (int i = 0; i < wordList.size(); i++) {
            wordScoreList.add(new wordScorePair(wordList.get(i), getScoreForTheWord(wordList.get(i))));
        }

        return wordScoreList;
    }
}
