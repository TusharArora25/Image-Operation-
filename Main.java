package com.java.encryptDecrypt.project;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

public static void main(String[] args) {
		Concept obj = new Concept();
		
        System.out.println("Started Working...");
        
        //setting frame
        JFrame f=new JFrame();
        f.setTitle("Image operation");
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        Font font=new Font("SansSerif",Font.BOLD,30);
        //creating button
        JButton button=new JButton();
        button.setText("Encrypt/Decrypt");
        button.setFont(font);
       

        //creating text field

        JTextField textField=new JTextField(10);
        textField.setFont(font);
        
        

        
        button.addActionListener(e->{
            String text=textField.getText();
            int pass=Integer.parseInt(text);
            obj.operate(pass);
        });

        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(textField);
        f.setVisible(true);

    }

}
