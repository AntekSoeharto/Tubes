/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Singleton;
import Model.Transaksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author V for Vladimir
 */
public class ControllerTransaksi {
    static DBHandler conn = new DBHandler();
    public static boolean insertNewTransaksi(Transaksi transaksi) {
        conn.connect();
        String query = "INSERT INTO Riwayat_Pasien VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
            String stringDate= DateFor.format(transaksi.getTanggakMasuk()); 
            stmt.setString(1, getLastIDFromTransaksi());
            stmt.setObject(2, stringDate);
            stmt.setInt(3, transaksi.getJumlah());
            stmt.setInt(4, transaksi.getJenisPasien());
            stmt.setDouble(5, transaksi.getHargaKonsultasi());
            stmt.setDouble(6, transaksi.getHargaObat());
            stmt.setDouble(7, transaksi.getTotal());
            stmt.setString(8, Singleton.getInstance().getStaff().getIdCabang());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    public static String getLastIDFromTransaksi(){
        String ID = "";
        conn.connect();
        String query = "SELECT ID_Transaksi FROM transaksi ORDER BY ID_Transaksi DESC LIMIT 1";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                ID = rs.getString("ID_Transaksi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int intID = Integer.parseInt(ID.substring(1));
        return ("T00" + (intID + 1));
    }
}
