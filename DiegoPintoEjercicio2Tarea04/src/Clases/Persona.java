
package Clases;

/**
 *
 * @author Porti
 */
public class Persona {
    private String strIdentificacion;
    private String strNombres;
    private String strEmail;

    public Persona(String strIdentificacion, String strNombres, String strEmail) {
        this.strIdentificacion = strIdentificacion;
        this.strNombres = strNombres;
        this.strEmail = strEmail;
    }

    public Persona() {
    }

    public String getStrIdentificacion() {
        return strIdentificacion;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public String getStrEmail() {
        return strEmail;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = cadena + String.format("\n\n------------Datos de la Persona------------"
                + "\nIdentificacion: %s\nNombres: %s\nEmail: %s\n",
                strIdentificacion, strNombres, strEmail);
        return cadena;   
    }
}
