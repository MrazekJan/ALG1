import java.util.Scanner;

public final class Numbers {

    private static Scanner sc = new Scanner(System.in);
    private static int MaxNumber;
    private static int SecondMax;

    private  static int Occurace;

    private Numbers(){

    }

    /**
     *
     * @param x in radians
     * @param precision
     * @return
     */
    public static double cos(double x, double precision){

        double cos;

        for (int i = 0; i < precision; i++) {

        }
        return 0;
    }
    public static void proccessSequence(){

        int value = sc.nextInt();

        if(MaxNumber == 0){
            MaxNumber = value;
            Occurace = 1;
        }

        else if (value > MaxNumber){
            SecondMax = MaxNumber;
            MaxNumber = value;
            Occurace = 1;
        }

        else if (value > SecondMax && value < MaxNumber){
            SecondMax = value;
        }

        else if ( value == MaxNumber){
            Occurace++;
        }

        System.out.println("Aktuální největší číslo: " + MaxNumber + " Druhý největší: " + SecondMax + " Výskyt největšího: " + Occurace);

    }
}
