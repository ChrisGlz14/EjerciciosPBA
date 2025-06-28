/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.EjemploVistoEnClase;

/**
 *
 * @author ChrisPC
 */
public class Personaje implements IMovible{
    
    int fila, columna;
    
    @Override
    public void moverAdelante() {
        
        fila++;
        
    }

    @Override
    public void moverAtras() {
        fila--;
    }

    @Override
    public void moverIzquierda() {
        columna--;
    }

    @Override
    public void moverDerecha() {
        columna++;
    }

    @Override
    public void detener() {
        
    }
    
}
