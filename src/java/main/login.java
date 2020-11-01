package src.java.main;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class login{

    JTextField userfield = new JTextField(20);
    JTextField userpass = new JTextField(20);
    JButton signButton = new JButton("Sign In");

    public void prepareGui() {
        //set constructors
        JFrame signInGui = new JFrame();
        //signInGui attr
        signInGui.setTitle("Sign in Page");
        signInGui.setSize(600, 500);
        signInGui.setVisible(true);
        signInGui.setResizable(false);
        signInGui.setLocation(500, 150);
        signInGui.setVisible(true);
        signInGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //login panel attr
        JPanel leftpan = new JPanel(new BorderLayout());
        leftpan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JPanel rightpan = new JPanel(new BorderLayout());
        rightpan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JPanel outerpan = new JPanel(new BorderLayout());

        outerpan.add(rightpan, BorderLayout.EAST);
        outerpan.add(leftpan, BorderLayout.WEST);
        JLabel userNameLabel = new JLabel("Username", JLabel.LEFT);
        JLabel userPassLabel = new JLabel("Password", JLabel.LEFT);
        JLabel blank = new JLabel("\s\s\s\s", JLabel.LEFT);

        rightpan.add(userfield, BorderLayout.NORTH);
        rightpan.add(userpass, BorderLayout.CENTER);
        rightpan.add(signButton, BorderLayout.SOUTH);
        
        leftpan.add(userNameLabel, BorderLayout.NORTH);
        leftpan.add(userPassLabel, BorderLayout.CENTER);
        leftpan.add(blank, BorderLayout.SOUTH);

        signButton.setActionCommand("Sign In");
        signButton.addActionListener(new signin());
        
        signInGui.setContentPane(outerpan);
        signInGui.pack();
        
               
    }
        //signin
public class signin implements ActionListener{
    private String user_name;
    private String user_pass;

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String command = e.getActionCommand();

        if(command.equals("Sign In")){
            this.user_name = userfield.getText();
            this.user_pass = userpass.getText();
            System.out.println(this.user_name);
            System.out.println(this.user_pass);

        }
        

    }
    

}





    
}
