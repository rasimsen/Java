package com.oasissofttech.multithreading.tutorials;

// Java program to illustrate
// thread without join()
 
public class OneThreadWithoutJoinMethod extends Thread {
    public void run()
    {
        System.out.println("geeks ");
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("forgeeks ");
    }
    public static void main(String[] args)
    {
        OneThreadWithoutJoinMethod c1 = new OneThreadWithoutJoinMethod();
        OneThreadWithoutJoinMethod c2 = new OneThreadWithoutJoinMethod();
        c1.start();
        c2.start();
    }
}