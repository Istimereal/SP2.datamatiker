import java.util.ArrayList;

public class Author {

    private String name;
    public ArrayList<Title> titles;
    public Author(String name) {
        this.name = name;
       titles = new ArrayList<Title>();
    }

    public void addTitle(Title t)
    {
        titles.add(t);
    }

    public float calculateTotalPay() {
        float totalPay = 0;

        for (Title t : titles) {

            totalPay += t.calculateRoyalty();
        }
        return totalPay;
    }

    public String getName()
    {
        return this.name;
    }
}
