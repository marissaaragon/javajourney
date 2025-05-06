package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame2 extends Frame implements TextListener, ActionListener{
    Label l1,l2;
    TextField tf;

   MyFrame2(){
        super("Textfield demo");
        l1 = new Label("No text entered");
        l2 = new Label("Enter key not yet hit");
        tf = new TextField(20);

        tf.addTextListener(this);
        tf.addActionListener(this);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
    }
}

public class TextFieldsDemo {
    public static void main(String[] args){
        MyFrame2 f = new MyFrame2();
        f.setSize(400,400);
        f.setVisible(true);
    }

}
