package array;
import java.util.Arrays;
import java.util.Scanner;

public class deleteDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int []arr = new int[sc.nextInt()];

        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        if (arr.length == 0) return;

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];

        int[] uniqueArr = Arrays.copyOf(arr, j);

        System.out.println("Delete duplicate: " + Arrays.toString(uniqueArr));
    }
}