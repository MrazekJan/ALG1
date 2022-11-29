
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public final class ArrayTools {
    private ArrayTools(){

    }

    public static int sum(int [] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }

        return sum;
    }

    public static int product(int [] a){
        int product = 1;
        for (int i = 0; i < a.length; i++){
            product *= a[i];
        }

        return product;
    }

    public static int max(int [] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int [] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static void print(int [] a){
        System.out.print("[");
        for (int i = 0; i < a.length -1; i++){
            System.out.print(a[i] + ", ");
        }

        System.out.println(a[a.length-1] +"]");
    }

    public static boolean IsAscending(int [] a){
        int current;
        for (int i =0; i < a.length;i++){
            current = a[i];
            if(i == a.length -1){
                break;
            }
            else if(current > a[i+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean IsDescending(int [] a){
        int current;
        for (int i =0; i < a.length;i++){
            current = a[i];
            if(i == a.length -1){
                break;
            }
            else if(current < a[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void ReverseArray(int [] a){
        for(int i = 0; i <= a.length / 2; i++){
            int firstValue =  a[i];
            int lastValue =  a[a.length - 1 -i];
            a[i] = lastValue;
            a[a.length - 1 -i] = firstValue;
        }

    }

    public static void ReverseArrayv2(int [] a){
        for(int i = a.length -1; i >= 0; i--){
            a[a.length-1-i] = a[i];
        }
    }

    public static int[] CreateRandomArray(int length, int min, int max){
        int [] a = new int[length];
        for(int i = 0; i < length; i++){
            Random rand = new Random();
            a[i] = rand.nextInt(min, max);
        }

        return a;

    }




}
