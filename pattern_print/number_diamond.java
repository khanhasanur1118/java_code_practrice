package pattern_print;
import java.util.*;
import java.io.*;

public class number_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i,j,k;
        int count=number-1;
        for(i=1;i<=2*(number)-1;i+=2)
        {
            for(k=1;k<=count;k++){
                System.out.print(" ");
            }
            count--;
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }



        count=1;
        for(i=2*(number)-1;i>=1;i-=2)
        {
            if(i!=2*(number)-1)
            {
                for (k = 1; k <= count; k++){
                    System.out.print(" ");
                }
                count++;
                for(j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }



        sc.close();




    }
}
