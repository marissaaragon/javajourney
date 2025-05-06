package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends Frame implements ActionListener {
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame3(){
        super("Text area demo");
        l = new Label("Enter text here");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b = new Button("Click");


        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ta.append(tf.getText());
    }
}

public class TextAreaOps {
    public static void main(String[] args){
        MyFrame3 f = new MyFrame3();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
