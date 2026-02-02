public class pr_12 {
    
    // Recursive function to calculate sum of array
    public static int sumArray(int[] arr, int index) {
        // Base case: if index reaches end of array
        if (index == arr.length) {
            return 0;
        }
        // Recursive case: add current element and sum of remaining elements
        return arr[index] + sumArray(arr, index + 1);
    }
    
    // Overloaded method to start recursion from index 0
    public static int sumArray(int[] arr) {
        return sumArray(arr, 0);
    }
    
    public static void main(String[] args) {
        // Test array
        int[] numbers = {5, 10, 15, 20, 25};
        
        // Calculate sum using recursion
        int result = sumArray(numbers);
        
        System.out.println("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Sum of array (using recursion): " + result);
    }
}
