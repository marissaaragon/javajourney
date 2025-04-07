package problems.classpractice;
import java.util.*;

class Account{
    private String accountNumber;
    private static int count = 1;

    private String assignAccountNumber(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        String aNum = "Bank-" + year + "-" + count;
        count++;
        return aNum;
    }

    Account(){
       accountNumber = assignAccountNumber();
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}

public class StaticPractice {
    public static void main(String[] args){
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();
        System.out.println(a1.getAccountNumber());
        System.out.println(a2.getAccountNumber());
        System.out.println(a3.getAccountNumber());
    }
}
