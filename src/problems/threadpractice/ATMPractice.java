package problems.threadpractice;

class ATM{
    synchronized public void checkBalance(String name) {
        System.out.print(name + " checking balance...");
        try{Thread.sleep(1000);}catch (Exception e){}
        System.out.println("Balance");
    }

    synchronized void withdraw(String name, int amount) {
        System.out.print(name + " withdrawing...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(amount);
    }


}

class Customer extends Thread{
    String name;
    int amount;
    ATM atm;

    Customer(String name, ATM a, int amt){
        this.name = name;
        atm = a;
        amount = amt;
    }

    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run(){
        useATM();
    }

}

public class ATMPractice {
    public static void main(String [] args){
        ATM atm = new ATM();
        Customer c1 = new Customer("John", atm,1000);
        Customer c2 = new Customer("Jack", atm, 2000);
        c1.start();
        c2.start();
    }
}
