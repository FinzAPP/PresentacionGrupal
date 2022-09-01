package edu.udea.FinzAPP.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Biviana Medina Trujillo
 *
 */

@RestController
public class EmpresaController {

    //Query Params
    @GetMapping("/empresas")
    public String getEmpresas() {
        //Me devuelve todas las empresas existentes
        return "ejemplo de retorno";
    }

    //Path Params
    @GetMapping("/empresas/{id}")
    public String getEmpresa() {
        //Me devuelve una empresa en específico
        return "ejemplo de retorno";
    }

    //Query Params
    @PostMapping("/empresa")
    public void setEmpresa(){
        //Me agrega una empresa
    }


  //Path Params
  //TODO PATCH
  //TODO DELETE


}
