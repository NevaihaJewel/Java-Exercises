public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Nevaiha");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the top score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newVal = 50;
        if (newVal == 50) {
            System.out.println("This is true!");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Honda";
        boolean isDomestic = makeOfCar == "Honda" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double firstVal = 20.00;
        double secVal = 80.00;
        double valTotal = (firstVal + secVal) * 100.00;
        System.out.println("Total of double values is: " + valTotal);
        double remainderVal = valTotal % 40.00;
        System.out.println("The remainder is: " + remainderVal);

        boolean remainResult = remainderVal == 0 ? true : false;
        System.out.println("The remainder is zero: " + remainResult);

        if (remainResult != true) {
            System.out.println("Got some remainder");
        }
    }
}
