package recursion;
import java.util.Scanner;

public class dec_increasePrint {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter an number: ");
       int n = input.nextInt();
       ins_dec(n);
       input.close();
    }


    static void ins_dec(int a){
        if(a==0) return ;
        System.out.println(a);
        ins_dec(a-1);
        if(a!=1) {
            System.out.println(a);
        }

    }
}
