/*
 Imagine there are three food counters in a restaurant that distributes food for the customer. 
 Assume 'n' customers reach the restaurant for having food. The customers are serviced one at 
 time by the counter member. Make sure that no two customers are allowed to access the counter at t
 he same time. Also, calculate the number of customers served by each counter and the amount of sales done by them.
 (Note : Each customer visits the counter with the total bill amount)
 */
package lab_10;

/**
 *
 * @author Vinayak Verma
 */

import java.util.*;

class threads extends Thread
{
    String name;
    Thread t;
    boolean suspend_flag;
    int n;
    
    threads(String tname)
    {
        name = tname;
        t = new Thread(this,name);
        System.out.println(t);
        suspend_flag = false;
        t.start();
    }
    
    void suspend_thread()
    {
        suspend_flag = true;
        System.out.println(name + "sus");
    }
    
    synchronized void resume_thread()
    {
        suspend_flag = false;
        System.out.println(name + "res");
        notify();
    }
    
    @Override
    public void run()
    {
        try
        {
            if(name.equals("One") && suspend_flag != true)
            { 
                int fact = 1;
                for(int j = 1; j<n+1; j++)
                {
                    fact *= j;
                }
                System.out.println(name + "fact: " + fact);
            }
            else if(name.equals("Two"))
            {
                int i;
                for(i = 0; i<=50; i++)
                {
                    System.out.println(name + ": " + i);
                    synchronized(this)
                    {
                        while(suspend_flag)
                        {
                            wait();
                            n = i;
                        }
                    }
                }
            }
        }
        catch(InterruptedException e){ }
        System.out.println(name + " exiting");
    }
}

public class que_2
{
    
}
