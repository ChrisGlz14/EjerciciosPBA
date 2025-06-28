/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjemploLijoClase08.clases;

import guiaEjerciciosU3.EjemploLijoClase08.interfaces.IDepredador;
import guiaEjerciciosU3.EjemploLijoClase08.interfaces.IPresa;
import guiaEjerciciosU3.EjemploLijoClase08.superClases.Anfibio;

/**
 *
 * @author ChrisPC
 */
public class Rana extends Anfibio implements IDepredador, IPresa{

    @Override
    public void perseguir() {
        System.out.println("La rana salta persiguiendo a su presa");
    }

    @Override
    public void cazar() {
        System.out.println("La rana salta epicamente a cazar");
    }

    @Override
    public void observar() {
        System.out.println("La rana observa increiblemente el entorno para ver si se la quieren culear");
    }

    @Override
    public void huir() {
        System.out.println("La rana huye para ver si evita ser comida");
    }
    
}
