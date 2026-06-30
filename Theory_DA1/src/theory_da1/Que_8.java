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

public class Que_8
{
    public static void mat_prod(double [][] m1, double[][] m2, double[][] sol)
    {
        //using for loops to iterate through the matrix
        for(int i = 0; i<2; i++)
        {
            //using sum to get the sum of every row multiplication
            double sum = 0;
            for(int j = 0; j<2; j++)
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
        //using the mathematical formula to calculate the determinant
        double d = (mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0]);
        return d;
    }
    
    public static void mat_i_a(double[][] mat, double [][] i_mat)
    {
        int I[][] = {{1, 0}, {0, 1}};
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                i_mat[i][j] = I[i][j] - mat[i][j];
            }
        }
    }
    
    public static void inv(double[][] mat, double[][] inv_mat)
    {
        double i_mat[][] = new double[2][2];
        //subtracting matrix A from matrix I as we have taken out the matrix x out as common
        mat_i_a(mat, i_mat);
        double d = det(i_mat);
        //finding the inverse of matrix using mathematical logic
        double temp = i_mat[0][0];
        i_mat[0][0] = i_mat[1][1];
        i_mat[1][1] = temp;
        i_mat[0][1] = -i_mat[0][1];
        i_mat[1][0] = -i_mat[1][0];
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                inv_mat[i][j] = (i_mat[i][j]/d);
            }
        }
    }
    
    public static String indu(int i)
    {
        String s = "";
        switch(i)
        {
            case 0:
                s = "Energy";
                break;
            case 1:
                s = "Manufacturing";
                break;
            default:
                break;
        }
        return s;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double mat1[][] = new double[2][2];
        double mat2[][] = new double[2][1];
        
        //using for loops to take the input of all the constants
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                String str = indu(j);
                //taking input energy for internal maufacturing and energy
                System.out.print("Enter The Amount Of " + str + ": ");
                mat1[i][j] = scan.nextDouble();
            }
        }
        
        for(int i = 0; i<2; i++)
        {
            String str = indu(i);
            System.out.print("Enter The Capacity Of " + str + " Production: ");
            mat2[i][0] = scan.nextDouble();
        }
        
        //fiding the product of the matrix to find the amount of each type needed
        double prod[][] = new double[2][2];
        mat_prod(mat1, mat2, prod);
        
        for(int i = 0; i<2; i++)
        {
            //using switch to get the industry type
            String s = indu(i);
            System.out.println("Total Amount Of " + s + " Need = $" + Math.round(prod[i][0]*10)/10.0 + " Million");
        }
        
        double mat3[][] = new double[2][2];
        for(int i = 0; i<2; i++)
        {
            String str = indu(i);
            System.out.print("Enter The Worth Of " + str + ": ");
            mat3[i][0] = scan.nextDouble();
        }
        
        //calculating the inverse of the matrix 1
        double inv_mat[][] = new double[2][2];
        inv(mat1, inv_mat);
        
        //calculaang the product of inv(matrix 1) and matrix 2 as it gives the values of matrix x as(A * X = B => X = ((A)^-1) * B
        double x[][] = new double[2][1];
        mat_prod(inv_mat, mat3, x);
                
        //printing the values
        for(int i = 0; i<2; i++)
        {
            //using switch to get the industry type
            String s = indu(i);
            System.out.println("The Industry Must Produce $" + Math.round(x[i][0]*10)/10.0 + " Million Worth Of " + s);
        }
    }
}
