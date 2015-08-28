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
public class Task3 implements Runnable {

    @Override
    public void run() {
        int i = 10;
        while (true) {
            System.out.println("Task3: "+ i++);
            try {
                sleep(3000);
            } catch (Exception e) {
                System.out.println("Task3 sleep interruptd");
                break;
            }

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task3());
        t1.start();
        try {
            sleep(10000);
            t1.interrupt();
        } catch (Exception e) {
            t1.interrupt();
        }
        
               

    }
}
