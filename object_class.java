import java.util.*;

 class objectify{
     public int count(int a,int b){
         System.out.println("objectify testing");
         int r=a+b;
         return r;
     }
 }


public class object_class {
    static void main(String[] args) {
        objectify obj = new objectify();
        int result = obj.count(4,5);
        System.out.println(result);

    }
}
