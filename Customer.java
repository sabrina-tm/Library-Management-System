//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//61220045
//SanasHotelManagement Class#4 Customer
//////////////////////////////////////////////////////////////////////////////////////////////////////////////


// This is a class called Customer which deals with the customer who is booking a room at the hotel. 
//It saves information about the customer, such as their name and contact number.
class Customer {
    //To prevent unautorized acces both name and contactNum variables are private
    //The name variable stores the name of the customer 
    private String name;
    //The variable stores their number. A String type is used instead of an integer as the contact numbers may include characters 
    //like +, -, or spaces and they are not being used in calculations.
    private String contactNum;

    //This constructor is used to initialize a new Customer object and makes sure to save a valid name and number.
    public Customer(String name, String Number) {
        //this sets the individuals name to  name attribute in the customer object
        this.name = name;
        //this sets the individuals number to the contactNum attribute in the customer object
        this.contactNum = Number;
    }

    //a getter method called getName is created so as to allow other parts of the code to recive the customers name.
    //This method provides a safe way to retrieve the customers name.
    public String getName() {
        return name;
    }


    //a getter method called getContactNumber is created so as to allow other parts of the code to recive the customers number.
    //Like name the contactNum variable is private, so it cannot be accessed directly and thsi allows for a safe way to 
    //get the customers number.
    public String getContactNumber() {
        return contactNum;
    }
}
