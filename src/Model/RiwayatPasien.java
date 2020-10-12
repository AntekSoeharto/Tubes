/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

public class RiwayatPasien extends Riwayat{
    private String penyakit;
    private List<String> resepObat = new ArrayList<String>();
    private Date tanggalKunjungan;

    public RiwayatPasien() {
    }

    public RiwayatPasien(Date Tanggal, String Keluhan, String Solusi) {
        super(Tanggal, Keluhan, Solusi);
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public List<String> getResepObat() {
        return resepObat;
    }

    public void setResepObat(List<String> resepObat) {

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


        return super.toString() + "RiwayatPasien{" + "penyakit=" + penyakit + ", resepObat=" + resepObat + ", tanggalKunjungan=" + tanggalKunjungan + '}';
    }
    

    
}
