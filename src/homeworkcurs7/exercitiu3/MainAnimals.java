package homeworkcurs7.exercitiu3;

public class MainAnimals {
    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println(cat.walk());
        System.out.println(cat.talk());
        System.out.println(cat.eat());

        Animal chicken = new Chicken();
        System.out.println("\n"+chicken.walk());
        System.out.println(chicken.eat());
        System.out.println(chicken.talk());

        Animal dog = new Dog();
        System.out.println("\n"+dog.talk());
        System.out.println(dog.walk());
        System.out.println(dog.eat());

        Animal duck = new Duck();
        System.out.println("\n" + duck.talk());
        System.out.println(duck.eat());
        System.out.println(duck.walk());

        Animal mouse = new Mouse();
        System.out.println("\n" + mouse.talk());
        System.out.println(mouse.walk());
        System.out.println(mouse.eat());


    }
}
