/*
 Get the register no, name, school (SCOPE, SELECT, SENSE, SMBS). Validate the register number and 
 thrown exceptions if the year is invalid, course code invalid (BCE, BAI, BRS, BEE, BME, BEC), roll 
 number invalid exceptions. Otherwise, if the entered register number is valid, open a file and store 
 the information into the file.
 */
package lab_10;

/**
 *
 * @author Vinayak Verma
 */

import java.io.*;
import java.util.*;

public class NewClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.print("Enter Your Registeration Number: ");
            String r_no = scan.nextLine();
            System.out.print("Enter Your Name: ");
            String name = scan.nextLine();
            System.out.print("Enter Your School Name: ");
            String school = scan.nextLine();
            if(r_no.substring(0,2).equals("20"))
            {
                String[] c_code = {"BCE", "BAI", "BRS", "BEE", "BME", "BEC"};
                String chk_code = r_no.substring(2,5);
                if(chk_code.equals(c_code[0]) || chk_code.equals(c_code[1]) || chk_code.equals(c_code[2]) || chk_code.equals(c_code[3]) || chk_code.equals(c_code[4]) || chk_code.equals(c_code[5]))
                {
                    int num = Integer.parseInt(r_no.substring(5));
                    if(num < 1000 || num > 1999)
                    {
                        throw new Roll_NoException(num);
                    }
                    else
                    {
                        FileWriter data = new FileWriter("D:\\Vinu\\VIT\\CSE1007 - Java Prog\\Theory\\files\\reg_data.txt", true);
                        BufferedWriter bw = new BufferedWriter(data);
                        bw.write("\n" + r_no + "\t" + name + "\t" + school);
                        bw.close();
                        data.close();
                    }
                }
                else
                {
                    throw new Course_CodeException(chk_code);
                }
            }
            else
            {
                throw new YearException(r_no.substring(0,2));
            }
                
        }
        catch (YearException | Course_CodeException | Roll_NoException ex)
        {
            System.out.println(ex);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File Was Not Found At The Location!");
        }
        catch (IOException ex)
        {
            System.out.println("File Was Not Created At The Location!");
        }
    }
}

class YearException extends Exception
{
    String s;
    YearException(String a)
    {
        s = a;
    }
        
    @Override
    public String toString()
    {
        return(s + " Is Not A Valid Year!");
    }
}

class Course_CodeException extends Exception
{
    String s;
    Course_CodeException(String a)
    {
        s = a;
    }
        
    @Override
    public String toString()
    {
        return(s + " No Such Course Code!");
    }
}

class Roll_NoException extends Exception
{
    int s;
    Roll_NoException(int a)
    {
        s = a;
    }
        
    @Override
    public String toString()
    {
        return(s + " Roll Number Out Of Range!");
    }
}
