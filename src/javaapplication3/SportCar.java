public class SportCar extends Car{
    private double newPrice;
    public SportCar(int Year, double Price){
        super(Year, Price);
    }

    @Override
    public double calculateSalePrice() {
        if (year>=2000){
            newPrice = 0.75*price;
        }
        if (year>=1995 && year<2000){
            newPrice = 0.5*price;
        }
        if (year<1995){
            newPrice = 0.25*price;
        }
        return newPrice;
    }
}
