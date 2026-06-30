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

public class batsman
{
    int bcode;
    String bname;
    int innings;
    int notout;
    int runs;
    double bat_avg;
    static Scanner scan = new Scanner(System.in);
    
    static void calc_avg(batsman b[], int i)
    {
        b[i].bat_avg = b[i].runs / (b[i].innings - b[i].notout);
        System.out.println("Calculate!");
    }
    
    static void read_data(batsman b[], int i)
    {
        scan.nextLine();
        System.out.print("Enter The Name: ");
        b[i].bname = scan.nextLine();
        System.out.print("Enter The Code: ");
        b[i].bcode = scan.nextInt();
        System.out.print("Enter The Number Of Innings Played: ");
        b[i].innings = scan.nextInt();
        System.out.print("Enter The Number Of Matches He Was Notout: ");
        b[i].notout = scan.nextInt();
        System.out.print("Enter The Runs Sccored: ");
        b[i].runs = scan.nextInt();
    }
    
    static void display_data(batsman b[], int i)
    {
        System.out.println("Name: " + b[i].bname + "\nCode: " + b[i].bcode + "\nAverage Runs: " + b[i].bat_avg);
    }
    
    public static void main(String[] args)
    {
        int i = 0;
        batsman obj[] = new batsman[10];
        boolean f = true;
        int c;
        while(f)
        {
            System.out.println("Enter The Number Corresponding To You Choice Of Function!");
            System.out.print("\t1) To Add A Batsman's Information\n\t2) To Calculate The Avg Runs\n\t3) To Display The Data\n\t4) Next Batsman\n\t5) Exit\nEnter: ");
            c = scan.nextInt();
            switch(c)
            {
                case 1:
                    obj[i] = new batsman();
                    read_data(obj, i);
                    break;
                case 2:
                    calc_avg(obj, i);
                    break;
                case 3:
                    display_data(obj, i);
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