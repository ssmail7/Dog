//*********************************************************
//  Author: Steven Smail
//
//  Dog.java
//
//  Represents a dog.
//*********************************************************
import java.util.Scanner;

public class Dog
{
    // Instance variables
    private String name;
    private String breed;
    private int age;
    private static int count = 0;

    //------------------------------------------------------
    // Constructor - Use file scanner to set up a dog object
    // by initializing the name, breed, and age.
    //------------------------------------------------------
    public Dog(Scanner dogScanner)
    {
        name = dogScanner.nextLine();
        breed = dogScanner.nextLine();
        age = dogScanner.nextInt();
        dogScanner.nextLine(); // Clear new line
        count++;
    }

    //-----------------------------------------------------
    // Constructor - sets up a dog object by initializing
    // the name, breed, and age.
    //-----------------------------------------------------
    public Dog(String newName, String newBreed, int newAge)
    {
        name = newName;
        breed = newBreed;
        age = newAge;
    }

    //--------------------------------------------------------------
    // Method ageInPersonYears that takes no parameter. The method
    // should compute and return the age of the dog in person years
    // (seven times the dog's age).
    //--------------------------------------------------------------
    public int ageInPersonYears()
    {
        int personAge = age * 7;
        return personAge;
    }
    
    //------------------------------------------------------
    // Returns a string representation of a dog.
    //------------------------------------------------------
    public String toString()
    {
        return name + "\t" + breed + "\t" + age + "\t" +
               "Age in person years:" + ageInPersonYears();
    }

   //-------------------------------------------------------   //  Returns the number of instances of this class that
   //  have been created.   //-------------------------------------------------------   public static int Get_Dog_Count()   {      return count;   }
}