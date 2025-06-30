package guiaEjerciciosU4;

import guiaEjerciciosU4.PrimerEjercicioListas.Alumno;
import guiaEjerciciosU4.PrimerEjercicioListas.Curso;
import java.util.Scanner;

public class mainU4 {

    public static void main(String[] args) {

        

        
        Scanner sc = new Scanner(System.in);

        int opcion;

        String menu = "Menu:\n"
                + "Opcion 1 - Agregar Alumno\n"
                + "Opcion 2 - Eliminar Alumno por legajo\n"
                + "Opcion 3 - Eliminar Alumno por nombre\n"
                + "Opcion 4 - Traer lista de todos los Alumnos\n"
                + "Opcion 0 - Salir\n"
                + "Ingrese una opción:";
        
        
        Curso cursoPBA = new Curso();

        do {
            System.out.println(menu);
            opcion = sc.nextInt();
            
            
            switch (opcion) {
                case 1:
                    System.out.println("Agregar Alumno seleccionado");
                    sc.nextLine();
                    System.out.println("Ingreese nombre: ");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Ingrese numero legajo: ");
                    int numeroLegajo = sc.nextInt();
                    
                    System.out.println("Ingrese nota del tp: ");
                    int notaTP = sc.nextInt();
                    
                    Alumno a = new Alumno(nombre, notaTP, numeroLegajo);
                    cursoPBA.matriculaAlumno(a);
                    break;
                case 2:
                    System.out.println("Eliminar Alumno por legajo seleccionado");
                    System.out.println("Ingresar numero de Legajo: ");
                    int legajo = sc.nextInt();
                    Alumno alumnoEncontrado = cursoPBA.consultaAlumno(legajo);
                    cursoPBA.desmatriculaAlumno(alumnoEncontrado);
                    break;
                case 3:
                    System.out.println("Eliminar Alumno por nombre seleccionado");  
                    sc.nextLine();
                    System.out.println("Ingrese nombre del alumno: ");
                    String nombreBuscar = sc.nextLine();
                    Alumno alumnoEncontradoNombre = cursoPBA.consultaAlumnoPorNombre(nombreBuscar);
                    
                    cursoPBA.desmatriculaAlumno(alumnoEncontradoNombre);
                    break;
                case 4:
                    System.out.println("Mostrar lista de Alumnos");
                    cursoPBA.listar();
                    
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.\n");
            }
        } while (opcion != 0);
        
        sc.close();
    }
}


    // agregar validacion en caso de querer agregar un nuevo alumno si es que ya esta!


