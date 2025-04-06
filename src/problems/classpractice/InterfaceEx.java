package problems.classpractice;

class Phone{
    public void call(){ System.out.println("Phone call");}
    public void sms(){ System.out.println("Phone sending text");}
}

interface ICamera{
    void click();
    void record();
}

interface IMusic{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusic{
    public void videoCall(){System.out.println("Phone starting video call");}
    public void click(){System.out.println("Taking photo");}
    public void record(){System.out.println("Recording video");}
    public void play(){System.out.println("Playing song");}
    public void stop(){System.out.println("Stopping song");}
}

public class InterfaceEx {
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone();
        sp.click();
        sp.videoCall();
        sp.play();
    }
}
