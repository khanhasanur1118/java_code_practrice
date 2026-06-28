package oop_learning;
import java.util.*;
import java.io.*;

public class constructor {
    static void main(String[] args) {
        Admission add=new Admission();
        System.out.println(new StringBuilder().append(add.university).append(",").append(add.degree_lavel).append(",").append(add.seassion).append(",").append(add.scholarship).toString());
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
        this.seassion = 2027;
        this.scholarship = true;
    }
}