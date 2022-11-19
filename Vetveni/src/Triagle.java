public class Triagle {
    public static void IsBuidable(double a, double b, double c){
        boolean buildable = ((a +b ) > c) && ((Math.abs(a) - Math.abs(b) ) < c);
        System.out.println(buildable? "Je" : "Není");
    }

}
