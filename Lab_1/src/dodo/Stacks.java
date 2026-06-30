/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dodo;

/**
 *
 * @author vinay
 */

import java.util.*;

public class Stacks<T> {
    private ArrayList<T> data;
    private int top = 0, MAX = 50;
    T item;
    private Scanner scan = new Scanner(System.in);
    
    public Stacks() {
        data = new ArrayList<T>();
    }

    public void push() {
        int i;
        if(top == MAX)
        {
            System.out.println("Staack is Full");
        }
        else
        {
            System.out.println("Enter:");
            item = scan.next();
            data.add(item);
            top++;
        }
    }

    public void pop() {
        if (top == 0) {
            System.out.println("Empty");
        }
        item = data.remove(data.size() - 1);
        top--;
        System.out.println("Removed");
    }

    public void peek() {
        if (top == 0) {
            System.out.println("Empty");
        }
        System.out.println(data.get(data.size() - 1));
    }
    
    public void disp(){
        int i;
        for(i = top; i!=0; i--)
        {
            System.out.println(data.get(i));
        }
    }
    
    public int main(String args[])
    {
        int con=1, x;
        do{
            System.out.println("enter ur choice l.push\n2.pop\n3.peek\n4.disp\n5.exit");
            x = scan.nextInt();
            switch(x)
            {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    disp();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            
        }
        while(con == 1);
        return 0;
    }
}

