package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Dokter extends User{
    private String NID;
    private String Poliklinik;
    private double Gaji;
    private ArrayList<AbsensiDokter> Absen = new ArrayList<AbsensiDokter>();
    private ArrayList<String> listPendidikan = new ArrayList<String>();
    private ArrayList<String> listKarir = new ArrayList<String>();
    
    
    public Dokter(){   
        
    }

    public Dokter(String NID, String Poliklinik, double Gaji) {
        this.NID = NID;
        this.Poliklinik = Poliklinik;
        this.Gaji = Gaji;
    }

    public Dokter(String NID, String Poliklinik, double Gaji, String Nama, String NIK, Date tglLahir, String golDar, String gender, String Alamat, String Telepon) {
        super(Nama, NIK, tglLahir, golDar, gender, Alamat, Telepon);
        this.NID = NID;
        this.Poliklinik = Poliklinik;
        this.Gaji = Gaji;
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

    public ArrayList<AbsensiDokter> getAbsen() {
        return Absen;
    }

    public void setAbsen(ArrayList<AbsensiDokter>absensiDokters ,AbsensiDokter absenDokter) {
        absensiDokters.add(absenDokter);
    }
    
    public String getPoliklinik() {
        return Poliklinik;
    }

    public void setPoliklinik(String Poliklinik) {
        this.Poliklinik = Poliklinik;
    }

    @Override
    public String toString() {
        return "Dokter{" + "NID=" + NID + ", Poliklinik=" + Poliklinik + ", Gaji=" + Gaji + '}';
    }
    
    
}
