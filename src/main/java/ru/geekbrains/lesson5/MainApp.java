package ru.geekbrains.lesson5;



public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableTask());
        Thread thread2 = new Thread(new MyRunnableTask());
        thread1.start();
        thread2.start();
        Thread thread =new Thread();


        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        thread.join();
        System.out.println(Thread.currentThread().getName());
    }
}

class MyRunnableTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread out: " + i);
            }
        }
    }
