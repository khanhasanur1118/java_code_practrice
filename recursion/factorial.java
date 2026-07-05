package recursion;
import java.util.*;

public class factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
    public static int fact(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n should be positive");
        }
        return  (n<=1)?1:n*fact(n-1);
    }
}
