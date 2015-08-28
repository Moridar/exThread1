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
public class Ex1 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());
        Thread t3 = new Thread(new Task3());

        t1.start();
        t2.start();
        t3.start();
        try {
            sleep(10000);
            t3.interrupt();
        } catch (Exception e) {
        }
    }
}
