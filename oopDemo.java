public class oopDemo {
    static void main(String[] args) {
        University s1 = new University();
        University s2 = new University();

        s1.department="CSE";
        s2.department="EEE";
        s1.name="Md Hasanur roshid khan";
        s2.name="Md mamunur roshid khan";
        s1.studentNumber=222;
        s2.studentNumber=333;
        s1.section="A";
        s2.section="B";

        s1.studentInfo();
        s2.studentInfo();
        s1.print();
        s2.print();
    }
}

class University{
    String name;
    String department;
    int studentNumber;
    String section;

    void studentInfo(){
        System.out.println("studentInfo showing "+name);

    }
    void print(){
        System.out.println(name+"is a student of "+department+"and his ID is: "+studentNumber+",and section: "+section);
    }
}