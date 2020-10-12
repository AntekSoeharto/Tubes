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
    private int Status;
    private Date tanggal;
    
    
    public AbsensiDokter(){
        
    }

    public AbsensiDokter(Date tanggal, int Status) {
        this.tanggal = tanggal;
        this.Status = Status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "AbsensiDokter{" + "tanggal=" + tanggal + ", Status=" + Status + '}';
    }
    
    
}
