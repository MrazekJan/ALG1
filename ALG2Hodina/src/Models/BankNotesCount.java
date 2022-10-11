package Models;

import java.util.Formatter;
import java.util.Scanner;

public class BankNotesCount {


    public static void CalculateSum(int moneyCount){

        int inMoneyCount = moneyCount;
        int banknote_1, banknote_2, banknote_5, banknote_10, banknote_20, banknote_50, banknote_100;

        banknote_100 = moneyCount / 100;

        moneyCount = moneyCount -(banknote_100 * 100);
        banknote_50 = moneyCount / 50;

        moneyCount = moneyCount -(banknote_50 * 50);
        banknote_20 = moneyCount / 20;

        moneyCount = moneyCount -(banknote_20 * 20);
        banknote_10 = moneyCount / 10;

        moneyCount = moneyCount -(banknote_10 * 10);
        banknote_5 = moneyCount / 5;

        moneyCount = moneyCount -(banknote_5 * 5);
        banknote_2 = moneyCount / 2;

        moneyCount = moneyCount -(banknote_2* 2);
        banknote_1 = moneyCount / 1;


        System.out.format("Pro: %d Kč je potřeba: \n", inMoneyCount);
        System.out.format("%12s %10d %10d %10d %10d %10d %10d \n", "Bankovky" ,100, 50, 20,10,5,2,1);
        System.out.format("%12s %10d %10d %10d %10d %10d %10d \n","Počty:" ,banknote_100, banknote_50, banknote_20, banknote_10, banknote_5, banknote_2, banknote_1);





    }
    public static void Sync(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej počet peněz");
        int moneyCount = Integer.parseInt(scanner.nextLine());

        CalculateSum(moneyCount);


    }
}

