package src.java.main;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JsignInGui;
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
        JFrame signInGui = new JFrame();
        JTextField userfield = new JTextField("enter username", 20);
        JTextField userpass = new JTextField("enter pass", 20);
        JButton signButton = new JButton("Sign In");

        //signInGui attr
        signInGui.setTitle("Sign in Page");
        signInGui.setSize(600, 500);
        signInGui.setVisible(true);
        signInGui.setResizable(false);
        signInGui.setLocation(500, 150);
        signInGui.setVisible(true);
        signInGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //login panel attr
        JPanel pan1 = new JPanel(new BorderLayout());
        pan1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pan1.add(userfield,BorderLayout.NORTH);
        pan1.add(userpass,BorderLayout.CENTER);
        pan1.add(signButton,BorderLayout.SOUTH);
        
        signInGui.setContentPane(pan1);
        signInGui.pack();

        signButton.addActionListener(this);
               
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
