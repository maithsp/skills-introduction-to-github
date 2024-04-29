package rectangle;
import java.util.Random;

public class Lottery {
    private int [] lotteryNumber = new int[5];
    public Lottery(){
        for (int i = 0; i < lotteryNumber.length;i++) {
            Random ra = new Random();
            int num1;
            num1 = ra.nextInt(9);
            lotteryNumber[i]=num1;
        }
    }
    public int compare(int [] lotteryCustomer){
        int count = 0;
        for(int i=0; i < lotteryNumber.length; i++) {

            if(lotteryCustomer[i] == lotteryNumber[i]) {
                count = count + 1;
            }
            else{
            }
        }
        return (count);
    }
    public int [] getLotteryNumber(){
        return lotteryNumber;
    }

}
