import java.util.*;


public class varArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String st=sc.nextLine();
        System.out.println(sum(arr));
        System.out.println();
    }


    static int sum(int...num){
        int sum=0;
        for(int v:num){
            sum+=v;
        }
        return sum;
    }
    static String concat(String...str){
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}
