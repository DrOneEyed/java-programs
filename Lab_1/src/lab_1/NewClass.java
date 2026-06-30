/**
 *
 * @author Vinayak Verma
 */
package lab_1;

//Completely importing a lib
import java.util.*;

public class NewClass
{
    int c = 6;
    public static void main(String[] args)
    {
        //defining a object of class to use non static var
        NewClass obj = new NewClass();
        System.out.println("Enter The Numbers: ");
        //taking the input of int
        Scanner scan = new Scanner(System.in);
        /*use nextInt for integers
          use nextDouble for decimal
          use next for str
          use nextLine to take input of a line
        */
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b + obj.c;
        System.out.println("Sum = "+sum);
    }
}
