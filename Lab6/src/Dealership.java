import java.time.Year;
import java.util.Random;

public class Dealership {
    private final static int CURRENT_YEAR = Year.now().getValue();
    private static final Random random = new Random(20);

    static class BrandOffer implements Offer {
        int discount;
        @Override
        public int getDiscount(Car car) {
            if (car.getCarType().equals(Car.CarType.MERCEDES)) {
                discount = (5 * car.getPrice()) / 100;
            }
            if (car.getCarType().equals(Car.CarType.FIAT)) {
                discount = (10 * car.getPrice()) / 100;
            }
            if (car.getCarType().equals(Car.CarType.SKODA)) {
                discount = (15 * car.getPrice()) / 100;
            }
            System.out.println("Applying Brand discount: " + discount + " euros");
            return discount;
        }
    }

    static class DealerOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int discount;
            if (car.getCarType().equals(Car.CarType.MERCEDES)) {
                discount = 300 * (CURRENT_YEAR - car.getYear());
                System.out.println("Applying Dealer discount: " + discount + " euros");
                return discount;
            }
            if (car.getCarType().equals(Car.CarType.FIAT)) {
                discount = 100 * (CURRENT_YEAR - car.getYear());
                System.out.println("Applying Dealer discount: " + discount + " euros");
                return discount;
            }
            if (car.getCarType().equals(Car.CarType.SKODA)) {
                discount = 150 * (CURRENT_YEAR - car.getYear());
                System.out.println("Applying Dealer discount: " + discount + " euros");
                return discount;
            }
            return 0;
        }
    }

    static class SpecialOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int discount = random.nextInt(1000);
            System.out.println("Applying Special discount: " + discount + " euros");
            return discount;
        }
    }

    public int getFinalPrice(Car car) {
        BrandOffer brandOffer = new BrandOffer();
        DealerOffer dealerOffer = new DealerOffer();
        SpecialOffer specialOffer = new SpecialOffer();

        int price = car.getPrice();
        price = price - brandOffer.getDiscount(car);
        price = price - dealerOffer.getDiscount(car);
        price = price - specialOffer.getDiscount(car);

        return price;
    }

    public void negotiate(Car car, Offer offer) {
        offer.getDiscount(car);
    }
}
