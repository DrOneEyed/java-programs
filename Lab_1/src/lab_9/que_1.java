/*
 The principal of a school has been decided to divide the students given in a file, 
 into two houses (teams) namely ODD and EVEN based on their name length. 
 If the name length is odd number, the student will be in the ODD house, else EVEN house.
 Help the Principal to complete the task. Input the filename with .txt extension and display the number of students in each house. 
 Also arrange the names in both the files in ascending order.
 */
package lab_9;

/**
 *
 * @author Vinayak Verma
 */

import java.io.*;
import java.util.*;

public class que_1
{
    public static void main(String[] args)
    {
        try 
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter The Name Of Student File: ");
            String stu = scan.nextLine();
            FileReader s = new FileReader(stu);
            BufferedReader bf = new BufferedReader(s);
            String line;
            ArrayList<String> names = new ArrayList<>();
            int i = 0;
            while((line = bf.readLine()) != null)
            {
                names.add(line);
            }
            Collections.sort(names);
            s.close();
            
            FileWriter e = new FileWriter("D:\\Vinu\\VIT\\CSE1007 - Java Prog\\Theory\\files\\even.txt");
            FileWriter o = new FileWriter("D:\\Vinu\\VIT\\CSE1007 - Java Prog\\Theory\\files\\odd.txt");
            int odd = 0, even = 0;
            for(String ss: names)
            {
                int l = ss.length();
                if(l % 2 == 0)
                {
                    e.write(ss + "\n");
                    even++;
                }
                else
                {
                    o.write(ss + "\n");
                    odd++;
                }
            }
            
            e.close();
            o.close();
            System.out.println("Names Sorted!\nNumber Of Even Names = " + even + "\nNumber Of Odd Names = " + odd);
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
