/*
Using separate arrays create a personal phone directory that contains  first names and phone numbers for 20 people. Using the "Directory.txt" Download "Directory.txt"
write a program that will use Scanner class to read this text file, retrieve the first name and phone number for each person, and store in appropriate arrays (parallel).

Once these names are in the arrays, prompt user for a name, search for the name, and if name is found in the array, display the corresponding phone number.
If name is not found, prompt the user to enter a phone number, and add the new name and phone number to the arrays. Continue to prompt the user for names until
the user enters "quit" or until arrays are full. After the arrays are full (containing 20 names) or the user enters quit,
do not allow the user  to add new entries. Print the full directory once program ends. Save the file as PhoneNumbers.java. Upload file once complete.
 */
package assignments;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PhoneNumbers {

    public static void main(String[] args) {
        final int MAX_SIZE = 20;
        String[] names = new String[MAX_SIZE];
        String[] phoneNumbers = new String[MAX_SIZE];
        int count = 0;

        // 1. Read from Directory.txt
        try {
            File file = new File("C:\\Users\\BigBoss424\\IdeaProjects\\cs22-intellij\\src\\assignments\\Directory.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext() && count < MAX_SIZE) {
                names[count] = fileScanner.next();
                if (fileScanner.hasNext()) {
                    phoneNumbers[count] = fileScanner.next();
                }
                count++;
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Directory.txt not found. Starting with an empty directory.");
        }

        // 2. User interaction loop
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";

        while (count < MAX_SIZE) {
            System.out.print("Enter a name to search (or 'quit' to stop): ");
            userInput = keyboard.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }

            // Search for the name
            int foundIndex = -1;
            for (int i = 0; i < count; i++) {
                if (names[i].equalsIgnoreCase(userInput)) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex != -1) {
                // Name found
                System.out.println("Phone number: " + phoneNumbers[foundIndex]);
            } else {
                // Name not found, add new entry
                System.out.println("Name not found.");
                System.out.print("Please enter the phone number for " + userInput + ": ");
                String newNumber = keyboard.nextLine();

                names[count] = userInput;
                phoneNumbers[count] = newNumber;
                count++;

                System.out.println("New entry added.");
            }

            if (count >= MAX_SIZE) {
                System.out.println("The directory is now full.");
            }
        }

        // 3. Final Directory Print
        System.out.println("\n--- Final Phone Directory ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s %s\n", names[i], phoneNumbers[i]);
        }

        keyboard.close();
    }

}
