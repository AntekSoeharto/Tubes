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
    
    
    public static ArrayList<Obat> getallObatReStock(String id_cabang){
        conn.connect();
        ArrayList<Obat> obats = new ArrayList<Obat>();
        String query = "SELECT * FROM masa_obat_pasien WHERE ID_cabang = '" + id_cabang + "' ";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Obat obat = new Obat();
                obat.setIdMlo(rs.getString("ID_MLO"));
                obat.setIdObat(rs.getString("ID_obat"));
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
    
//    public static boolean ReStockObat(Obat obat){
//        conn.connect();
//        String query = "UPDATE masa_obat_pasien SET nik='" + dokter.getNIK() + "', "
//                + "nama='" + dokter.getNama() + "', "
//                + "Tgl_Lahir='" + (Object)dokter.getTglLahir() + "', "
//                + "Goldar='" + dokter.getGolDar() + "', "
//                + "Gender='" + dokter.getGender() + "', "
//                + "NID='" + dokter.getNID() + "', "
//                + "Poliklinik='" + dokter.getPoliklinik() + "', "
//                + "No_Telepon='" + dokter.getTelepon() + "', "
//                + "Alamat='" + dokter.getAlamat() + "', "
//                + "ID_cabang='" + Singleton.getInstance().getStaff().getIdCabang() + "' "
//                + "WHERE nik='" + dokter.getNIK() + "'";
//        try {
//            Statement stmt = conn.con.createStatement();
//            stmt.executeUpdate(query);
//            return (true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return (false);
//        }
//    }
    
}
