public class Area {
    CandyBag candyBag;
    int number;
    String street;
    String message;

    public Area() {
        this.number = 0;
        this.street = "nowhere";
        this.message = "nowhere";
    }

    public Area(int number, String street, String message, CandyBag candyBag) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
        this.message = message;
    }

    public void getBirthdayCard() {
        System.out.println("Street " + street + ", number " + number);
        System.out.println("\n" + message + "\n");

        for (CandyBox candy : candyBag.candies) {
            if (candy instanceof Lindt)
                ((Lindt)candy).printLindtDim();
            if (candy instanceof Baravelli)
                ((Baravelli)candy).printBaravelliDim();
            if (candy instanceof ChocAmor)
                ((ChocAmor)candy).printChocAmorDim();
        }
    }

    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", number " + number);
        System.out.println("\n" + message + "\n");

        for (CandyBox candy : candyBag.candies)
            candy.printDim();
    }
}
