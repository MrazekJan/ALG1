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

        System.out.print(a[a.length-1] +"]");
    }

}
