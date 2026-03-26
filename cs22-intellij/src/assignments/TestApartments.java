package assignments;
import assignments.Apartments;
import java.util.Scanner;

public class TestApartments {

    public static void displayMenu() {
        System.out.println("\nApartments Program");
        System.out.println("1) Prompt User for Apartment Info");
        System.out.println("2) Find Potential Match");
        System.out.println("3) Quit");
    }

    public static void main(String[] args) {
        // Fixed: Removed the double comma after the 202 entry
        Apartments[] apartments = {
                new Apartments(101, 1, 1, 1200), new Apartments(102, 2, 1, 1500),
                new Apartments(201, 2, 2, 1750), new Apartments(202, 3, 2, 2100),
                new Apartments(301, 1, 1, 1100), new Apartments(302, 3, 3, 2500),
                new Apartments(401, 2, 2, 1800), new Apartments(402, 2, 1, 1450),
                new Apartments(501, 1, 2, 1350), new Apartments(502, 4, 3, 3000)
        };

        Scanner kb = new Scanner(System.in);
        int choice;

        // Fixed: Initialized variables so the code can compile
        int minBed = 0;
        double minBath = 0;
        double maxRent = 0;

        do {
            displayMenu();
            System.out.print("Choice: ");
            choice = kb.nextInt();

            if (choice == 1) {
                System.out.print("Enter minimum bedrooms required: ");
                minBed = kb.nextInt();
                System.out.print("Enter minimum bathrooms required: ");
                minBath = kb.nextDouble(); // Changed to double for 1.5/2.5 baths
                System.out.print("Enter maximum rent willing to pay: ");
                maxRent = kb.nextDouble();

            } else if (choice == 2) {
                boolean found = false; // Reset found state for every new search
                System.out.println("\nSearching for: " + minBed + " bed, " + minBath + " bath, max $" + maxRent);

                for(Apartments apt : apartments) {
                    // Logic Fix: Rent must be LESS THAN OR EQUAL to maxRent
                    if(apt.getNumberOfBedrooms() >= minBed &&
                            apt.getNumberOfBaths() >= minBath &&
                            apt.getRentAmount() <= maxRent)
                    {
                        System.out.println(apt.toString());
                        found = true;
                    }
                }

                if(!found) {
                    System.out.println("Sorry, no Apartments meet your criteria");
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                System.exit(0);
            }
        } while(choice != 3); // Better to loop until 3 is pressed specifically
    }
}