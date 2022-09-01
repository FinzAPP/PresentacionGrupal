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
        return "ejemplo de retorno";
    }

    //Path Params
    @GetMapping("/empresas/[id]")
    public String getEmpresas2() {
        return "ejemplo de retorno";
    }

    //Query Params
    @PostMapping("/postEmpresa")
    public void postEmpresas(){
        //TODO
    }


  //Path Params
  //TODO PATCH
  //TODO DELETE


}
