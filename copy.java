public class copy {
    String name;
    int id;

    copy(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name is " + name + " Id is  " + id);
    }

    public static void main(String[] args) {
        copy p = new copy("hi", 1);
        p.display();
    }
}
