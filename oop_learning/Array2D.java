package oop_learning;
import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        MatrixProcessor matrix = new MatrixProcessor();
        matrix.fillArray();
        matrix.displayArray();
    }
}
class MatrixProcessor {
    private int rows;
    private int cols;
    private int[][] arr;
    private Scanner sc = new Scanner(System.in);

    public MatrixProcessor() {
        System.out.print("Enter number of rows: ");
        this.rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        this.cols = sc.nextInt();

        this.arr = new int[rows][cols];
    }

    public void fillArray() {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) { // arr.length gives number of rows
            for (int j = 0; j < arr[i].length; j++) { // arr[i].length gives columns in that row
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void displayArray() {
        System.out.println("\nYour 2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}