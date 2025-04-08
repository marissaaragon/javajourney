package problems.exceptionpractice;

public class TestEx {
    public static void main(String[] args) {
        try {
            int[] A = {10,0,5,2,7};
            int a = 10;
            int b = 0;
            int c = A[12] / A[1];
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        }
    }
}
