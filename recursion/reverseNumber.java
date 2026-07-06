package recursion;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        reverse(start,end);
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

}
