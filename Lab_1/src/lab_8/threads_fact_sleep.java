/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

/**
 *
 * @author Vinayak Verma
 */


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
        suspend_flag=true;
        System.out.println(name + "sus");
    }
    
    synchronized void resume_thread()
    {
        suspend_flag=false;
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

public class threads_fact_sleep
{
    public static void main(String[] args)
    {
        threads obj1 = new threads("One");
        threads obj2 = new threads("Two");
        try
        {
            while(true)
            {
                obj1.suspend_thread();
                Thread.sleep(100);
                obj1.resume_thread();
                obj2.suspend_thread();
                Thread.sleep(100);
                obj2.resume_thread();
            }
                
        }
        catch(InterruptedException e){ }
    }
}
