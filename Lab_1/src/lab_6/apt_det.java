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

public class apt_det
{
    String name = "Vin";
    String block_no = "B";
    String flat_no = "83";
    double amt_to_pay = 20000.0;
    double mainten_amt_to_pay = 1000.0;
    double amt_paid = 0.0;
    double amt_due = 0.0;
    double mainten_amt_paid = 0.0;
    double mainten_amt_due = 0.0;
    String phone = "8826027591";
    static Scanner scan = new Scanner(System.in);
    
    static void insert(apt_det a[], int i)
    {
        scan.nextLine();
        System.out.print("Enter The Name: ");
        a[i].name = scan.nextLine();
        System.out.print("Enter The Block Number: ");
        a[i].block_no = scan.nextLine();
        System.out.print("Enter The Flat Number: ");
        a[i].flat_no = scan.nextLine();
        System.out.println("Amount Due: " + a[i].amt_to_pay);
    }
    
    static void amt_due_flat(apt_det a[], int i)
    {
        System.out.print("Enter The Amount You Paid: ");
        a[i].amt_paid = scan.nextDouble();
        a[i].amt_due = a[i].amt_to_pay - a[i].amt_paid;
        System.out.println("\tUpdated\nAmount Due: " + a[i].amt_due);
        a[i].amt_to_pay = a[i].amt_due;
    }
    
    static void maintenance_amt(apt_det a[], int i)
    {
        System.out.print("Enter The Maintenance Amount You Paid: ");
        a[i].mainten_amt_paid = scan.nextDouble();
        a[i].mainten_amt_due = a[i].mainten_amt_to_pay - a[i].mainten_amt_paid;
        System.out.println("Maintenace Amount Due: " + a[i].mainten_amt_due);
        a[i].mainten_amt_to_pay = a[i].mainten_amt_due;
    }
    
    void del(apt_det a)
    {
        
    }
    
    public static void main(String[] args)
    {
        int i = 0;
        apt_det obj[] = new apt_det[10];
        boolean f = true;
        int c;
        while(f)
        {
            System.out.println("Enter The Number Corresponding To You Choice Of Function!");
            System.out.print("\t1) To Add A Residence Information\n\t2) To Check For Due Amount Of Flat\n\t3) To Check For Due Amount Of Maintenance\n\t4) Next Residence\n\t5) Exit\nEnter: ");
            c = scan.nextInt();
            switch(c)
            {
                case 1:
                    obj[i] = new apt_det();
                    insert(obj, i);
                    break;
                case 2:
                    amt_due_flat(obj, i);
                    break;
                case 3:
                    maintenance_amt(obj, i);
                    break;
                case 4:
                    i++;
                    break;
                case 5:
                    f = false;
                    break;
                default:
                    break;
            }
        }
    }
}
