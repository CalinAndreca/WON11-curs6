package homeworkcurs7.exercitiu3;

public class Duck implements Animal{
    @Override
    public String walk() {
        return "Duck is walking";
    }

    @Override
    public String talk() {
        return "Duck is speaking";
    }

    @Override
    public String eat() {
        return "Duck is eating";
    }
}
