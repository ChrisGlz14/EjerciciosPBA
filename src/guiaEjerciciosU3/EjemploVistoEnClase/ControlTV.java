/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjemploVistoEnClase;

/**
 *
 * @author ChrisPC
 */
public class ControlTV implements IMovible {
    
    //Canal actual sera la posicion en la que vayamos recorriendo el array.
    private int canalActual;
    
    //cantidad de canales sera un array de enteros.
    private int[] cantidadCanales;

    
    //Contructor
    public ControlTV(int canalActual, int[] cantidadCanales) {
        this.canalActual = canalActual;
        this.cantidadCanales = cantidadCanales;
    }

    
    
    public int[] getCantidadCanales() {
        return cantidadCanales;
    }
    
   
    public void setCantidadCanales(int[] cantidadCanales) {
        this.cantidadCanales = cantidadCanales;
    }

    public int getCanalActual() {
        return cantidadCanales[canalActual];
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }

    @Override
    public String toString() {
        return "ControlTV{" + "canalActual=" + canalActual + '}';
    }

    
    

    @Override
    public void moverAdelante() {
        
    }

    @Override
    public void moverAtras() {
        
    }

    @Override
    public void moverIzquierda() {
    if(this.canalActual < cantidadCanales[0]){
        System.out.println("No se puede bajar mas");
        } else {
        canalActual--;
        System.out.println("Canal cambiado a " + cantidadCanales[canalActual]);
        }
    }

    @Override
    public void moverDerecha() {
       if(this.canalActual > cantidadCanales.length){
            System.out.println("No se puede subir mas");
       } else {
           canalActual++;
           System.out.println("El canal cambiado a " + cantidadCanales[canalActual]);
       }
    }

    @Override
    public void detener() {
    }
    
    
    
}
