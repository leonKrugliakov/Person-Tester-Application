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
// 2. Customer.java
// 3. PersonDriver.java
//
//*****************************************************************************************************

//package person.tester.application;

public class Employee extends Person
{
    private String employeeSSN;
    
    public Employee()
    {
        super();
        employeeSSN = "000-00-0000";
    }
    
    //*****************************************************************************************************
    
    public String getEmployeeSSN()
    {
        return employeeSSN;
    }
    
    //*****************************************************************************************************
    
    public void setEmployeeSSN(String employeeSSN)
    {
        this.employeeSSN = employeeSSN;
    }
    
    //*****************************************************************************************************
    
    @Override
    public String getDisplayText()
    {
        String tempOutput = "\nYou entered:\n" +  this.toString() 
                + "\nSocial security number: " + getEmployeeSSN() + "\n";
        return tempOutput;
    }
}