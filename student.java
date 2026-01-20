class student {
    String name = "Vaibhav";
    int age = 20;
    public String toString() {
        return "Student{name=" + name + ", age=" + age + "}";
    }

    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.toString());
    }
}
