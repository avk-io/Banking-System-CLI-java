import vehicle.*;

public class MountainBike extends Bike{
    public int seatHeight;

    public MountainBike(int startHeight,int startCadence,int startSpeed,int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void seatHeight(int newValue){
        seatHeight = newValue;
    }
}
