package edu.udea.FinzAPP.controllers;

import edu.udea.FinzAPP.entities.Empresa;
import edu.udea.FinzAPP.services.GestorEmpresas;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 *
 * @author Biviana Medina Trujillo
 *
 */

@RestController
public class EmpresaController {

    //ATRIBUTOS:
    private GestorEmpresas gestorEmpresas = new GestorEmpresas();

    /* ATRIBUTOS - COMENTARIOS:
        1. gestorEmpresa se conecta con la lógica que se encuentra dentro de
           la clase GestorEmpresa
    */


    //Query Params
    @GetMapping("/empresas")
    public ResponseEntity<ArrayList<Empresa>> getEmpresas() {
        //Me devuelve todas las empresas existentes
        return new ResponseEntity<>(gestorEmpresas.getEmpresas(), HttpStatus.OK);
    }

    //Path Params
    @GetMapping("/empresa/{id}")
    public ResponseEntity<Object> getEmpresa(@PathVariable int id) {
        try {
            //Me devuelve una empresa en específico
            return new ResponseEntity<>(gestorEmpresas.getEmpresa(id), HttpStatus.OK);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Query Params
    @PostMapping("/empresa")
    public ResponseEntity<String> postEmpresa(@RequestBody Empresa empresaNueva){
        //Me agrega una empresa
        try {
            String msg = gestorEmpresas.setEmpresa(empresaNueva);
            return new ResponseEntity<>( msg, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


  //Path Params
  //TODO PATCH
  //TODO DELETE


}
