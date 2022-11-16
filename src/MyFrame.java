import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ChangeListener {

    JPanel panel;
    JLabel label;
    JSlider slider;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setLayout(new FlowLayout());
        this.setSize(500,500);
        
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("°C = " + slider.getValue());


        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);
        this.add(panel);
        
        // this.pack();
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());
    }
    
    
    
}
