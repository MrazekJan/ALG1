package Model;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Locale.setDefault(new Locale("en", "US")); // cs CZ
        int a = 9;
        int b = 2;

        System.out.println(a/b);
        System.out.println((double)a/b);

        double aa = 5;
        System.out.println(aa);
        int bb = (int)5.6;
        System.out.println(bb);

        double n1 = 5.6;
        double n2 = 5.8;

        System.out.println(n1 +n2);

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Zadejte hodiny, minuty, sekundy");
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());
        int seconds = Integer.parseInt(sc.nextLine());


        LocalTime time_start = LocalTime.of(0, 0, 0);
        LocalTime time_stop  = LocalTime.of(hours, minutes, seconds);
        int max_speed = 50;
        int distance = 10;
        */
        AverageTemperature.Calculate(new double[]{23, 25 ,27.5});
        //VehicleSpeed.Calculate(max_speed, distance,time_start, time_stop);
        Alcohol.Calculate(1000, 5, 60,"m");
        CoordinatesConvertor.ConvertToPolar(5,10);
        CoordinatesConvertor.ConvertToCartesian(30,90);


    }
}