//package Day6.Scrabble.src;

/**
 * Created by test on 7/25/2015.
 */
public class wordScorePair implements Comparable{

    String word;
    int score;

    public wordScorePair(String word, int score){
        this.word = word;
        this.score = score;
    }
    public wordScorePair(String word){
        this.word = word;
        this.score = 0;
    }

    @Override
    public int compareTo(Object o) {

        wordScorePair pair = (wordScorePair)o;
        if(this.score == pair.score)
            return this.word.compareTo(pair.word);
        else
            return this.score - pair.score;

    }
}
