//************************************************
//  Author: Steven Smail
//
//  Dog.java
//
//  Represents a dog.
//************************************************
public class Dog
{
    // Instance variables
    private String name;
    private String breed;
    private String age;
    private boolean isValid;

    //-----------------------------------------------------
    // Constructor - Sets up a dog object from one line
    // of a Comma Separated Values file.
    //-----------------------------------------------------
    public Dog(String dog_info)
    {
        String[] dogs = dog_info.split(",");

        if (dogs.length == 3)
        {
            this.name = dogs[0];
            this.breed = dogs[1];
            this.age = dogs[2];
            isValid = true;
        }
        else
        {
            isValid = false;
        }
    }

    //------------------------------------------------------
    // Returns a single string with all dog components
    // in a printable format.
    //------------------------------------------------------
    public String toString()
    {
        if (this.isValid)
        {
            return
                this.name + "\t" +
                this.breed + "\t" +
                this.age;
        }
        else
        {
            return "Invalid dog\n";
        }
    }

    //------------------------------------------------------
    // Returns a single string with all dog components
    // suitable for input by a Java program or by Excel.
    //------------------------------------------------------
    public String Serialize()
    {
        if (this.isValid)
        {
            int i = Integer.parseInt(this.age);

            return
                this.name + "," +
                this.breed + "," +
                (i + 1);
        }
        else
        {
            return "\n";
        }
    }

    //------------------------------------------------------
    // Returns a boolean that says whether or not the
    // dog is valid.
    //------------------------------------------------------
    public boolean isValid()
    {
       return this.isValid;
    }

}