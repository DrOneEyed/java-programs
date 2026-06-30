/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_6;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class survey
{
    static Scanner scan = new Scanner(System.in);
    int id_no;
    int no_m;
    double house_income;
    static double avg_income;
    static int[] above_avg_l = new int[100];
    static int[] below_poverty_l = new int[100];
    static int aal = 0, bpl = 0;
    
    static void insert(survey s[], int i)
    {
        System.out.print("Enter The House Number: ");
        s[i].id_no = scan.nextInt();
        System.out.print("Enter The Number Of People In House: ");
        s[i].no_m = scan.nextInt();
        System.out.print("Enter The Household Income: ");
        s[i].house_income = scan.nextDouble();
        avg_income += s[i].house_income;
    }
    
    static void above_avg(survey s[], int i)
    {
        for(int j = 0; j<i; j++)
        {
            if(s[j].house_income > avg_income){above_avg_l[aal++] = (j+1);}
        }
        above_avg_l[aal] = '\0';
    }
    
    static void below_poverty(survey s[], int i)
    {
        for(int j = 0; j<i; j++)
        {
            double p = 7500.00 + 950.00 * (s[j].no_m - 2);
            if(s[j].house_income < p){below_poverty_l[bpl++] = (j+1);}
        }
        below_poverty_l[bpl] = '\0';
    }
    
    static void display()
    {
        System.out.println("All Houseolds With Above Average Income: ");
        if(aal == 0){System.out.println("None");}
        else
        {
            for(int j = 0; j<aal; j++)
            {
                System.out.println(above_avg_l[j]);
            }
        }
        System.out.println("All Houseolds Below Poverty Line: ");
        if(bpl == 0){System.out.println("None");}
        else
        {
            for(int j = 0; j<bpl; j++)
                {
                    System.out.println(below_poverty_l[j]);
                }
        }
    }
    
    public static void main(String[] args)
    {
        System.out.print("Enter The Number Of Houses: ");
        int n = scan.nextInt();
        survey obj[] = new survey[n];
        int i;
        for(i = 0; i<n; i++)
        {
            obj[i] = new survey();
            insert(obj, i);
        }
        avg_income /= n;
        above_avg(obj, i);
        below_poverty(obj, i);
        display();
    }
}
