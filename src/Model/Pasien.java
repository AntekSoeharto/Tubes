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
public class Pasien extends User implements InterfaceGolongan{
    private ArrayList<RiwayatPasien> listRiwayatPasien = new ArrayList<RiwayatPasien>();
    
    public Pasien(){
        
    }

    public Pasien(ArrayList<RiwayatPasien> listRiwayatPasien, String Nama, String NIK, String Alamat, String Telepon, int Umur) {
        super(Nama, NIK, Alamat, Telepon, Umur);
        this.listRiwayatPasien = listRiwayatPasien;
    }

    public ArrayList<RiwayatPasien> getListRiwayatPasien() {
        return listRiwayatPasien;
    }

    public void setListRiwayatPasien(ArrayList<RiwayatPasien> listRiwayatPasien) {
        this.listRiwayatPasien = listRiwayatPasien;
    }

    @Override
    public String toString() {
        return super.toString() + "   Pasien{" + "listRiwayatPasien=" + listRiwayatPasien + ", BPJS=" + BPJS + '}';
    }
    
    
}
