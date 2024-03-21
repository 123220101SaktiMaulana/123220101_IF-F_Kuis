/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo_123220101;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class Login extends JFrame implements ActionListener{
    JLabel teks1 = new JLabel("Halo selamat datang");
    JLabel teks2 = new JLabel("Username");
    JLabel teks3 = new JLabel("Password");
    
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    
    JButton Login = new JButton("Login");
    
    Login(){
        setVisible(true);
        setSize(480,480);
        setTitle("Halaman Login");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        this.setLocationRelativeTo(null);
        
        add(teks1);
        teks1.setBounds(20,40,300,25);
        teks1.setFont(new Font("Arial", Font.BOLD,25));
        
        add(teks2);
        teks2.setBounds(20,90,300,25);
        teks2.setFont(new Font("Arial", Font.BOLD,15));
        
        add(input1);
        input1.setBounds(100,90,300,25);
        input1.setFont(new Font("Arial", Font.BOLD,15));
        
        add(teks3);
        teks3.setBounds(20,120,300,25);
        teks3.setFont(new Font("Arial", Font.BOLD,15));
        
        add(input2);
        input2.setBounds(100,120,300,25);
        input2.setFont(new Font("Arial", Font.BOLD,15));
        
        add(Login);
        Login.setBounds(100,150,100,25);
        Login.setFont(new Font("Arial", Font.BOLD,15));
        Login.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = input1.getText();
            String password = input2.getText();
            
            if(username.isEmpty() || password.isEmpty()){
                throw new Exception("Username atau password tidak boleh kosong");
            }
            if(password.equalsIgnoreCase("12345")){
                new halamanutama(username, password);
                this.dispose();
            }
            else{
                throw new Exception("Password salah");
            }
            
            
            
        } catch (Exception error) {
            
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
