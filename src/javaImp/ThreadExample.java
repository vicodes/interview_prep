package javaImp;

public class ThreadExample extends Thread {

    public void run(){
        System.out.println("even");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        ThreadExample obj1 = new ThreadExample();
        obj1.start();
        ThreadExample obj2 = new ThreadExample();
        obj2.start();
    }
}
