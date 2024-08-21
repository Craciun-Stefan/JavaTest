package Wrappers;

public class MainThreads {

    public static void main(String[] args) {
      MultiThread myThread1 = new MultiThread();
    //  myThread1.run();
      MultiThread myThread2 = new MultiThread();
     // myThread2.run();
        myThread2.start();
        myThread1.start();
    }
}
