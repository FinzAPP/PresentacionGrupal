package edu.udea.FinzAPP.entities;

/**
 *
 * @author Edwin Marin Ballesteros
 * @author Mari Luz Tabares López
 *
 */

public class MovimientoDinero {

    private double montoMovimiento;
    private String conceptoMovimiento;
    private String usuarioMovimiento;

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento, String usuarioMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public MovimientoDinero(){


    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(String usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

}
