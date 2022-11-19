import java.util.Scanner;

public class NumbersInput {
    public static void Sync(){

        int count = 0;
        int totalvalue = 0;

        while (true)
        {
            System.out.println("Napiš číslo");
            Scanner sc = new Scanner(System.in);
            int value = Integer.valueOf(sc.nextLine());

            count += 1;
            totalvalue += value;

            System.out.println("Chceš dálší, áš si?");
            Scanner sc2 = new Scanner(System.in);
            String decision = sc2.nextLine();

            boolean IsNext = decision.equals("a");

            if(IsNext == false){
                break;
            }

        }
        System.out.println("Počet: " + count + " Avg hodnota: " + Double.valueOf(totalvalue /count));
    }
}
