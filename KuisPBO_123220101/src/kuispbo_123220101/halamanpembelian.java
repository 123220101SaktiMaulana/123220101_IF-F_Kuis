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
public class halamanpembelian extends JFrame implements ActionListener{
    double harga;
    JLabel teks1 = new JLabel("Halaman Pembelian");
    JLabel teks2 = new JLabel("Kategori");
    JLabel teks3 = new JLabel("Harga : ");
    JLabel teks4 = new JLabel("Jumlah : ");
    
    JTextField input1 = new JTextField();
    
    JButton Kembali = new JButton("Kembali");
    JButton Beli = new JButton("Beli");
    
    JLabel teks5 = new JLabel("Total Pembelian");
    JLabel teks6 = new JLabel("Harga Satuan :");
    JLabel teks7 = new JLabel("Jumlah :" );
    JLabel teks8 = new JLabel("Total Harga : ");
    JLabel teks9 = new JLabel("   - ");
    
    halamanpembelian(String majalah, double harga){
        this.harga = harga;
    setVisible(true);
        setSize(720,720);
        setTitle("Halaman Pembelian");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        this.setLocationRelativeTo(null);
        
        
        
        add(teks1);
        teks1.setBounds(20,40,400,25);
        teks1.setFont(new Font("Arial", Font.BOLD,25));
        
        add(teks2);
        teks2.setBounds(20,90,300,25);
        teks2.setFont(new Font("Arial", Font.BOLD,15));
        teks2.setText("Kategori : " + majalah);
        
        add(teks3);
        teks3.setBounds(20,140,300,25);
        teks3.setFont(new Font("Arial", Font.BOLD,15));
        teks3.setText("Harga : " + harga + "/pcs");
        
        add(teks4);
        teks4.setBounds(20,190,300,25);
        teks4.setFont(new Font("Arial", Font.BOLD,15));
        
        add(input1);
        input1.setBounds(100,190,300,25);
        input1.setFont(new Font("Arial", Font.BOLD,15));
//        double jumlah = Double.parseDouble(input1.getText());
        
//        double totharga = jumlah * harga;
        
        add(Kembali);
        Kembali.setBounds(100,240,100,25);
        Kembali.setFont(new Font("Arial", Font.BOLD,15));
        Kembali.addActionListener(this);
        
        add(Beli);
        Beli.setBounds(300,240,100,25);
        Beli.setFont(new Font("Arial", Font.BOLD,15));
        Beli.addActionListener(this);
        
        add(teks5);
        teks5.setBounds(20,280,120,25);
        teks5.setFont(new Font("Arial", Font.BOLD,15));
        
        add(teks6);
        teks6.setBounds(20,320,400,25);
        teks6.setFont(new Font("Arial", Font.BOLD,15));
        
        
        add(teks7);
        teks7.setBounds(20,360,400,25);
        teks7.setFont(new Font("Arial", Font.BOLD,15));

//        String hasil = String.valueOf(totharga);
        add(teks8);
        teks8.setBounds(20,400,400,25);
        teks8.setFont(new Font("Arial", Font.BOLD,15));
//        teks8.setText("total harga: " + hasil + "/pcs");
        add(teks9);
        teks9.setBounds(200,400,400,25);
        teks9.setFont(new Font("Arial", Font.BOLD,15));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            
            if(e.getSource() == Beli){
              
                
            double jum = Double.parseDouble(input1.getText());
            double totharga = jum * harga;
            
            String jumharga = String.valueOf(totharga);
            String tot = String.valueOf(jum);

            
            teks6.setText("Harga Satuan : " + harga);
            teks7.setText("Jumlah : " + tot );
            teks9.setText(jumharga + " K");
            
            }
            if(e.getSource() == Kembali){
                new halamanutama("","");
                this.dispose();
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());

        }
        
        
    }
}