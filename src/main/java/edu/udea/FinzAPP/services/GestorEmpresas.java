package edu.udea.FinzAPP.services;

import edu.udea.FinzAPP.entities.Empresa;

import java.util.ArrayList;

public class GestorEmpresas {
    /* GestorEmpresas se encarga de gestionar(buscar, agregar, modificar, eliminar)
       las empresas agregadas al sistema
    */

    //ATRIBUTOS: _______________________________________________________________________________________________________
    private ArrayList<Empresa> empresas;

    //CONSTRUCTOR: _____________________________________________________________________________________________________
    public GestorEmpresas(){
        this.empresas = new ArrayList<Empresa>();
        this.empresas.add(new Empresa("empresa1", "direccion1", "1234567", 1));
    }


    //SETTER && GETTERS: _______________________________________________________________________________________________
    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }


    //LÓGICA DEL NEGOCIO: ______________________________________________________________________________________________

    //PARA CONSULTAR TODAS LAS EMPRESAS (GET):
    //Se usa el getter getEmpresas()


    //PARA CONSULTAR UNA EMPRESA (GET):
    public Empresa getEmpresa(int nit) throws Exception {
        /*
        1. Se debe recorrer el ArrayList en busca del nit que entra como argumento,
        si existe, lo muestra
        si no existe, muestra error(excepción)
        */
        for(Empresa empresa: this.empresas){
            if(empresa.getNit() == nit){
                //existe
                return empresa;
            }
        }

        //no existe
        throw new Exception("La empresa no se encuentra registrada");
    }


    //PARA CREAR UNA NUEVA EMPRESA (POST):
    public String setEmpresa(Empresa empresaNueva) throws Exception {
        //si existe la empresa, no debe permitir registrar
        //si no existe, debe permitir registrar
        //se hace uso dem método getEmpresa()

        try {
            //si existe
            getEmpresa(empresaNueva.getNit());
            // ***
        } catch (Exception e) {
            //no existe
            this.empresas.add(empresaNueva);
            return "Se ha registrado la empresa de manera Exitosa!";
        }

        // ***
        throw new Exception("La empresa ya se encuentra registrada");
    }


    //PARA EDITAR EMPRESA YA EXISTENTE:


    //PARA ELIMINAR EMPRESA YA EXISTENTE:
}
