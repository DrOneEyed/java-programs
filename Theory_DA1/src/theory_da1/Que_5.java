package theory_da1;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que_5
{
    public static double mat_prod(double[] m1, double[] m2)
    {
        //using for loops to iterate through the matrix
        double sum = 0;
        for(int i = 0; i<3; i++)
        {
            //adding the product of two elements into sum
            sum += (m1[i]*m2[i]);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];
        
        // taking input of points awarded to diff contestents in diff categories
        for(int i = 0; i<3; i++)
        {
            // using i as case char to get the name
            String c = " ";
            switch(i)
            {
                case 0:
                    c = "Brielle";
                    break;
                case 1:
                    c = "Brynn";
                    break;
                case 2:
                    c = "Briana";
                    break;
                default:
                    break;
            }
            for(int j = 0; j<3; j++)
            {
                // using j as case char to get the category
                String s = " ";
                switch (j)
                {
                    case 0:
                        s = "Quilting";
                        break;
                    case 1:
                        s = "Butter Carying";
                        break;
                    case 2:
                        s = "Knitting";
                        break;
                    default:
                        break;
                }
                System.out.print("Enter The Points Earned By " + c + " In " + s +  " Category: ");
                m1[i][j] = scan.nextDouble();
            }
        }
        
        // taking input of points awarded to diff contestents in diff categories
        for(int i = 0; i<3; i++)
        {
            // using i as case char to get the name
            String c = " ";
            switch(i)
            {
                case 0:
                    c = "Brielle";
                    break;
                case 1:
                    c = "Brynn";
                    break;
                case 2:
                    c = "Briana";
                    break;
                default:
                    break;
            }
            for(int j = 0; j<3; j++)
            {
                // using j as case char to get the category
                String s = " ";
                switch (j)
                {
                    case 0:
                        s = "Quilting";
                        break;
                    case 1:
                        s = "Butter Carying";
                        break;
                    case 2:
                        s = "Knitting";
                        break;
                    default:
                        break;
                }
                System.out.print("Enter The Point Multiplyer Earned By " + c + " In " + s +  " Category: ");
                m2[i][j] = scan.nextDouble();
            }
        }
        
        // Displaying the price matrix
        System.out.println("The Number Of Person: ");
        for(int i = 0; i<3; i++)
        {
            // calling the fuction to multiply the matrices and get  the price matrix
            double prod = mat_prod(m1[i], m2[i]);
            System.out.print("[" + m1[i][0] + " " + m1[i][1] + " " + m1[i][2] + "] X [" + m2[i][0] + " " + m2[i][1] + " " + m2[i][2] + "] = " + prod + "\n");
        }
    }
}
