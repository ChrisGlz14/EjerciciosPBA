/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU2.ejercicio4.ClasesSemaforo;
/**
 *
 * @author ChrisPC
 */
public class EnAviso extends Estado{
    
    
    @Override 
    public void cambiarEstado(Semaforo semaforo){
        semaforo.setEstado(new EnAviso());
    }
    
    
    @Override
    public String toString(){
        return "En Aviso";
    }
    
}
