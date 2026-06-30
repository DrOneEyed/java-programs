package theory_da1;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que_3
{
    public static void mat_prod(double[][] m1, double[][] m2, double[][] sol)
    {
        //using for loops to iterate through the matrix
        for(int i = 0; i<3; i++)
        {
            
            for(int j = 0; j<3; j++)
            {
                //using sum to get the sum of every row multiplication
                double sum = 0;
                for(int k = 0; k<3; k++)
                {
                    //adding the product of two elements into sum
                    sum += (m1[i][k]*m2[k][j]);
                }
                //adding the final product to the matrix
                sol[i][j] = (sum/10);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];
        
        // taking input of nuts and their nutri
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                // using j as case char to get the type of nutri
                String nutri = " ";
                switch (j)
                {
                    case 0:
                        nutri = "Protein";
                        break;
                    case 1:
                        nutri = "Carbs";
                        break;
                    case 2:
                        nutri = "Fat";
                        break;
                    default:
                        break;
                }
                System.out.print("Enter The Amount Of " + nutri + " In Nut Type " + (i+1) +  ": ");
                m1[j][i] = scan.nextDouble();
            }
        }
        
       // taking input of different mixtures
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                // using j as case char to get the type of nut
                String nut = " ";
                switch (j)
                {
                    case 0:
                        nut = "Almond";
                        break;
                    case 1:
                        nut = "Cashews";
                        break;
                    case 2:
                        nut = "Pecans";
                        break;
                    default:
                        break;
                }
                System.out.print("Enter The Number Of Cups In Mixture " + (i+1) + " Of " + nut + ": ");
                m2[j][i] = scan.nextDouble();
            }
        }
        
        // calling the fuction to multiply the matrices and get  the price matrix
        double[][] prod = new double[3][3];
        mat_prod(m1, m2, prod);
        
        // Displaying the price matrix
        System.out.println("The Amount of Nutir Per Cup: ");
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(prod[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
