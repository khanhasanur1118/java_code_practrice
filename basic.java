import java.util.*;
public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr.length-1);
        System.out.println(arr[arr.length%2==0?arr.length/2-1:arr.length/2 ]);

        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        for(int j:arr){
            System.out.print(j +" ");

        }
    }
}
