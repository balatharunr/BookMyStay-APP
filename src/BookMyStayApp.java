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
        RoomSearchService searchRoom = new RoomSearchService();
        searchRoom.searchAvailableRooms(inventory, singleRoom, doubleRoom, suiteRoom);
    }
}