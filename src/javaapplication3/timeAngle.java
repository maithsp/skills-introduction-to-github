import static java.lang.Math.sqrt;

public class timeAngle {
    private double h,m,nh,distance1,distance2,degree;
    public timeAngle(double hour, double minute){
        h=hour;
        m=minute;
        nh=h*(60.0/12.0);   ///putting the hour hand on the same base as the minute hand

        distance1=(sqrt(nh-m))*(sqrt(nh-m));        ///distance on one side in minutes (always positive with)
        distance2=(sqrt(nh-m-60))*(sqrt(nh-m-60));  ///distance on the other side

        if (distance1>distance2){       ///testing which distance is shorter
            degree=(360.0/60.0)*distance2;  ///if distance2 shorter : use it to calculate the shorter angle
        }
        if (distance1<distance2){
            degree=(360.0/60.0)*distance1;
        }
    }

    public double getDegree() {
        return degree;
    }
}
