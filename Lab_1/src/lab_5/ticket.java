/*
 Assume a ticket issuing machine. The following are the methods to be discussed with the system: 
 getBalance, getPrice, insertMoney, and printTicket. 
 Given a ticket number t1,t2,t3, or t4, the getPrice method should return a value containing the price of the 
 corresponding ticket that was set. The insertMoney method should accept the user input of money and 
 the getBalance to check if the amount entered is greater or equal to the price and display the balance to be returned.
 Once you have inserted enough money, the printTicket method will display the ticket number, amount entered 
 and the balance amount given.
 */
package lab_5;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class ticket
{
    private static int[] getBalance(int p, int im)
    {
        int b = 0;
        int f = 1;
        if(p>im)
        {
            System.out.println("You Entered Lower Amount Than Expected!\nTry Again!");
            f = 0;
        }
        else if(p<im){b = (im-p);}
        int arr[] = {f,b};
        return arr;
    }
    
    private static int getPrice(String t)
    {
        int p = 0;
        boolean f = true;
        switch(t)
        {
            case "t1":
                p = 100;
                break;
            case "t2":
                p = 200;
                break;
            case "t3":
                p = 300;
                break;
            case "t4":
                p = 400;
                break;
            default:
                f = false;
                break;
        }
        if(f){System.out.println("The Amount To Be Paid Is " + p);}
        else{System.out.println("There Is No Such Ticket As " + t.toUpperCase());}
        return p;
    }
    private static int[] insertMoney(int p)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Amount: ");
        int im = scan.nextInt();
        int arr[] = getBalance(p, im);
        if(arr[0] == 0){return insertMoney(p);}
        int arr2[] = {im, arr[1]};
        return arr2;
    }
    private static void printTicket(String t, int p, int im, int bal)
    {
        System.out.println("Ticket = " + t.toUpperCase() + "\nAmount To Be Paid = " + p + "\nAmount Paid = " + im + "\nBalance = " + bal);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Name Of Ticket You Need From T1, T2, T3, T4\nEnter: ");
        String t = scan.nextLine().toLowerCase();
        int p = getPrice(t);
        int arr[] = insertMoney(p);
        int amt = arr[0];
        int bal = arr[1];
        printTicket(t, p, amt, bal);
    }
}
