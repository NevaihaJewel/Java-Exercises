public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int gcd = getGreatestCommonDivisor(80, 12);
        System.out.println("The greatest common divisor between the two number is: " + gcd);
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd = 1;
        int i = 1;

        while (i <= first || i <= second) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}
