import java.util.HashMap;

public class RoomInventory {
        private HashMap <String,Integer> inventory;
        RoomInventory(){
            inventory = new HashMap<>();
            inventory.put("Single", 5);
            inventory.put("Double", 3);
            inventory.put("Suite", 2);
        }
        int getAvailability(String roomType){
            return inventory.get(roomType);
        }
}