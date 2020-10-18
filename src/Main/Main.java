/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Model.*;
import java.util.ArrayList;
import java.util.Date;
import Controller.Controller;
/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args){
        AbsensiDokter AD = new AbsensiDokter();
        AD.absenDokter(AD);
        Dokter d = new Dokter();
        ArrayList<AbsensiDokter> LAD = new ArrayList<>();
        LAD.add(AD);
        d.setAbsen(LAD);
        int i = 0;
        

        
    }
    
}
