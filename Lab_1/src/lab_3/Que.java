/*onduct a survey among  5 candidates, getting their name, and hobby. 
Hobby is reading books, hobby is watching movie, hobby is dancing, hobby is sports 
(get their responses in the form of yes / no. Find out the following using array of objects:*/
package lab_3;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que
{
    String name;
    char h_r_b;
    char h_w_m;
    char h_d;
    char h_s;
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Que obj[] = new Que[5];
        for(int i = 0; i<5; i++)
        {
            obj[i] = new Que();
            System.out.print("Enter Your Name: ");
            obj[i].name = scan.nextLine();
            System.out.println("\nEnter Your Choice As Yes/No (Y/N): ");
            System.out.print("Do You Like To Read Books?\nAns: ");
            obj[i].h_r_b = scan.next().charAt(0);
            System.out.print("Do You Like To Watch Movie?\nAns: ");
            obj[i].h_w_m = scan.next().charAt(0);
            System.out.print("Do You Like To Dance?\nAns: ");
            obj[i].h_d = scan.next().charAt(0);
            System.out.print("Do You Like To Play Sports?\nAns: ");
            obj[i].h_s = scan.next().charAt(0);
            scan.nextLine();
        }
        for(int i = 0; i<5; i++)
        {
            if(obj[i].h_r_b == 'Y' && obj[i].h_w_m == 'Y' && obj[i].h_s == 'N' && obj[i].h_d == 'N')
            {
                System.out.println(obj[i].name + " Likes To Read Books And Watch Movies!");
            }
            else if(obj[i].h_r_b == 'Y' && obj[i].h_w_m == 'N' && obj[i].h_s == 'Y' && obj[i].h_d == 'N')
            {
                System.out.println(obj[i].name + " Likes To Read Books And Play Sports!");
            }
            else if(obj[i].h_r_b == 'N' && obj[i].h_w_m == 'Y' && obj[i].h_s == 'N' && obj[i].h_d == 'N')
            {
                System.out.println(obj[i].name + " Likes To Watch Movies!");
            }
            
        }
    }
}
