package Model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int count = num2 + num1;
        int product = num2 * num1;

        System.out.println(count  + " " + product);

    }
}