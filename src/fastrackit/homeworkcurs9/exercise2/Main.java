package fastrackit.homeworkcurs9.exercise2;

import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        FlowerBouquet bouquet = new FlowerBouquet();
        bouquet.add("rose");
        bouquet.add("tulip");
        bouquet.add("lily");
        bouquet.add("daisy");

        System.out.println("All flowers: " + bouquet.getAll());
        bouquet.remove("tulip");
        System.out.println("All flowers after removing tulip: " + bouquet.getAll());
    }
}
