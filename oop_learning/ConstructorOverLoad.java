package oop_learning;
import java.util.*;
import java.io.*;

public class ConstructorOverLoad {
    public static void main(String[] args) {
        Taka tk=new Taka();
        System.out.println(tk.amount+","+tk.accType+","+tk.bankName);
        Taka.show();
    }
}




class Taka{
    int amount;
    String bankName;
    String accType;


    Taka(){
        this(100000);
        System.out.println("no 1 constructor");
    }
    Taka(int amount){
        this(amount,null);
        System.out.println("no 2 constructor");
    }
    Taka(int amount,String bankName){
        this(amount,bankName,null);
        System.out.println("no 3 constructor");
    }
    Taka(int amount,String bankName,String accType){
        this.amount=amount;
        this.bankName=bankName;
        this.accType=accType;
        System.out.println("main work start");
    }
    static void show(){
        int a=5,b=5;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
