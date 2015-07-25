
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
public class ConstraintHandler {
    Sowpods s;
    BlankSpaceHandler b;
    
    public ConstraintHandler()
    {
        s  = new Sowpods();
        b = new BlankSpaceHandler();
    }

    public ArrayList<String> fetchValidWords(String rack, String constraint)
    {
        ArrayList<String> possibleWords;
        ArrayList<String> matchedWords = new ArrayList<>();
        String patternToCheck = "(.*)";
        if(!constraint.isEmpty())
        {
            patternToCheck = generateRegex(constraint);
            rack = modifyRack(rack, constraint);
        }
        System.out.println("Pattern: " + patternToCheck);
        System.out.println("Modified Rack: " + rack);
        ArrayList<String> modified_racks = b.getBlankReplacedRacks(rack);
        
        System.out.println(modified_racks);
        for (String each_rack : modified_racks)
        {
            possibleWords = s.getValidWordsFor(each_rack);
            for( String word: possibleWords)
            {
                if(isMatching(word, patternToCheck))
                {
                    matchedWords.add(word);
                }
            }
        }
        return matchedWords;
    }
    
    private String modifyRack(String rack, String constraint)
    {
        return rack + constraint.replaceAll("[^a-z]", "");
    }
    
    private String generateRegex(String constraint)
    {
        return (constraint.replaceAll("\\*", "(.*)"));
    }
    
    private boolean isMatching(String word, String patternToCheck)
    {
        Pattern pattern = Pattern.compile(patternToCheck);
        Matcher matcher = pattern.matcher(word);
        return (matcher.find());
    } 

    /*public static void main(String args[])
    {
        ConstraintHandler constraintHandler = new ConstraintHandler();
        
        System.out.println(constraintHandler.fetchValidWords("abcd_", "*a.c"));
    }*/
}