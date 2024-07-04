public class EvenDigitSum {
    public static void main(String[] args) {

        System.out.println("The even digit sum of given number: " + getEvenDigitSum(56));
        System.out.println("The even digit sum of given number: " + getEvenDigitSum(2));
        System.out.println("The even digit sum of given number: " + getEvenDigitSum(4023));
        System.out.println("The even digit sum of given number: " + getEvenDigitSum(89654));

    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;

            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
        return sum;
    }
}
