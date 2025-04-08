package problems.exceptionpractice;


class Stack{
    private int top = -1;
    private int size;
    private int[] s;

    public Stack(int size){
        this.size = size;
        this.s = new int[size];
    }

    public void push(int x) throws StackOverflowError{
        if(top == size-1){
            throw new StackOverflowError();
        }
        top++;
        s[top] = x;
    }

    public int pop() throws StackUnderflowError{
        int x = -1;
        if(top == -1){
            throw new StackUnderflowError();
        }
        x = s[top];
        top--;
        return x;
    }

}

class StackOverflowError extends Exception{
    public String toString(){
        return "Stack is full";
    }
}

class StackUnderflowError extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}
public class StackEx {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        try{
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
        }catch (StackOverflowError e){
            System.out.println(e);
        }
    }
}
