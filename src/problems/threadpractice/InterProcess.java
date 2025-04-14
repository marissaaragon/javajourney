package problems.threadpractice;

class Data{
    int value = 0;
    boolean flag = true;

    synchronized void set(int v) {
        while (!flag) {
            try { wait(); } catch (Exception e) {}
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized int get() {
        while (flag) {
            try { wait(); } catch (Exception e) {}
        }
        int x = value;
        flag = true;
        notify();
        return x;
    }

}

class Producer extends Thread{
    Data data;

    public Producer(Data d){
        data = d;
    }

    public void run(){
        int count = 1;
        while(true){
            data.set(count);
            count++;
        }
    }
}

class Consumer extends Thread{
    Data data;

    public Consumer(Data d){
        data = d;
    }

    public void run(){
        int value;
        while(true){
            value = data.get();
            System.out.println("Consumer " + value);
        }
    }
}


public class InterProcess {

    public static void main(String [] args){
        Data d = new Data();
        Consumer c =  new Consumer(d);
        Producer p = new Producer(d);

        p.start();
        c.start();

    }
}
