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
public class Pasien extends User{
    private ArrayList<RiwayatPasien> listRiwayatPasien = new ArrayList<RiwayatPasien>();
    private GolonganPasien BPJS;
    
    public Pasien(){
        
    }

    public Pasien(GolonganPasien BPJS) {
        this.BPJS = BPJS;
    }

    public Pasien(GolonganPasien BPJS, String Nama, String NIK, String Alamat, String Telepon, int Umur) {
        super(Nama, NIK, Alamat, Telepon, Umur);
        this.BPJS = BPJS;
    }

    public ArrayList<RiwayatPasien> getListRiwayatPasien() {
        return listRiwayatPasien;
    }

    public void setListRiwayatPasien(ArrayList<RiwayatPasien> listRiwayatPasien) {
        this.listRiwayatPasien = listRiwayatPasien;
    }

    public GolonganPasien getBPJS() {
        return BPJS;
    }

    public void setBPJS(GolonganPasien BPJS) {
        this.BPJS = BPJS;
    }

    @Override
    public String toString() {
        return "Pasien{" + "listRiwayatPasien=" + listRiwayatPasien + ", BPJS=" + BPJS + '}';
    }

    
    
    
}
