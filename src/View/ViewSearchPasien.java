/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DateLabelFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author V for Vladimir
 */
public class ViewSearchPasien {
    JFrame viewSearchPasien = new JFrame("Search Pasien");
    JLabel namaSearchLabel,
            tglLahirLabel,
            golonganPasienLabel;
    JTextField namaSearchTextField,golonganPasienTextField;
    JButton buttonSearch;
    JDatePickerImpl tglLahir;
    JDatePanelImpl datePanel;
    
    public ViewSearchPasien(){
        namaSearchLabel = new JLabel("Nama Pasien");
        tglLahirLabel = new JLabel("Tanggal Lahir Pasien");
        golonganPasienLabel = new JLabel("Golongan Pasien(Tulis dengan Huruf Kapital Semua)");
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        datePanel = new JDatePanelImpl(model, p);
        tglLahir = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        namaSearchTextField = new JTextField();
        golonganPasienTextField = new JTextField();
        buttonSearch = new JButton("Cari Pasien");
        
        namaSearchLabel.setBounds(0, 0, 0, 0);
        tglLahirLabel.setBounds(0, 0, 0, 0);
        golonganPasienLabel.setBounds(0, 0, 0, 0);
        tglLahir.setBounds(0, 0, 0, 0);
        namaSearchTextField.setBounds(0, 0, 0, 0);
        golonganPasienTextField.setBounds(0, 0, 0, 0);
        
        viewSearchPasien.add(tglLahir);
        viewSearchPasien.add(namaSearchLabel);
        viewSearchPasien.add(tglLahirLabel);
        viewSearchPasien.add(golonganPasienLabel);
        viewSearchPasien.add(namaSearchTextField);
        viewSearchPasien.add(golonganPasienTextField);
        viewSearchPasien.add(buttonSearch);
        
        viewSearchPasien.setSize(400,500);
        viewSearchPasien.setLayout(null);
        viewSearchPasien.setVisible(true);
        
        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cek datanya ada di database atw g
                //masuk ke viewUpdateDataPasien
            }
        });
    }
}
