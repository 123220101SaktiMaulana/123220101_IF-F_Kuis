/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo_123220101;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class halamanutama extends JFrame implements ActionListener{
    JLabel teks1 = new JLabel("Selamat datang 123220101");
    JLabel teks2 = new JLabel("Silahkan masukkan menu di bawah ini untuk membeli majalah");
    
    JButton button1 = new JButton("Majalah Anak");
    JButton button2 = new JButton("Majalah Remaja");
    JButton button3 = new JButton("Majalah Dewasa");
    
    halamanutama(String username,String password){
    setVisible(true);
        setSize(720,720);
        setTitle("Halaman Utama");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        this.setLocationRelativeTo(null);
        
        add(teks1);
        teks1.setBounds(20,40,400,25);
        teks1.setFont(new Font("Arial", Font.BOLD,25));
        
        add(teks2);
        teks2.setBounds(20,90,450,25);
        teks2.setFont(new Font("Arial", Font.BOLD,15));
        
        add(button1);
        button1.setBounds(20,200,400,35);
        button1.setFont(new Font("Arial", Font.BOLD,15));
        
        add(button2);
        button2.setBounds(20,250,400,35);
        button2.setFont(new Font("Arial", Font.BOLD,15));
        
        add(button3);
        button3.setBounds(20,300,400,35);
        button3.setFont(new Font("Arial", Font.BOLD,15));
            
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            new halamanpembelian("Majalah Anak",12.700);
        }
        if(e.getSource() == button2){
            new halamanpembelian("Majalah remaja",15.200);
        }
        if(e.getSource() == button3){
            new halamanpembelian("Majalah Dewasa",26.900);
        }
        
        this.dispose();
    }
}
