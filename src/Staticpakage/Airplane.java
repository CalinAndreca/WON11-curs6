package Staticpakage;

public class Airplane {
    private static double gravityCoefficient;
    private String type;
    private double fuel;

    public static double getGravityCoefficient() {

        return gravityCoefficient;
    }

    public static void setGravityCoefficient(double gravityCoefficient) {
        Airplane.gravityCoefficient = gravityCoefficient;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getType() {
        gravityCoefficient++;
        return type;
    }

    public double getFuel() {
        return fuel;
    }
}
