package com.oasissofttech.multithreading.tutorials;

// Java program to illustrate
// isAlive()
 
public class OneThread extends Thread {
    public void run()
    {
        System.out.println("geeks ");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("forgeeks ");
    }
    public static void main(String[] args)
    {
        OneThread c1 = new OneThread();
        OneThread c2 = new OneThread();
        c1.start();
        c2.start();
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}