package edu.udea.FinzAPP.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @GetMapping("/empleados")
    public String getEmpleados() {
        //Me devuelve todos los empleados
        return "ejemplo de retorno";
    }

    @GetMapping("/empleado/{id}")
    public String getEmpleado() {
        //Me devuelve un solo empleado
        return "ejemplo de retorno";
    }

    @PostMapping("/empleado")
    public void setEmpleado(){
        //Me ingresa un nuevo empleado
    }


}
