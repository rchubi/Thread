package com.company;

/**
 * Created by Roman on 08.11.2018.
 */
public class ThreadTwoSecondInterval extends Thread {

    public void run() {
        for (int i=0; i < 5; i++) {
            System.out.println("Hello, world");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
