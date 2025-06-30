/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.ejercicioCocaCola.clasesCloneables;

/**
 *
 * @author ChrisPC
 */
public class IngredienteCompuesto implements Cloneable {
    private String nombre;
    private int cantidadMl;

    public IngredienteCompuesto(String nombre, int cantidadMl) {
        this.nombre = nombre;
        this.cantidadMl = cantidadMl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadMl() {
        return cantidadMl;
    }

    public void setCantidadMl(int cantidadMl) {
        this.cantidadMl = cantidadMl;
    }

      
    
    @Override 
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }   
    

    @Override
    public String toString() {
        return "IngredienteCompuesto{" + "nombre=" + nombre + ", cantidadMl=" + cantidadMl + '}';
    }
    
    
}
