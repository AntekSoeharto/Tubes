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
public class Obat {
    private String Nama;
    private int hargaBeli;
    private int hargaJual;
    private int Stok;
    
    public Obat(){
        
    }

    public Obat(String Nama, int hargaBeli, int hargaJual, int Stok) {
        this.Nama = Nama;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.Stok = Stok;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    @Override
    public String toString() {
        return "Obat{" + "Nama=" + Nama + ", hargaBeli=" + hargaBeli + ", hargaJual=" + hargaJual + ", Stok=" + Stok + '}';
    }
    
    
}
