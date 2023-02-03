import java.util.ArrayList;
/**
 * Super class Limerick extends poem with abstract methods getSyllabels
 * and numLines
 */
public class Limerick extends Poem {
    ArrayList<String> lines = new ArrayList<>();
    /**
     * Constructor for objects of class Limerick
     */
    public Limerick(ArrayList<String> arr) {
        super();
        lines = arr;
    }
    @Override
    public int getSyllables(int lineNumber) {
        ArrayList temp = new ArrayList<String>();
        int syllabels = 0;
        String a = lines.get(lineNumber);
        String[] split = a.split(" ");
        for (int i = 0; i < a.length(); i++) {
            switch (a.toLowerCase().charAt(i)) {
                case 'a':
                    syllabels++;
                    break;
                case 'e':
                    syllabels++;
                    break;
                case 'i':
                    syllabels++;
                    break;
                case 'o':
                    syllabels++;
                    break;
                case 'u':
                    syllabels++;
                    break;
                default:
                    break;
            }
        }
        return syllabels;
    }
    @Override
    public int numLines() {
        int returner = lines.size();
        // for(int i = 0; i < lines.size(); i++)
        // {
        // for(int x = 0; x < lines.get(i).length(); x++)
        // {
        // if(lines.get(i).charAt(x) == ' ')
        // {
        // returner++;
        // }
        // }
        // }
        return returner;
    }
}
