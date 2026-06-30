/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_cat;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

class credit_card
{
    int cc_no;
    String name;
    int phone_no;
    String exp_date;
    String email;
    double credit_limit;
}

public class test_class
{
    static Scanner scan = new Scanner(System.in);
    
    static void input(credit_card cc[], int i)
    {
        System.out.print("Enter The Credit Card Number: ");
        cc[i].cc_no = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter The Name: ");
        cc[i].name = scan.nextLine();
        System.out.print("Enter The Phone Number: ");
        cc[i].phone_no = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter The Expiry Date: ");
        cc[i].exp_date = scan.nextLine();
        System.out.print("Enter The Email ID: ");
        cc[i].email = scan.nextLine();
        System.out.print("Enter The Credit Limit: ");
        cc[i].credit_limit = scan.nextDouble();
    }
    
    static void disp_cc_det(credit_card cc[], int i)
    {
        System.out.print("Enter The Phone Number To Find The Related Credit Card Numbers: ");
        int pno = scan.nextInt();
        for(int j = 0; j<i; j++)
        {
            if(pno == cc[j].phone_no)
            {
                System.out.println("Credi Card Number: " + cc[j].cc_no + " Is Registered Under " + cc[j].name);
            }
        }
    }
    
    static void disp_cc_det_exp(credit_card cc[], int i)
    {
        System.out.print("Enter The Year To Find The Related Credit Card Numbers Due On The Same: ");
        String exp_year = scan.nextLine();
        for(int j = 0; j<i; j++)
        {
            if(exp_year.equals(cc[j].exp_date.substring(0,5)))
            {
                System.out.println("Credi Card Number: " + cc[j].cc_no + " Is Registered Under " + cc[j].name + "\nEmail ID: " + cc[i].email);
            }
        }
    }
    
    static void inc_cc_limit(credit_card cc[], int i)
    {
        int[] i_done = new int[10];
        int ii = 0;
        for(int j = 0; j<i; j++)
        {
            int noc = 0;
            int[] i_to_do = new int [10];
            int itd = 0;
            for(int k = 0; k<i; k++)
            {
                if(cc[j].phone_no == cc[k].phone_no && j != k)
                {
                    noc++;
                    i_to_do[itd++] = k;
                }
            }
            if(noc > 3)
            {
                cc[j].credit_limit += 50000;
                for(int l = 0; l<itd; l++)
                {
                    cc[l].credit_limit += 50000;
                }
                i_done[ii++] = cc[j].phone_no;
            }
            else if(noc > 1)
            {
                cc[j].credit_limit += 50000;
                for(int l = 0; l<itd; l++)
                {
                    cc[l].credit_limit += 50000;
                }
                i_done[ii++] = cc[j].phone_no;
            }
        }
        for(int j = 0; j<i; j++)
        {
            System.out.println("Credi Card Number: " + cc[j].cc_no + "\tCredit Limit: " + cc[j].credit_limit);
        }
    }
    
    public static void main(String[] args)
    {
        System.out.print("Enter The Number Of Customers: ");
        int n = scan.nextInt();
        credit_card obj[] = new credit_card[n];
        int i = 0;
        for(i = 0; i<n; i++)
        {
            System.out.println("Enter The Details Of Customer Number " + (i+1));
            obj[i] = new credit_card();
            input(obj, i);
        }
        disp_cc_det(obj, i);
        disp_cc_det_exp(obj, i);
        inc_cc_limit(obj, i);
    }
}
