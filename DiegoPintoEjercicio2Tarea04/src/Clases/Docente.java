
package Clases;

/**
 *
 * @author Porti
 */
public class Docente extends Persona {
    
    private String strIddocente;

    public Docente(String strIddocente, String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
        this.strIddocente = strIddocente;
    }



    @Override
    public String toString() {
        return String.format("%sId Docente: %s\n", super.toString(), strIddocente);
    }   
}
