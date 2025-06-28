/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjemploVistoEnClase;

/**
 *
 * @author ChrisPC
 */
public class Auto implements IMovible{
    
    
    private int velocidad;
    private final boolean arrancar;

    public Auto(int velocidad, boolean arrancar) {
        this.velocidad = velocidad;
        this.arrancar = arrancar;
    }

    

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
    @Override
    public void moverAdelante() {
        if(this.arrancar == true) {
           this.velocidad += 10;
            System.out.println("La velocidad es de: " + velocidad + " km/h");
        } else {
            System.out.println("El auto esta apagado.");
        }
    }

    @Override
    public void moverAtras() {
        
    }
    
    public void detener() {
        
    }
    
    
    public void detener(int velocidad){
        if(this.arrancar == true){
          velocidad = getVelocidad();
          while(velocidad != 0){
              this.velocidad--;
              System.out.println("La velocidad se reduce poco a poco: " + velocidad-- + " Km/h"); 
          }
            System.out.println("El auto se frenó");
           
        } else {
            System.out.println("El auto ya esta frenado");
        }
    }

   

    
    
    
    @Override
    public void moverIzquierda() {

    }

    @Override
    public void moverDerecha() {

    }
}
