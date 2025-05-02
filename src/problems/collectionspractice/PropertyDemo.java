package problems.collectionspractice;

import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args){
        Properties p = new Properties();
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "I7");
        p.setProperty("OS", "Windows");
        p.setProperty("Model", "Latitude");

        System.out.println(p);
    }
}
