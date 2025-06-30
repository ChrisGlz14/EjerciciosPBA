/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU4.PrimerEjercicioListas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ChrisPC
 */
public class Curso {
    
   List<Alumno> alumnos; 
    
   public Curso (){
       alumnos = new ArrayList<>();
       
   }
   
   public void matriculaAlumno(Alumno a) {
    int i = 0;
    boolean encontreAlumno = false;
    while (i < alumnos.size() && !encontreAlumno) {
        if (a.getLegajo() == alumnos.get(i).getLegajo()) {
            System.out.println("El alumno con ese legajo ya existe!");
            encontreAlumno = true;
        }
        i++;
    }
    
    if (!encontreAlumno) {
        alumnos.add(a);
        System.out.println("Alumno matriculado correctamente.");
    }
}

   
   public void desmatriculaAlumno(Alumno a){
       alumnos.remove(a);
   }
   
   public Alumno consultaAlumno(int legajo){
       int i = 0;
       Alumno alumnoEncontrado = null;
       boolean encontreAlumno = false;
       while(i < alumnos.size() && !encontreAlumno){
           
           Alumno esteAlumno = alumnos.get(i);
           
           if(esteAlumno.getLegajo() == legajo){
               encontreAlumno = true;
               alumnoEncontrado = esteAlumno;
           }
 
           i++;
           
       }
       return alumnoEncontrado;
   }
   
   
   public Alumno consultaAlumnoPorNombre(String nombre){
       int i = 0;
       Alumno alumnoEncontrado = null;
       boolean encontreAlumno = false;
       while(i < alumnos.size() && !encontreAlumno){
           
           Alumno esteAlumno = alumnos.get(i);
           
           if(esteAlumno.getNombre().equals(nombre)){
               encontreAlumno = true;
               alumnoEncontrado = esteAlumno;
           }
 
           i++;
           
       }
       return alumnoEncontrado;
   }
   
   
   
   
   
   
   
   public void listar(){
        System.out.println(alumnos);
    }
}
