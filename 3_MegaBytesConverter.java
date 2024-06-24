public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(96);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {

        int toMegaBytes = kilobytes / 1024;
        int remaining = kilobytes % 1024;

        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilobytes + " KB = "
                    + toMegaBytes + " MB and " + remaining + " KB");
        }
    }
}
