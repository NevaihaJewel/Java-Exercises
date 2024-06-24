public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println("All three numbers has an equal sum: " + hasEqualSum(5, 3, 8));
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {

        int result = firstNum + secondNum;

        if (result == thirdNum) {
            return true;
        } else {
            return false;
        }
    }
}
