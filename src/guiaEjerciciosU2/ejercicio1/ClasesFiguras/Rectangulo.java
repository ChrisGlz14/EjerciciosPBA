/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU2.ejercicio1.ClasesFiguras;

/**
 *
 * @author ChrisPC
 */
public class Rectangulo extends Figura {
    
    // constructor de rectangulo
    public Rectangulo(double base, double altura){
    super(base, altura);
    }
    
    
    @Override 
    public double calcularArea(){
    return base * altura;
    }
    
    @Override 
    public double calcularPerimetro(){
    return (base*2) + (altura*2);
    }
    
    
    
}
