public class pr_11 {
    public static int findMax(int[] arr, int index) {
        // Base case: only one element left
        if (index == arr.length - 1) {
            return arr[index];
        }
        
        // Recursive case: compare current element with max of rest
        int maxOfRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxOfRest);
    }
    
    public static void main(String[] args) {
        int[] array = {5, 12, 8, 23, 15, 3};
        int maximum = findMax(array, 0);
        System.out.println("Maximum number: " + maximum);
    }
}