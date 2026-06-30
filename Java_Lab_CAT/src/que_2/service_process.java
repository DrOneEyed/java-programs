/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que_2;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

class service
{
    int serv_req_no;
    String name;
    String ACM;
    String serv_type;
    class complaint_date
    {
        int day;
        int month;
        int year;
    }
    double bill_amt;
}

public class service_process
{
    static Scanner scan = new Scanner(System.in);
    
    static void input(service s[], int i, service.complaint_date[] in)
    {
        System.out.print("Enter The Service Request Number: ");
        s[i].serv_req_no = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter The Name: ");
        s[i].name = scan.nextLine();
        System.out.print("Enter The ACM Details(Y/N): ");
        s[i].ACM = scan.nextLine();
        System.out.print("Enter The Service Type(GS/PR): ");
        s[i].serv_type = scan.nextLine();
        System.out.print("Enter The Date\nDay: ");
        in[i].day = scan.nextInt();
        System.out.print("Month: ");
        in[i].month = scan.nextInt();
        System.out.print("Year: ");
        in[i].year = scan.nextInt();
    }
    
    static void cal_bill(service s[], int i)
    {
        for(int j = 0; j<i; j++)
        {
            if("Y".equals(s[j].ACM))
            {
                if("GS".equals(s[j].serv_type))
                {
                    s[j].bill_amt = 0;
                }
                else
                {
                    s[j].bill_amt = 1000;
                }
            }
            else
            {
                if("GS".equals(s[j].serv_type))
                {
                    s[j].bill_amt = 500;
                }
                else
                {
                    s[j].bill_amt = 2000;
                }
            }
        }
    }
    
    static void disp_cust_det(service s[], int i, service.complaint_date[] in)
    {
        System.out.print("Enter The Service Number To Display Details: ");
        int srn = scan.nextInt();
        for(int j = 0; j<i; j++)
        {
            if(srn == s[j].serv_req_no)
            {
                System.out.println("Service Request Number: " + s[j].serv_req_no + "\nName: " + s[j].name + "\nService Type" + s[j].serv_type + "\nBill Amount" + s[j].bill_amt + "\nDate: " + in[j].day + "/" + in[j].month + "/" + in[j].year);
            }
        }
    }
    
    static void disp_serv_month(service s[], int i, service.complaint_date[] in)
    {
        System.out.print("Enter The Month Number To Display All The Services In The Specific Month: ");
        int mon = scan.nextInt();
        int tot = 0;
        for(int j = 0; j<i; j++)
        {
            if(mon == in[j].month)
            {
                tot++;
            }
        }
        System.out.println("Total Number Of Services = " + tot);
    }
    
    public static void main(String[] args)
    {
        System.out.print("Enter The Number Of Customers: ");
        int n = scan.nextInt();
        service obj[] = new service[n];
        service.complaint_date[] in = new service.complaint_date[n];
        int i = 0;
        for(i = 0; i<n; i++)
        {
            System.out.println("Enter The Details Of Customer Number " + (i+1));
            obj[i] = new service();
            input(obj, i, in);
        }
        cal_bill(obj, i);
        disp_cust_det(obj, i, in);
        disp_serv_month(obj, i, in);
    }
}