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
public class Alumno {
    
   private String nombre;
   private int legajo;
   private float notaTp1;

  
    public Alumno(String nombre, int legajo, float notaTp1) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notaTp1 = notaTp1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public float getNotaTp1() {
        return notaTp1;
    }

    public void setNotaTp1(float notaTp1) {
        this.notaTp1 = notaTp1;
    }

    @Override
    public String toString() {
        return "Alumno{" + " nombre= " + nombre + ", legajo= " + legajo + ", notaTp1= " + notaTp1 + '}';
    }
    
    

    
  
}
