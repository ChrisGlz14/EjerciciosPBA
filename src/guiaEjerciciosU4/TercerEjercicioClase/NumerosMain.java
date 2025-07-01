package guiaEjerciciosU4.TercerEjercicioClase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumerosMain {

    public static void main(String[] args) {
        
        //Importante usar las wrapper clases porque siempre a las listas se le pasan OBJETOS y no tendriamos el compareTo tambien.
        //List<int> numerosList = new ArrayList<>();
                
                
        List<Integer> numeros = new ArrayList<>(Arrays.asList(0,5,1,2,9,8,7));
        
        
        //Agregar un numero al principio de la lista
        //Ingresamos en la posicion de index(0) el numero 14, por ende se agrega primero. 
        numeros.add(0, 14);
        
        
        //Si queremos agregar un elemento al final podriamos simplemente hacer un Add y listo.
        numeros.add(99);
        
        
        
        //Copia de la lista anterior guardada en una NUEVA ARRAY LIST.
        List<Integer> numerosCopia = new ArrayList<>(numeros);
        
        
        
        //Reeplazar los numeros impares por ceros. Tener en cuenta que Al usar INTEGER teneos el get y set por naturaleza.
        for(int i = 0; i < numerosCopia.size(); i++ ){
            Integer esteNumero = numerosCopia.get(i);
            if(esteNumero % 2 != 0) {
                numerosCopia.set(i, 0);
            }
        }
        
        //Recorrer lista ENTERA y eliminar los numeros mayores a 100
        for(int i = 0; i < numeros.size(); i++){
            Integer esteNumero = numeros.get(i);
            if (esteNumero >= 100) numeros.remove(i);
        }
        
        //En este caso Tenemos que usar un bucle While porque aunque se elimine uno la varaible iteradora se suma en el bucle for
        
        int i = 0;
        while (i < numeros.size()){
            Integer esteNumero = numeros.get(i);
            
            if(esteNumero > 100) numeros.remove(i);
            else i++;
        }
        
        
        //Misma funcionalidad pero con bucle FOR EACH
        for(Integer esteNumero : numeros){
            if(esteNumero > 100) numeros.remove(esteNumero);
        }
        
        /* 
        Entonces CUANDO NECESITAMOS SABER LA POSICION UN BUCLE FOR NORMAL.
        CUANDO NECESITAMOS LA POSICION PERO NO ESTA DETERMINADA O NO ESPECIFICO Un WHILE.
        CUANDO NECESITAMOS EL OBJETO O UNA PROPIEDAD EL FOR EACH.
        
        SINO PRIMERO PROBAMOS CON FOR EACH Y DESPUES CAMBIAMOS AL QUE MAS SE NOR AJUSTE.
        
        */
        
        
        
        numeros.sort(null);
        
        
        System.out.println(numeros);
    }
    
    
    
    
}
