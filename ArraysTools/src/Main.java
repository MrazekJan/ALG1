public class Main {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        System.out.println("Součet: " + ArrayTools.sum(a));
        System.out.println("Součin: " + ArrayTools.product(a));
        System.out.println("Max: " + ArrayTools.max(a));
        System.out.println("Min: " + ArrayTools.min(a));
        System.out.println("Je vzestupné? " + ArrayTools.IsAscending(a));
        System.out.println("Je sestupné? " + ArrayTools.IsDescending(a));
        ArrayTools.print(a);
        ArrayTools.ReverseArray(a);
        ArrayTools.print(a);
        ArrayTools.print(ArrayTools.CreateRandomArray(5,1,100));
    }
}