/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU2.ejercicio4.ClasesSemaforo;
/**
 *
 * @author ChrisPC
 */
public class Habilitado extends Estado{
    
    public Habilitado(){
        setEstado(true);
    }
   
    @Override 
    public void cambiarEstado(Semaforo semaforo){
       
    }
  
     @Override
    public String toString(){
        return "Habilitado ";
    }
    
    @Override 
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Habilitado h = (Habilitado) obj;
        return this.Estado == h.Estado;
    }
    
}
