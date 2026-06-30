package theory_da1;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que_1
{
    //function to find the cofactors of a matrix
    static void Cofactor(int mat[][], int temp[][], int c, int n)
    {
        int i = 0, j = 0;
        
        // Looping for each element of the matrix
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                // Copying the elements which are not present in the row into temporary matrix
                if (row != 0 && col != c)
                {
                    // Using variables to iterate each element for cofactor
                    temp[i][j++] = mat[row][col];
                    
                    // Reseting j to 0 and increasing the i by 1
                    if (j == n-1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
    
    // Recursive function for finding determinant of matrix.
    static int area(int mat[][], int n)
    {
        int result = 0;
        if (n == 1){return mat[0][0];}
        int temp[][] = new int[3][3];
        int sign = 1;
 
        // Iterate for each element of first row
        for (int f = 0; f < n; f++)
        {
            // Getting Cofactor of mat[0][f]
            Cofactor(mat, temp, f, n);
            result += sign * mat[0][f] * area(temp, n - 1);
 
            //Change the sign(Due to formula of deteminant
            sign = -sign;
        }
        return result;
    }
    
    //main function or Driver code
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][] mat = new int[3][3];
        
        // taking input of values
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                // since triangles have only x and y coordinates we have to set the last values as 1
                // checking if we are adding to the last element of the row
                if(j == 2){mat[i][j] = 1;}
                else
                {
                    System.out.print("Enter The Value of point(" + (i+1) + ", " + (j+1) + "): ");
                    mat[i][j] = scan.nextInt();
                }
            }
        }
        
        // Displaying the matrix
        System.out.println("The Matrix: ");
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                 System.out.print(mat[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        // calling the function to calculate the deteminant
        int d = area(mat, 3);
        
        // calculating the area
        float a = (float) (0.5*d);
        
        // checking if the determent is -ve or +ve
        if(a<0){a*=-1;}
        System.out.println("Area Of Triangle = " + a);
    }
}