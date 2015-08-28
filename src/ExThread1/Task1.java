/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExThread1;

/**
 *
 * @author Computer
 */
public class Task1 implements Runnable{

    @Override
    public void run() {
        long counter = 0;
        for (int i = 0; i <= 1000000000; i++) {
            counter += i;
            
        }
        System.out.println("Task1: " + counter);
    }
    
    public static void main(String[] args) {
        Thread task1 = new Thread(new Task1());
        task1.start();
    }
       
}
