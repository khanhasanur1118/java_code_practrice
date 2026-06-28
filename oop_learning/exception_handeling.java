package oop_learning;
import java.util.Scanner;
import java.util.InputMismatchException;

public class exception_handeling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a student ID: ");
            int studentID = input.nextInt();
            System.out.print("Enter a student name: ");
            String name=input.next();


        }
        catch(InputMismatchException e){
            System.out.println("Invalid student ID");
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        finally{
            input.close();
        }
    }
}
