/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class MenuPasien implements ActionListener{
    
    JFrame frame = new JFrame("MenuPasien");
    JPanel menu = new JPanel();
    JPanel isi = new JPanel();
    
    JButton menu_pasien = new JButton("PASIEN");
    JButton menu_dokter = new JButton("DOKTER");
    JButton menu_admin = new JButton("ADMINISTRASI");
    JButton insertPasienBaru = new JButton("Insert Pasien Baru");
    JButton searchPasien = new JButton("cari Pasien");
    JButton beliObat = new JButton("beli obat");
    JButton tambahRiwayatPasien = new JButton("update riwayat pasien");
    
    public MenuPasien(){
        
        frame.setSize(1200, 700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        menu.setLayout(null);
        isi.setLayout(null);
        menu.setBounds(10,10,200,640);
        isi.setBounds(230,10,930,640);
        isi.setBackground(Color.cyan);
        menu.setBackground(Color.cyan);
        menu_pasien.setBounds(35,200,120,50);
        menu_dokter.setBounds(35,260,120,50);
        menu_admin.setBounds(35,320,120,50);
        insertPasienBaru.setBounds(265, 10, 150, 25);
        searchPasien.setBounds(265, 50, 130, 25);
        beliObat.setBounds(265, 90, 150, 25);
        tambahRiwayatPasien.setBounds(265, 130, 160, 25);
        isi.add(insertPasienBaru);
        isi.add(searchPasien);
        isi.add(beliObat);
        isi.add(tambahRiwayatPasien);
        menu.add(menu_dokter);
        menu.add(menu_pasien);
        menu.add(menu_admin);
        menu_dokter.addActionListener(this);
        menu_pasien.addActionListener(this);
        menu_admin.addActionListener(this);
        
        
        frame.add(isi);
        frame.add(menu);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        insertPasienBaru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewInsertPasienBaru();
            }
        });
        searchPasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewSearchPasien();
            }
        });
        beliObat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewBeliObat();
            }
        });
        tambahRiwayatPasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewTambahRiwayatPasien();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command) {
            case "PASIEN": 
                new MenuPasien();
                frame.setVisible(false);
                break;
            case "DOKTER":
                new MenuDokter();
                frame.setVisible(false);
                break;
            case "ADMINISTRASI":
                new MenuAdmin();
                frame.setVisible(false);
                break;
            default: 
                break;
        }
    }
}
