package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Porti
 */
public class RegistroAcademico {

    ArrayList<ComponenteEducativa> listComponentes;
    ArrayList<Persona> listPersonas;

    Persona objPersona = null;
    ComponenteEducativa objComponente = null;

    public Persona getObjPersona(Persona objPersona) {
        return objPersona;
    }

    public List getObjComponenteEducativa(ArrayList<ComponenteEducativa> lsComponentes) {
        return lsComponentes;
    }

    public void combinar_registros(Persona objPersona, ArrayList<ComponenteEducativa> lsComponentes) {
        int intPosicion;
        String cadena;

        cadena = "---------Persona--------\n";
        cadena = cadena + String.format("%s", objPersona.toString());
        for (int j = 0; j < 2; j++) {
            intPosicion = (int) (Math.random() * lsComponentes.size()) + 1;
            cadena = cadena + String.format("%s", lsComponentes.get(intPosicion).toString());

        }

        System.out.println(cadena);

    }

}
