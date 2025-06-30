/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaEjerciciosU3.EjercicioHeroeLijo;

import guiaEjerciciosU3.EjercicioHeroeLijo.clases.Heroe;

/**
 *
 * @author ChrisPC
 */
public class CampoBatalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Heroe heroe1 = new Heroe("Chris", 100);
        Heroe heroe2 = new Heroe("Aixa", 100);

        System.out.println(heroe1.compareTo(heroe2));

        realizarDuelo(heroe1, heroe2);

    }

    private static void realizarDuelo(Heroe heroe1, Heroe heroe2) {
        System.out.println("Heroe 1: " + heroe1.getNombre() + " Poder de combate: " + heroe1.getPoderDeCombate());
        System.out.println("\nHeroe 2: " + heroe2.getNombre() + " Poder de combate: " + heroe2.getPoderDeCombate());

        int resultado = heroe1.compararPoder(heroe2);

        if (resultado > 0) {
            System.out.println("\nEl ganador es: " + heroe1.getNombre());
        } else if (resultado < 0) {
            System.out.println("El ganador es: " + heroe2.getNombre());
        } else {
            System.out.println("Empate de poder entre " + heroe1.getNombre() + " y " + heroe2.getNombre());
            System.out.println("Se evaluaran los nombres!");

            int nombreResultado = heroe1.getNombre().compareTo(heroe2.getNombre());
            
            if (nombreResultado == 0) {
                System.out.println("Hasta tienen el mismo nombre");
            } else if (nombreResultado < 0) {
                System.out.println("Se ordenaría alfabéticamente como " + heroe1.getNombre() + " primero");
            } else {
                System.out.println("Se ordenaría alfabéticamente como " + heroe2.getNombre() + " primero");
            }
        }
    }
}


