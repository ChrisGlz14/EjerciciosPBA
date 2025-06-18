/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU2.ejercicio1.ClasesFiguras;

/**
 *
 * @author ChrisPC
 */
public class Triangulo extends Figura {
    
    //Constructor de Triangulo
    public Triangulo(double base, double altura){
    super(base,altura);
    }
  
    @Override  
    public double calcularArea(){
    return (base * altura) / 2;
    }
    
      
    @Override
    public double calcularPerimetro() {
    return 3 * base;
    }
    
}
