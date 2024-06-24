public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println("One of the three people are a teen: " + hasTeen(19, 34, 23));
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {

        int teen[] = {ageOne, ageTwo, ageThree};

        if (isTeen(ageOne) || isTeen(ageTwo) || isTeen(ageThree)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int teen) {

        if (teen > 12 && teen < 20) {
            return true;
        } else {
            return false;
        }
    }
}
