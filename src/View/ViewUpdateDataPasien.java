/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author V for Vladimir
 */
public class ViewUpdateDataPasien {
    JFrame viewUpdateData = new JFrame("Update Data Pasien");
    JLabel golonganPasienBaru,
            alamatInputBaruLabel,
            TeleponInputBaruLabel;
    JTextField alamatInputTextField,
            teleponInputTextField,
            golonganPasienTextField;
    JButton ubahDataPasien;
    public ViewUpdateDataPasien(){
        golonganPasienBaru = new JLabel("Golongan Pasien(Tulis dengan Huruf Kapital Semua)");
        alamatInputBaruLabel = new JLabel("Alamat Baru Pasien");
        TeleponInputBaruLabel = new JLabel("No Telepon Baru Pasien");
        alamatInputTextField = new JTextField();
        teleponInputTextField = new JTextField();
        golonganPasienTextField = new JTextField();
        ubahDataPasien = new JButton("Ubah Data Pasien");
        
        golonganPasienBaru.setBounds(0, 0, 0, 0);
        alamatInputBaruLabel.setBounds(0, 0, 0, 0);
        TeleponInputBaruLabel.setBounds(0, 0, 0, 0);
        alamatInputTextField.setBounds(0, 0, 0, 0);
        teleponInputTextField.setBounds(0, 0, 0, 0);
        golonganPasienTextField.setBounds(0, 0, 0, 0);
        ubahDataPasien.setBounds(0, 0, 0, 0);
        
        viewUpdateData.add(golonganPasienBaru);
        viewUpdateData.add(golonganPasienTextField);
        viewUpdateData.add(alamatInputBaruLabel);
        viewUpdateData.add(alamatInputTextField);
        viewUpdateData.add(teleponInputTextField);
        viewUpdateData.add(TeleponInputBaruLabel);
        viewUpdateData.add(ubahDataPasien);
        
        viewUpdateData.setSize(400,500);
        viewUpdateData.setLayout(null);
        viewUpdateData.setVisible(true);
        
        ubahDataPasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //panggil method update pasien
            }
        });
    }
}
