import java.util.Arrays;

public class pr_14 {
    public static void main(String[] args) {
        System.out.println("Before sorting: " + Arrays.toString(args));
        Arrays.sort(args);
        System.out.println("After sorting:  " + Arrays.toString(args));
    }
}
