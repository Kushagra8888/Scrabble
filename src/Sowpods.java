import java.util.Arrays;

public class Sowpods 
{
	private String sortWord(String word)
	{
		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	
	

}
