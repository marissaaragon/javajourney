package awt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame4 extends Frame implements ItemListener {
    List l;
    Choice c;
    TextArea ta;

    MyFrame4(){
        l = new List(4,true);
        c = new Choice();
        ta = new TextArea(20,30);

        l.add("Sunday");
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");

        c.add("Jan");
        c.add("Feb");
        c.add("Mar");
        c.add("Apr");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==l){
            ta.setText(l.getSelectedItem());
        }else{
            ta.setText(c.getSelectedItem());
        }
    }
}

public class ListBoxTest {
    public static void main(String[] args){
        MyFrame4 f = new MyFrame4();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
