package src.java.main;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.*;

public class login implements ActionListener {
    private String user_name;
    private String user_pass;
    JTextField userfield = new JTextField("enter username", 20);
    JTextField userpass = new JTextField("enter pass", 20);
    JButton signButton = new JButton("Sign In");

    public void prepareGui() {
        //set constructors
        JFrame frame = new JFrame();
        JTextField userfield = new JTextField("enter username", 20);
        JTextField userpass = new JTextField("enter pass", 20);
        JButton signButton = new JButton("Sign In");

        //frame attr
        frame.setTitle("Login Page");
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(500, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //login panel attr
        JPanel pan1 = new JPanel(new BorderLayout());
        pan1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pan1.add(userfield,BorderLayout.NORTH);
        pan1.add(userpass,BorderLayout.CENTER);
        pan1.add(signButton,BorderLayout.SOUTH);
        
        frame.setContentPane(pan1);
        frame.pack();

        signButton.addActionListener(this);

        /* frame.getContentPane().add(userfield, BorderLayout.NORTH);
        frame.getContentPane().add(userpass, BorderLayout.CENTER);
        frame.getContentPane().add(signButton, BorderLayout.SOUTH);
 */
               
    }

    public String getName(){
        return user_name;
    }

    public String getPass(){
        return user_pass;
    }

        //signin
    public void actionPerformed(ActionEvent e){
        this.user_name = userfield.getText();
        this.user_pass = userpass.getText();

        System.out.println(getName());
        System.out.println(getPass());
        
    }





    
}
