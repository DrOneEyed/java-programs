/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_9;

/**
 *
 * @author Vinayak Verma
 */

import java.io.*;

public class que_3
{
    public static void main(String[] args)
    {
        try 
        {
            FileReader convo = new FileReader("D:\\Vinu\\VIT\\CSE1007 - Java Prog\\Theory\\files\\file conversation.txt");
            FileWriter p1 = new FileWriter("D:\\Vinu\\VIT\\CSE1007 - Java Prog\\Theory\\files\\Person1.txt");
            FileWriter p2 = new FileWriter("D:\\Vinu\\VIT\\CSE1007 - Java Prog\\Theory\\files\\Person2.txt");
            BufferedReader bf = new BufferedReader(convo);
            String line;
            while((line = bf.readLine()) != null)
            {
                String words[] = line.split(" ");
                if(words[0].equals("Person1:"))
                {
                    p1.write(line.substring(9) + "\n");
                }
                else if(words[0].equals("Person2:"))
                {
                    p2.write(line.substring(9) + "\n");
                }
            }
            
            convo.close();
            p1.close();
            p2.close();
            System.out.println("Conversation Sorted!");
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
