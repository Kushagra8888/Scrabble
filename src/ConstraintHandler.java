import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class ConstraintHandler
{
    Sowpods s;
    BlankSpaceHandler b;
    
    public ConstraintHandler()
    {
        s  = new Sowpods();
        b = new BlankSpaceHandler();
    }

    public ArrayList<String> fetchValidWords(String rack, String constraint, int length)
    {
        ArrayList<String> possibleWords;
        ArrayList<String> matchedWords = new ArrayList<>();
        String patternToCheck = "(.*)";
        if(!constraint.isEmpty())
        {
            patternToCheck = generateRegex(constraint);
            rack = modifyRack(rack, constraint);
        }
        ArrayList<String> modified_racks = b.getBlankSpaceReplacedRacks(rack);
        
        for (String rack : modified_racks)
        {
            possibleWords = s.getValidWordsFor(rack);
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
        return (constraint.replaceAll("*", "(.*)"));
    }
    
    private boolean isMatching(String word, String patternToCheck)
    {
        Pattern pattern = Pattern.compile(patternToCheck);
        Matcher matcher = pattern.matcher(word);
        return (matcher.find());
    } 
}
