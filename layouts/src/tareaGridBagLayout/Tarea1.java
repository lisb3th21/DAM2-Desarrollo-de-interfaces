package tareaGridBagLayout;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tarea1 extends JFrame{
    ButtonsPanel buttons;
public Tarea1(String title){
    super(title);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setMinimumSize(new Dimension(350, 350));
    //set layout manager

    setLayout(new BorderLayout());

    //create swing component
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("Click me!");
    buttons = new ButtonsPanel();
    //add swing component to content pane 
    JScrollPane scroll = new JScrollPane(buttons);
        scroll.setViewportView(buttons);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(10, 10, buttons.getWidth(), buttons.getHeight());
        
buttons.setAutoscrolls(true);
    Container c = getContentPane();

    c.add(textArea, BorderLayout.CENTER);
    c.add(button, BorderLayout.SOUTH);
    c.add(buttons, BorderLayout.WEST);

    button.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.append("hello \n");
            
        }
        
    });

    

    
}

    public static void main(String[] args) {
  Tarea1 t = new Tarea1("gosd");
        t.setVisible(true);
    }
}
