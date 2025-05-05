package awt;
import java.awt.*;

public class FirstAppVariation extends Frame{
    Label l;
    TextField tf;
    Button b;

    public FirstAppVariation() {
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name:");
        tf = new TextField(20);
        b = new Button("Submit");

        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args){
        FirstAppVariation fa = new FirstAppVariation();
        fa.setSize(300,300);
        fa.setVisible(true);
    }
}
