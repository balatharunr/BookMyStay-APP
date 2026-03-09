
public class BookMyStayAPP{

    /**
     * The main method is the entry point of the application.
     * The JVM looks for this specific signature to start execution.
     *
     * @param args Command-line arguments (not used in this use case).
     */
    public static void main(String[] args) {
        // UC1: Welcome message
        System.out.println("=======================================");
        System.out.println("   Welcome to Book My Stay App!");
        System.out.println("   Hotel Booking Management System v6.1");
        System.out.println("   Hotel Booking Management System v5.1");
        System.out.println("   Hotel Booking Management System v4.1");
        System.out.println("   Hotel Booking Management System v3.1");
        System.out.println("=======================================\n");

        // UC2: Initialize room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();
        Room[] rooms = { single, doubleRoom, suite };

        // UC3: Centralized Inventory
        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType(single.getRoomType(), 2);
        inventory.addRoomType(doubleRoom.getRoomType(), 1);
        inventory.addRoomType(suite.getRoomType(), 0); // Suite fully booked
        inventory.displayInventory();

        // UC4: Room Search (Read-only)
        SearchService searchService = new SearchService(inventory);
        searchService.searchAvailableRooms(rooms);

        // UC5: Booking Request Queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();
        bookingQueue.addRequest(new Reservation("Alice", "Single Room"));
        bookingQueue.addRequest(new Reservation("Bob", "Double Room"));
        bookingQueue.addRequest(new Reservation("Charlie", "Suite Room"));
        bookingQueue.addRequest(new Reservation("Diana", "Single Room"));
        bookingQueue.displayQueue();

        // UC6: Process requests and confirm reservations
        BookingService bookingService = new BookingService(inventory);
        bookingService.processRequests(bookingQueue);

        // Final inventory state
        // Search again after update
        searchService.searchAvailableRooms(rooms);
        single.displayRoomDetails();
        doubleRoom.displayRoomDetails();
        suite.displayRoomDetails();

        // UC3: Centralized Inventory
        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType(single.getRoomType(), 5);
        inventory.addRoomType(doubleRoom.getRoomType(), 3);
        inventory.addRoomType(suite.getRoomType(), 2);

        // Display inventory
        inventory.displayInventory();

        // Example update
        inventory.updateAvailability("Single Room", 4);
        System.out.println("\nAfter booking one Single Room:");
        inventory.displayInventory();
    }
}
