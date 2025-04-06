package problems.classpractice;

class Tv{
    public void turnOn(){
        System.out.println("Tv has been turned on.");
    }

    public void changeChannel(){
        System.out.println("Tv's channel has changed.");
    }

}

class SmartTv extends Tv{

    @Override
    public void turnOn(){
        System.out.println("Smart tv has been turned on.");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart tv's channel has been changed");
    }

    public void browse(){
        System.out.println("Smart tv is now browsing");
    }
}

public class Television {
    public static void main(String[] args){
        Tv t = new Tv();
        t.turnOn();
        t.changeChannel();

        SmartTv st = new SmartTv();
        st.turnOn();
        st.changeChannel();
        st.browse();

        //cannot use browse method because it is still a basic tv
        Tv nt = new SmartTv();
        nt.changeChannel();
        nt.turnOn();
    }
}
