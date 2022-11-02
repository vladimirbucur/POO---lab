public class ChocAmor extends CandyBox {
    float lenght;

    public ChocAmor() {
//        this.lenght = 0;
    }

    public ChocAmor(String flavour, String origin, float length) {
        super(flavour, origin);
        this.lenght = length;
    }

    @Override
    public float getVolume() {
        return this.lenght * this.lenght * this.lenght;
    }

    @Override
    public String toString() {
        return "ChocAmor: The " + flavour + " " + origin + " chocolate has volume " + this.getVolume();
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor: " + lenght);
    }

    public void printDim() {
        System.out.println("ChocAmor: " + lenght);
    }
}
