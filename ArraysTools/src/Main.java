public class Main {
    public static void main(String[] args) {
        int [] a = {3,5,2};
        System.out.println("Součet: " + ArrayTools.sum(a));
        System.out.println("Součin: " + ArrayTools.product(a));
        System.out.println("Max: " + ArrayTools.max(a));
        System.out.println("Min: " + ArrayTools.min(a));
        ArrayTools.print(a);
    }
}