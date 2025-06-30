/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEjerciciosU3.ejercicioCocaCola.clasesCloneables;

/**
 *
 * @author ChrisPC
 */
public class CocaCola implements Cloneable {
    private String tipo;
    private Double volumeMl;
    private IngredienteCompuesto esenciaSecreta; // Objeto anidado

    public CocaCola(String tipo, Double volumeMl, IngredienteCompuesto esenciaSecreta) {
        this.tipo = tipo;
        this.volumeMl = volumeMl;
        this.esenciaSecreta = esenciaSecreta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getVolumeMl() {
        return volumeMl;
    }

    public void setVolumeMl(Double volumeMl) {
        this.volumeMl = volumeMl;
    }

    public IngredienteCompuesto getEsenciaSecreta() {
        return esenciaSecreta;
    }

    public void setEsenciaSecreta(IngredienteCompuesto esenciaSecreta) {
        this.esenciaSecreta = esenciaSecreta;
    }

    @Override
    public String toString() {
        return "CocaCola{" + "tipo=" + tipo + ", volumeMl=" + volumeMl + ", esenciaSecreta=" + esenciaSecreta + '}';
    }
    
    
    public CocaCola copiaSuperficial() throws CloneNotSupportedException{
        return (CocaCola) super.clone();
    }
    
    
    public CocaCola copiaProfunda() throws CloneNotSupportedException{        
        CocaCola clonada = (CocaCola) super.clone();
        clonada.esenciaSecreta = (IngredienteCompuesto) this.esenciaSecreta.clone(); //Le debemos pasar el casteo a obj porque clone retorna obj
        
        return clonada;
    }
    
}
