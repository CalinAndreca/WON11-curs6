package homeworkcurs7.exercitiu1;

public class Main {
    public static void main(String[] args) {
        Ad facebookAd = new FacebookAd();
        Company company1 = new Company(facebookAd);
        company1.advertise();

        Ad emailAd = new EmailAd();
        Company company2 = new Company(emailAd);
        company2.advertise();

        Ad printAd = new PrintAd();
        Company company3 = new Company(printAd);
        company3.advertise();

    }
}
