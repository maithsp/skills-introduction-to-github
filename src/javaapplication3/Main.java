//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            ///Q1
        Car car1 = new ClassicCar(1998, 2000);
        Car car2 = new SportCar(2001,5000);
        CarExhibition list = new CarExhibition();
        list.addCar(car1);
        list.addCar(car2);
        System.out.println("total price : "+ list.getTotalPrice());
            ///Q1

            ///Q2
        MyRectangle rect = new MyRectangle(20,20,70,80);
        MyRectangle secondRect = new MyRectangle(30,30,60,70);
        System.out.println("area : "+ rect.area());
        System.out.println("overlapped area : "+ rect.overlap(rect,secondRect).area());
            ///Q2

            ///Q3
        timeAngle hm = new timeAngle(5,20);
        System.out.println("angle difference : "+ hm.getDegree());
            ///Q3
    }
}