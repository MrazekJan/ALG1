package Models;

import java.util.Scanner;

public class ToSeconds {

    public static int Convert(int hours, int minutes, int seconds){

        int finalHours = (hours*3600) + (minutes*60) + seconds;
        return finalHours;
    }

    public static void Sync(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej počet hodin");
        int hours = Integer.parseInt(scanner.nextLine());

        System.out.println("Zadej počet minut");
        int minutes = Integer.parseInt(scanner.nextLine());

        System.out.println("Zadej počet sekund");
        int seconds = Integer.parseInt(scanner.nextLine());

        int finalSeconds = ToSeconds.Convert(hours, minutes, seconds);

        System.out.println(finalSeconds);
    }
}
