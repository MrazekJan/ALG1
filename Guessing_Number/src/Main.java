import java.util.Scanner;
import java.util.Random;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static int lowerbound = 1;
    public static int upperbound = 1000000;
    public static void main(String[] args) {
        int choice;
        boolean end = false;

        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    computerGuess();
                    break;
                case 2:
                    userGuess();
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    System.out.println("Nevalidní volba");
            }
        } while (!end);
    }

    private static void userGuess() {

        Random rand = new Random();
        int secretNumber = rand.nextInt(lowerbound, upperbound +1);
        boolean end = false;

        do {
            System.out.println("Zadej číslo, co si myslim");
            int myGuess = sc.nextInt();

            if(secretNumber > myGuess){
                System.out.println("Číslo je větčší");
            }
            else if (secretNumber < myGuess) {
                System.out.println("Číslo je menší");
            }
            else{
                end = true;
                System.out.println("Číslo je treba");
            }
        }
        while (!end);
        }

    private static void computerGuess() {

        int min = lowerbound;
        int max = upperbound;
        boolean end = false;

        System.out.println("Vymysli si číslo more v rozshahu " + lowerbound + "-" + upperbound);
        do{
            Scanner sc = new Scanner(System.in);

            int computer_guess = (min + max) / 2;

            System.out.println("More, mysliš si číslo " + computer_guess + "?");
            System.out.println("More odpověz: -1 je menší, 1 je vetší, 0 treba");

            int answer = sc.nextInt();

                switch (answer){
                    case -1: max = computer_guess -1; break;
                    case 1 : min = computer_guess + 1; break;
                    case 0: end = true;
                        System.out.println("TREfA MORE");

                }
        }
        while (!end);
    }

    private static void displayMenu() {
        System.out.println("********************");
        System.out.println("* Hra: Hádej číslo *");
        System.out.println("* 0. Konec         *");
        System.out.println("* 1. Hádá počítač  *");
        System.out.println("* 2. Hádá hráč     *");
        System.out.println("********************");

    }
}