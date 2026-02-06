package Userpackage.Nestedpackage;

public class nestedpackage {
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public static void main(String[] args) {
        nestedpackage user = new nestedpackage();
        user.eat();
        user.sleep();
    }
}
