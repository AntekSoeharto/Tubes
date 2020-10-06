/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hp
 */
public abstract class User {
    private String Nama;
    private String NIK;
    private int Umur;
    private String Alamat;
    private String Telepon;
    
    public User(){
        
    }

    public User(String Nama, String NIK, String Alamat, String Telepon, int Umur) {
        this.Nama = Nama;
        this.NIK = NIK;
        this.Alamat = Alamat;
        this.Telepon = Telepon;
        this.Umur = Umur;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public int getUmur() {
        return Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
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

    @Override
    public String toString() {
        return "User{" + "Nama=" + Nama + ", NIK=" + NIK + ", Alamat=" + Alamat + ", Telepon=" + Telepon + '}';
    }
    
    
}
