package com.company;

import static java.lang.Thread.sleep;

/**
 * Created by Roman on 08.11.2018.
 */
public class ThreadThreeSecondInterval implements Runnable {
    public void run() {
        for (int i=0; i < 5; i++) {
            System.out.println("Peace in the peace");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
