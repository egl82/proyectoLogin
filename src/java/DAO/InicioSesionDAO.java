/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import controller.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Members;

/**
 *
 * @author Emmanuel
 */
public class InicioSesionDAO {

    public String autenticar(Members members) {
        String uname = members.getUname();
        String pass = members.getPass();

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB = "";
        String roleDB = "";
        try {
            con = Conexion.getConexion();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select uname,pass,rango from members");
            while (resultSet.next()) {
                userNameDB = resultSet.getString("uname");
                passwordDB = resultSet.getString("pass");
                roleDB = resultSet.getString("rango");
                if (uname.equals(userNameDB) && pass.equals(passwordDB) && roleDB.equals("admin")) {
                    return "Admin_Role";
                } else if (uname.equals(userNameDB) && pass.equals(passwordDB) && roleDB.equals("marca")) {
                    return "marca_Role";
                } else if (uname.equals(userNameDB) && pass.equals(passwordDB) && roleDB.equals("influencer")) {
                    return "influencer_Role";
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return "Invalid user credentials";

    }

}
