/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author hp
 */
public class Controller {
    public Controller(){
//        callAbsenDokter();
    }
//    public void callAbsenDokter() {
//        ArrayList<Dokter> LD = getDokters();
//        Date hariIni = new Date();
//        AbsensiDokter AD = new AbsensiDokter();
//        AbsensiDokter.absenDokter(AD,LD);
//    }
    public ArrayList<Dokter> getDokters(){
        ArrayList<Dokter> listDokters = new ArrayList<Dokter>();
        Dokter dokter = new Dokter(null,null, null, 0,"123", "gigi", "hansen", "0123", "abc", "0888", 0);
        Dokter dokter1 = new Dokter(null,null, null, 0,"456", "THT", "john", "0456", "def", "0889", 0);
        listDokters.add(dokter);
        listDokters.add(dokter1);
        return listDokters;
    }
}
