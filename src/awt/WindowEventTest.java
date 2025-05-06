package awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Frame4 extends Frame implements WindowListener {
    Label l;

    public Frame4(){
        super("Window event test");
        l = new Label("");

        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}

public class WindowEventTest {
    public static void main(String[] args){
        Frame4 f = new Frame4();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
