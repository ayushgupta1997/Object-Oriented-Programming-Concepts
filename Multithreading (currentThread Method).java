/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush Gupta
 */
public class TestCurrentThread extends Thread{
    public void run() {
         System.out.println("he "+ Thread.currentThread().getName());  // --->current thread here is Thread-0
    }
    public static void main(String[] args) {
        TestCurrentThread t1 = new TestCurrentThread();
        t1.start();
        //System.out.println("he "+ t1.currentThread().getName()); ---->this will print Main as the currrent thread ;)
        
    }
}
