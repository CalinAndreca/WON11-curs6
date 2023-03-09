package Homework;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alina", 54, true);
        Person person2 = new Person("Vasile", 30, false);
        Person person3 = new Person("Ionut", 45, true);

        System.out.println("Person 1 - Name " + person1.getName() + ", Age: " + person1.getAge() + ", Married: " + person1.isMarried());
        System.out.println("Person 1 - Name " + person2.getName() + ", Age: " + person2.getAge() + ", Married: " + person2.isMarried());
        System.out.println("Person 1 - Name " + person3.getName() + ", Age: " + person3.getAge() + ", Married: " + person3.isMarried());
    }
}
