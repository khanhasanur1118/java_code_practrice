package oop_learning;
import java.util.*;
import java.io.*;

public class constructor {
    static void main(String[] args) {
        Admission add=new Admission();

        System.out.println(new StringBuilder().append(add.university).append(",").append(add.degree_lavel).toString());
        Admission add1=new Admission("khan","Msc",2027,true);
        System.out.println(new StringBuilder().append(add1.university).append(",").append(add1.degree_lavel).append(",").append(add1.seassion).append(",").append(add1.scholarship).toString());
        Admission add2=new Admission("khan",2027);
        System.out.println(new StringBuilder().append(add2.university).append(",").append(add2.degree_lavel).append(",").append(add2.seassion).append(",").append(add2.scholarship).toString());


    }



}
class Admission{
    String university;
    String degree_lavel;
    int seassion;
    boolean scholarship;

    Admission(){
        this.university = "KFUPM";
        this.degree_lavel = "Msc";
       // this.seassion = 2027;
       // this.scholarship = true;
    }
    Admission(String university, String degree_lavel, int seassion, boolean scholarship){
        this.university = university;
        this.degree_lavel = degree_lavel;
        this.seassion = seassion;
        this.scholarship = scholarship;
    }
    Admission(String university,  int seassion  ){
        this(university,null,seassion,false);
    }
}