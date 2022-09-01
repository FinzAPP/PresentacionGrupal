package edu.udea.FinzAPP.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @GetMapping("/empleado")
    public String getEmpleado() { return "ejemplo de retorno"; }

    @PostMapping("/postEmpleado")
    public void postEmpresa(){
        //TODO
    }

    @GetMapping("/empleado/[id]")
    public String getEmpleado2() { return "ejemplo de retorno"; }
}
