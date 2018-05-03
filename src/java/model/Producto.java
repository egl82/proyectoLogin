/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Emmanuel
 */
public class Producto {
   
private int idproducto ;
private String nombre ;
private String categoria ;
private String descripcion;

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto() {
    }

    public Producto(int idproducto, String nombre, String categoria, String descripcion) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
    public Producto (String nombre, String categoria, String descripcion){
         this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", categoria=" + categoria + ", descripcion=" + descripcion + '}';
    }

}