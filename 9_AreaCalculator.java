public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println("The area of the circle is: " + area(9.45));
        System.out.println("The area of the rectangle is: " + area(6.32, 8.45));
    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }

        double circArea = Math.PI * (radius * radius);
        return circArea;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1.0;
        }

        double rectArea = x * y;
        return rectArea;
    }
}
