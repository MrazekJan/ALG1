import java.util.Scanner;

public class Main{

    public static void main(String args[])
    {
        /*System.out.println("Zadej 3 hodnoty pro hod min a sec");
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(DateTimeTools.timeToSecods(h,m,s));*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej počet hodnot");
        int numbersCount = sc.nextInt();
        System.out.println("Zadávej hodnoty");
        for (int i = 0 ; i < numbersCount; i++){
            Numbers.proccessSequence();

        }

    }
}
