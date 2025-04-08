package problems.exceptionpractice;

public class ThrowThrows {

    static int method1(){
        return 10/0;
    }
    static void method2(){
        method1();
    }
    static void method3(){
        method2();
    }

    public static void main(String[] args) {
        try {
            method3();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
