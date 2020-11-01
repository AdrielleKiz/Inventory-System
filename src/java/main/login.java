package src.java.main;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class login {
    private String user_name;
    private String user_pass;

    public void prepareGui(boolean b) {
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
        frame.setVisible(b);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //login panel attr
        JPanel pan1 = new JPanel(new BorderLayout());
        pan1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pan1.add(userfield,BorderLayout.NORTH);
        pan1.add(userpass,BorderLayout.CENTER);
        pan1.add(signButton,BorderLayout.SOUTH);
        
        frame.setContentPane(pan1);
        frame.pack();

        /* frame.getContentPane().add(userfield, BorderLayout.NORTH);
        frame.getContentPane().add(userpass, BorderLayout.CENTER);
        frame.getContentPane().add(signButton, BorderLayout.SOUTH);
 */
        
        
    }

    private String getName(){
        return getName();
    }

    private void setName(String username){
        this.user_name = username;

    }
    private String getPass(){
        return getPass();
    }

    private void setPass(String password){
        this.user_pass = password;

    }

    
        
    
}
