package awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Frame3 extends Frame implements MouseListener, MouseMotionListener {
    Label l,l2;

    public Frame3(){
        super("Mouse event test");

        l = new Label("");
        l2 = new Label("");
        setLayout(null);

        l.setBounds(10,50,100,20);
        l2.setBounds(10,80,100,20);
        add(l);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse moved");
        l2.setText("("+ e.getX() + ","+ e.getY()+ ")");
    }
}

public class MouseTest {
    public static void main(String[] args){
        Frame3 f = new Frame3();
        f.setSize(500,500);
        f.setVisible(true);
    }

}
