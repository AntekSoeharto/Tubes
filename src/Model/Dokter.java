package Model;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Dokter extends User{
    private String NID;
    private String Poliklinik;
    private Double Gaji;
    private ArrayList<RiwayatDokter> listRiwayatDokter = new ArrayList<RiwayatDokter>();
    public Dokter(){   
        
    }
    
    public Dokter(Double Gaji, ArrayList<RiwayatDokter> listRiwayatDokter, String NID, String Poliklinik, String Nama, String NIK, String Alamat, String Telepon, int Umur) {
        super(Nama, NIK, Alamat, Telepon, Umur);
        this.Gaji = Gaji;
        this.listRiwayatDokter = listRiwayatDokter;
        this.NID = NID;
        this.Poliklinik = Poliklinik;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public Double getGaji() {
        return Gaji;
    }

    public void setGaji(Double Gaji) {
        this.Gaji = Gaji;
    }
    
    
    
    public String getPoliklinik() {
        return Poliklinik;
    }

    public void setPoliklinik(String Poliklinik) {
        this.Poliklinik = Poliklinik;
    }

    public ArrayList<RiwayatDokter> getListRiwayatDokter() {
        return listRiwayatDokter;
    }

    public void setListRiwayatDokter(ArrayList<RiwayatDokter> listRiwayatDokter) {
        this.listRiwayatDokter = listRiwayatDokter;
    }

    @Override
    public String toString() {
        return super.toString() + "  Dokter{" + "NID=" + NID + ", Poliklinik=" + Poliklinik + ", listRiwayatDokter=" + listRiwayatDokter + '}';
    }
}