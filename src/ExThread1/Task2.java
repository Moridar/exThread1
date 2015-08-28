/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExThread1;

import static java.lang.Thread.sleep;

/**
 *
 * @author Computer
 */
public class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
             System.out.println("Task2: " + (1+i));
             try {
                sleep(2000);
            } catch (Exception e) {
                 System.out.println("Task2 sleep interruptd");
            }
             
            
        }
    }
    
    public static void main(String[] args) {
        new Thread(new Task2()).start();
        
    }
    
    
}
