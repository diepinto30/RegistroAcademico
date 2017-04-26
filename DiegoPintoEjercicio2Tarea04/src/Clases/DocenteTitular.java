/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Porti
 */
public class DocenteTitular extends Docente {
    
    private String strHorarioClase;

    public DocenteTitular(String strHorarioClase, String strIddocente, String strIdentificacion, String strNombres, String strEmail) {
        super(strIddocente, strIdentificacion, strNombres, strEmail);
        this.strHorarioClase = strHorarioClase;
    }



    @Override
    public String toString() {
        return String.format("%sHorario clase: %s\n", super.toString(), strHorarioClase);
    }
    
    
}
