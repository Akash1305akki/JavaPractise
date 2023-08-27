package RoomAllocationAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class RoomAllocation {

    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room("Room_" + (char)('A' + i)));
        }

    //--------------------------------------------------------------------------------------------------------------------------

        // Step 1: Initial Allocation (30 people)
        List<People> people = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            people.add(new People("Person_" + i));
        }
        distributePeople(people, rooms);

    //--------------------------------------------------------------------------------------------------------------------------

        // Step 2: Allocation for New People (5 people)
        List<People> newPeople = new ArrayList<>();
        for (int i = 31; i <= 35; i++) {
            newPeople.add(new People("Person_" + i));
        }
        allocateNewPeople(newPeople, rooms);

    //--------------------------------------------------------------------------------------------------------------------------

        // Step 3: Maintenance in Rooms (RoomC, RoomF)
        List<Room> maintenanceRooms = new ArrayList<>();
        maintenanceRooms.add(rooms.get(2)); // RoomC
        maintenanceRooms.add(rooms.get(5)); // RoomF
        performMaintenance(maintenanceRooms, rooms);

    //--------------------------------------------------------------------------------------------------------------------------

        // Step 4: Adding a New Room (RoomK)
        Room newRoom = new Room("Room_K");
        rooms.add(newRoom);

    //--------------------------------------------------------------------------------------------------------------------------

        // Step 5: Vacating Rooms (25 people)
        List<People> vacatingPeople = new ArrayList<>(people.subList(0, 25));
        vacateRooms(vacatingPeople, rooms);

    //--------------------------------------------------------------------------------------------------------------------------

        // Print final room allocations
        System.out.println("--------------------------------------------------------------------------------------------");
        for (Room room : rooms) {
            System.out.print(room.name + ": ");
            System.out.print("{ ");
            for (People person : room.occupants) {
                System.out.print(person.name + " ");
            }
            System.out.print("}");
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------");
        }
    }

    // Distribution of people equally across rooms
    public static void distributePeople(List<People> people, List<Room> rooms) {
        int roomIndex = 0;
        for (People person : people) {
            rooms.get(roomIndex).occupants.add(person);
            person.room = rooms.get(roomIndex);
            roomIndex = (roomIndex + 1) % rooms.size();
        }
    }

    // Allocate new people to rooms with fewer occupants
    public static void allocateNewPeople(List<People> newPeople, List<Room> rooms) {
        Collections.sort(rooms, Comparator.comparingInt(room -> room.occupants.size()));
        for (People person : newPeople) {
            Room room = rooms.get(0);
            room.occupants.add(person);
            person.room = room;
        }
    }

    // Reallocate people from maintenance rooms to other rooms
    public static void performMaintenance(List<Room> maintenanceRooms, List<Room> rooms) {
        for (Room maintenanceRoom : maintenanceRooms) {
            List<People> occupantsToMove = new ArrayList<>(maintenanceRoom.occupants);
            occupantsToMove.sort(Comparator.comparingInt(person -> person.stayDuration));

            for (People person : occupantsToMove) {
                Room targetRoom = rooms.stream()
                        .filter(room -> !maintenanceRooms.contains(room))
                        .min(Comparator.comparingInt(room -> room.occupants.size()))
                        .orElse(null);

                if (targetRoom != null) {
                    maintenanceRoom.occupants.remove(person);
                    targetRoom.occupants.add(person);
                    person.room = targetRoom;
                }
            }
        }
    }

    // Vacate rooms and redistribute occupants if required
    public static void vacateRooms(List<People> vacatingPeople, List<Room> rooms) {
        for (People person : vacatingPeople) {
            person.room.occupants.remove(person);
            person.room = null;
        }

        distributePeople(vacatingPeople, rooms);
    }
}