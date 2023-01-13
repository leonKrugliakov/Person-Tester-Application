//*****************************************************************************************************
//
// File: Person.java
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
// 1. Customer.java
// 2. Employee.java
// 3. PersonDriver.java
//
//*****************************************************************************************************

//package person.tester.application;

public abstract class Person 
{
    private String fname,
            lname,
            email;
    
    public Person()
    {
        fname = " ";
        lname = " ";
        email = " ";
    }
    
    //*****************************************************************************************************
    
    public String getFname()
    {
        return fname;
    }
    
    //*****************************************************************************************************
    
    public String getLname()
    {
        return lname;
    }
    
    //*****************************************************************************************************
    
    public String getEmail()
    {
        return email;
    }
    
    //*****************************************************************************************************
    
    public void setFname(String fname)
    {
        this.fname = fname;
    }
    
    //*****************************************************************************************************
    
    public void setLname(String lname)
    {
        this.lname = lname;
    }
    
    //*****************************************************************************************************
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    //*****************************************************************************************************
    
    public String toString()
    {
        String tempOutput = "Name: " + getFname() + " " + getLname() 
                + "\nEmail: " + getEmail();
        return tempOutput;
    }
    
    //*****************************************************************************************************
    
    public abstract String getDisplayText();
    
}
