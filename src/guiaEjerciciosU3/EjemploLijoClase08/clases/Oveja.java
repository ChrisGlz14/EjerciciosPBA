/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjemploLijoClase08.clases;

import guiaEjerciciosU3.EjemploLijoClase08.interfaces.IPresa;
import guiaEjerciciosU3.EjemploLijoClase08.superClases.Mamifero;

/**
 *
 * @author ChrisPC
 */
public class Oveja extends Mamifero implements IPresa {

    @Override
    public void observar() {
        System.out.println("La oveja observa si no hay un lobo cerca xd");
    }

    @Override
    public void huir() {
        System.out.println("La oveja corre y huye por su vida");
    }
    
}
