public abstract class Car {
    protected int year;
    protected double price;
    public Car(int Year, double Price){
        year = Year;
        price = Price;
    }

    public abstract double calculateSalePrice();
}
