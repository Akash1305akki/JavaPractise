package RoomAllocationAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Room {
        String name;
        List<People> occupants;

        public Room(String name) {
            this.name = name;
            occupants = new ArrayList<>();
        }
}
