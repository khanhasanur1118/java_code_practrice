package pattern_print;
import java.util.Scanner;
public class number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i,j,k,left,right,count;
        left=1;right=0;
        count=rows-1;

        for(i=1;i<=rows;i++)
        {
            for(k=1;k<=count;k++){
                System.out.print(" ");
            }
            for(j=i;j<=left;j++)
            {
                System.out.print(j);
            }
            left+=2;
            if (i!=1){
                for (j=right;j>=i;j--) {
                    System.out.print(j);
                }
            }
            right+=2;

            System.out.println();
            count--;
        }



    }
}
