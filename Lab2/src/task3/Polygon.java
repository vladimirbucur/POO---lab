package task3;
import java.util.Arrays;

public class Polygon {
    int n;
    Point[] points;

    public Polygon(int n) {
        this.n = n;
        this.points = new Point[n];
    }

    public Polygon(float[] numbers) {
        this(numbers.length / 2);
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(numbers[2 * i], numbers[2 * i + 1]);
//            points[i].x = numbers[2 * i];
//            points[i].y = numbers[2 * i + 1];
        }
    }

    public static void main(String[] args) {
        float[] numbers = {10, 15, 20, 25, 30, 35, 40};
        Polygon polygon = new Polygon(numbers);
        for (int i = 0; i < polygon.points.length; i++)
            polygon.points[i].showPoint();
    }
}
