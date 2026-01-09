public class methodover {
    public int multiply(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public int multiply(int a, int b, int c) {
        int prod = a * b * c;
        return prod;
    }

    public static void main(String[] args) {
        methodover m = new methodover();
        int p = m.multiply(1, 2);
        System.out.println(p);
        p = m.multiply(1, 2, 3);
        System.out.println(p);
    }
}
