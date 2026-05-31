import java.util.*;

public class factorial_last_digit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int x=sc.nextInt();
            int fact=1;
            for (int j=1;j<=x;j++){
                fact=fact*j;
            }
            System.out.println(fact%10);
        }
    }
}
