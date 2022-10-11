package Model;

/**
 * * test case
 * *
 * *
 */
public class AverageTemperature { //úloha 7
    public static void Calculate(double[] values){
        int big_value = 2;
        double values_count = values[0] + values[1] + (values[2] * big_value);
        System.out.println("Hodnoty " + values_count / 4);

        }
    }
