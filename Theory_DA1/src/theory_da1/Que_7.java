/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theory_da1;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

public class Que_7
{
    public static void mat_prod(double [][] m1, double[][] m2, double[][] sol)
    {
        //using for loops to iterate through the matrix
        for(int i = 0; i<3; i++)
        {
            //using sum to get the sum of every row multiplication
            double sum = 0;
            for(int j = 0; j<3; j++)
            {
                //adding the product of two elements into sum
                sum += (m1[i][j]*m2[j][0]);
            }
            //adding the final product to the matrix
            sol[i][0] = sum;
        }
    }
    
    public static double det(double[][] mat)
    {
        double d = 0.0;
        for(int i = 0; i<3; i++)
        {
            //using the mathematical formula to calculate the determinant
            d += (mat[0][i] * (mat[1][(i+1)%3]*mat[2][(i+2)%3] - mat[1][(i+2)%3]*mat[2][(i+1)%3]));
        }
        return d;
    }
    
    public static void inv(double[][] mat, double[][] inv_mat)
    {
        double d = det(mat);
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                //finding the inverse of matrix using mathematical logic
                inv_mat[i][j] = (((mat[(j+1)%3][(i+1)%3] * mat[(j+2)%3][(i+2)%3]) - (mat[(j+1)%3][(i+2)%3] * mat[(j+2)%3][(i+1)%3]))/d);
            }
        }
           
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double mat1[][] = new double[3][3];
        double mat2[][] = new double[3][1];
        System.out.print("Enter The Coefficients Of Each Variable In The Following Form:\n(ax + by + cz = d)\nWhere a, b, c, d are Coefficients\nIf No Variable Is Present Then Put A Zero\nEnter:\n");
        
        //using for loops to take the input of all the constants
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                //taking input of constants on the left side of equals sign
                mat1[i][j] = scan.nextDouble();
            }
            //taking input of constants on the right side of equals sign
            mat2[i][0] = scan.nextDouble();
        }
        
        //calculating the inverse of the matrix 1
        double inv_mat[][] = new double[3][3];
        inv(mat1, inv_mat);
        
        //calculaang the product of inv(matrix 1) and matrix 2 as it gives the values of matrix x as(A * X = B => X = ((A)^-1) * B
        double x[][] = new double[3][1];
        mat_prod(inv_mat, mat2, x);
                
        //printing the values
        for(int i = 0; i<3; i++)
        {
            //using switch case to get the name of flower
            String f = "";
            switch(i)
            {
                case 0:
                    f = "Rose";
                    break;
                case 1:
                    f = "Tulips";
                    break;
                case 2:
                    f = "Lillies";
                    break;
                default:
                    break;
            }
            //since one bouquet wiil have 1/5 of total flowers, thus we will divide the value of x by 5
            System.out.println("Number Of " + f + " For A Bouquet = " + Math.round(x[i][0]/5));
        }
    }
}
