package recursion;
import java.util.Scanner;
import java.math.BigInteger;

public class reverseNumber {
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("start");
        int start=sc.nextInt();
        System.out.println("end");
        int end=sc.nextInt();
        reverse(start,end);
        System.out.println("Base: ");
        long base=sc.nextLong();
        System.out.println("exponent: ");
        long exponent=sc.nextLong();
        System.out.println("result:"+pows(BigInteger.valueOf(base),exponent));
        sc.close();

    }
    public static int reverse(int start,int end)throws IllegalArgumentException
    {   if(start<0){
        throw new IllegalArgumentException("put positive number");
    }

        if( start>end) return 0;
        System.out.println(end);
        return reverse(start,end-1);

    }

    public static BigInteger pows(BigInteger a,long b)throws IllegalArgumentException
    {  if(b<0){
        throw new IllegalArgumentException("Exponent 'b' cannot be negative for integer power calculations.");
    }
        if(b==0) return BigInteger.ONE;
        return a.multiply(pows(a,b-1));
    }

}
