package fastrackit.homeworkcurs9.exercise1;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("apple");
        basket.add("orange");
        basket.add("banana");
        System.out.println("The basket contains " + basket.count() + " fruits.");
        System.out.println("The basket contains " + basket.customCount() + " fruits (custom count).");
        System.out.println("Is there a banana in the basket? " + basket.find("banana"));
        System.out.println("Removing banana... " + basket.remove("banana"));
        System.out.println("Is there a banana in the basket now? " + basket.find("banana"));
        System.out.println("The position of orange in the basket is: " + basket.position("orange"));
        System.out.println("The distinct fruits in the basket are: " + basket.distinct());
    }

}

