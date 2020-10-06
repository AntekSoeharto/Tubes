/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class RiwayatDokter extends Riwayat{
    private String NamaPasien;
    
    public RiwayatDokter(){
        
    }

    public RiwayatDokter(String NamaPasien, Date Tanggal, String Keluhan, String Solusi) {
        super(Tanggal, Keluhan, Solusi);
        this.NamaPasien = NamaPasien;
    }

    public String getNamaPasien() {
        return NamaPasien;
    }

    public void setNamaPasien(String NamaPasien) {
        this.NamaPasien = NamaPasien;
    }

    @Override
    public String toString() {
        return super.toString() + "   RiwayatDokter{" + "NamaPasien=" + NamaPasien + '}';
    }    
}
