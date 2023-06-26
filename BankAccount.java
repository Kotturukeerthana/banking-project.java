
/**
 * Represents a current account / savings account for a customer
 */
public class BankAccount {
    // Instance Variables
    /**
     * Type of account (current / savings)
     */
    String AccountType;
    /**
     * Balance for the bank account
     */
    double balance;
    /**
     * Customer for this bank account
     */
    Customer customer;
    /**
     * Creates a bank account of given type for the given customer
     * @param AccountType is either savings of current account
     * @param customer from the customer.java user defined datatype
     */
    public BankAccount(String AccountType, Customer customer){
        this.AccountType = AccountType;
        this.customer = customer;
    }
    // Methods
    /**
     * Deposits the given amount
     * @param amount to be added.
     */
    public void deposit(double amount){
       this.balance = this.balance + amount;
        // this.balance+=amount;
    }
    /**
     * Withdraws the given amount
     * @param amount to be withdrawn
     */
    public void withdraw(double amount){
        if(this.balance > amount){
            this.balance = this.balance - amount;
        }
        else{
            System.out.println("Balance is less than the given amount ");
        }
    }
    /**
     * Prints the account information of this bank account
     * @return account information is returned
     */
    public String getAccountInfo(){
        return this.AccountType + " " + this.balance;
    }
    /**
     * Prints the customer information of this bank account
     * @return customer information is returned
     */
    public String getCustomerInfo(){
        return this.customer.name + " " +this.customer.address +" "+ this.customer.age;
    }

    public double getInterestPayment(double amount, double rate_of_interest, int time_in_years){
        double interest = (amount * rate_of_interest * time_in_years)/100;
        return interest;
    }

}