/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU4.segundoEjercicioFiguras;

/**
 *
 * @author ChrisPC
 */
public class Triangulo extends Figura{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + '}';
    }
    
    
}
