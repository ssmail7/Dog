//**************************************************
//  Author: Steven Smail
//
//  DogsFromCSV.java
//
//  A test driver for class Dog.
//**************************************************
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class DogsFromCSV
{
    //-----------------------------------------------
    // Reads a CSV file of dogs and creates Dog
    // objects from the contents.
    //-----------------------------------------------
    public static void main (String[] args)
    {
        Boolean ok = false;

        System.out.println("This is program DogsFromCSV.");
        System.out.println();

        while (!ok)
        {
            System.out.print("Please enter name of a CSV file: ");
            Scanner keyboardScanner = new Scanner(System.in);
            String in_filename = keyboardScanner.nextLine();

            try
            {
                // Create a Scanner for the dogs file.
                File dog_list = new File(in_filename);
                String out_filename = in_filename.replace(".csv", "2.csv");
                Scanner fileScanner = new Scanner(dog_list);
                System.out.println("Output filename: " + out_filename);
             
                FileOutputStream fos = new FileOutputStream(out_filename, false);
                PrintWriter pw = new PrintWriter(fos);

                // Read each line of the file and create a Dog object.
                while (fileScanner.hasNext()) // Test for end of file
                {
                    // Read next line from file
                    String str = fileScanner.nextLine();
                    Dog dog = new Dog(str);

                    if (dog.isValid())
                    {
                        System.out.println(dog);
                    }
                    else
                    {
                        System.out.println("Bad dog:");
                        System.out.println(str + "\n");
                    }

                    String serialstr = dog.Serialize();
                    pw.println(serialstr);
                }
                    pw.close();
                    System.out.println("End of file reached.");
                    System.out.println();

                    ok = true;
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("File " + in_filename + " was not found.");
                System.out.println();
            }
        }

        System.out.println("Program complete.");
    }
}