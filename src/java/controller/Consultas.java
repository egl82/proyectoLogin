/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Emmanuel
 */
public class Consultas extends Conexion {

    public boolean autenticacion(String uname, String pass ) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "Select * from members where uname = ? and pass = ? ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, uname);
            pst.setString(2, pass);
           // pst.setString(3, rango);  , String rango and rango = ? 
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }

        } catch (Exception e) {
            System.err.println("Error" + e);

        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {

            }

        }

        return false;
    }

    public boolean registrar(String firstname, String lastname, String email, String uname, String pass, String rango) {
        PreparedStatement pst = null;
        try {
            String consulta = "insert into members( firstname,  lastname,  email,  uname,  pass, rango) values (?,?,?,?,?,?) ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, firstname);
            pst.setString(2, lastname);
            pst.setString(3, email);
            pst.setString(4, uname);
            pst.setString(5, pass);
            pst.setString(6, rango);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception ex) {
            System.err.println("Error" + ex);

        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();

                }

            } catch (Exception ex) {
                System.err.println("Error" + ex);
            }

            return false;
        }

    }

    public boolean addproducto(String nombre, String categoria, String descripcion) {
        PreparedStatement pst = null;
        try {
            String consulta = "insert into producto ( nombre,  categoria,  descripcion) values (?,?,?) ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, categoria);
            pst.setString(3, descripcion);
        
            if (pst.executeUpdate() == 1) {
                 return true;
               
            }
        } catch (Exception ex) {
            System.err.println("Error" + ex);

        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();

                }

            } catch (Exception ex) {
                System.err.println("Error" + ex);
            }

            

        }
        return false;
    
    }
    }