public class BarkingDog {
    public static void main(String[] args) {

        shouldWakeUp(true, 6);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        System.out.println("The hour of the day is " + hourOfDay +
                " and the fact of the dog barking right now is " + barking);
        if (hourOfDay < 0 || hourOfDay > 23) {
            return barking = false;

        } else if (hourOfDay < 8 || hourOfDay > 22) {
            return barking == true;

        } else {
            return barking = false;

        }
    }
}
