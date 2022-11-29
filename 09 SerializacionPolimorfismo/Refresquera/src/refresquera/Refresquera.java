
package refresquera;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Refresquera {


    public static void main(String[] args) {
        Pet objetoPet = new Pet();
        Lata objetoLata = new Lata();
        /*Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor introduce el nombre PET");
        objetoPet.setNombre(entrada.next());
        System.out.println("Por favor introduce la presentacion PET");
        objetoPet.setPresentacion(entrada.next());
        System.out.println("Por favor introduce la envasadora PET");
        objetoPet.setEnvasadora(entrada.next());
        
        System.out.println("");
        
        System.out.println("Por favor introduce el nombre LATA");
        objetoLata.setNombre(entrada.next());
        System.out.println("Por favor introduce la presentacion LATA");
        objetoLata.setNombrelata(entrada.next());
        System.out.println("Por favor introduce la envasadora LATA");
        objetoLata.setPresentacion(entrada.next());
        */
        
        //System.out.println(objetoPet.imprimir());
        //System.out.println(objetoLata.imprimir());
        // PARA CREAR UNA COLECCION
        
        ArrayList<Pet> listPet = new ArrayList<Pet>();
        
        listPet.add(objetoPet);
        int tamaño = listPet.size();
        System.out.println("El tamaño de la coleccion es. " +listPet.size());
        //recuperar un objeto de la coleccion
        Pet objetoPetRecuperado = listPet.get(0);
        System.out.println(objetoPetRecuperado.imprimir());
        //eliminar elementos de la coleccion
        listPet.remove(0);
        System.out.println("El tamaño de la coleccion es: " +listPet.size());
        listPet.add(objetoPet);
        listPet.add(objetoPet);
        listPet.add(objetoPet);
        listPet.add(objetoPet);
        
        for(int i=0;i<listPet.size();i++){
            Pet objetoPetRecuperadoConFor = listPet.get(i);
            System.out.println(objetoPetRecuperadoConFor.imprimir());
              
        }
        //lo ideal es usar For Each
            for (Pet objetoPetRecuperadoConForeach : listPet){
                System.out.println(objetoPetRecuperadoConForeach.imprimir());
            }
            File outFile = 
    }
    
}
