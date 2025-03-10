//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//61220045
//SanasHotelManagement Class#3 Booking
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

// This is a class called Booking which deals with the customers reservations for their hotel room
class Booking {
    //This private variable deals withthe customer for whom the reservation is being made for 
    private Customer customer;
    //This private variable deals with whcih room the customer wishes to book 
    private Room room;
    //This provate integer variable deals with the number of nights the customer wishes to stay at hte hotel 
    private int nights;


    //This constructor is used to create a new booking by integrating the customer, the room, and the number of nights being spent
    // whenever a new Booking object is created.
    public Booking(Customer customer, Room room, int nights) {
        //this sets the customers name in the customer attribute of the Booking object
        this.customer = customer;
        //his sets the room chosen by the customer to the Booking object
        this.room = room;
        //stores the durotion or how long the customer will stay
        this.nights = nights;

        // This mark or changes the status of the room to unavailable so no one else can book it
        room.setAvailable(false);
    }

    // This methos calculates total cost the customer will be charged for thir stay
    public double TotalCost() {
        return room.getPrice() * nights;
    }

    // This method displays the booking and customer details which is their name, their room, their stay duration and their total cost 
    public void displayBooking() {
        System.out.println("\n--- Booking Details ---");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Room Number: #" + room.getRoomNumber()+ "("+room.getRoomType()+")");
        System.out.println("The Number of Nights"+customer.getName()+" staying is: " + nights);
        System.out.println("The Total Cost for "+customer.getName()+" is: $" + TotalCost());
    }
}
