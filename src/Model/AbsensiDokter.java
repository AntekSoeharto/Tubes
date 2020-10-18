/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import Controller.Controller;

/**
 *
 * @author hp
 */
public class AbsensiDokter implements InterfaceAbsensiDokter{
    private Date tanggal;
    private StatusAbsensi Status;

    
    
    public AbsensiDokter(){
        
    }

    public AbsensiDokter(Date tanggal, StatusAbsensi Status) {
        this.tanggal = tanggal;
        this.Status = Status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public StatusAbsensi getStatus() {
        return Status;
    }

    public void setStatus(StatusAbsensi Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "AbsensiDokter{" + "tanggal=" + tanggal + ", Status=" + Status + '}';
    }
    
    @Override
    public void absenDokter(AbsensiDokter absenDokter){
        Controller c = new Controller();
        ArrayList<Dokter> listDokter = c.getDokters();
        int i = 0;
        boolean found = false;
        boolean statusMasuk = true;
        String namaDokter = JOptionPane.showInputDialog("masukkan nama dokter : ");
  
        absenDokter.tanggal = new Date();
        
        boolean statusIzin = Boolean.parseBoolean(JOptionPane.showInputDialog(""
                + "1. ya"
                + "\n0.tidak"
                + "\napakah dokter izin? :"));
        
        
        while(i < listDokter.size() && !found){
//            String listNama = ;
            if(namaDokter.equals(listDokter.get(i).getNama())){
                found = true;
            }else{
                i++;
            }
        }
        
//        StatusAbsensi absen;
        if(found == true){
            if(statusIzin == false && statusMasuk == true){
                absenDokter.Status = MASUK;
            }else if(statusIzin == true){
                absenDokter.Status = IZIN;
            }else if(statusIzin == false && statusMasuk == false){
                absenDokter.Status = ALPHA;
            }
        }else{
            JOptionPane.showMessageDialog(null,"Nama tidak ditemukan!");
        }
        
        
    }
}
