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
public class RiwayatPasien extends Riwayat{
    private String NamaDokter;
    
    
    public RiwayatPasien(){
        
    }

    public RiwayatPasien(String NamaDokter, Date Tanggal, String Keluhan, String Solusi) {
        super(Tanggal, Keluhan, Solusi);
        this.NamaDokter = NamaDokter;
    }

    public String getNamaDokter() {
        return NamaDokter;
    }

    public void setNamaDokter(String NamaDokter) {
        this.NamaDokter = NamaDokter;
    }

    @Override
    public String toString() {
        return super.toString() + "   RiwayatPasien{" + "NamaDokter=" + NamaDokter + '}';
    } 
    
}
