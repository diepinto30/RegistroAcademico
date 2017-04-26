
package Clases;

/**
 *
 * @author Porti
 */
public class ComponenteEducativa {
    private String strCodigo;
    private String strNombre;
    private int intNumCreditos;

    public ComponenteEducativa(String strCodigo, String strNombre, int intNumCreditos) {
        this.strCodigo = strCodigo;
        this.strNombre = strNombre;
        this.intNumCreditos = intNumCreditos;
    }

    @Override
    public String toString() {
        return String.format("\n\n----------Componente Educativo ----------"
                + "\nCodigo: %s\nNombre del componente: %s\nN° Creditos: %d\n",
                strCodigo, strNombre, intNumCreditos);
    }
    
    
}
