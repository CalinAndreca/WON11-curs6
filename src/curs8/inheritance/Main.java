package curs8.inheritance;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(3);
        System.out.println(bike.getTyrePressure());
        bike.inflateTyre(6);
        System.out.println(bike.getTyrePressure());
        bike.inflateTyre(2);
        System.out.println(bike.getTyrePressure());

        MountainBike mountainBike = new MountainBike();
        System.out.println(mountainBike.getTyrePressure());

        CityBike cityBike = new CityBike(9);
        System.out.println(cityBike.getTyrePressure());

        System.out.println("\nArray example:");
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike(5);
        bikes[1] = new MountainBike();
        bikes[2] = new CityBike(9);

        Random r = new Random();
        for (Bike b : bikes){
            b.increaseSpeed(r.nextInt(100));
            System.out.println(b.getSpeed());
        }
    }
}
