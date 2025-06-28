/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU2.ejercicio4.ClasesSemaforo;

/**
 *
 * @author ChrisPC
 */
public abstract class Estado {    

    boolean Estado;

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
    
    //Definir metodo abstracto cambiar estado
    public abstract void cambiarEstado(Semaforo semaforo);
    
    
}
