package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Components extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;

    Components(){
        super("Swing Test");

        setLayout(new FlowLayout());
        l = new JLabel("Clicked " + count + " times.");
        b = new JButton("Click");

        add(l);
        add(b);
        b.addActionListener(this);
        getRootPane().setDefaultButton(b);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count + " times.");
    }
}

public class SwingComponents {
    public static void main(String[] args){
        Components c = new Components();
        c.setSize(500,500);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
