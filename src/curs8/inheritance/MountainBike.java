package curs8.inheritance;

public class MountainBike extends Bike{
    private int suspensionStrength;

    public MountainBike(){
        super(6);
    }

    public int getSuspensionStrength() {
        this.tyrePressure = 0;
        return suspensionStrength;
    }

    public void setSuspensionStrength(int suspensionStrength) {
        this.suspensionStrength = suspensionStrength;
    }
}
