package tareaGridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class ButtonsPanel extends JPanel {
    public ButtonsPanel(){
        //Dimension size = getPreferredSize();
       // size.width=200;
        //setPreferredSize(size);
        //setMinimumSize(size);
        setBorder(BorderFactory.createTitledBorder("detalles"));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        for (int i = 0; i < 10; i++) {
            JButton bt1 = new JButton("Button "+i);
            gc.weighty=0.1;
            gc.gridx=0;
            gc.gridy=i;
            add(bt1, gc);
        }
        
        setAutoscrolls(true);
    }
}
