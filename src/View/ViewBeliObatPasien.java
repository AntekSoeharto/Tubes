/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerObat;
import Controller.ControllerPasien;
import Controller.ControllerTransaksi;
import Model.GolonganPasien;
import Model.Obat;
import Model.Transaksi;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author V for Vladimir
 */
public class ViewBeliObatPasien {
    Transaksi t = new Transaksi();
    JFrame formBeliObat = new JFrame();
    JLabel jumlahJenisObatLabel,namaObatLabel,totalHarga,jumlahObatLabel;
    JTextField jumlahJenisObatField;
    JTextField[] namaObatFields,jumlahObatFields;
    JButton buttonHitungTotalHarga,buttonLanjut;
    JPanel panelContent,panelMenu;
    JButton menu_pasien = new JButton("PASIEN");
    JButton menu_dokter = new JButton("DOKTER");
    JButton menu_admin = new JButton("ADMINISTRASI");
    public ViewBeliObatPasien(String NIK,double hargaKonsul){
        formBeliObat.setSize(1200, 700);
        jumlahJenisObatLabel = new JLabel("jumlah Jenis obat");
        jumlahJenisObatField = new JTextField();
        buttonLanjut = new JButton("Lanjut");
        buttonHitungTotalHarga = new JButton("hitung total harga");
        panelContent = new JPanel();
        panelMenu = new JPanel();
        
        panelContent.setLayout(null);
        panelMenu.setLayout(null);
        
        panelContent.setBackground(Color.CYAN);
        panelMenu.setBackground(Color.CYAN);
        
        panelMenu.setBounds(10,10,200,640);
        panelContent.setBounds(230,10,930,640);
        jumlahJenisObatLabel.setBounds(10, 40, 140, 25);
        jumlahJenisObatField.setBounds(160, 40, 140, 25);
        buttonLanjut.setBounds(265, 400, 150, 25);
        buttonHitungTotalHarga.setBounds(740, 500, 150, 25);
        
        menu_pasien.setBounds(35,200,120,50);
        menu_dokter.setBounds(35,260,120,50);
        menu_admin.setBounds(35,320,120,50);
        
        panelContent.add(jumlahJenisObatLabel);
        panelContent.add(jumlahJenisObatField);
        panelContent.add(buttonLanjut);
        panelContent.add(buttonHitungTotalHarga);
        panelContent.add(buttonLanjut);
        panelContent.add(buttonLanjut);
        panelMenu.add(menu_pasien);
        panelMenu.add(menu_dokter);
        panelMenu.add(menu_admin);
        
        formBeliObat.add(panelMenu);
        formBeliObat.add(panelContent);
        formBeliObat.setLayout(null);
        formBeliObat.setVisible(true);
        formBeliObat.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        buttonLanjut.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jumlahJenisObatLabel.setVisible(false);
                jumlahJenisObatField.setVisible(false);
                buttonLanjut.setVisible(false);
                try {
                    String jmlStr = jumlahJenisObatField.getText();
                    int jml = Integer.parseInt(jmlStr);
                    namaObatFields = new JTextField[jml];
                    jumlahObatFields = new JTextField[jml];
                    for(int i = 0; i < jml; i++){
                        namaObatLabel = new JLabel("nama obat " + (i+1));
                        jumlahObatLabel = new JLabel("jumlah obat " + (i+1) + "(dalam mg)");
                        namaObatFields[i] = new JTextField();
                        jumlahObatFields[i] = new JTextField();
                        
                        namaObatLabel.setBounds(10, (i*3+1)*10, 100, 25);
                        namaObatFields[i].setBounds(130, (i*3+1)*10, 120, 25);
                        jumlahObatLabel.setBounds(10, (i*3+1)*10, 180, 25);
                        jumlahObatFields[i].setBounds(210, (i*3+1)*10, 120, 25);
                        
                        panelContent.add(namaObatLabel);
                        panelContent.add(namaObatFields[i]);
                        panelContent.add(jumlahObatLabel);
                        panelContent.add(jumlahObatFields[i]);
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "input bukan angka!");
                    if(JOptionPane.OK_OPTION == 0){
                        jumlahJenisObatField.setText("");
                    }
                }
            }
        });
        buttonHitungTotalHarga.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 int hargaKonsul = 15000;
                int golonganPasien = 0;
                if(ControllerPasien.getPasien(NIK).getBPJS() == GolonganPasien.BPJS){
                    golonganPasien = 1;
                }else{
                    golonganPasien = 2;
                }
                t.setHargaKonsultasi(hargaKonsul);
                ControllerObat CO = new ControllerObat();
                int[] stockObat = new int[namaObatFields.length];
                int totalHarga = 0;
                for(int i = 0; i < namaObatFields.length; i++){
                    stockObat[i] = 0;
                    String IDObat = CO.getObat(namaObatFields[i].getText()).getIDObat();
                    stockObat[i] = CO.getStockObat(IDObat);
                    int jumlahBeli = Integer.parseInt(jumlahObatFields[i].getText());
                    totalHarga += CO.getObat(namaObatFields[i].getText()).getHargaJual() * (jumlahBeli/10);
                    CO.updateStockObat(IDObat, stockObat[i] - jumlahBeli);
                }
                t.setHargaObat(totalHarga);
                t.setJenisPasien(golonganPasien);
                t.setJumlah(namaObatFields.length);
                Date hariIni = new Date();
                t.setTanggakMasuk(hariIni);
                t.setTotal(totalHarga + hargaKonsul);
                 ControllerTransaksi.insertNewTransaksi(t);
            }
        });
    }
}
