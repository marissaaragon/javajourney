package problems.threadpractice;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while(true){
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class RunnableTest {
    public static void main(String[] args){
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        int i = 1;
        while (true){
            System.out.println(i + "world");
            i++;
        }
    }
}
