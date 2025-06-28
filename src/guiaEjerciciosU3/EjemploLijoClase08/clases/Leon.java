/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjemploLijoClase08.clases;

import guiaEjerciciosU3.EjemploLijoClase08.interfaces.IDepredador;
import guiaEjerciciosU3.EjemploLijoClase08.superClases.Felino;

/**
 *
 * @author ChrisPC
 */
public class Leon extends Felino implements IDepredador{

    public Leon(String especie, int peso) {
        super(especie, peso);
    }
    

    @Override
    public void perseguir() {
        
        System.out.println("El leon esta persiguiendo a la presa");

    }

    @Override
    public void cazar() {
        System.out.println("El leon esta cazando");
    }
    
}
