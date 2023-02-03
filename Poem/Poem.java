/**
 * Abstract class Poem has abstract methods getSyllables and numLines. It 
 * also contains concrete method printRythmn
 */
public abstract class Poem {
    /**
     * @returns the amount of syllabels in a line defined as the amount of
     * a, e, i, o, and u that the line contains
     */
    public abstract int getSyllables(int lineNumber); 
    public abstract int numLines(); // Returns the amount of lines
    /**
     * Print the requirements for a limerick or haiku
     */
    public static void printRythmn(Boolean lim) {
        if (lim) { // True if it's a limerick being tested
            System.out.println("    Limerick");
            System.out.println();
            System.out.println("Syllabels");
            System.out.println("1st line: 7-10");
            System.out.println("2nd line: 7-10");
            System.out.println("3rd line: 5-7");
            System.out.println("4th line: 5-7");
            System.out.println("5th line: 7-10");
        } else { // False if it's a haiku being tested
            System.out.println("    Haiku");
            System.out.println();
            System.out.println("Syllabels");
            System.out.println("1st line: 5");
            System.out.println("2nd line: 7");
            System.out.println("3rd line: 5");
        }
    }
}
