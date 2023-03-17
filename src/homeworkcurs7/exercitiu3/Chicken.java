package homeworkcurs7.exercitiu3;

public class Chicken implements Animal {
    @Override
    public String walk() {
        return "Chicken is walking";
    }

    @Override
    public String talk() {
        return "Chicken is talking";
    }

    @Override
    public String eat() {
        return "Chicken is eating";
    }
}
