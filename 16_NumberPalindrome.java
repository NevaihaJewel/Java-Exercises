public class NumberPalindrome {
    public static void main(String[] args) {

        boolean palindrome = isPalindrome(1001);
        boolean palindrome2 = isPalindrome(5874);

        System.out.println("This number is a palindrome number: " + palindrome);
        System.out.println("This number is a palindrome number: " + palindrome2);
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int newNum = number;

        while (newNum != 0) {
            int lastDigit = newNum % 10;
            reverse = (reverse * 10) + lastDigit;
            newNum /= 10;
        }

        return reverse == number;
    }
}
