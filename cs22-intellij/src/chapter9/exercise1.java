package chapter9;

import java.util.Scanner;

public class exercise1 {

    public static void displayMenu()
    {
        System.out.println("1) Test 1");
        System.out.println("2) Test 2");
        System.out.println("3) Test 3");
        System.out.println("4) Quit");
    } //end displayMenu

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int choice;

        do{
            displayMenu();
            choice = kb.nextInt();
            if(choice == 1)
            {
                System.out.println("Yet to be implemented");
            }
            else if(choice == 2)
            {
                System.out.println("Yet to be implemented");
            }
            else if(choice == 3)
            {
                System.out.println("Yet to be implemented");

            }
            else{
                System.exit(0);
            }
        }while(choice != 4);

    }//end main
}
