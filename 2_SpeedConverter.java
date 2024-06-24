public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(896.52);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        double kph = kilometersPerHour / 1.609;

        if (kph < 0) {
            return -1;
        } else {
            return Math.round(kph);
        }
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = "
                    + milesPerHour + " mi/h");
        }
    }
}
