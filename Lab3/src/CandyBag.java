import java.util.*;

public class CandyBag {
    ArrayList<CandyBox> candies = new ArrayList<>(6);

    public CandyBag() {
        candies.add(new Lindt("Austria", "cherry", 20, (float)5.4, (float)19.2));
        candies.add(new Lindt("Austria", "apricot", 20, (float)5.4,(float)19.2));
        candies.add(new Lindt("Austria", "strawberry", 20, (float)5.4,(float)19.2));
        candies.add(new Baravelli("Italy", "grape", (float)6.7, (float)8.7));
        candies.add(new ChocAmor("France", "coffee", (float)5.5));
        candies.add(new ChocAmor("France", "vanilla", (float)5.5));
    }

    public ArrayList<CandyBox> getCandies() {
        return candies;
    }

    public void setCandies(ArrayList<CandyBox> candies) {
        this.candies = candies;
    }
}
