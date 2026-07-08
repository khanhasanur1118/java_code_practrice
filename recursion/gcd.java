package recursion;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=sc.nextInt();
      System.out.println(gcdfn(n,r));
      System.out.println(findGCDIterative(n,r));
    }
    public static int gcdfn(int a,int b){
        if(b==0)return a;
        else return gcdfn(b,a%b);
    }

    public static int findGCDIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}