public class Main {
    public static void main(String[] args) {
        System.out.println(Divisible.IsDivisible(6,6));
        Triagle.IsBuidable(3,4,5);
        System.out.println(Years.CalculateLeapYear(1900));

        String str = "020805/2724";
        String parts[] = str.split("/");
        System.out.println(BirthCode.Calculate(Integer.parseInt(parts[0]), Integer.parseInt(parts[1])));
    }
}