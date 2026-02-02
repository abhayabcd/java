public class pr_13 {
    
    public static int sumJaggedArray(int[][] arr, int rowIndex) {
        if (rowIndex == arr.length) {
            return 0;
        }
        return sumRowElements(arr[rowIndex], 0) + sumJaggedArray(arr, rowIndex + 1);
    }
    
    private static int sumRowElements(int[] row, int colIndex) {
        if (colIndex == row.length) {
            return 0;
        }
        return row[colIndex] + sumRowElements(row, colIndex + 1);
    }
    
    public static int sumJaggedArray(int[][] arr) {
        return sumJaggedArray(arr, 0);
    }
    
    public static void main(String[] args) {
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9},
            {10}
        };
        
        int result = sumJaggedArray(jaggedArray);
        
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nSum of jagged array (using recursion): " + result);
    }
}
