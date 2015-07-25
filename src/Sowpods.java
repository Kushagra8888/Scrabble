import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Sowpods 
{
	HashMap<String, String> sowpodAnagramMap = new HashMap<String, String>();
	public static final String fileName="src/sowpods.txt";
	
	public Sowpods() 
	{
		try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
 
			String word;
 
			while ((word = br.readLine()) != null) 
			{
				sowpodAnagramMap.put(sortWord(word), word);
			}
 
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}   
	}
	
	private String sortWord(String word)
	{
		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	
	private String fetchSowpodWordFor(String key)
	{
		return sowpodAnagramMap.get(key);
	}
	
	public static void main(String[] args) 
	{
		Sowpods sowpods = new Sowpods();
	}
    
    public ArrayList<String> getValidWords( String word ) {
        ArrayList<String> validWords = new ArrayList<String>();
        validWords.add("Hello");
        List<String> powerSets = new ArrayList<>();
        
        powerSets = generatePowerSets(word);
        String key = "";
        for ( String s: powerSets ) {
            key = sortWord(s);
        }
        return validWords;
    }
    
    private List<String> generatePowerSets(String word) 
    {
        List<String> powerSets = new ArrayList<>();
        return combo("", word, powerSets);
    }
    private List<String> combo(String prefix, String s, List<String> powerSets) 
    {
    
        int N = s.length();

        if ( prefix.length() > 1 ) {
            powerSets.add(prefix);
        }

        for (int i = 0 ; i < N ; i++) {
           combo(prefix + s.charAt(i), s.substring(i+1), powerSets);
        }
        return powerSets;
    }
}
