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

import model.*;
import view.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ControllerStaff {
    public ControllerStaff(){
        
    }
    
    static DBHandler conn = new DBHandler();

    public boolean Login(String username, String password){
        
        return(true);
    }
    
    
}
