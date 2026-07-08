package recursion;
import java.util.Scanner;

public class revNumString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int t = sc.nextInt();
        System.out.println("enter a String--");
        String st= sc.next();
        System.out.println("reverse number:"+ printReverse(t,0));
        System.out.println("reversed string--"+printReverse2(st));
        System.out.println(sum(t));
        sc.close();
    }


    public static int printReverse(int n,int r) {
            if (n==0)return r;
            return printReverse(n/10,r*10+n%10);

    }
    public static String printReverse2(String as) {
        if (as.isEmpty())return "";
        StringBuilder sb = new StringBuilder(as);
        return String.valueOf(String.valueOf(sb.reverse()));
    }
    public static int sum(int a){
        if (a==0)return 0;
        return a+sum(a-1);
    }

}
