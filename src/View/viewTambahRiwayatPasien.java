/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.mysql.cj.util.StringUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author V for Vladimir
 */
public class viewTambahRiwayatPasien {
    JFrame viewTambahRiwayat = new JFrame("Tambah Riwayat Pasien");
    JLabel penyakitLabel,tanggalKunjunganLabel,jumlahObatLabel,namaObatLabel,labelError;
    JTextField jumlahObatField;
    JTextField[] namaObatFields;
    JButton buttonInsert;
    public viewTambahRiwayatPasien(){
        jumlahObatLabel = new JLabel("jumlah jenis obat pasien");
        labelError = new JLabel();
        jumlahObatField = new JTextField();
        buttonInsert = new JButton();
        
        buttonInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(StringUtils.isStrictlyNumeric(jumlahObatField.getText())){
//                    if(!jumlahObatField.getText().equals("")){
//                        System.out.println(Integer.parseInt(jumlahObatField.getText()));
//                    }
                    int jmlObat = Integer.parseInt(jumlahObatField.getText());
                    namaObatFields = new JTextField[jmlObat];
                    if(jmlObat > 0){
                        for(int i = 0 ; i < jmlObat ; i++){
                            namaObatLabel = new JLabel("namaObat" + (i + 1));
                            namaObatFields[i] = new JTextField();
                            namaObatLabel.setBounds(10, 40, 100, 25);
                            namaObatFields[i].setBounds(115, (i+1)*10, 125, 25);
                            viewTambahRiwayat.add(namaObatLabel);
                            viewTambahRiwayat.add(namaObatFields[i]);
                        }
                    }
                }
            }
        });
        
        
        
        jumlahObatLabel.setBounds(10, 10, 145, 25);
        jumlahObatField.setBounds(155, 10, 100, 25);
        buttonInsert.setBounds(10,20,100,25);
        
        viewTambahRiwayat.add(jumlahObatLabel);
        viewTambahRiwayat.add(jumlahObatField);
        viewTambahRiwayat.add(buttonInsert);
        
        viewTambahRiwayat.setSize(400,700);
        viewTambahRiwayat.setLayout(null);
        viewTambahRiwayat.setVisible(true);
    }
}
