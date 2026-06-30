package theory_da1;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que_4
{
    public static void mat_prod(int[][] m1, int[][] m2, int[][] sol)
    {
        //using for loops to iterate through the matrix
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<3; j++)
            {
                //using sum to get the sum of every row multiplication
                int sum = 0;
                for(int k = 0; k<2; k++)
                {
                    //adding the product of two elements into sum
                    sum += (m1[i][k]*m2[k][j]/100);
                }
                //adding the final product to the matrix
                sol[i][j] = sum;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][3];
        
        // taking input of number of students of diff sex in diff classes
        for(int i = 0; i<2; i++)
        {
            // using i as case char to find the class category
            String c = " ";
            switch(i)
            {
                case 0:
                    c = "Junior";
                    break;
                case 1:
                    c = "Senior";
                    break;
                default:
                    break;
            }
            for(int j = 0; j<2; j++)
            {
                // using j as case char to get the sex
                String s = " ";
                switch (j)
                {
                    case 0:
                        s = "Males";
                        break;
                    case 1:
                        s = "Females";
                        break;
                    default:
                        break;
                }
                System.out.print("Enter The Number Of " + s + " In " + c +  " Classes: ");
                m1[j][i] = scan.nextInt();
            }
        }
        
       // taking input of percentage of health of diff sex
        for(int i = 0; i<2; i++)
        {
            // using i as case char to get the sex
            String s = " ";
            switch (i)
            {
                case 0:
                    s = "Males";
                    break;
                case 1:
                    s = "Females";
                    break;
                default:
                    break;
            }
            for(int j = 0; j<3; j++)
            {
                // using j as case char to get their health
                String h = " ";
                switch (j)
                {
                    case 0:
                        h = "Healthy";
                        break;
                    case 1:
                        h = "Sick";
                        break;
                    case 2:
                        h = "Carrier";
                        break;
                    default:
                        break;
                }
                System.out.print("Enter The Percent Of " + s + " That Are " + h + ": ");
                m2[i][j] = scan.nextInt();
            }
        }
        
        // calling the fuction to multiply the matrices and get  the price matrix
        int[][] prod = new int[2][3];
        mat_prod(m1, m2, prod);
        
        // Displaying the price matrix
        System.out.println("The Number Of Person: ");
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(prod[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
