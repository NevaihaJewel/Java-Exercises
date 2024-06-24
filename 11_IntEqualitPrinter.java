public class IntEqualitPrinter {
    public static void main(String[] args) {

        printEqual(-8, 2, 0);
        printEqual(5, 5, 5);
        printEqual(3, 4, 6);
        printEqual(4, 5, 4);
    }

    public static void printEqual(int number1, int number2, int number3) {

        if (number1 < 0 || number2 < 0 || number3 < 0) {
            System.out.println("Invalid Value");
        } else if (number1 == number2 && number2 == number3 && number3 == number1) {
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number2 != number3 && number3 != number1) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
