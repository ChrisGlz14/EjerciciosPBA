package guiaEjerciciosU3.EjemploLijoClase08;

import guiaEjerciciosU3.EjemploLijoClase08.clases.Leon;
import guiaEjerciciosU3.EjemploLijoClase08.clases.Rana;

public class animalesMain {

    public static void main(String[] args) {
      
        
        System.out.println("\nAcciones LEON \n");
        
        Leon leon = new Leon("Leon", 42);
        
        
        System.out.println("Especie: " + leon.getEspecie());
        System.out.println("Peso: " + leon.getPeso());
     
        leon.cazar();
        
       
        System.out.println("\nAcciones RANA\n");
        System.out.println("Rana Depredadora");
        Rana rana = new Rana();
        
        rana.perseguir();
        rana.cazar();
        
        System.out.println("\nRana Cagona:");
        rana.observar();
        rana.huir();
        
        
    }
    
}
