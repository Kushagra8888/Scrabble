import java.util.ArrayList;

public class BlankSpaceHandler {

    ArrayList<String> spaceReplacedRack;
    char blankChar;

    public BlankSpaceHandler() {
        spaceReplacedRack = new ArrayList<String>();
        blankChar = '_';
    }

    public void generateRack(String rackWithSpaces) {


        if (rackWithSpaces.contains(Character.toString(blankChar))) {

            for (int i = 0; i < 26; i++) {
                String newRack = "";
                int j = 0;

                while (rackWithSpaces.charAt(j) != '_') {
                    newRack = newRack + rackWithSpaces.charAt(j);
                    j++;
                }

                newRack = newRack + (char) ('a' + i) + rackWithSpaces.substring(j + 1);

                generateRack(newRack);

            }

        } else {
            spaceReplacedRack.add(rackWithSpaces);
            return;
        }
    }

    public ArrayList<String> getBlankReplacedRacks(String rackWithSpaces) {
        generateRack(rackWithSpaces);
        return spaceReplacedRack;
    }

    public static void main(String args[]) {
        BlankSpaceHandler blankSpaceHandler = new BlankSpaceHandler();
        System.out.println(blankSpaceHandler.getBlankReplacedRacks("ab_"));
    }
}
