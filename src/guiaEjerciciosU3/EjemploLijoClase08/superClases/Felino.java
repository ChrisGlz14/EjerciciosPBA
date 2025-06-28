/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjemploLijoClase08.superClases;

/**
 *
 * @author ChrisPC
 */
public abstract class Felino {
    
    private String especie;
    private int peso;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Felino(String especie, int peso) {
        this.especie = especie;
        this.peso = peso;
    }
    
    
    
}
