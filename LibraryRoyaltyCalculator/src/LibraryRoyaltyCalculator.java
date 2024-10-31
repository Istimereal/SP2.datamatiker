import java.util.ArrayList;

public class LibraryRoyaltyCalculator {


    public static void main(String[] args) {

        Author author1 = new Author("Stephen King");

    // ArrayList<Title> titles = new ArrayList<>();
// PrintedBook("Dark Tower", "Fiction", 20, 600);

    PrintedBook printedBookStephen1 = new PrintedBook
            ("Dark Tower", "SKØN", 20, 600);
    PrintedBook printedBookStephen2 = new PrintedBook
            ("Dark Tower 2", "TE", 15, 75);
    AudioBook audioBookStephen1 = new AudioBook
            ("Dark Tower 3", "SKØN", 5, 1020);

    author1.addTitle(printedBookStephen1);
    author1.addTitle(printedBookStephen2);
    author1.addTitle(audioBookStephen1);
    author1.addTitle(new AudioBook("Dark Tower5", "SKØN", 22, 522));


        System.out.println(author1.getName() + ": " + author1.calculateTotalPay() + " Kr.");

    }
}
