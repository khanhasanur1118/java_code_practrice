import java.util.Scanner;

public class array_declaration_initialization {

    public static void max_min(int[]arr){
        int max=arr[0];
        int min=arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("enter number of array size:");
        Scanner sc=new Scanner(System.in);
        int []arr=new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        max_min(arr);
        boolean sorted=isSorted(arr);
        if (sorted) {
            System.out.println("Sorted array");
        }
        else {
            System.out.println("Not sorted");
        }

    }
}
