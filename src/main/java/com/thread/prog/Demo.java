package com.thread.prog;

//ThreadDemo.java

class MyRunnable implements Runnable {
 private String threadName;

 public MyRunnable(String threadName) {
     this.threadName = threadName;
 }

 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(threadName + " - Count: " + i);
         try {
             Thread.sleep(500); // pause for 0.5 seconds
         } catch (InterruptedException e) {
             System.out.println(threadName + " interrupted.");
         }
     }
     System.out.println(threadName + " finished execution.");
 }
}

public class Demo {
 public static void main(String[] args) {
     Runnable r1 = new MyRunnable("Thread-1");
     Runnable r2 = new MyRunnable("Thread-2");
     Runnable r3 = new MyRunnable("Thread-3");

     Thread t1 = new Thread(r1);
     Thread t2 = new Thread(r2);
     Thread t3 = new Thread(r3);

     t1.start(); // Start first thread
     t2.start(); // Start second thread
     t3.start();
     
 }
}

