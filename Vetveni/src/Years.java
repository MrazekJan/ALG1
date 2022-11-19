public class Years {

    public static String CalculateLeapYear(int year){
        String leap_year = "Přestupný rok";
        String not_leap_year = "Není přestupný rok";

        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    return leap_year;
                }
                return  not_leap_year;
            }
            return leap_year;
        }

        return not_leap_year;
    }
}

