package Homework;

public class ProductApplication {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 3.25, 5, "Fruit");
        Product product2 = new Product("Toothbrush", 13.23, 10, "Personal Care");
        Product product3 = new Product("Sunglasses", 50.75, 0, "Accessories");

        System.out.println("Product 1:");
        System.out.println("Name: " + product1.getName());
        System.out.println("Price: " + product1.getPrice());
        System.out.println("Quantity: " + product1.getQuantity());
        System.out.println("Category: " + product1.getCategory());
        System.out.println("Has stock: " + product1.hasStock());
        System.out.println("Is Fruit category: " + product1.isCategory("Fruit"));

        System.out.println("\nProduct 2:");
        System.out.println("Name: " + product2.getName());
        System.out.println("Price: " + product2.getPrice());
        System.out.println("Quantity: " + product2.getQuantity());
        System.out.println("Category: " + product2.getCategory());
        System.out.println("Has stock: " + product2.hasStock());
        System.out.println("Is Personal Care category: " + product2.isCategory("Personal Care"));

        System.out.println("\nProduct 3:");
        System.out.println("Name: " + product3.getName());
        System.out.println("Price: " + product3.getPrice());
        System.out.println("Quantity: " + product3.getQuantity());
        System.out.println("Category: " + product3.getCategory());
        System.out.println("Has stock: " + product3.hasStock());
        System.out.println("Is Accessories category: " + product3.isCategory("Accessories"));
    }
}
