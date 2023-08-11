
package linkedlists;


import java.util.LinkedList;
import java.util.List;


public class LinkedLists {

    public static void main(String[] args) {
        
        List<Persona> lista = new LinkedList<Persona> ();
        
        //agregar personas al final de la lista
        lista.add(new Persona(1,"nico",23));
        lista.add(new Persona(2,"tuma15",14));
        lista.add(new Persona(3,"tuma17",22));
        lista.add(new Persona(4,"martin",21));
        
        //agregar personas al principio, lo unico es que se agrega un 0
        //antes de new
        lista.add(0, new Persona(1,"probando",33));
        
        System.out.println("\n------FOREACH Recorre elemento x elemento-----");
        //Recorrer elemento por elemento con foreach
        for (Persona perso:lista){
            System.out.println("Prueba: "+ perso.getNombre());
        }
        
    }
}
