public class pr_16 {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double l = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        double area = 3.14 * r * r;
        double area1 = l * b;
        System.out.println("Area of Circle = " + area);
        System.out.println("Area of Rectangle = " + area1);
    }
}
