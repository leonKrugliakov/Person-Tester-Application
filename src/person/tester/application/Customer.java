//*****************************************************************************************************
//
// File: Customer.java
//
// Student: Leon Krugliakov
//
// Assignment: Assignment #4
//
// Course Name: Java I
//
// Course Number: COSC 2050 - 01
//
// Due: February 19, 2020
//
//
// This program asks the user if they would like to create a customer or
// an employee. Then depending on who the user chooses, the program prompts
// for first and last name, email address and then depending on customer 
// or employee it prompts the user to enter a social security number or
// a customer ID.
//
// Other files required:
// 1. Person.java
// 2. Employee.java
// 3. PersonDriver.java
//
//*****************************************************************************************************

//package person.tester.application;

public class Customer extends Person
{
    private String customerNumber;
    
    public Customer()
    {
        super();
        customerNumber = "00";
    }
    
    //*****************************************************************************************************
    
    public String getCustomerNumber()
    {
        return customerNumber;
    }
    
    //*****************************************************************************************************
    
    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    
    //*****************************************************************************************************
    
    @Override
    public String getDisplayText()
    {
        String tempOutput = "\nYou entered:\n" + this.toString() 
                + "\nCustomer number: " + getCustomerNumber() + "\n";
        return tempOutput;
    }
}