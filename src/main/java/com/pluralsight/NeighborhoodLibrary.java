package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[20];
        int numOfAvailableBooks = 3;

        books[0] = new Book(123457, "1000001", "Harry Potter and the Goblet of Fire by J.K. Rowling", false, "");
        books[1] = new Book(123458, "1000002", "Carrie by Stephen King", false, "");
        books[2] = new Book(123459, "1000003", "Dune by Paul Atreides", false, "");

        System.out.println("Welcome to your neighborhood library!");


        boolean condition1 = false;
        boolean bigCondition = false;
        int choice = 0;
        int choice2 = 0;
        String name = "";

        while(!bigCondition){
            while (!condition1){
                System.out.println("\n------- Home -------");
                System.out.println();
                System.out.println("1. Show Available Books");
                System.out.println("2. Show Checked Out Books");
                System.out.println("3. Exit\n");
                System.out.print("Your choice: ");
                choice = scan.nextInt();
                scan.nextLine();

                if(choice > 0 && choice <= 3){
                    condition1 = true;
                } else {
                    System.out.println("Invalid choice, please try again.");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("------- Available Books -------\n");
                    int j = 1;
                    for (int i = 0; i < books.length; i++) {
                        if ((books[i] != null) && !books[i].isCheckedOut()){
                            System.out.println(j + ". " + books[i].toString());
                            j+=1;
                        }
                    }
                    System.out.println("\n" + j + ". | " + "Exit to home screen");

                    System.out.println("\nPlease check out a book or choose exit");
                    System.out.print("Your choice (1-" + j + "): ");

                    choice2 = scan.nextInt();
                    scan.nextLine();

                    if(choice2 != (j)){
                        System.out.print("Please enter your name: ");
                        name = scan.nextLine();

                        books[choice2 - 1].checkOut(name);
                        books[choice2 - 1].setCheckedOutTo(name);
                        books[choice2 - 1].setCheckedOut(true);
                        numOfAvailableBooks -= 1;
                    } else {
                        condition1 = false;
                    }

                    break;
                case 2:

                    break;
                case 3:
                    bigCondition = true;
                    break;
                default:
                    break;
            }
        }


    }

}
