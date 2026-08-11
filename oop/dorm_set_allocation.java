package oop;

import java.util.*;

public class dorm_set_allocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int totalStudents = sc.nextInt();

        List<Integer> studentIDs = new ArrayList<>();
        System.out.println("Enter the Student IDs:");
        for (int i = 0; i < totalStudents; i++) {
            studentIDs.add(sc.nextInt());
        }

        System.out.print("Enter total number of rooms: ");
        int totalRooms = sc.nextInt();

        dormju dd = new dormju(studentIDs, totalRooms);
        dd.allocateRooms();

        sc.close();
    }
}

class dormju {
    List<Integer> studentIDs;
    int numberOfRooms;

    dormju(List<Integer> studentIDs, int numberOfRooms) {
        this.studentIDs = studentIDs;
        this.numberOfRooms = numberOfRooms;
    }

    void allocateRooms() {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        // Separate IDs into Odd and Even queues maintaining original order
        for (int id : studentIDs) {
            if (id % 2 != 0) {
                oddQueue.add(id);
            } else {
                evenQueue.add(id);
            }
        }

        int currentRoom = 1;

        // Recursively fill rooms while there are students and available rooms
        while ((!oddQueue.isEmpty() || !evenQueue.isEmpty()) && currentRoom <= numberOfRooms) {
            List<Integer> roomOccupants = new ArrayList<>();

            // 1. Fill up to 4 spaces with Odd IDs first
            while (roomOccupants.size() < 4 && !oddQueue.isEmpty()) {
                roomOccupants.add(oddQueue.poll());
            }

            // 2. If room still has space, fill remaining beds with Even IDs
            while (roomOccupants.size() < 4 && !evenQueue.isEmpty()) {
                roomOccupants.add(evenQueue.poll());
            }

            System.out.println("Room " + currentRoom + " [Occupants: " + roomOccupants.size() + "/4]: " + roomOccupants);
            currentRoom++;
        }

        // Output any unallotted students if room capacity was exceeded
        int unallottedCount = oddQueue.size() + evenQueue.size();
        if (unallottedCount > 0) {
            List<Integer> unallottedList = new ArrayList<>();
            unallottedList.addAll(oddQueue);
            unallottedList.addAll(evenQueue);
            System.out.println("\nRooms are full! Unallotted Students (" + unallottedCount + "): " + unallottedList);
        } else {
            System.out.println("\nAll students have been allotted rooms successfully.");
        }
    }
}


