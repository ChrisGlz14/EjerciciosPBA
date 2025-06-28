/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaEjerciciosU2.ejercicio4;

import guiaEjerciciosU2.ejercicio4.ClasesSemaforo.EnAviso;
import guiaEjerciciosU2.ejercicio4.ClasesSemaforo.Habilitado;
import guiaEjerciciosU2.ejercicio4.ClasesSemaforo.NoHabilitado;
import guiaEjerciciosU2.ejercicio4.ClasesSemaforo.Semaforo;

/**
 *
 * @author ChrisPC
 */
public class MainEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos un nuevo semaforo
        
        Semaforo semaforo1 = new Semaforo("Gorriti", "Penialoza");
        
        Semaforo semaforo2 = new Semaforo("Gorriti", "Penialoza", new EnAviso());
        
        Semaforo semaforo3 = new Semaforo("Gorriti No Habilitado que debe estar en aviso", "Penialoza", new NoHabilitado());
        
        Semaforo semaforoPruebaEquals = new Semaforo("Gorriti", "Azcuenaga",new Habilitado());
        
        Semaforo semaforoIdentico1 = new Semaforo("Gorriti", "Penaloza", new Habilitado());
        Semaforo semaforoIdentico2 = new Semaforo("Gorriti", "Penaloza", new Habilitado());

        
        
        semaforo3.setEstado(new EnAviso());
        
        
        
        System.out.println(semaforo1);
        System.out.println(semaforo2);
        System.out.println(semaforo3);
        System.out.println(semaforoPruebaEquals.equals(semaforo1));
        System.out.println(semaforoIdentico1.equals(semaforoIdentico2));
        
    }
    
}
