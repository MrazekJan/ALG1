import static java.lang.Math.*;

public class BirthCode {
    public static boolean Calculate(int firstPart, int secondPart){
        final int DEVIDER = 11;
        boolean Isvalid = true;
        boolean IsInvalid = false;

        int birth_code = firstPart * 10000 + secondPart;
        int first_nine = birth_code / 10;

        int remainder = first_nine % DEVIDER;

        if(remainder == 10 && secondPart % 10 == 0)
        {
            return Isvalid;
        }
        else if( remainder == secondPart % 10)
        {
            return Isvalid;
        }

        return IsInvalid;
    }
}
