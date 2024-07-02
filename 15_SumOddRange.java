public class SumOddRange {
    public static void main(String[] args) {

        System.out.println("The sum of all odd numbers provided is: " + sumOdd(5, 50));
    }

    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {

        if (end >= start) {
            if (end > 0 && start > 0) {
                int sumResult = 0;

                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sumResult += i;
                    }
                }
                return sumResult;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
