package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to your neighborhood library!\n");
        System.out.println("------- Home -------");
        System.out.println();

        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Exit\n");

        boolean condition = false;
        int choice;

        while (!condition){
            System.out.print("Your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            if(choice > 0 && choice <= 3){
                condition = true;
            } else {
                System.out.println("Invalid choice, please try again.\n");
            }
        }
    }

}
