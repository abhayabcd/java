package Userpackage;
public class userpackage {
    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public static void main(String[] args) {
        userpackage user = new userpackage();
        user.eat();
        user.sleep();
    }
}
