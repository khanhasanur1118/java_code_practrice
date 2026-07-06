package recursion;
import java.util.*;
import java.io.*;
public class oneToN_print {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("start");
        int n1 = sc.nextInt();
        System.out.println("end");
        int n2 = sc.nextInt();
        print(n1,n2);
        printReverse(1,n2);
        anotherVersionPrint(12);
        sc.close();
    }
    static void print(int start,int end) {
        if (start == end+1 )return;
        System.out.println(start);
        print(start+1,end);

    }

    static void printReverse(int start,int end) {
        if(start>end)return;
        System.out.println(end);
        printReverse(1,end-1);
    }


    static void anotherVersionPrint(int k) throws IllegalArgumentException {
        if (k < 0) {
            throw new IllegalArgumentException("Array size 'k' cannot be negative.");
        }
        if (k == 0) return;
        int[] arr = new int[k + 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= k; i++) {
            arr[i] = i;
            sb.append(arr[i]);
            if (i < k) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }

}
