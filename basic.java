import java.util.*;
public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr.length-1);


        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        System.out.println("reverse thr array:");
        for(int j:arr){
            System.out.print(j +" ");

        }
    }
}
