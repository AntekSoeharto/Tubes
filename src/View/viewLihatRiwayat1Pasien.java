/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author V for Vladimir
 */
public class viewLihatRiwayat1Pasien {
    JFrame lihatRiwayatPasien = new JFrame("Lihat Riwayat Pasien");
    JLabel NIKInputLabel,tglKunjunganInput;
    JTextField NIKInputField;
    JTable tableRiwayatPasien;
    public viewLihatRiwayat1Pasien() {
        NIKInputLabel = new JLabel();
        tglKunjunganInput = new JLabel();
        NIKInputField = new JTextField();
        tableRiwayatPasien = new JTable();
    }
    
}
