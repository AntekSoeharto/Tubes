/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dokter;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ControllerDokter {
    
    static DBHandler conn = new DBHandler();
    
    public static boolean addDokter(){
        
        return(true);
    }
    public ArrayList<Dokter> getDokters(){
        ArrayList<Dokter> listDokters = new ArrayList<Dokter>();
        return listDokters;
    }
}
