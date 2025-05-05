package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener{
    int count = 0;
    Label l;
    Button b;

    public MyFrame(){
        super("Button Test");
        l = new Label("  "+ count);
        b = new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("  "+ count);
    }
}


public class ButtonDemo {
    public static void main(String[] args){
        MyFrame mf = new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);

    }
}
