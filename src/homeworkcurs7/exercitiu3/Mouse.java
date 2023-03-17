package homeworkcurs7.exercitiu3;

public class Mouse implements Animal{
    @Override
    public String walk() {
        return "Mouse is walking";
    }

    @Override
    public String talk() {
        return "Mouse is speaking";
    }

    @Override
    public String eat() {
        return "Mouse is eating";
    }
}
