package oop;
import java.util.*;

public class object_learn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter total number of rooms: ");
        int rooms = sc.nextInt();

        dorm dd = new dorm(students,rooms);
        dd.allotedRoomNumber(dd.numberOfStudents, dd.numberOfRooms);
    }
}

class dorm {
    int numberOfStudents;
    int numberOfRooms;

    dorm(int numberOfStudents, int numberOfRooms) {
        this.numberOfStudents = numberOfStudents;
        this.numberOfRooms = numberOfRooms;
    }

    void allotedRoomNumber(int numberOfStudents, int numberOfRooms) {
        int perRoomCapacity = 4;


        int maxCapacity = numberOfRooms * perRoomCapacity;

        if (numberOfStudents > maxCapacity) {
            int unallotted = numberOfStudents - maxCapacity;
            System.out.println("Rooms are full! Number of unallotted students: " + unallotted);
        } else {
            System.out.println("All students get allotted!");
        }
    }
}