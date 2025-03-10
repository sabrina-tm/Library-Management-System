//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//61220045
//SanasHotelManagement Class#2 SingleRoom
//////////////////////////////////////////////////////////////////////////////////////////////////////////////


//This class defines the Single Room type. It extends or it gains all its variables and methods from the Room superclass 
//This is the constructor for the SingleRoom class.
class SingleRoom extends Room {
    //with the use super(roomNumber), it calls the constructor of the Room class and passes  the room number to 
    //construct the parent class
    public SingleRoom(int roomNumber) {
        super(roomNumber);
    }


    //This implements the abstract method in the Room class and returns the room type to be a single room
    public String getRoomType() {
        return "Single";
    }

   
    //This implements the abstract method in the Room class and returns the price for the single room to be 150
    public double getPrice() {
        return 150.0;
    }
}

//Similar to the single room, this class defines the DOuble Room type and it also extends or it gains all 
//its variables and methods from the Room superclass 
class DoubleRoom extends Room {
    //with the use super(roomNumber), it calls the constructor of the Room class and passes  the room number to 
    //construct the parent class
    public DoubleRoom(int roomNumber) {
        super(roomNumber);
    }

    
    //This implements the abstract method in the Room class and returns the room type to be a Double room
    public String getRoomType() {
        return "Double";
    }


    //This implements the abstract method in the Room class and returns the price for the double room to be 250
    public double getPrice() {
        return 250.0;
    }
}


//Similar to the other two room this class defines the Suite Room type and it also extends or it gains all 
//its variables and methods from the Room superclass 
class SuiteRoom extends Room {
    //with the use super(roomNumber), it calls the constructor of the Room class and passes  the room number to 
    //construct the parent class
    public SuiteRoom(int roomNumber) {
        super(roomNumber);
    }


    //This implements the abstract method in the Room class and returns the room type to be a Suite room
    public String getRoomType() {
        return "Suite";
    }

    
    //This implements the abstract method in the Room class and returns the price for the Suite room to be 400
    public double getPrice() {
        return 400.0;
    }
}