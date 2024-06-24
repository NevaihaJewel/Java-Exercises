public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(96203878);
    }

    public static void printYearsAndDays(long minutes) {

        int minPerHour = 60;
        int hoursPerDay = 24;
        int daysPerYear = 365;

        int minPerDay = hoursPerDay * minPerHour;
        int minPerYear = minPerHour * hoursPerDay * daysPerYear;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / minPerYear;
            long days = (minutes / minPerDay) % daysPerYear;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
