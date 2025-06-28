/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU2.ejercicio1.ClasesFiguras;

/**
 *
 * @author ChrisPC
 */
public abstract class Figura {
    
    //Atributos
    public double altura;
    public double base;
    
    
    //Getters y Setters
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    // Métodos abstractos: deben implementarlo las subclases
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    
    
    // Constructor: Debe utilizarse para construir elementos.
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    
}
