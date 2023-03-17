package homeworkcurs7.exercitiu3;

public class Cat implements Animal{
    @Override
    public String walk() {
        return "Cat is walking";
    }

    @Override
    public String talk() {
        return "Cat makes Meow";
    }

    @Override
    public String eat() {
        return "Cat is eating";
    }
}
