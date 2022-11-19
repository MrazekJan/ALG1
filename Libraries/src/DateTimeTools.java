public final class DateTimeTools {

    final static int SECONDS_IN_HOUR = 3600;

    final static int SECONDS_IN_MINUTE = 60;

    private DateTimeTools() {
    }

    /* Calculate day of week using Zeller algorithm
      * @param hours
      * @param minutes
      * @param seconds
      * @return time in seconds
     */
    public static int timeToSecods(int hours, int minutes, int seconds){

        return hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
    }

    public static boolean isLeap(int year){
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}