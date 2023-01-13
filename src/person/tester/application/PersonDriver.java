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
// 3. Customer.java
//
//*****************************************************************************************************

//package person.tester.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonDriver 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean contin = true;
        String choice,
                another;
        Customer custo = new Customer();
        Employee emp = new Employee();
        
        System.out.println("Welcome to the Person Tester application");
        
        while(contin)
        {
            choice = getChoiceString(sc, "Create customer or employee? (c/e)"
                    + " : ", "c", "e");
            if(choice.equalsIgnoreCase("c"))
            {
                custo.setFname(getRequiredString(sc, "Enter first name: "));
                custo.setLname(getRequiredString(sc, "Enter last name: "));
                custo.setEmail(getRequiredString(sc, "Enter email address: "));
                custo.setCustomerNumber(getRequiredString(sc, 
                        "Customer number: "));                
                System.out.println(custo.getDisplayText());
            }
            else if(choice.equalsIgnoreCase("e"))
            {
                emp.setFname(getRequiredString(sc, "Enter first name: "));
                emp.setLname(getRequiredString(sc, "Enter last name: "));
                emp.setEmail(getRequiredString(sc, "Enter email address: "));
                emp.setEmployeeSSN(getRequiredString(sc, 
                        "Social Security number: "));                
                System.out.println(emp.getDisplayText());
            }
            
            another = getChoiceString(sc, "Continue? (y/n)", "y", "n");
            if(another.equalsIgnoreCase("y"))
            {
                contin = true;
            }else if(another.equalsIgnoreCase("n"))
            {
                contin = false;
            }
        }
    }
    
    //*****************************************************************************************************
    
    public static int getInt(Scanner sc, String prompt)
    {
        boolean valid = false;
        int input = 0;
        
        while(!valid)
        {
            try
            {
                System.out.print(prompt);
                input = sc.nextInt();
                valid = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("The input you have eneterd is invalid, "
                        + "it must be an integer. Try again!");
                sc.nextLine();
                continue;
            }
        }
        
        return input;
    }
    
    //*****************************************************************************************************
    
    public static int getIntWithinRange(Scanner sc, 
            String prompt, int min, int max)
    {
        boolean valid = false;
        int input = 0;
        
        while(!valid)
        {
            input = getInt(sc, prompt);
            
            if(input <= min)
            {
                System.out.println("The input you have entered cannot be "
                        + "lower than " + min + ", please try again!");
            }
            else if(input >= max)
            {
                System.out.println("The input you have entered cannot be "
                        + "higher than " + max + ", please try again!");
            }
            else
            {
                valid = true;
            }
            
        }
        
        return input;
    }

    //*****************************************************************************************************
    
    public static String getRequiredString(Scanner sc, String prompt)
    {
        String input = "";
        boolean valid = true;
        
        while(valid)
        {
            System.out.print(prompt);
            input = sc.nextLine();
            
            if(input.isEmpty())
            {
                System.out.println("Please enter an input, this line can't "
                        + "be left blank!");
                valid = true;
                sc.nextLine();
            }
            else if(!input.isEmpty())
            {
                valid = false;
            }
            
        }
        
        return input;
        
    }

    //*****************************************************************************************************
    
    public static String getChoiceString(Scanner sc, 
            String prompt, String s1, String s2)
    {
        String input = "";
        boolean valid = false;
        
        while(!valid)
        {
            input = getRequiredString(sc, prompt);
            if(input.equalsIgnoreCase(s1))
            {
                valid = true;
            }
            else if(input.equalsIgnoreCase(s2))
            {
                valid = true;
            }
            else
            {
                System.out.println("The input you have entered is invalid. "
                        + "Please enter 'y' or 'n' as your answer!");
                valid = false;
            }
        }
        
        return input;
    }
}

/*
Welcome to the Person Tester application
Create customer or employee? (c/e) : c
Enter first name: Frank
Enter last name: Jones
Enter email address: frank44@hotmail.com
Customer number: M10293

You entered:
Name: Frank Jones
Email: frank44@hotmail.com
Customer number: M10293

Continue? (y/n)y
Create customer or employee? (c/e) : e
Enter first name: Anne
Enter last name: Prince
Enter email address: anne@murach.com
Social Security number: 111-11-1111

You entered:
Name: Anne Prince
Email: anne@murach.com
Social security number: 111-11-1111

Continue? (y/n)n
*/