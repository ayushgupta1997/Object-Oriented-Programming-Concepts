/*
     * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush Gupta
 */
public class Simple1 extends Thread{
    public void run( ){
        System.out.println("task one");
    }
}
class Simple2 extends Thread{
    public void run( ){
        System.out.println("task two");
    }
}
class TestMultitasking3 {
    public static void main(String[] args) {
        Simple1 t1 = new Simple1();
        Simple2 t2 = new Simple2();
        t1.start();
        t2.start();
    }
}
