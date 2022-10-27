package tareaGridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;


public class DetailsPanel extends JPanel {
    
    public DetailsPanel(){
        Dimension size = getPreferredSize();
        size.width = 200;
        setPreferredSize(size);

        setBorder(BorderFactory.createTitledBorder("detalles"));

        JLabel nameLabel = new JLabel("Name: ");
        JLabel occupation = new JLabel("Occupation: ");
        JTextField nameField = new JTextField(10);
        JTextField occupationField = new JTextField(10);

        JButton addBtn = new JButton("Add");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
    }
}
