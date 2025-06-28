/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU2.ejercicio4.ClasesSemaforo;

/**
 *
 * @author ChrisPC
 */
public class Semaforo  {
    //Atributos
    private String calle1;
    private String calle2;
    private Estado estado;
    
    
    //Constructor
    public Semaforo(String calle1, String calle2){
    this.calle1 = calle1;
    this.calle2 = calle2;
    this.estado = new Habilitado();
    }
    
    public Semaforo(String calle1, String calle2, Estado estado){
    this.calle1 = calle1;
    this.calle2 = calle2;
    this.estado = estado;
    }
    
    
    public void cambiarEstado(){
        estado.cambiarEstado(this);
    }
    
    public void setEstado(Estado nuevoEstado){
        this.estado = nuevoEstado;
    }
    
    
    public Estado getEstado(){
        return estado;
    }

    void setEstado(NoHabilitado noHabilitado) {
        
    }
 
    @Override
    public String toString(){
        return "El Semadoro entre: " + this.calle1 + " y " + this.calle2 + " esta en estado: " + this.estado;
    }
    
    
}
