public class PlayingCat {
    public static void main(String[] args) {

        System.out.println("The cat is playing: " + isCatPlaying(false, 32));
        System.out.println("The cat is playing in summer: " + isCatPlaying(true, 55));
    }

    public static boolean isCatPlaying(boolean summer, int temp) {

        if (temp >= 25 && temp <= 35) {

            return true;
        } else if (summer) {

            if (temp >= 25 && temp <= 45) {
                return true;
            } else {
                return false;
            }
        } else {

            return false;
        }

    }
}
