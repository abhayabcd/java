public class pr_18 {
    
    // Car class definition
    static class Car {
        // Attributes
        private String brand;
        private String model;
        private int year;
        
        // Constructor
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        
        public void display() {
            System.out.println("=== Car Details ===");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022);

        
        // Display initial car details
        System.out.println("Initial Car Details:");
        car1.display();
    }
}
