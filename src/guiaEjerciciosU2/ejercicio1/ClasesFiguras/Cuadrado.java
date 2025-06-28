/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU2.ejercicio1.ClasesFiguras;

/**
 *
 * @author ChrisPC
 */
public class Cuadrado extends Figura {
    
    //Construcctor de cuadrado (Sus lados son iguales)
   public Cuadrado(double lado) {
        super(lado, lado);
   }
    
    @Override
    public double calcularArea (){
    return base * altura;
    }

    @Override
    public double calcularPerimetro() {
    return 4 * base;
    }
    
    
    @Override // Para poder mostrar mejor todo por consola
    public String toString(){
       return "El Area del Cuadrado es: " + calcularArea();
    }
    
   @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    return false;
    }
}
