package ru.geekbrains.lesson5;


import java.util.Arrays;

public class MainApp {

    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    static class ThreadedArray implements Runnable {
        float[] arr;
        int threadNum;

        ThreadedArray(float[] arr, int threadNum) {
            this.arr = arr;
            this.threadNum = threadNum;
        }

        @Override
        public void run() {
            final long timeCalculationArrayBefore = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            final long timeCalculationArrayFinal = System.currentTimeMillis() - timeCalculationArrayBefore;
            System.out.println("Время обработки формулы в массиве (поток " + threadNum + "): " + timeCalculationArrayFinal + " мс");
        }
    }

    public static void main(String[] args) {
        firstMethod();
       /* dividedArray();*/

    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }
}











   /* public static void main(String[] args) throws InterruptedException {
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

        System.out.println("END");
    }
}

class MyRunnableTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread out: " + i);
            }
        }*/

