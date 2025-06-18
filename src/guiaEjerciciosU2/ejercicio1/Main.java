/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaEjerciciosU2.ejercicio1;

import guiaEjerciciosU2.ejercicio1.ClasesFiguras.Cuadrado;
import guiaEjerciciosU2.ejercicio1.ClasesFiguras.Figura;
import guiaEjerciciosU2.ejercicio1.ClasesFiguras.Rectangulo;
import guiaEjerciciosU2.ejercicio1.ClasesFiguras.Triangulo;

/**
 *
 * @author ChrisPC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Figura cuadrado1 = new Cuadrado(12);
         
         System.out.println(cuadrado1.calcularPerimetro());
         System.out.println(cuadrado1.calcularArea());
         
         
         Figura Triangulo1 = new Triangulo(5, 10);
         
         System.out.println(Triangulo1.calcularPerimetro());
         System.out.println(Triangulo1.calcularArea());
         
         
         Figura Rectangulo1 = new Rectangulo(20, 10);
         
         System.out.println(Rectangulo1.calcularPerimetro());
         System.out.println(Rectangulo1.calcularArea());
    }
    
}
