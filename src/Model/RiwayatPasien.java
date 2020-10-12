/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class RiwayatPasien {
    private String Penyakit;
    private ArrayList<String> resepObat = new ArrayList<String>();
    private Date tanggalKunjungan;
    
    
    public RiwayatPasien(){
        
    }

    public RiwayatPasien(ArrayList<String> resepObat, String Penyakit, Date tanggalKunjungan) {
        this.resepObat = resepObat;
        this.Penyakit = Penyakit;
        this.tanggalKunjungan = tanggalKunjungan;
    }

    public String getPenyakit() {
        return Penyakit;
    }

    public void setPenyakit(String Penyakit) {
        this.Penyakit = Penyakit;
    }

    public ArrayList<String> getResepObat() {
        return resepObat;
    }

    public void setResepObat(ArrayList<String> resepObat) {
        this.resepObat = resepObat;
    }

    public Date getTanggalKunjungan() {
        return tanggalKunjungan;
    }

    public void setTanggalKunjungan(Date tanggalKunjungan) {
        this.tanggalKunjungan = tanggalKunjungan;
    }

    @Override
    public String toString() {
        return "RiwayatPasien{" + "Penyakit=" + Penyakit + ", resepObat=" + resepObat + ", tanggalKunjungan=" + tanggalKunjungan + '}';
    }

    
}
