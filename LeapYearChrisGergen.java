/************************************************************
COSC 1173 Lab Section 48
Assignment 2 - Programming Assignment: Leap Year
Name: Chris Gergen
Date: Feb 17
***********************************************************\ 

/* 
Collect a correctly formatted year from user.
Infor user if it is a leap year.

int year >= 0.

Psudo code
if year % 400 != 0
  leap year = true
else if year % 400 != 0 && year % 100 != 0 && year % 4 == 0
  leap year = true

*/

import  java.util.Scanner;

public class Main {
  // Main Method
  public static void main(String[] args){
    // Declare Variables
    boolean isLeapYear = false;
    int year;

    // Create Scanner object
    Scanner input = new Scanner(System.in);
    
    // Get year from user.
    System.out.println("Greetings! Please enter a value 0 or larger, and learn if that year is a Leap Year.");
    year = input.nextInt();

    // Check for valid year input
    while (year < 0){
      System.out.println("That is an invalid year format. Please enter a year 0 or larger.");
      year = input.nextInt();
    }
      

    // Leap Year Logic
    if (year % 400 == 0)
      isLeapYear = true;
    else if (year % 400 != 0 && year % 100 != 0 && year % 4 == 0 )
      isLeapYear = true;
    else 
      isLeapYear = false;
     

    if (isLeapYear)
    System.out.println(year + " is a Leap Year." );
    else
    System.out.println(year + " is not a Leap Year." );

    input.close();
  }
}
