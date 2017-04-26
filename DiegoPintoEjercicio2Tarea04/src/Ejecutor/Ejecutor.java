package Ejecutor;

import Clases.Alumno;
import Clases.ComponenteEducativa;
import Clases.CrearArchivo;
import Clases.Docente;
import Clases.DocenteAuxiliar;
import Clases.DocenteTitular;
import Clases.LecturaArchivo;
import Clases.Persona;
import Clases.RegistroAcademico;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Porti
 */
public class Ejecutor {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        //Atributos
        String strIdentificacion;
        String strNombres;
        String strEmail;
        String strIdAlumno;
        String strIdDocente;
        String strHorarioClase;
        String strHorarioTutoria;
        String strCodigo;
        String strNombre;
        int intNumCreditos;

        int opcion;
        boolean bandera = true;

        //objetos
        Persona objPersona = null;
        Alumno objAlumno;
        Docente objDocente;
        DocenteAuxiliar objDauxiliar;
        DocenteTitular objDtitular;
        ComponenteEducativa objComponente;
        RegistroAcademico objRegistro = null;
        CrearArchivo objCrear = new CrearArchivo();
        LecturaArchivo objLec = new LecturaArchivo();

        ArrayList<Persona> listPersonas = new ArrayList<Persona>();
        ArrayList<ComponenteEducativa> listComponentes = new ArrayList<ComponenteEducativa>();

        while (bandera) {

            System.out.println("------SISTEMA DE REGISTRO-------");
            System.out.println("--- [1] Ingresar persona      --");
            System.out.println("--- [2] Ingresar componente   --");
            System.out.println("--------------------------------");
            System.out.print("Elija la opcion 1-2: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("------- Persona --------");
                    System.out.print("Ingrese la identificacion: ");
                    strIdentificacion = entrada.next();
                    System.out.print("Ingrese sus nombres: ");
                    strNombres = entrada.next();
                    System.out.print("Ingrese el email:");
                    strEmail = entrada.next();
                    System.out.println("------- Elija que tipo de persona es -------");
                    System.out.println("----- [1] Alumno                        ----");
                    System.out.println("----- [2] Docente                       ----");
                    System.out.print("Elija la opcion 1-2: ");
                    opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("-------ALUMNO-------");
                            System.out.print("Ingrese el id: ");
                            strIdAlumno = entrada.next();
                            objAlumno = new Alumno(strIdentificacion, strNombres, strEmail, strIdAlumno);
                            //objRegistro.agregar_persona(objAlumno);
                            System.out.println("ALUMNO INGRESADO CORRECTAMENTE!");
                            String cadena = String.format("%s;%s;%s;%s;", strIdentificacion, strNombres, strEmail, strIdAlumno);
                            objCrear.agregarRegistro(cadena);
                            break;
                        // aqui va un constructor

                        case 2:
                            System.out.println("-------DOCENTE------");
                            System.out.print("Ingrese el id: ");
                            strIdDocente = entrada.next();
                            System.out.println("------------------------------");
                            System.out.println("--- [1] Docente Titular    ---");
                            System.out.println("--- [1] Docente Auxiliar   ---");
                            System.out.print("Elija el tipo de DOCENTE 1-2: ");
                            opcion = entrada.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("------ Docente Titular ------");
                                    System.out.print("Ingrese el horario clase: ");
                                    strHorarioClase = entrada.next();
                                    objDtitular = new DocenteTitular(strIdentificacion, strNombres, strEmail, strIdDocente, strHorarioClase);
                                    // objRegistro.agregar_persona(objDtitular);
                                    listPersonas.add(objDtitular);
                                    cadena = String.format("%s;%s;%s;%s;%s;", strIdentificacion, strNombres, strEmail,  strIdDocente, strHorarioClase);
                                    objCrear.agregarRegistro(cadena);
                                    break;
                                // aqui va un constructor
                                case 2:
                                    System.out.println("------ Docente Auxiliar ------");
                                    System.out.print("Ingrese el horario tutoria: ");
                                    strHorarioTutoria = entrada.next();
                                    objDauxiliar = new DocenteAuxiliar(strIdentificacion, strNombres, strEmail, strIdDocente, strHorarioTutoria);
                                    //objRegistro.agregar_persona(objDauxiliar);
                                    listPersonas.add(objDauxiliar);
                                    cadena = String.format("%s;%s;%s;%s;%s;", strIdentificacion, strNombres, strEmail,  strIdDocente, strHorarioTutoria);
                                    objCrear.agregarRegistro(cadena);
                                    break;
                                // aqui va un constructor

                            }
                            break;
                    }
                    break;

                case 2:
                    System.out.println("--------- Componente ----------");
                    System.out.print("Ingrese el codigo: ");
                    strCodigo = entrada.next();
                    System.out.print("Ingrese el nombre: ");
                    strNombre = entrada.next();
                    System.out.print("Ingrese el numero de creditos: ");
                    intNumCreditos = entrada.nextInt();
                    objComponente = new ComponenteEducativa(strCodigo, strNombre, intNumCreditos);
                    listComponentes.add(objComponente);

                    break;
                // aqui va el constructoe

            }

            System.out.println("----------------------------");
            System.out.println("Desea ingresar otro registro [1] Si  [2] No");
            opcion = entrada.nextInt();
            if (opcion != 1) {
                bandera = false;
            }
            
        }

    }

}
