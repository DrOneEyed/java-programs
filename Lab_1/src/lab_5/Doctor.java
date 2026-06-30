/*
 Details of two disease and its symptoms are :
 Symptom 1  Fever                        Cold
 Symptom 2  HeadAche                     Cough
 Guidance   Dolo650 for 3 days (1-1-1)   CofStop Z Syrup 5ml 3 times a day
 
 The system allows the patient to share their symptoms. 
 It then processes users symptoms to check for various illness that could be associated with it. 
 If the system is not able to provide suitable results, it urges users to go visit a doctor.
 The system suggests a hospital based on their location provided by the patient.
 */
package lab_5;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Doctor
{
    public String dr_det(String loc)
    {
        String hosp;
        switch(loc)
        {
            case "delhi":
                hosp = "Indraprastha Apollo Hospital\nAddress:\nSarita Vihar, Delhi Mathura road,\nNew Delhi - 110076, India";
                break;
            case "gurugram":
                hosp = "Artemis Hospital\nAddress:\nSector 51, Gurugram,\nHaryana-122001, India";
                break;
            case "chennai":
                hosp = "Apollo Hospital\nAddress:\nPeriyamet, Chennai,\nTamil Nadu-600003, India";
                break;
            default:
                hosp = "Nearest National Hospital";
                break;
        }
        return hosp;
    }
}

class symptons extends Doctor
{
    static Scanner scan = new Scanner(System.in);
    static String s1, s2, g, loc, name;
    
    private static void symp(String s1, String s2, String loc)
    {
        if(s1.equals("fever") && s2.equals("headache")){System.out.println("Please Have Dolo650 for 3 days (1-1-1)");}
        else if(s1.equals("cold") && s2.equals("cough")){System.out.println("Please Have CofStop Z Syrup 5ml 3 times a day");}
        else
        {
            Doctor dr = new Doctor();
            String hos = dr.dr_det(loc);
            System.out.println("Please Recommed A Doctor At: " + hos);
        }
    }
    
    public static void main(String[] args)
    {
        System.out.print("Enter Your Name: ");
        name = scan.nextLine();
        System.out.print(name + " Please Enter First Sympton From:\nFever or Cold Or Other\nEnter: ");
        s1 = scan.nextLine().toLowerCase();
        System.out.print(name + " Please Enter Second Sympton From:\nHeadache or Cough or Other\nEnter: ");
        s2 = scan.nextLine().toLowerCase();
        System.out.print(name + " Please Enter Your Current Location: ");
        loc = scan.nextLine().toLowerCase();
        symp(s1, s2, loc);
    }
}