package guiaEjerciciosU4;

import guiaEjerciciosU4.segundoEjercicioFiguras.Cuadrado;
import guiaEjerciciosU4.segundoEjercicioFiguras.Figura;
import guiaEjerciciosU4.segundoEjercicioFiguras.Rectangulo;
import guiaEjerciciosU4.segundoEjercicioFiguras.Triangulo;
import java.util.ArrayList;
import java.util.List;




public class FigurasMain {
    
    public static void main(String[] args) {
        
        
        Triangulo t1 = new Triangulo(5.0,25.0);
        Cuadrado c1 = new Cuadrado(12.2, 12.2);
        Rectangulo r1 = new Rectangulo(12.2,15.5);
        
        c1.obtenerArea();
        
        List<Figura> figurasLista = new ArrayList<>();
        
        
        figurasLista.add(t1);
        figurasLista.add(c1);
        figurasLista.add(r1);
        
        
        for(Figura f : figurasLista){
            System.out.println("El area de la figura " + f.getClass().getSimpleName() + " es: " + f.obtenerArea());
            System.out.println("La suma de todas las areas es : " + f.obtenerArea());
        }
        
        System.out.println(figurasLista);
        
    }
    
}
