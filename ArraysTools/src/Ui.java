import java.util.Scanner;

public class Ui {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Zadej počet hodnot");
        int length = sc.nextInt();
        System.out.println("Zadej hodnoty");
        int[] yourArray = readArray(length);
        ArrayTools.print(yourArray);

    }

    public static int[] readArray(int n){
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        return a;
    }

}

