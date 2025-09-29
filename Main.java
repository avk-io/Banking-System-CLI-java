import vehicle.*;

public class Main{
    public static void main(String[] args) {
        Bike myBike = new Bike(60,0,4);

        System.out.println("Initial Speed: "+ myBike.getSpeed());
        myBike.speedUp(10);
        System.out.println("After Speed Up: "+ myBike.getSpeed());
        myBike.applyBrake(3);
        System.out.println("After Brake: "+ myBike.getSpeed());
    }
}
            