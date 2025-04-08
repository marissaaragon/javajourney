package problems.exceptionpractice;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions of a rectangle cannot be negative";
    }
}

public class ThrowThrows2 {

    static int area(int l, int b) throws NegativeDimensionException{
        if(l <= 0 || b <= 0){
            throw new NegativeDimensionException();
        }
        return l * b;
    }

    static void method1() throws NegativeDimensionException{
        System.out.println("Area is " + area(-10, 20));
    }


    public static void main(String[] args){
        try {
            method1();
        }catch (NegativeDimensionException e){
            System.out.println("Exception: " + e);
        }
    }
}
