import java.util.Arrays;
public class pr_15 {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int c=0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 0 ) {
            System.out.println(n + " is a PRIME number");
        } else {
            System.out.println(n + " is NOT a prime number");
        }
    }
}
