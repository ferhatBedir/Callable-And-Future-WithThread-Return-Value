package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        CallableAndFutureClass callableAndFuture = new CallableAndFutureClass();
        callableAndFuture.returnValues();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                callableAndFuture.callableadd();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                callableAndFuture.callableProfit();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                callableAndFuture.callableMultiplication();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                callableAndFuture.callAbleDivision();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }
}

