public class pr_19 {
    
    static class Student {
        private String name;
        private int rollNo;
        private double marks;
        
        public Student(String name, int rollNo, double marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
            System.out.println("Student object created: " + name);
        }
        
        public void display() {
            System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
        }
        
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalize called: Student object '" + name + "' is being destroyed!");
            super.finalize();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Object Creation and Destruction Demo ===\n");
        
        // Create Student objects
        Student student1 = new Student("Amit", 101, 85.5);
        Student student2 = new Student("Bhavna", 102, 92.0);
        Student student3 = new Student("Chirag", 103, 78.5);
        
        System.out.println("\n--- Displaying Student Details ---");
        student1.display();
        student2.display();
        student3.display();
        
        System.out.println("\n--- Destroying Objects ---\n");
        
        // Destroy student1 by setting it to null
        System.out.println("Setting student1 to null...");
        student1 = null;
        
        // Destroy student2 by setting it to null
        System.out.println("Setting student2 to null...");
        student2 = null;
        
        // Destroy student3 by setting it to null
        System.out.println("Setting student3 to null...");
        student3 = null;
        
        System.out.println("\n--- Requesting Garbage Collection ---");
        
        // Request garbage collection
        // This will call finalize() method for objects marked for deletion
        System.out.println("Calling System.gc()...");
        System.gc();
        
        System.out.println("\nGarbage collection completed.");
        System.out.println("Main method ending...");
    }
}
