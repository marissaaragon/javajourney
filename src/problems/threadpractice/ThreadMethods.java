package problems.threadpractice;

class MyT extends Thread{
    public void run(){
        int count = 1;
        while (true){
            System.out.println(count++);
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) throws Exception {
       MyT t = new MyT();
       t.setDaemon(true);
       t.start();

       Thread mainThread = Thread.currentThread();
       mainThread.join();
    }
}
