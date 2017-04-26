
package Clases;

/**
 *
 * @author Porti
 */
public class Alumno extends Persona {
    
    private String strIdalumno;

    public Alumno(String strIdalumno, String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
        this.strIdalumno = strIdalumno;
    }

    @Override
    public String toString() {
        return String.format("%sId alumno: %s\n", super.toString(), strIdalumno);
    }
    


}
