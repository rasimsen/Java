package com.oasissofttech.multithreading.tutorials;
// Java program to illustrate
 
public class OneThreadWithJoin extends Thread {
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
        OneThreadWithJoin c1 = new OneThreadWithJoin();
        OneThreadWithJoin c2 = new OneThreadWithJoin();
        c1.start();
 
        try {
            c1.join(); // Waiting for c1 to finish
        }
        catch (InterruptedException ie) {
        }
 
        c2.start();
    }
}