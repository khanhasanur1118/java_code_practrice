package oop_learning;
import java.util.*;
import java.io.*;


class multiplacation{
    static int ml(int d,int f){
        int m= d*f;
        int m1=m;
        System.out.println(m1);
        return m;
    }
}

class object_experiment{
    static void pairEven_Odd(int a,int b){
        if(a%2==0 || b%2==0) System.out.println("Even number without a doubt");
        else System.out.println("Odd number without a doubt");
        return;
    }
}

class University {

    String name;
    int id;
    String department;
    String section;

    public University(String name, int id, String department, String section) {

        if (name != null && department != null && section != null) {
            this.name = name;
            this.id = id;
            this.department = department;
            this.section = section;
        } else {
            System.out.println("Error: Fields cannot be null.");
        }
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Section: " + section);
    }
}



public class fn {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a=input.nextInt();
       int b=input.nextInt();
        System.out.println(func(a,b));
        multiplacation.ml(a,b);
        object_experiment.pairEven_Odd(a,b);

        University un=new University("khan",222,"cse","a");
        un.displayDetails();


    }
    static int func(int x,int y){
        int addition = x+y;
        return addition;

    }
}
