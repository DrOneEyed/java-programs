/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dodo_java;

/**
 *
 * @author vinay
 */
import java.util.*;
        
public class Que5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (count == 1) {
            System.out.println("Enter Register number: ");
            int regNo = sc.nextInt();
            System.out.println("Number of books already in your account: ");
            int booksTaken = sc.nextInt();
            if(booksTaken>10){
                System.out.println("Exceeded the max issue criteria");
            }
            System.out.println("Select 1 for issue book or 2 to return book");
            int response = sc.nextInt();
            if (response == 1) {
                System.out.println("Enter number of books want to issue: ");
                int booksIssued = sc.nextInt();
                if (booksIssued + booksTaken > 10) {
                    System.out.println("Full, Can't issue more books");
                } else {
                    System.out.println("Books issued");
                    booksTaken += booksIssued;
                    System.out.println("Updated books taken: " + booksTaken);
                }
            } else if (response == 2) {
                System.out.println("Number of books wants to return: ");
                int booksReturned = sc.nextInt();
                if (booksReturned > booksTaken) {
                    System.out.println("You dont have that much issued books");
                } else {
                    System.out.println("Books Successfully returned");
                    booksTaken -= booksReturned;
                    System.out.println("Updated books taken: " + booksTaken);
                }
            } else {
                System.out.println("Check for correct response");
            }
            System.out.println("Enter 1 to continue or 0 to exit : ");
            int n = sc.nextInt();
            if (n == 1) {
                count = 1;
            } else if (n == 0) {
                count = 0;
            }
        }
    }
}