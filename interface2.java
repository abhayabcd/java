interface I1 {
    void part();
}

interface I2 {
    void part2();
}

class C1 implements I1, I2 {
    public void part() {
        System.out.println("Interface 1 part");
    }

    public void part2() {
        System.out.println("Interface 2 part");
    }
}

class interface2 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.part();
        c.part2();
    }
}
