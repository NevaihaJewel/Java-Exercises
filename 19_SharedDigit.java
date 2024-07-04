public class SharedDigit {
    public static void main(String[] args) {

        boolean sharedDigit = hasSharedDigit(56, 75);
        boolean sharedDigit2 = hasSharedDigit(31, 75);

        System.out.println("The number given has shared digits: " + sharedDigit);
        System.out.println("The number given has shared digits: " + sharedDigit2);
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {

        boolean firstDigit = numberOne > 9 && numberOne < 100;
        boolean secondDigit = numberTwo > 9 && numberTwo < 100;

        if (!firstDigit || !secondDigit) {
            return false;
        }

        int firstLeftDigit = numberOne / 10;
        int firstRightDigit = numberOne % 10;
        int secondLeftDigit = numberTwo / 10;
        int secondRightDigit = numberTwo % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit ||
                firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit ||
                firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }
}
