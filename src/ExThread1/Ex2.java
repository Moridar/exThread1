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
public class Ex2 implements Runnable {
    Even e;
    public Ex2(Even even){
        this.e = even;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5000000; i++) {
            int j = e.next();
            if(j % 2 == 1) System.out.println(j);
        }}
    
    
    public static void main(String[] args) {
        Even e = new Even();
        
        Thread t1 = new Thread(new Ex2(e));
        Thread t2 = new Thread(new Ex2(e));
        t1.start();
        t2.start();
        }
    
}

class Even {

    private int n = 0;

    public synchronized int next() {
        n++;
        n++;
        return n;
    }
}