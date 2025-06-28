/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjemploVistoEnClase;

/**
 *
 * @author ChrisPC
 */
public class TableroPersonaje {

    private Personaje personaje;

    private int mapaFil = 5;
    private int mapaCol = 5;

    private int[][] mapa;

    public TableroPersonaje() {
        mapa = new int[mapaFil][mapaCol];

        for (int i = 0; i < mapaFil; i++) {

            for (int j = 0; j < mapaCol; j++) {
                mapa[i][j] = 0;
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < mapaFil; i++) {
            for (int j = 0; j < mapaCol; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
            }
        }
    }

