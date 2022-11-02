import java.util.Objects;

public class CandyBox {
    String flavour;
    String origin;

    public CandyBox() {
        this.flavour = "sugar-free";
        this.origin = "Switzerland";
    }

    public CandyBox(String flavour, String origin) {
        this.flavour = flavour;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    public String toString() {
        return "The " + flavour + " " + origin + " chocolate";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavour, candyBox.flavour) && Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavour, origin);
    }

    public void printDim() {

    }
}
