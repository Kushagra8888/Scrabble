//package Day6.Scrabble.src;
import java.util.Arrays;

/**
 * Created by test on 7/25/2015.
 */
public class Sowpods 
{
	private String sortWord(String word)
	{
		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}
