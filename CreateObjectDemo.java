import java.awt.Point;
import java.awt.Rectangle;

public class CreateObjectDemo {
    public static void main(String[] args){

        Point originOne = new Point(23,94);


        Rectangle rectOne = new Rectangle(originOne.x,originOne.y,100,200);
        Rectangle rectTwo = new Rectangle(0,0,50,100);

        int area = rectOne.width* rectOne.height;
        System.out.println("Area of rectOne: "+ area);
        System.out.println("Width of rectone: "+rectOne.width);
        System.out.println("Height of rectone: "+rectOne.height);

        int area2 = rectTwo.width*rectTwo.height;
        System.out.println("Area of rectTwo: "+ area2);
        System.out.println("Width of rectTwo: "+rectTwo.width);
        System.out.println("Height of rectTwo: "+rectTwo.height);

        rectTwo.setLocation(originOne);

        System.out.println(("X position of rectTwo: " + rectTwo.x));
        System.out.println(("Y position of rectTwo: " + rectTwo.y));

        rectTwo.setLocation(40,72);
        System.out.println(("X position of rectTwo: " + rectTwo.x));
        System.out.println(("Y position of rectTwo: " + rectTwo.y));


        System.out.println(rectOne.x +"-----" + rectOne.y);
    }
} 
