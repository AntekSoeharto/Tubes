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
        golonganPasienLabel = new JLabel("Golongan Pasien");
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
        
        namaSearchLabel.setBounds(10, 10, 120, 25);
        tglLahirLabel.setBounds(10, 40, 120, 25);
        golonganPasienLabel.setBounds(10, 70, 120, 25);
        tglLahir.setBounds(130, 40, 120, 25);
        namaSearchTextField.setBounds(130, 10, 120, 25);
        golonganPasienTextField.setBounds(130, 70, 120, 25);
        
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
        viewSearchPasien.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cek datanya ada di database atw g
                //masuk ke viewUpdateDataPasien
            }
        });
    }
}
