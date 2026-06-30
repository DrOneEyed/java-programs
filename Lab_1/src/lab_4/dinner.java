/*
* Assume your organization is interested in arranging a dinner for all the employees.
* In this regard, it started collecting information like name, emp-no, starter, main-course and desert choices to
* fix the one what majority of people likes. Use array of object to find and select the dinner menu.
*/
package lab_4;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class dinner
{
    String name;
    int emp_no;
    int starter;
    int main;
    int desert;
    
    public static int get_max(int n, dinner obj[], int t)
    {
        int max = 0;
        int ii = 0;
        for(int i = 1; i<4; i++)
        {
            int nos = 0;
            for(int j = 0; j<n; j++)
            {
                switch(t)
                {
                    case 1:
                        if(i == obj[j].starter)
                        {
                            nos++;
                        }
                        break;
                    case 2:
                        if(i == obj[j].main)
                        {
                            nos++;
                        }
                        break;
                    case 3:
                        if(i == obj[j].desert)
                        {
                            nos++;
                        }
                        break;
                }
            }
            if(nos>max){max = nos; ii=i;}
        }
        return ii;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number Of Employees: ");
        int n = scan.nextInt();
        dinner obj[] = new dinner[n];
        for(int i = 0; i<n; i++)
        {
            obj[i] = new dinner();
            scan.nextLine();
            System.out.print("Enter Your Name: ");
            obj[i].name = scan.nextLine();
            System.out.print("Enter Your Employee Number: ");
            obj[i].emp_no = scan.nextInt();
            System.out.println("\nEnter Your Choice As The Coresponding Number: ");
            System.out.print("\n\t1) Momos\n\t2) Chilli Panner\n\t3) Honey Chilli Potato\nEnter: ");
            obj[i].starter = scan.nextInt();
            System.out.print("\n\t1) Panner Dhaniya Adraki\n\t2) Thai Green Curry\n\t3) Dosa\nEnter: ");
            obj[i].main = scan.nextInt();
            System.out.print("\n\t1) Chocolate Pudding\n\t2) Gulab Jamun\n\t3) Ice-cream\nEnter: ");
            obj[i].desert = scan.nextInt();
        }
        int s_n = get_max(n, obj, 1);
        int m_n = get_max(n, obj, 2);
        int d_n = get_max(n, obj, 3);
        switch(s_n)
        {
            case 1:
                System.out.println("Starter Of Choice Is Momos!");
                break;
            case 2:
                System.out.println("Starter Of Choice Is Chilli Panner!");
                break;
            case 3:
                System.out.println("Starter Of Choice Is Honey Chilli Potato!");
                break;
            default:
                break;
        }
        switch(m_n)
        {
            case 1:
                System.out.println("Main Course Of Choice Is Panner Dhaniya Adraki!");
                break;
            case 2:
                System.out.println("Main Course Of Choice Is Thai Green Curry!");
                break;
            case 3:
                System.out.println("Main Course Of Choice Is Dosa!");
                break;
            default:
                break;
        }
        switch(d_n)
        {
            case 1:
                System.out.println("Desert Of Choice Is Chocolate Pudding!");
                break;
            case 2:
                System.out.println("Desert Of Choice Is Gulab Jamun!");
                break;
            case 3:
                System.out.println("Desert Of Choice Is Ice-cream!");
                break;
            default:
                break;
        }
    }
}
