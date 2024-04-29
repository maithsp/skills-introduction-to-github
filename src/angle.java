public class angle {
    public int hour;
    public int minute;

    public angle(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }

    public int calculangle(){
        if (hour-(minute/5)==0){
            return 0;
        }if (hour-(minute/5)==2 || hour-(minute/5)==-2 ){

            return 30;
        }if (hour-(minute/5)==1 || hour-(minute/5)==-1 ){

            return 15;
        }if (hour-(minute/5)==3 || hour-(minute/5)==-3 ){

            return 45;
        }if (hour-(minute/5)==4 || hour-(minute/5)==-4 ){

            return 60;
        }if (hour-(minute/5)==5 || hour-(minute/5)==-5 ){

            return 75;
        }if (hour-(minute/5)==6 || hour-(minute/5)==-6 ){
            return 90;
        }else{
            return 0;
        }
    }


    public static void main(String[] args){
        angle angle1=new angle(2,10);
        int finalangle=angle1.calculangle();
        System.out.printf("the angle is ; "+finalangle);
    }






}
