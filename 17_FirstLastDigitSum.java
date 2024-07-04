public class FirstLastDigitSum {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(8963));
        System.out.println(sumFirstAndLastDigit(42));
        System.out.println(sumFirstAndLastDigit(8));
        System.out.println(sumFirstAndLastDigit(96327));
    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        int firstLastSum = firstDigit + lastDigit;

        if (number < 0) {
            return -1;
        } else {
            System.out.print("Sum of first and last digits of number: ");
        }

        return firstLastSum;
    }
}
