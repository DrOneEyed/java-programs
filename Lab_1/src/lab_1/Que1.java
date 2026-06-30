package lab_1;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que1 
{
    String Reg;
    static String name;
    public static void main(String[] args)
    {
        Que1 obj = new Que1();
        int age;
        String qual, ph_no, gen, address;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Reg No.: ");
        obj.Reg = scan.nextLine();
        System.out.print("Enter The Name: ");
        name = scan.nextLine();
        System.out.print("Enter The Age: ");
        age = scan.nextInt();
        System.out.println("Enter The Date Of Birth: ");
        System.out.print("Day: ");
        int day = scan.nextInt();
        System.out.print("Month: ");
        int month = scan.nextInt();
        System.out.print("Year: ");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter The Qualification: ");
        qual = scan.nextLine();
        System.out.print("Enter The Phone No.: ");
        ph_no = scan.nextLine();
        System.out.print("Enter The Gender: ");
        gen = scan.nextLine();
        System.out.print("Enter The Address: ");
        address = scan.nextLine();
        System.out.println("Reg No.: " + obj.Reg);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date Of Birth: " + day + "/" + month + "/" + year);
        System.out.println("Qualification: " + qual);
        System.out.println("Phone No.: " + ph_no);
        System.out.println("Gender: " + gen);
        System.out.println("Address: " + address);
    }
}
