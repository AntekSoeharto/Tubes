/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerDokter;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author V for Vladimir
 */
public class ViewJanjiTemu implements ActionListener{
    JFrame janjiTemu = new JFrame("buat Janji Temu pasien dengan dokter");
    JLabel NIKLabel,poliLabel,dokterLabel,hargaLabel;
    JTextField NIKField;
    JComboBox<Object>dokterField,poliField;
    JButton buttonNext,buttonBuatJanji;
    JPanel panelContent,panelMenu;
    JButton menu_pasien = new JButton("PASIEN");
    JButton menu_dokter = new JButton("DOKTER");
    JButton menu_admin = new JButton("ADMINISTRASI");
    public ViewJanjiTemu(){
        NIKLabel = new JLabel("NIK");
        poliLabel = new JLabel("poli");
        dokterLabel = new JLabel("nama dokter");
        hargaLabel = new JLabel("harga");
        String[] poli = {"gigi","THT","gizi"};
        poliField = new JComboBox<>(poli);//isi dari database?
        ControllerDokter CD = new ControllerDokter();
//        ArrayList<Dokter> DAL = CD.getAllDokters();
//        String[] namaDokters = new String[DAL.size()];
//        for (int i = 0; i < DAL.size(); i++) {
//            namaDokters[i] = new String();
//            namaDokters[i] = DAL.get(i).getNama();
//        }
        dokterField = new JComboBox<>();//kalo udh ad getAllDokters masukkin namaDokters ke sini
        NIKField = new JTextField();
        buttonBuatJanji = new JButton("Done");
        panelContent = new JPanel();
        panelMenu = new JPanel();
        
        NIKLabel.setBounds(245, 10, 160, 25);
        poliLabel.setBounds(245, 50, 160, 25);
        dokterLabel.setBounds(245, 90, 160, 25);
        NIKField.setBounds(325, 10, 160, 25);
        poliField.setBounds(325, 50, 160, 25);
        dokterField.setBounds(325, 90, 160, 25);
        
        panelMenu.setBounds(10,10,200,640);
        panelContent.setBounds(230,10,930,640);
        
        panelContent.setLayout(null);
        panelMenu.setLayout(null);
        janjiTemu.setLayout(null);
        
        
        panelContent.setBackground(Color.cyan);
        panelMenu.setBackground(Color.cyan);
        menu_pasien.setBounds(35,200,120,50);
        menu_dokter.setBounds(35,260,120,50);
        menu_admin.setBounds(35,320,120,50);
        
        panelContent.add(NIKLabel);
        panelContent.add(NIKField);
        panelContent.add(poliLabel);
        panelContent.add(poliField);
        panelContent.add(dokterLabel);
        panelContent.add(dokterField);
        
        panelMenu.add(menu_admin);
        panelMenu.add(menu_dokter);
        panelMenu.add(menu_pasien);
        menu_dokter.addActionListener(this);
        menu_pasien.addActionListener(this);
        menu_admin.addActionListener(this);
        
        janjiTemu.add(panelContent);
        janjiTemu.add(panelMenu);
        janjiTemu.setSize(1200, 700);
        janjiTemu.setVisible(true);
        janjiTemu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command) {
            case "PASIEN": 
                new MenuPasien();
                janjiTemu.setVisible(false);
                break;
            case "DOKTER":
                new MenuDokter();
                janjiTemu.setVisible(false);
                break;
            case "ADMINISTRASI":
                new MenuAdmin();
                janjiTemu.setVisible(false);
                break;
            default: 
                break;
        }
    }
}
