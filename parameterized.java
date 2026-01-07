public class parameterized {
    String name;
    int id;

    parameterized(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name is " + name + "Id is " + id);
    }

    public static void main(String[] args) {
        parameterized p = new parameterized("hi", 1);
        p.display();
    }
}
