public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println("The first and second numbers are equivalent: "
                + areEqualByThreeDecimalPlaces(5.63, 89.14));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        num1 = (long) (num1 * 1000);
        num2 = (long) (num2 * 1000);

        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}
