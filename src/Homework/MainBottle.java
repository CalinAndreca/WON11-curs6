package Homework;

public class MainBottle {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(1000, 500);
        System.out.println("Available liquid: " + bottle.getAvailableLiquid());
        System.out.println("Empty capacity: " + bottle.getEmptyCapacity());
        System.out.println("Opening bottle: " + bottle.open());
        System.out.println("Drinking 300 ml: " + bottle.drink(300));
        System.out.println("Drinking 200 ml: " + bottle.drink(200));
        System.out.println("Drinking 300 ml: " + bottle.drink(300));
        System.out.println("Closing bottle: " + bottle.close());
    }
}
