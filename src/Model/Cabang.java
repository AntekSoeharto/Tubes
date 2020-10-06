/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Cabang{
    private String Alamat;
    private String Telepon;
    private String Nama;
    private ArrayList<Dokter> listDokter = new ArrayList<Dokter>();
    private ArrayList<Obat> listobat = new ArrayList<Obat>();
    
    public Cabang(){
        
    }

    public Cabang(ArrayList<Dokter> listDokter, ArrayList<Obat> listobat, String Alamat, String Telepon, String Nama) {
        this.listobat = listobat;
        this.listDokter = listDokter;
        this.Alamat = Alamat;
        this.Telepon = Telepon;
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getTelepon() {
        return Telepon;
    }

    public void setTelepon(String Telepon) {
        this.Telepon = Telepon;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    @Override
    public String toString() {
        return "Cabang{" + "Alamat=" + Alamat + ", Telepon=" + Telepon + ", Nama=" + Nama + '}';
    }
}
