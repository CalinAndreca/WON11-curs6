package homeworkcurs7.exercitiu1;

public class Company {
    private Ad advertisement;
    public Company(Ad advertisement){
        this.advertisement = advertisement;
    }

    public void advertise(){
        advertisement.display();
    }
}
