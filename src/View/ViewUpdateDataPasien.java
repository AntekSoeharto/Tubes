/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPasien;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author V for Vladimir
 */
public class ViewUpdateDataPasien {
    JFrame viewUpdateData = new JFrame("Update Data Pasien");
    JLabel golonganPasienBaru,
            alamatInputBaruLabel,
            TeleponInputBaruLabel,ketentuanLabel;
    JTextField alamatInputTextField,
            teleponInputTextField,
            golonganPasienTextField;
    JButton ubahDataPasien,buttonValidasi;
    JCheckBox golonganCheckBox,alamatCheckBox,teleponCheckBox;
    JPanel panelContent,panelMenu;
    JButton menu_pasien = new JButton("PASIEN");
    JButton menu_dokter = new JButton("DOKTER");
    JButton menu_admin = new JButton("ADMINISTRASI");
    public ViewUpdateDataPasien(String NIK){
        panelContent = new JPanel();
        panelMenu = new JPanel();
        ketentuanLabel = new JLabel("silahkan tandai data yang ingin di ubah");
        golonganPasienBaru = new JLabel("Golongan Pasien(Tulis dengan Huruf Kapital Semua)");
        alamatInputBaruLabel = new JLabel("Alamat Baru Pasien");
        TeleponInputBaruLabel = new JLabel("No Telepon Baru Pasien");
        alamatInputTextField = new JTextField();
        teleponInputTextField = new JTextField();
        golonganPasienTextField = new JTextField();
        golonganCheckBox = new JCheckBox("ubah golongan");
        alamatCheckBox = new JCheckBox("ubah alamat");
        teleponCheckBox = new JCheckBox("ubah no kontak");
        ubahDataPasien = new JButton("Ubah Data Pasien");
        buttonValidasi = new JButton("validasi pilihan");
        
        alamatInputBaruLabel.setVisible(false);
        TeleponInputBaruLabel.setVisible(false);
        golonganPasienBaru.setVisible(false);
        alamatInputTextField.setVisible(false);
        teleponInputTextField.setVisible(false);
        golonganPasienTextField.setVisible(false);
        
        panelMenu.setBounds(10,10,200,640);
        panelContent.setBounds(230,10,930,640);
        menu_pasien.setBounds(35,200,120,50);
        menu_dokter.setBounds(35,260,120,50);
        menu_admin.setBounds(35,320,120,50);
        golonganPasienBaru.setBounds(350, 10, 150, 25);
        alamatInputBaruLabel.setBounds(350, 40, 150, 25);
        TeleponInputBaruLabel.setBounds(350, 70, 150, 25);
        alamatInputTextField.setBounds(350, 100, 150, 25);
        teleponInputTextField.setBounds(350, 130, 150, 25);
        golonganPasienTextField.setBounds(350, 160, 150, 25);
        ubahDataPasien.setBounds(350, 190, 150, 25);
        
        panelContent.add(ketentuanLabel);
        panelContent.add(alamatCheckBox);
        panelContent.add(golonganCheckBox);
        panelContent.add(teleponCheckBox);
        panelContent.add(golonganPasienBaru);
        panelContent.add(golonganPasienTextField);
        panelContent.add(alamatInputBaruLabel);
        panelContent.add(alamatInputTextField);
        panelContent.add(teleponInputTextField);
        panelContent.add(TeleponInputBaruLabel);
        panelContent.add(ubahDataPasien);
        panelContent.add(buttonValidasi);
        
        viewUpdateData.setSize(1200, 700);
        viewUpdateData.setLayout(null);
        viewUpdateData.setVisible(true);
        
        buttonValidasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(alamatCheckBox.isSelected()){
                    alamatCheckBox.setVisible(false);
                    alamatInputBaruLabel.setVisible(true);
                    alamatInputTextField.setVisible(true);
                }else{
                    alamatCheckBox.setVisible(true);
                    alamatInputBaruLabel.setVisible(false);
                    alamatInputTextField.setVisible(false);
                }
                if(teleponCheckBox.isSelected()){
                    teleponCheckBox.setVisible(false);
                    TeleponInputBaruLabel.setVisible(true);
                    teleponInputTextField.setVisible(true);
                }else{
                    teleponCheckBox.setVisible(true);
                    TeleponInputBaruLabel.setVisible(false);
                    teleponInputTextField.setVisible(false);
                }
                if(golonganCheckBox.isSelected()){
                    golonganCheckBox.setVisible(false);
                    golonganPasienBaru.setVisible(true);
                    golonganPasienTextField.setVisible(true);
                }else{
                    golonganCheckBox.setVisible(true);
                    golonganPasienBaru.setVisible(false);
                    golonganPasienTextField.setVisible(false);
                }
            }
        });
        
        ubahDataPasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControllerPasien cp = new ControllerPasien();
                try {
                    cp.updatePasien(golonganPasienTextField.getText(), alamatInputTextField.getText()
                        , teleponInputTextField.getText(), NIK);
                    JOptionPane.showMessageDialog(null, "data berhasil diubah");
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "data gagal diubah");
                }

                //panggil method update pasien
            }
        });
    }
}
