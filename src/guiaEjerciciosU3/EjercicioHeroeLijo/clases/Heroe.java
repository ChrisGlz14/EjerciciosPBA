/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjercicioHeroeLijo.clases;

/**
 *
 * @author ChrisPC
 */
public class Heroe implements Comparable<Heroe>{
    private String nombre;
    private int poderDeCombate;

    public Heroe(String nombre, int poderDeCombate) {
        this.nombre = nombre;
        this.poderDeCombate = poderDeCombate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoderDeCombate() {
        return poderDeCombate;
    }

    public void setPoderDeCombate(int poderDeCombate) {
        this.poderDeCombate = poderDeCombate;
    }
    
    

    @Override
    public int compareTo(Heroe otroHeroe){
        if(this.poderDeCombate != otroHeroe.poderDeCombate){
            return Integer.compare(this.poderDeCombate, otroHeroe.poderDeCombate);
        } else {
            return this.nombre.compareTo(otroHeroe.nombre);
        }
    }
    
    public int compararPoder(Heroe otroHeroe){
    return Integer.compare(this.poderDeCombate, otroHeroe.poderDeCombate);
    }

    
    

    @Override
    public String toString() {
        return "Heroe{" + "nombre=" + nombre + ", poderDeCombate=" + poderDeCombate + '}';
    }
    
    
            
    
}
