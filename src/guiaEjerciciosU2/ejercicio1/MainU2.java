
package guiaEjerciciosU2.ejercicio1;

import guiaEjerciciosU2.ejercicio1.ClasesFiguras.Figura;
import guiaEjerciciosU2.ejercicio1.ClasesFiguras.Cuadrado;
import guiaEjerciciosU2.ejercicio1.ClasesFiguras.Rectangulo;
import guiaEjerciciosU2.ejercicio1.ClasesFiguras.Triangulo;

/**
 *
 * @author ChrisPC
 */
public class MainU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Figura cuadrado1 = new Cuadrado(12);
         
         
         System.out.println(cuadrado1.equals(cuadrado1)); // devolverá true
         
         System.out.println(cuadrado1);
         
         System.out.println(cuadrado1.calcularPerimetro());
         System.out.println(cuadrado1.calcularArea());
         
         
         Figura Triangulo1 = new Triangulo(5, 10);
         Figura Triangulo2 = new Triangulo(6, 10);
         
          if (Triangulo1.equals(Triangulo2)) {
            System.out.println("Son iguales en altura y base");
        } else {
            System.out.println("Son distintos");
        }
         
         
         System.out.println(Triangulo1.calcularPerimetro());
         System.out.println(Triangulo1.calcularArea());
         
         
         Figura Rectangulo1 = new Rectangulo(20, 10);
         
         System.out.println(Rectangulo1.calcularPerimetro());
         System.out.println(Rectangulo1.calcularArea());
    }
    
}
