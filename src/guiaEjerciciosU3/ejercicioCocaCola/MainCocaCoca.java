/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaEjerciciosU3.ejercicioCocaCola;

import guiaEjerciciosU3.ejercicioCocaCola.clasesCloneables.CocaCola;
import guiaEjerciciosU3.ejercicioCocaCola.clasesCloneables.IngredienteCompuesto;

/**
 *
 * @author ChrisPC
 */
public class MainCocaCoca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws CloneNotSupportedException {
        
        //Coca cola Copia SUPERFICIAL 
        CocaCola original = new CocaCola("Esencia pura y Original", 300.0, new IngredienteCompuesto("Original papa", 300));
        
        
        System.out.println("Coca original = " + original);
        CocaCola clon = original.copiaSuperficial();
        
        clon.setTipo("Truchanga");
        clon.getEsenciaSecreta().setNombre("Modificada");
        
        System.out.println("Coca Clon = " + clon); 
        
        
        //Al llamar de nuevo a la original, al compartir direccion se cambia aunque hayamos cambiado el clon
        System.out.println("Coca original despues de modificar el clon = " + original);
        
        
        
        //Coca Cola Copia Profunda
        CocaCola original2 = new CocaCola("Esencia pura y Original 2", 300.0, new IngredienteCompuesto("Original papa 2", 300));
        
        CocaCola clonAutonomo = original2.copiaProfunda();
        clonAutonomo.setTipo("Truchanga 2");
        clonAutonomo.getEsenciaSecreta().setNombre("Rebajadisima con agua jeje");
  
        
        System.out.println("\nCoca original 2 = " + original2);
        
        System.out.println("Coca Clon 2 = " + clonAutonomo);
        
        
        
        
        //Aca tenemos la impresion original luego de haber modificado el clon.
        
        System.out.println("\nCoca original 2 luego de ser modificado el clon = " + original2);
        
        
        System.out.println("\nCoca Clon 2 = " + clonAutonomo);

    }
    
}
