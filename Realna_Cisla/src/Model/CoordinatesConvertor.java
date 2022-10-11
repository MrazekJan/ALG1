package Model;

public class CoordinatesConvertor { //úloha 16
    public static void ConvertToPolar(double x, double y){ //úloha 16
        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double polar = Math.atan(y/x);
    }

    public static void ConvertToCartesian(double r,  double fi){
        double x =  r * Math.cos(fi);
        double y = r * Math.sin(fi);
    }
}
