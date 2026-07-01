package recursion;
import java.util.*;
public class oneToN_print {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("start");
        int n1 = sc.nextInt();
        System.out.println("end");
        int n2 = sc.nextInt();
        print(n1,n2);
    }
    static void print(int start,int end) {
        if (start == end+1 )return;
        System.out.println(start);
        print(start+1,end);

    }
}
