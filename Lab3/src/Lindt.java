public class Lindt extends CandyBox {
    float lenght;
    float width;
    float height;

    public Lindt() {
//        this.lenght = 0;
//        this.width = 0;
//        this.height = 0;
    }

    public Lindt(float length, float width, float height) {
        this.lenght = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(String flavour, String origin, float length, float width, float height) {
        super(flavour, origin);
        this.lenght = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return this.lenght * this.width * this.height;
    }

    @Override
    public String toString() {
        return "Lindt: The " + flavour + " " + origin + " chocolate has volume " + this.getVolume();
    }

    public void printLindtDim() {
        System.out.println("Lindt: " + lenght + " " + width + " " + height);
    }

    public void printDim() {
        System.out.println("Lindt: " + lenght + " " + width + " " + height);
    }
}
