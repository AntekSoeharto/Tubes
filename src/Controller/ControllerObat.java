/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author hp
 */
import Model.*;
import Model.Singleton;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class ControllerObat {
    
    static DBHandler conn = new DBHandler();
    
    public ControllerObat(){
        
    }
    
    public static boolean addObat(Obat obat){
        conn.connect();
        String query = "INSERT INTO obat VALUES(?,?,?,?) ";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, obat.getIdObat());
            stmt.setString(2, obat.getNama());
            stmt.setInt(3, obat.getHargaBeli());
            stmt.setInt(4, obat.getHargaJual());
            stmt.executeUpdate();
            boolean masa = addmasaObat(obat);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }        
        
    }
    
    public static boolean addmasaObat(Obat obat){
        conn.connect();
        String query = "INSERT INTO masa_berlaku_obat VALUES(?,?,?,?,?,?) ";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, obat.getIdMlo());
            stmt.setString(2, obat.getIdObat());
            stmt.setObject(3, obat.getTgl_beli());
            stmt.setObject(4, obat.getTgl_kadaluarsa());
            stmt.setInt(5, obat.getStok());
            stmt.setString(6, Singleton.getInstance().getStaff().getIdCabang());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }        
    }
    
    
    public static ArrayList<Obat> getallObat(){
        conn.connect();
        ArrayList<Obat> obats = new ArrayList<Obat>();
        String query = "SELECT * FROM obat WHERE ID_cabang = '" + Singleton.getInstance().getStaff().getIdCabang() + "' ";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Obat obat = new Obat();
                obat.setNama(rs.getString("Nama_obat"));
                obat.setHargaBeli(Integer.parseInt(rs.getString("Harga_beli")));
                obat.setHargaJual(Integer.parseInt(rs.getString("Harga_jual")));
                obat.setStok(Integer.parseInt(rs.getString("Stok")));
                obat.setTgl_beli(rs.getString("Tgl_beli"));
                obat.setTgl_kadaluarsa(rs.getString("Tgl_kadaluarsa"));
                obats.add(obat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obats;
    
    }
}
