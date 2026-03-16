public class BookMyStayApp{
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("   Welcome to Book My Stay App!");
        System.out.println("   Hotel Booking Management System v1.0");
        System.out.println("=======================================\n");
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();
        RoomInventory inventory = new RoomInventory();
        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Single: "+ inventory.getAvailability("Single")); 
        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Double: "+ inventory.getAvailability("Double")); 
        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Suite: "+ inventory.getAvailability("Suite"));
    }
}