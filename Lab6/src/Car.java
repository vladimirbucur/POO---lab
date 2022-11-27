public class Car {
    enum CarType {
        MERCEDES,
        FIAT,
        SKODA
    }
    private int price;
    private CarType carType;
    private int year;

    public Car(int price, Car.CarType carType, int year) {
        this.carType = carType;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", carType=" + carType +
                ", year=" + year +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
