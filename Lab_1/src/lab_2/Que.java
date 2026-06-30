//reg_no name list 3 elective aand let choose for 10 numbers then sort on choices 

package lab_2;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number Of Students: ");
        int n = scan.nextInt();
        String reg_no[] = new String[n];
        String name[] = new String[n];
        int elective[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            scan.nextLine();
            System.out.print("Enter Your Registration Number: ");
            reg_no[i] = scan.nextLine();
            System.out.print("Enter Your Name: ");
            name[i] = scan.nextLine();
            System.out.println("Please Enter The Number Coresponding To The Elective Of Your Choice: ");
            System.out.print("\t1) Network Security\n\t2) Psychology\n\t3) AI\nEnter: ");
            elective[i] = scan.nextInt();
        }
        int max = 0;
        int ii = 0;
        for(int i = 1; i<4; i++)
        {
            int nos = 0;
            System.out.println("The Registration Number Of Students Who Oppted For Elective Number " + (i+1) + ": ");
            for(int j = 0; j<n; j++)
            {
                if(i == elective[j])
                {
                    System.out.println(reg_no[j]);
                    nos++;
                }
            }
            if(nos>max){max = nos; ii=i;}
        }
        System.out.print("The Elective For Next Semester Will Be ");
        switch (ii)
        {
            case 1:
                System.out.println("Network Security!");        
                break;
            case 2:
                System.out.println("Psychology!");
                break;
            case 3:
                System.out.println("AI!");
                break;
            default:
                break;
        }
        System.out.println("As " + max + " Students Oppted For It!");
    }
}