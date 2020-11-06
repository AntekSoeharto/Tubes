/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DateLabelFormatter;
import Model.GolonganPasien;
import Model.InterfaceGolongan;
import Model.Pasien;
import Model.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author V for Vladimir
 */
public class ViewInsertPasienBaru implements InterfaceGolongan{
    JFrame viewInsertNewPatient = new JFrame("Form Pasien Baru");
    JLabel NIKLabel,namaLabel,tglLahirLabel,alamatLabel,noKontakLabel,golonganLabel,
            genderLabel,alergiLabel,goldarLabel,penyakitMenurunLabel;
    JTextField NIKTextField,namaTextField,alamatTextField,noKontakTextField,
            alergiTextField,goldarTextField,penyakitMenurunTextField;
    JRadioButton BPJSRadioButton,nonBPJSRadioButton,wanitaRadioButton,priaRadioButton;
    ButtonGroup genderButtonGroup,golonganButtonGroup;
    JButton insertNewPatient;
    JDatePickerImpl tglLahir;
    JDatePanelImpl datePanel;
    
    public ViewInsertPasienBaru(){
        NIKLabel = new JLabel("NIK");
        namaLabel = new JLabel("Nama Lengkap");
        tglLahirLabel = new JLabel("Tanggal Lahir");
        alamatLabel = new JLabel("Alamat Pasien");
        noKontakLabel = new JLabel("no Kontak Pasien");
        golonganLabel = new JLabel("Golongan Pasien");
        genderLabel = new JLabel("Jenis Kelamin Pasien");
        alergiLabel = new JLabel("Alergi");
        goldarLabel = new JLabel("golongan darah");
        penyakitMenurunLabel = new JLabel("Penyakit Menurun");
        NIKTextField = new JTextField();
        namaTextField = new JTextField();
        alergiTextField = new JTextField();
        goldarTextField = new JTextField();
        penyakitMenurunTextField = new JTextField();
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        datePanel = new JDatePanelImpl(model, p);
        tglLahir = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        alamatTextField = new JTextField();
        noKontakTextField = new JTextField();
        BPJSRadioButton = new JRadioButton("BPJS");
        nonBPJSRadioButton = new JRadioButton("non BPJS");
        wanitaRadioButton = new JRadioButton("wanita");
        priaRadioButton = new JRadioButton("pria");
        genderButtonGroup = new ButtonGroup();
        golonganButtonGroup = new ButtonGroup();
        genderButtonGroup.add(wanitaRadioButton);
        genderButtonGroup.add(priaRadioButton);
        golonganButtonGroup.add(BPJSRadioButton);
        golonganButtonGroup.add(nonBPJSRadioButton);
        insertNewPatient = new JButton("Tambahkan Pasien Baru");
        
        //label
        NIKLabel.setBounds(10, 10, 100, 45);
        namaLabel.setBounds(10, 50, 100, 45);
        alergiLabel.setBounds(10, 90, 100, 45);
        goldarLabel.setBounds(10, 130, 100, 45);
        penyakitMenurunLabel.setBounds(10, 170, 125, 45);
        tglLahirLabel.setBounds(10, 210, 100, 45);
        alamatLabel.setBounds(10, 250, 100, 45);
        noKontakLabel.setBounds(10, 290, 100, 45);
        golonganLabel.setBounds(10, 330, 100, 45);
        genderLabel.setBounds(10, 370, 125, 45);
        //field
        NIKTextField.setBounds(135, 17, 200, 25);
        namaTextField.setBounds(135, 57, 200, 25);
        alergiTextField.setBounds(135, 97, 200, 25);
        goldarTextField.setBounds(135, 137, 150, 25);
        penyakitMenurunTextField.setBounds(135, 177, 200, 25);
        tglLahir.setBounds(135, 217, 150, 25);
        alamatTextField.setBounds(135, 257, 200, 25);
        noKontakTextField.setBounds(135, 297, 200, 25);
        //button
        BPJSRadioButton.setBounds(10, 360, 100, 25);
        nonBPJSRadioButton.setBounds(110, 360, 100, 25);
        wanitaRadioButton.setBounds(10, 400, 100, 25);
        priaRadioButton.setBounds(110, 400, 100, 25);
        insertNewPatient.setBounds(10, 470, 200, 25);
        
        viewInsertNewPatient.add(NIKLabel);
        viewInsertNewPatient.add(namaLabel);
        viewInsertNewPatient.add(alergiLabel);
        viewInsertNewPatient.add(goldarLabel);
        viewInsertNewPatient.add(penyakitMenurunLabel);
        viewInsertNewPatient.add(golonganLabel);
        viewInsertNewPatient.add(tglLahirLabel);
        viewInsertNewPatient.add(alamatLabel);
        viewInsertNewPatient.add(noKontakLabel);
        viewInsertNewPatient.add(genderLabel);
        
        viewInsertNewPatient.add(wanitaRadioButton);
        viewInsertNewPatient.add(priaRadioButton);
        viewInsertNewPatient.add(BPJSRadioButton);
        viewInsertNewPatient.add(nonBPJSRadioButton);
        viewInsertNewPatient.add(NIKTextField);
        viewInsertNewPatient.add(namaTextField);
        viewInsertNewPatient.add(alergiTextField);
        viewInsertNewPatient.add(goldarTextField);
        viewInsertNewPatient.add(penyakitMenurunTextField);
        viewInsertNewPatient.add(alamatTextField);
        viewInsertNewPatient.add(noKontakTextField);
        viewInsertNewPatient.add(tglLahir);
        
        viewInsertNewPatient.add(insertNewPatient);
        
        viewInsertNewPatient.setSize(400,700);
        viewInsertNewPatient.setLayout(null);
        viewInsertNewPatient.setVisible(true);
        
        insertNewPatient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pasien pt = new Pasien();
                pt.setNIK(NIKTextField.getText());
                pt.setNama(namaTextField.getText());
                pt.setAlamat(alamatTextField.getText());
                pt.setPenyakitMenurun(penyakitMenurunTextField.getText());
                pt.setAlergi(alergiTextField.getText());
                pt.setGolDar(goldarTextField.getText());
                pt.setTglLahir((Date)tglLahir.getModel().getValue());
                pt.setTelepon(noKontakTextField.getText());
                String gender = "";
                if(wanitaRadioButton.isSelected()){
                    gender = "Wanita";
                }else if(priaRadioButton.isSelected()){
                    gender = "Pria";
                }
                if(BPJSRadioButton.isSelected()){
                    pt.setBPJS(BPJS);
                }else if(nonBPJSRadioButton.isSelected()){
                    pt.setBPJS(NON_BPJS);
                }
                pt.setGender(gender);
                pt.setListRiwayatPasien(new ArrayList<>());
                
                pt.pasienBaru(pt);
                
            }
        });
    }
}
