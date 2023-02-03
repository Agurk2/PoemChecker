import java.util.ArrayList;
public class Test {
    Haiku haik;
    ArrayList<String> haiArr = new ArrayList<>();
    Limerick lim;
    ArrayList<String> limArr = new ArrayList<>();
    /**
     * Constructor for objects of class Test
     */
    public Test() {
        limArr.add("There once was a very sad daddy,");
        limArr.add("Whose golf game was going quite badly.");
        limArr.add("He looked left and right");
        limArr.add("No ball was in sight.");
        limArr.add("I think that he needed a caddy!");
        lim = new Limerick(limArr);

        haiArr.add("An ocean voyage.");
        haiArr.add("As waves break over the bow,");
        haiArr.add("the sea welcomes me.");
        haik = new Haiku(haiArr);
    }

    public void testLim() {
        System.out.println("For line 2: " + lim.getSyllables(2));
        System.out.println("The number of lines: " + lim.numLines());
        System.out.println("Check against table");
        Poem.printRythmn(true);
        System.out.println();
        System.out.println("--------------");
        System.out.println();
        System.out.println("For line 2: " + haik.getSyllables(2));
        System.out.println("The number of lines: " + haik.numLines());
        System.out.println("Check against table");
        Poem.printRythmn(false);
    }
}
