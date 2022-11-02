public class Baravelli extends CandyBox {
    float radius;
    float height;

    public Baravelli() {
//        this.radius = 0;
//        this.height = 0;
    }

    public Baravelli(String flavour, String origin, float radius, float height) {
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI) * this.radius * this.radius * this.height;
    }

    @Override
    public String toString() {
        return "Baravelli: The " + flavour + " " + origin + " chocolate has volume " + this.getVolume();
    }

    public void printBaravelliDim() {
        System.out.println("Baravelli: " + radius + " " + height);
    }

    public void printDim() {
        System.out.println("Baravelli: " + radius + " " + height);
    }
}
