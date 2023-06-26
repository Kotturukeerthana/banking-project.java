/**
 * Describes the information of the customer
 */
public class Customer {
    //Instance variables
    /**
     * Name of the customer
     */
    String name;
    /**
     * Address of the customer
     */
     String address;
    /**
     * Age of the customer
     */
    int age;
    //Constructors
    /**
     * Creates a customer
     * @param name of the customer
     */
    public Customer(String name){
        this.name = name;
    }
    //Methods
    //Setter 
    /**
     * Sets the address to the customer
     * @param address to be assigned
     */
    public void setAddress(String address){
        this.address = address;
    }
    /**
     * Sets the age to the customer
     * @param age to be assigned
     */
    public void setAge(int age){
        this.age = age;
    }
    //Getter methods
    /**
     * @return the name of the customer
     */
    public String getName(){
        return this.name;
    }
    /**
     * @return the address of the customer
     */
    public String getAddress(){
        return this.address;
    }
    /**
     * @return the age of the customer
     */
    public int getAge(){
        return this.age;
    }

}