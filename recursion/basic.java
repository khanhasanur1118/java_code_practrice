package recursion;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        printReverse(n);
    }
    static void printReverse(int n){

        if (n == 0) return;
        System.out.println(n);
        printReverse(n-1);
    }
}
