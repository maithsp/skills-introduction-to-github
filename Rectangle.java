/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author maith
 */
public class Rectangle {
   private final String  color="blue";
   private static String sidecolor=" ";
   private double width,height;
    /**
     * @param args the command line arguments
     * 
     */
  /// final=constant  static --- it is connected to the class 
   public Rectangle(double wid, double ht){
       width=wid;
       height=ht;
       sidecolor=sidecolor+" "+" two colors";
   
   }
   public double getArea(){
       return height*width;
   }

    public String getColor() {
        return color;
    }

    public String getSidecolor() {
        return sidecolor;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        double w,h;
        Scanner keyboard=new Scanner(System.in);
      /*  System.out.println("Enter the width");
        w=keyboard.nextDouble();
        System.out.println("Enter the height");
        h=keyboard.nextDouble();*/
        Rectangle room1=new Rectangle(11,22);
        
        Rectangle room2=new Rectangle(20,30);
        
        System.out.println("Room 2 Height "+room2.getHeight()+" Width  "+room2.getWidth());
        System.out.println("Side color room 2  "+room2.getSidecolor());
        
        
        System.out.println("Room 1 Height "+room1.getHeight()+" Width  "+room1.getWidth());
        System.out.println("Side color room 1  "+room1.getSidecolor());
    
    }
    
}
