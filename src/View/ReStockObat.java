/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author hp
 */
import Model.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import Controller.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReStockObat implements ActionListener{
    private ControllerObat control = new ControllerObat();
    JFrame frame = new JFrame("Input Dokter");
    JPanel menu = new JPanel();
    JPanel isi = new JPanel();
    
    JButton menu_pasien = new JButton("PASIEN");
    JButton menu_dokter = new JButton("DOKTER");
    JButton menu_admin = new JButton("ADMINISTRASI");
    JButton submit = new JButton("SUBMIT");
    
    JLabel labTglbeli = new JLabel("Tgl Beli");
    JLabel labTglkadaluarsa = new JLabel("Tgl Beli");
    JLabel labidobat = new JLabel("Id Obat");
    JLabel labBeli = new JLabel("Harga Beli");
    JLabel labJual = new JLabel("Harga Jual");
    JLabel labStok = new JLabel("Stok");
    UtilDateModel model1 = new UtilDateModel();
    UtilDateModel model2 = new UtilDateModel();
    Properties p = new Properties();
    JTextField textJual = new JTextField();
    JTextField textStok= new JTextField();
    JDatePanelImpl datePanel1 = new JDatePanelImpl(model1, p);
    JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p);
    JDatePickerImpl tgl_beli = new JDatePickerImpl(datePanel1, new DateLabelFormatter());
    JDatePickerImpl tgl_kadaluarsa = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
    ArrayList<Obat> obats = control.getallObatReStock(Singleton.getInstance().getStaff().getIdCabang());
    String[] listobat;
    JComboBox obat;
    
    
    
    
    public ReStockObat (){
        //template
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
        menu.add(menu_dokter);
        menu.add(menu_pasien);
        menu.add(menu_admin);
        menu_dokter.addActionListener(this);
        menu_pasien.addActionListener(this);
        menu_admin.addActionListener(this);
        //akhir template
        
        listobat = new String[obats.size()];
        for(int i = 0 ; i < obats.size(); i++){
            Obat oba = obats.get(i);
            listobat[i] = oba.getIdObat();
        }
        
        obat = new JComboBox(listobat);
        
        //isi menu
        labidobat.setBounds(50, 120, 80, 20);
        isi.add(labidobat);  
        obat.setBounds(50, 120, 300, 20);
        isi.add(obat);
        
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        
        
        labTglbeli.setBounds(50, 180, 80, 20);
        isi.add(labTglbeli);
        tgl_beli.setBounds(200, 180, 300, 20);
        isi.add(tgl_beli);
        labTglkadaluarsa.setBounds(50, 220, 80, 20);
        isi.add(labTglkadaluarsa);
        tgl_kadaluarsa.setBounds(200, 220, 300, 20);
        isi.add(tgl_kadaluarsa);
        
        
        
        submit.setBounds(350,400,120,50);
        submit.addActionListener(this);
        isi.add(submit);
        
        
        frame.add(isi);
        frame.add(menu);
        frame.setVisible(true);
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
            case "SUBMIT":
                String strid = String.valueOf(obat.getSelectedItem());
                int stok = Integer.parseInt(textStok.getText());
                String strtglbeli = model1.getYear() + "-" + model1.getMonth() + "-" + model1.getDay();
                String strtglkadal = model2.getYear() + "-" + model2.getMonth() + "-" + model2.getDay();
                
                Obat obat = new Obat();
                obat.setStok(stok);
                obat.setTgl_beli(strtglbeli);
                obat.setTgl_kadaluarsa(strtglkadal);
//
//                boolean input = control.addObat(obat);
//                if(input == true){
//                    frame.setVisible(false);
//                    JOptionPane.showMessageDialog(null,"Data Sudah Di Tambah");
//                    new MenuAdmin();
//                    frame.setVisible(false);
//                }                
            default: 
                break;
        }
    }
    
    
}
