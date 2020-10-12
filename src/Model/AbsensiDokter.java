/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

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
    
    
}
