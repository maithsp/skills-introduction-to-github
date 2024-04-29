public class CarExhibition{
    private Car[] carList = new Car[0];
    private double TotalPrice=0;
    private int length;

    void addCar(Car C1){
        length = carList.length;        ///get current length of the list of car
        Car[] pastCarList = carList;    ///save current state of the list
        carList = new Car[length+1];    ///create a new empty list of cars matching the new required size
        for (int i=0 ; i<length ; i++){
            carList[i]=pastCarList[i];  ///copy past car list in the new empty one
        }
        carList[length]=C1;             ///add the new car
    }

    public double getTotalPrice() {
        for (int i=0 ; i< carList.length ; i++){
            TotalPrice += carList[i].calculateSalePrice();
        }
        return TotalPrice;
    }
}
