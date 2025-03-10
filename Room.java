//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//61220045
//SanasHotelManagement Class#1 Rooms
//////////////////////////////////////////////////////////////////////////////////////////////////////////////



// This is a class called Rooms which creates the different room types in the hotel
// The abstract keyword implies that this class is extended by other class, the SingleRoom subclass
abstract class Room {
    // this variable can only be accessed within this calss as it is a private variable and it stores the number given for the room 
    private int roomNumber;
    // this variable can only be accessed within this calss as it is a private variabl and it determines 
    //whether a room is available(true) or occupied (false)
    private boolean available;

    //This constructor is used to initialize a new object of the Room class.
    public Room(int roomNumber) {
        //sets the room number of object to the number given when the room is created.
        this.roomNumber = roomNumber;
        //Sets all rooms that are as being created as available by default 
        this.available = true; 
    }

    //a getter method called getRoomNumber is created so as to allow other parts of the code to  recive the room number.
    public int getRoomNumber() {
        return roomNumber;
    }

    //a getter method called getAvailable is created so as to allow other parts of the code to know if the room is availible or not
    public boolean getAvailable() {
        return available;
    }

    //a setter method called setAvailable is created to change the availiblity of the room in the situation where it is booked
    public void setAvailable(boolean available) {
        this.available = available;
    }

    //an abstract method called getRoomType is created which calls onto the subclass SingleRoom to return the type of room 
    //with the use of polymorphism
    public abstract String getRoomType();

    //an abstract method called getPrice is created which calls onto the subclass SingleRoom to return the price for the specific type of room
    //with the use of polymorphism
    public abstract double getPrice();

    //This method displays the rooms data.It prints the rooms number, type, price, and its availability.
    public void displayRoom() {
        System.out.println("Room Number: " + roomNumber + ", Type: " + getRoomType() + ", Price: $" + getPrice() + ", is Available");
    }
}
