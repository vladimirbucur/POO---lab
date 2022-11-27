
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random(20);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        switch(taskNum) {
            case 1:
                // TODO: uncomment for Task1
                Car mercedes = new Car(20000, Car.CarType.MERCEDES, 2019);
                Car fiat = new Car(7000, Car.CarType.FIAT, 2020);
                Car skoda = new Car(12000, Car.CarType.SKODA, 2022);
                Dealership dealership = new Dealership();
                break;
            case 2:
                // TODO: uncomment for Task2
                Car mercedes1 = new Car(20000, Car.CarType.MERCEDES, 2010);
                Car mercedes2 = new Car(35000, Car.CarType.MERCEDES, 2015);

                Car fiat1 = new Car(3500, Car.CarType.FIAT, 2008);
                Car fiat2 = new Car(7000, Car.CarType.FIAT, 2010);

                Car skoda1 = new Car(12000, Car.CarType.SKODA, 2015);
                Car skoda2 = new Car(25000, Car.CarType.SKODA, 2021);

                dealership = new Dealership();
                int finalPrice = dealership.getFinalPrice(mercedes1);
                finalPrice = dealership.getFinalPrice(mercedes2);
                finalPrice = dealership.getFinalPrice(fiat1);
                finalPrice = dealership.getFinalPrice(fiat2);
                finalPrice = dealership.getFinalPrice(skoda1);
                finalPrice = dealership.getFinalPrice(skoda2);
                break;
            case 3:
                // TODO: uncomment for Task3
                dealership = new Dealership();
                Car mercedes3 = new Car(20000, Car.CarType.MERCEDES, 2019);
                // TODO: write solution for Task3 here
                dealership.negotiate(mercedes3, new Offer() {
                    @Override
                    public int getDiscount(Car car) {
                        int discount = (5 * car.getPrice()) / 100;
                        System.out.println("Applying Client discount: " + discount + " euros");
                        return discount;
                    }
                });
                break;
            case 4:
                // TODO: write solution for Task4 here
                ArrayList<Car> cars = new ArrayList<>();
                Car car1 = new Car(20000, Car.CarType.SKODA, 2019);
                Car car2 = new Car(30000, Car.CarType.MERCEDES, 2019);
                Car car3 = new Car(50000, Car.CarType.MERCEDES, 2021);
                Car car4 = new Car(10000, Car.CarType.FIAT, 2018);

                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
                cars.add(car4);

                for(Car car : cars)
                    System.out.println(car.toString());

                cars.removeIf((car) -> car.getPrice() > 25000);

                for(Car car : cars)
                    System.out.println(car.toString());
                break;
        }
    }
}