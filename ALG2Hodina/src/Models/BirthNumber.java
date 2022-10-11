package Models;

public class BirthNumber {


    public static void Calculate(){
        String birthCode = "0208052724";
        var year = birthCode.length() > 2 ? birthCode.substring(0, 2) : null;
        var month = birthCode.length() > 4  ? birthCode.substring(2, 4) : null;
        var day = birthCode.length() > 6  ? birthCode.substring(4, 6) : null;


    }

    public static void Sync(){
        Calculate();

    }
}
