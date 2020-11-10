/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dokter;
import Model.Singleton;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class ControllerDokter {
    
    static DBHandler conn = new DBHandler();
    
    
    
    public static Dokter getDokter(String nid){
        conn.connect();
        Dokter dokter = new Dokter();
        String query = "SELECT * FROM dokter WHERE nik='" + nid + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                dokter.setNIK(rs.getString("NIK"));
                dokter.setNama(rs.getString("Nama"));
                dokter.setTglLahir((Date)rs.getObject("Tgl_lahir"));
                dokter.setGolDar(rs.getString("Goldar"));
                dokter.setGender(rs.getString("Gender"));
                dokter.setNID(rs.getString("NID"));
                dokter.setPoliklinik(rs.getString("Poliklinik"));
                dokter.setTelepon(rs.getString("No_Telepon"));
                dokter.setAlamat(rs.getString("Alamat"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (dokter);
    }
    
    
    public static boolean addDokter(Dokter dokter){
        conn.connect();
        String query = "INSERT INTO dokter VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, dokter.getNIK());
            stmt.setString(2, dokter.getNama());
            stmt.setObject(3, dokter.getTglLahir());
            stmt.setString(4, dokter.getGolDar());
            stmt.setString(5, dokter.getGender());
            stmt.setString(6, dokter.getNID());
            stmt.setString(7, dokter.getPoliklinik());
            stmt.setString(8, dokter.getTelepon());
            stmt.setString(9, dokter.getAlamat());
            stmt.setString(10, Singleton.getInstance().getStaff().getIdCabang());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
    public static boolean updateDokter(Dokter dokter){
        conn.connect();
        String query = "UPDATE dokter SET NIK='" + dokter.getNIK() + "', "
                + "Nama='" + dokter.getNama() + "', "
                + "Tgl_Lahir='" + dokter.getTglLahir() + "', "
                + "Goldar='" + dokter.getGolDar()+ "', "
                + "Gender='" + dokter.getGender() + "', "
                + "NID='" + dokter.getNID() + "', "
                + "Poliklinik='" + dokter.getPoliklinik() + "', "
                + "No_Telepon='" + dokter.getTelepon() + "', "
                + "Alamat='" + dokter.getAlamat() + "', "
                + "ID_Cabang='" + Singleton.getInstance().getStaff().getIdCabang() + "', "
                + "WHERE NID='" + dokter.getNID() + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
    public static boolean deleteDokter(String strnid){
        conn.connect();

        String query = "DELETE FROM dokter WHERE nik='" + strnid + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
}
