import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by test on 7/25/2015.
 */
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
}
