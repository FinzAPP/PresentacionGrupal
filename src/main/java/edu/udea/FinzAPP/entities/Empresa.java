package edu.udea.FinzAPP.entities;

/**
 *
 * @author Santiago Medina Trujillo
 * @author Biviana Medina Trujillo
 *
 */

public class Empresa {

    //ATRIBUTOS:
    private String nombre;
    private String direccion;
    private String telefono;
    private int nit;


    //CONSTRUCTORES:
    Empresa(String nombre, String direccion, String telefono, int nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }


    //GETTERS && SETTERS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

}
