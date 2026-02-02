public class pr_17 {    
    static class Room {
        private double length;
        private double breadth;
        private double area;
        
        public Room(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
            this.area = length * breadth;
        }
        
        public void displayDetails() {
            System.out.println("=== Room Details ===");
            System.out.println("Length: " + length + " units");
            System.out.println("Breadth: " + breadth + " units");
            System.out.println("Area: " + area + " square units");
            System.out.println();
        }     
    }
    
    public static void main(String[] args) {
        Room room1 = new Room(10, 8);
        
        room1.displayDetails();
    }
}
