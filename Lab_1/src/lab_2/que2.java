/*
customer name (n) choose 1 item of their choice for diff age grp[1-10][11-30][31-50]
items:
color pencil
Pen
Diary
Kettle
Toys
Umbrella
Socks
Coolers
*/

package lab_2;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class que2
{
    public static void main(String[] aags)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number Of Custumeres: ");
        int n = scan.nextInt();
        int age[] = new int[n];
        String name[] = new String[n];
        int gender[] = new int[n];
        int choice[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            scan.nextLine();
            System.out.print("Enter Your Name: ");
            name[i] = scan.nextLine();
            System.out.print("Please Enter The Number Coresponding To Your Gender:\n\t1) Male\n\t2) Female\nEnter: ");
            gender[i] = scan.nextInt();
            System.out.print("Enter Your Age: ");
            age[i] = scan.nextInt();
            System.out.println("Please Enter The Number Coresponding To The Elective Of Your Choice: ");
            System.out.print("\t1) color pencil\n\t2) Pen\n\t3) Diary\n\t4) Kettle\n\t5) Toys\n\t6) Umbrella\n\t7) Socks\n\t8) Coolers\nEnter: ");
            choice[i] = scan.nextInt();
        }
        /*int cm10 = 0;
        for(int i = 0; i<n; i++)
        {
            if(gender[i] == 1)
            {
                if(age[i]<=10)
                {
                    cm10
                }
            }
        }*/
        
    }
    
}
