/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPasien;
import Model.DateLabelFormatter;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author V for Vladimir
 */
public class ViewSearchPasien {
    JFrame viewSearchPasien = new JFrame("Search Pasien");
    JLabel NIKOutputLabel,namaLabel,tglLahirLabel,golonganPasienLabel,
            alamatLabel,noKontakLabel,genderLabel,alergiLabel,goldarLabel,
            penyakitMenurunLabel,NIKInputLabel;
    JTextField NIKInputTextField;
    JButton buttonSearch,buttonUpdate;
    
    public ViewSearchPasien(){
        NIKInputLabel = new JLabel("masukkan NIK pasien");
        NIKOutputLabel = new JLabel();
        namaLabel = new JLabel();
        tglLahirLabel = new JLabel();
        golonganPasienLabel = new JLabel();
        alamatLabel = new JLabel();
        noKontakLabel = new JLabel();
        genderLabel = new JLabel();
        alergiLabel = new JLabel();
        goldarLabel = new JLabel();
        NIKInputTextField = new JTextField();
        buttonSearch = new JButton("Cari Pasien");
        buttonUpdate = new JButton("Ubah Data Pasien");
        
        namaLabel.setBounds(10, 10, 120, 25);
        tglLahirLabel.setBounds(10, 40, 120, 25);
        golonganPasienLabel.setBounds(10, 70, 120, 25);
        
        viewSearchPasien.add(namaLabel);
        viewSearchPasien.add(tglLahirLabel);
        viewSearchPasien.add(golonganPasienLabel);
        viewSearchPasien.add(buttonSearch);
        
        viewSearchPasien.setSize(400,500);
        viewSearchPasien.setLayout(null);
        viewSearchPasien.setVisible(true);
        viewSearchPasien.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pasien p = ControllerPasien.getPasien(NIKInputTextField.getText());
                if(p != null){
                    NIKOutputLabel.setText("NIK : " + p.getNIK());
                    namaLabel.setText("Nama : " + p.getNama());
                    tglLahirLabel.setText("Tanggal Lahir : " + p.getTglLahir());
                    golonganPasienLabel.setText("Golongan : " + p.getBPJS());
                    alamatLabel.setText("alamat : " + p.getAlamat());
                    noKontakLabel.setText("no Kontak" + p.getTelepon());
                    genderLabel.setText("Gender : " + p.getGender());
                    alergiLabel.setText("Alergi : " + p.getAlergi());
                    penyakitMenurunLabel.setText("Penyakit Menurun : " + p. getPenyakitMenurun());
                    goldarLabel.setText("Goldar : " + p.getGolDar());
                }else{
                    JOptionPane.showMessageDialog(null, "Data Pasien tidak ditemukan");
                }
            }
        });
        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pasien p = ControllerPasien.getPasien(NIKInputTextField.getText());
                new ViewUpdateDataPasien(p.getNIK());
            }
        });
    }
}
