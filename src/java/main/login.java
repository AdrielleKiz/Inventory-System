package src.java.main;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class login extends init {
    public String user_name;
    public String user_pass;
    public boolean lever;

    JTextField userfield = new JTextField(20);
    JTextField userpass = new JTextField(20);
    JButton signButton = new JButton("Sign In");

    public void prepareGui() {
        // set constructors
        JFrame signInGui = new JFrame();
        // signInGui attr
        signInGui.setTitle("Sign in Page");
        signInGui.setSize(600, 500);
        signInGui.setVisible(true);
        signInGui.setResizable(false);
        signInGui.setLocation(500, 150);
        signInGui.setVisible(true);
        signInGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // login panel attr
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
        signButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Setters
                String command = e.getActionCommand();
                user_pass = userpass.getText();
                user_name = userfield.getText();
                if (command.equals("Sign In")) {
                try {
                    Scanner sc;
                    int counter = 0;         
                        sc = new Scanner(filepath);
                        while(sc.hasNext() && counter != 2 && sc.hasNextLine()){
                            sc.useDelimiter("[,]");
                            String line = sc.nextLine();
                            Scanner linecredentials = new Scanner(line);
                            String user = linecredentials.next();
                            String pass = linecredentials.next();
                            if(user.equals(user_name)){
                                counter++;
                                System.out.println("user: "+ user + " user_name: " + user_name);
                                if(pass.equals(user_pass)){
                                counter++;
                                System.out.println("pass: " + pass + "" + " userpass: "+ user_pass);
                                System.out.println("Proper Credentials");
                                lever = true;
                                signInGui.setVisible(false);
                                sc.close();
                                linecredentials.close();
                                }else{
                                    System.out.println("Wrong Credentials");
                                lever = false;
                                }
                            }else{
                                System.out.println("Wrong Credentials");
                                lever = false;
                            }
                        }
                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
        
                }
            }
        }
        );
        signInGui.setContentPane(outerpan);
        signInGui.pack();
    }
/* 
    public String getUserNametf(String user_name){
        return user_name;
    }
    public String getUserPasstf(String user_pass){
        return user_pass;
    } */

    // Sign In Verification
    /* public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //Setters
        String command = e.getActionCommand();
        this.user_pass = userpass.getText();
        this.user_name = userfield.getText();
        if (command.equals("Sign In")) {
        try {
            Scanner sc;
            int counter = 0;         
                sc = new Scanner(filepath);
                while(sc.hasNext() && counter != 2 && sc.hasNextLine()){
                    sc.useDelimiter("[,]");
                    String line = sc.nextLine();
                    Scanner linecredentials = new Scanner(line);
                    String user = linecredentials.next();
                    String pass = linecredentials.next();
                    if(user.equals(user_name)){
                        counter++;
                        System.out.println("user: "+ user + " user_name: " + user_name);
                        if(pass.equals(user_pass)){
                        counter++;
                        System.out.println("pass: " + pass + "" + " userpass: "+ user_pass);
                        System.out.println("Proper Credentials");
                        lever = true;
                        sc.close();
                        linecredentials.close();
                        }else{
                            System.out.println("Wrong Credentials");
                        lever = false;
                        }
                    }else{
                        System.out.println("Wrong Credentials");
                        lever = false;
                    }
                }
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }
    } */
}
