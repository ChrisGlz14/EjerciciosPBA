/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaEjerciciosU3;

import guiaEjerciciosU3.EjemploVistoEnClase.Auto;
import guiaEjerciciosU3.EjemploVistoEnClase.ControlTV;
/**
 *
 * @author ChrisPC
 */
public class mainU3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        int[] canales = {1,7,13,16,45};
        
        ControlTV control = new ControlTV(0, canales);
      
        
        System.out.println("El canal actual es: " + control.getCanalActual());
        control.moverDerecha();
        control.moverDerecha();
        control.moverDerecha();
        
        
        
        Auto auto = new Auto(0, true);
        
        auto.moverAdelante();
        auto.moverAdelante();
        auto.moverAdelante();
        
        
        auto.detener(auto.getVelocidad());
        
        
        
        
    }
    
}
