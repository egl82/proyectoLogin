/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Emmanuel
 */
public class Conexion {

    private static Connection con = null;
    private static String URL = "jdbc:mysql://localhost:3306/pruebascon";
    private static String USER = "root";
    private static String PASSWORD = "root";

    public static Connection getConexion() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        con = DriverManager.getConnection(URL, USER, PASSWORD);
        return con;

    }
}
