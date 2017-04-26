
package Clases;

/**
 *
 * @author Porti
 */
public class DocenteAuxiliar extends Docente {
    
    private String strHorarioTutoria;

    public DocenteAuxiliar(String strHorarioTutoria, String strIddocente, String strIdentificacion, String strNombres, String strEmail) {
        super(strIddocente, strIdentificacion, strNombres, strEmail);
        this.strHorarioTutoria = strHorarioTutoria;
    }

    @Override
    public String toString() {
        return String.format("%sHorario Tutoria: %s\n", super.toString(), strHorarioTutoria);
    }
}
