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

public class que_2
{
    static boolean is_vow(char s)
    {
        return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u';
    }
    
    public static void main(String[] args)
    {
        try 
        {
            FileReader e = new FileReader("D:\\Vinu\\VIT\\CSE1007 - Java Prog\\Theory\\files\\english.txt");
            FileWriter pl = new FileWriter("D:\\Vinu\\VIT\\CSE1007 - Java Prog\\Theory\\files\\pig_latin.txt");
            BufferedReader bf = new BufferedReader(e);
            String line;
                        
            while((line = bf.readLine()) != null)
            {
                String words[] = line.split(" ");
                for(String word : words)
                {
                    char at_1 = Character.toLowerCase(word.charAt(1));
                    char at_0 = Character.toLowerCase(word.charAt(0));
                    if(is_vow(at_0))
                    {
                        if(is_vow(at_1))
                        {
                            word += "ay ";
                            pl.write(word);
                        }
                        else
                        {
                            word += "way ";
                            pl.write(word);
                        }
                    }
                    else
                    {
                        if(!is_vow(at_1))
                        {
                            pl.write(word.substring(2,word.length()) + word.charAt(0) + word.charAt(1) + "ay ");
                        }
                        else
                        {
                            pl.write(word.substring(1,word.length()) + word.charAt(0) + "ay ");
                        }
                    }
                }
                pl.write("\n");
            }
            
            e.close();
            pl.close();
            System.out.println("Converted Contents Of 'english.txt' To 'piglatin.txt'!");
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

