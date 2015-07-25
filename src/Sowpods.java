/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sowpods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author test
 */
public class Sowpods {

    /**
     * @param args the command line arguments
     */
    
    
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
    private String sortWord(String word)
    {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
    }
    
    private List<String> generatePowerSets(String word) {
        List<String> powerSets = new ArrayList<>();
        return combo("", word, powerSets);
    }
    private List<String> combo(String prefix, String s, List<String> powerSets) {
    
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
