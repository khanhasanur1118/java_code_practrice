package oop_learning;
import java.util.*;

//static keyword
public class static_demo {
    static void main(String[] args) {
        A s1=new A("hasan",28,1);
        A s2=new A("khan",28,2);

        System.out.println(s1.name+","+A.college+","+s1.age+","+s1.id);
        System.out.println(s2.name+","+A.college+","+s2.age+","+s2.id);
        System.out.println(A.address+" "+A.nationality );
    }
}
class A{
    String name;
    int age;
    int id;
    static String college;
    static String address;
    static String nationality;
    A(String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;

    }
    static{
        college="uu";
        address="Dhaka";
        nationality="BD";
    }



}