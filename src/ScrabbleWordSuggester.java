//package Day6.Scrabble.src;

import java.util.*;

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

    public List<wordScorePair> getMaximumScoreWords(String rack, String constraints, int outputLimit){

        ArrayList<String> validWords;
        ArrayList<wordScorePair> wordScorePairList;
        ScoreGenerator scoreGenerator = new ScoreGenerator();

        ConstraintHandler constraintHandler = new ConstraintHandler();
        if(constraints.isEmpty())
            validWords = constraintHandler.fetchValidWords(rack);
        else
            validWords = constraintHandler.fetchValidWords(rack, constraints);

        wordScorePairList = scoreGenerator.getScoreofWordList(validWords);
        Collections.sort(wordScorePairList);

        return wordScorePairList.subList(0, outputLimit);

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String rack;
        String constraints;
        int outputsize;

        System.out.println("Enter Rack elements");
        rack = sc.nextLine();

        System.out.println("Enter constraints");
        constraints = sc.nextLine();

        System.out.println("Enter output size limit");
        outputsize = sc.nextInt();

        System.out.println("Got "+rack+" "+constraints+" "+outputsize);
    }
}

