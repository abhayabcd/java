class a {
    int x = 10;
    private static int y = 20;
    static int z = 30;

    class b {
        void display() {
            System.out.println("x=" + x);
            System.out.println("y=" + y);
            System.out.println("z=" + z);
        }
    }
}

class nonstaticinner {
    public static void main(String args[]) {
        a outerObj = new a();
        a.b innerObj = outerObj.new b();
        innerObj.display();
    }
}