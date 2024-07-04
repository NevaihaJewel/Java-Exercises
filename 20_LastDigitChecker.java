public class LastDigitChecker {
    public static void main(String[] args) {

        boolean sameLast = hasSameLastDigit(85, 15, 32);
        boolean notTheSame = hasSameLastDigit(56, 62, 78);
        boolean valid = isValid(56);
        boolean notValid = isValid(1001);

        System.out.println("Some of the three integers share a last digit: " + sameLast);
        System.out.println("Some of the three integers share a last digit: " + notTheSame);

        System.out.println("The number is valid: " + valid);
        System.out.println("The number is valid: " + notValid);
    }

    public static boolean hasSameLastDigit(int one, int two, int three) {

        boolean oneValid = one >= 10 && one <= 1000;
        boolean twoValid = two >= 10 && two <= 1000;
        boolean threeValid = three >= 10 && three <= 1000;

        if (!oneValid || !twoValid || !threeValid) {
            return false;
        }

        int oneLast = one % 10;
        int twoLast = two % 10;
        int threeLast = three % 10;

        boolean firstLastShared = oneLast == twoLast ||
                oneLast == threeLast;
        boolean secondLastShared = twoLast == oneLast ||
                twoLast == threeLast;
        boolean thirdLastShared = threeLast == oneLast ||
                threeLast == twoLast;

        if (firstLastShared || secondLastShared || thirdLastShared) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {

        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
