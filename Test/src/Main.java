import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {
    public static void main(String[] args) { //úloha 29

        int numA = 18416;
        int numB = 17296;

        boolean result = AreFriendly(numA, numB);

        if(result) System.out.println("Čísla jsou spřátelená");
        else System.out.println("Čísla nejsou spřátelená");
    }
    public static int SumFactors(int number){
        int i = 1;
        int sum = 0;
        while (i <= number/2){
            if(number%i == 0){
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static boolean AreFriendly(int numA, int numB){
        int sumFactorsA = SumFactors(numA);
        int sumFactorsB = SumFactors(numB);

        if(sumFactorsA == numB && sumFactorsB == numA){
            return true;
        }
        else return false;
    }

    @Test
    void TestFriendlyNumbers() {
        int numA = 9437056;
        int numB = 9363584;

        assertTrue(AreFriendly(numA, numB));
    }
}