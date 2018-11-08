package com.company;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
//        try {
//            sleppOneSecond();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        queueTwoThread();

        
    }

    public static void queueTwoThread() {
        ThreadTwoSecondInterval threadTwoSecondInterval = new ThreadTwoSecondInterval();
        Runnable runnable = new ThreadThreeSecondInterval();
        Thread thread = new Thread(runnable);

        threadTwoSecondInterval.start();
        thread.start();
        try {
            threadTwoSecondInterval.join();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("My name is Roman");
    }
    public static void sleppOneSecond() throws InterruptedException {
        for (int i=0; i < 10; i++) {
            System.out.println("I study Java");
            sleep(1000);

        }
    }
}
