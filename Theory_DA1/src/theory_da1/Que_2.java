/*The following matrix consists of a shoe store’s inventory of flip flops, clogs, and Mary Janes in sizes small, medium, and large:
The store wants to know how much their inventory is worth for all the shoes. How should we set up the matrix multiplication to 
determine this the best way?*/
package theory_da1;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que_2
{
    public static void mat_prod(int [][] m1, int[][] m2, int[][] sol)
    {
        //using for loops to iterate through the matrix
        for(int i = 0; i<3; i++)
        {
            //using sum to get the sum of every row multiplication
            int sum = 0;
            for(int j = 0; j<3; j++)
            {
                //adding the product of two elements into sum
                sum += (m1[j][i]*m2[j][0]);
            }
            //adding the final product to the matrix
            sol[i][0] = sum;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int[][] pri = new int[3][1];
        
        // taking input of number of shoes
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                // using j as case char to get the size of the shoe
                char size = ' ';
                switch (j)
                {
                    case 0:
                        size = 'S';
                        break;
                    case 1:
                        size = 'M';
                        break;
                    case 2:
                        size = 'L';
                        break;
                    default:
                        break;
                }
                System.out.print("Enter The Number Of Shoes Of Type " + (i+1) + " In Size " + size + ": ");
                mat[i][j] = scan.nextInt();
            }
        }
        
        // taking input of price of each type of shoes
        for(int j = 0; j<3; j++)
        {
            System.out.print("Enter The Price Of Shoes Of Type " + (j+1) + ": ");
            pri[j][0] = scan.nextInt();
        }
        
        // calling the fuction to multiply the matrices and get  the price matrix
        int[][] prod = new int[3][1];
        mat_prod(mat, pri, prod);
        
        // Displaying the price matrix
        System.out.println("The Price: ");
        for(int i = 0; i<3; i++)
        {
            System.out.print(prod[i][0] + "\t");
            System.out.print("\n");
        }
    }  
}
