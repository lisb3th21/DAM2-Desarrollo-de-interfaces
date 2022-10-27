package tareaGridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    DetailsPanel details;
    public MainFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set layout manager
        setLayout(new BorderLayout());

        //create swing component
        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click me!");

        details = new DetailsPanel();

        //add swing component to content pane 

        Container c = getContentPane();

        c.add(textArea, BorderLayout.CENTER);
        c.add(button, BorderLayout.SOUTH);
        c.add(details, BorderLayout.WEST);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("hello \n");
                
            }
            
        });
    }

    public static void main(String[] args) {
        MainFrame f= new MainFrame("holaaa");
        f.setVisible(true);
    }
}
