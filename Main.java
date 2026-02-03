class a {
    int x = 10;
    private static int y = 20;
    static int z = 30;

    static class b {
        void display() {
            a obj = new a();
            System.out.println("x=" + obj.x);
            System.out.println("y=" + y);
            System.out.println("z=" + z);
        }
    }
}

class Main {
    public static void main(String args[]) {
        a.b obj = new a.b();
        obj.display();
    }
}