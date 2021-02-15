//***********************************************
//  Author: Steven Smail
//
//  DogsFromFile.java
//
//  A test driver for class Dog.
//***********************************************
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DogsFromFile
{
//------------------------------------------------
// Creates an array of dog objects by using a file
// scanner and then outputs the attributes of each
// dog to the screen.
//------------------------------------------------
    public static void main (String[] args)
    {
        // Declare string array
        Dog[] dogs = new Dog[100];
        int count = 0;
        Boolean ok = false;
        
        System.out.println("This is program DogsFromFile.");
        System.out.println();

        while (!ok)
        {
            System.out.print("Please enter file name: ");
            Scanner keyboardScanner = new Scanner(System.in);
            String filename = keyboardScanner.nextLine();

            try
            {
                // Create a file scanner
                File dog_list = new File(filename);
                Scanner dogScanner = new Scanner(dog_list);

                    // Get dogs from the file
                    while (dogScanner.hasNext()) // Test for end of file
                    {
                        // Create a dog object
                        Dog dog1 = new Dog(dogScanner);
                        // Assign array values to object
                        dogs[count++] = dog1;
                    }

                    System.out.println("End of file reached.");
                    System.out.println();

                    // Print summary for the dogs
                    for (int index = 0; index < count; index++)
                    {
                        System.out.println(dogs[index]);
                    }
                    
                    System.out.println();
                    System.out.println("There are " + Dog.Get_Dog_Count() +
                                       " dogs in the system.");

                    ok = true;
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("File " + filename + " was not found.");
                System.out.println("Please try again.");
            }
        }

        System.out.println();
        System.out.println("Program Complete.");
        System.out.println();
    }
}