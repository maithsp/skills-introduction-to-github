import java.time.Year;

public class ClassicCar extends Car{
    public ClassicCar(int Year, double Price){
        super(Year, Price);
    }

    @Override
    public double calculateSalePrice() {
        return 10000;
    }
}
