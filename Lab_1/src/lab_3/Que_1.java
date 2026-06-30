package lab_3;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que_1
{
    String name;
    double cur;
    double prev;
    double unit;
    double price;
    
    public static double price_cal(double u)
    {
        double p;
        if(u<=100){p = 0;}
        else if(u<100 && u<200){p = 1.5 * u;}
        else if(u<200 && u<500){p = 3 * u;}
        else{p = 6.6 * u;}
        return p;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number Of Customers: ");
        int n = scan.nextInt();
        Que_1 obj[] = new Que_1[n];
        for(int i = 0; i<n; i++)
        {
            scan.nextLine();
            obj[i] = new Que_1();
            System.out.print("Enter The Name: ");
            obj[i].name = scan.nextLine();
            System.out.print("Enter The Previous Reading: ");
            obj[i].prev = scan.nextDouble();
            System.out.print("Enter The Current Reading: ");
            obj[i].cur = scan.nextDouble();
            obj[i].unit = obj[i].cur - obj[i].prev;
            obj[i].price = price_cal(obj[i].unit);
        }
        for(int i = 0; i<n; i++)
        {
            System.out.println("\n\tDetails Of Customer Number " + (i+1) + ":\n");
            System.out.println("Name: " + obj[i].name);
            System.out.println("Previous Reading = " + obj[i].prev + "\nCurrent Reading = " + obj[i].cur);
            System.out.println("Units Consumed = " + obj[i].unit + "\nPrice = " + obj[i].price);
        }
    }
}