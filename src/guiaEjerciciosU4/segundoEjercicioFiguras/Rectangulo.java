/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU4.segundoEjercicioFiguras;

/**
 *
 * @author ChrisPC
 */
public class Rectangulo extends Figura {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double obtenerArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + '}';
    }
    
    
    
}
