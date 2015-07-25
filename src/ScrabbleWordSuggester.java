package Day6.Scrabble.src;

import java.util.ArrayList;

/**
 * Created by test on 7/25/2015.
 */
public class ScrabbleWordSuggester {

    String rack;
    String constraints;
    String outPutLimit;
    ArrayList<wordScorePair> maximumScoreWordList;

    public ScrabbleWordSuggester(){
        maximumScoreWordList = new ArrayList<>();
    }

    public ArrayList<wordScorePair> getMaximumScoreWords(String rack, String constraints, int outputLimit){

        ArrayList<String> validWords;
        ScoreGenerator scoreGenerator = new ScoreGenerator();

        ConstraintHandler constraintHandler = new ConstratintHandler();
        if(constraints.isEmpty())
            validWords = constraintHandler.fetchValidWords(rack, outputLimit);
        else
            validWords = constraintHandler.fetchValidWords(rack, constraints, outputLimit);


    }

    public static void main(String args[]){

    }
}

