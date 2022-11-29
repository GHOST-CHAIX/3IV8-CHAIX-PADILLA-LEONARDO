package pkg07crudpersonas;

import java.util.*;
public class VistaPersona {
    Scanner entrada = new Scanner (System.in);
    int opcion;
    
    ControladorPersona crud = new ControladorPersona();
    
    public void Principal() {
    
        System.out.println("Bienvenidos al sistema de dormiditos");
        System.out.println("Por favor elija una opcion"
        + "\n 1 .- Mostrar lista de dormiditos"
        + "\n 2 .- Registrar un nuevo dormidito"
        + "\n 3 .- Registrar un nuevo dormidito"
        + "\n 4 .- Registrar un nuevo dormidito"
        + "\n 5 .- Registrar un nuevo dormidito"
    );
        
        switch (opcion){
        
            case 1: 
                ArrayList<Personas> listadormiditos = crud.mostrarPersonas();
                for (Personas p : listadormiditos)
                break;
            case 2:
                System.out.println("Ingresa el id del dormidito");
                int iddormidito = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingresa el nombre del dormidito");
                String nombredormidito = entrada.nextLine();
                System.out.println("Ingrese la edad del dormidito");
                int edaddormidito = Integer.parseInt(entrada.nextLine());
                
                //enviarlos al objt de persona
                Personas nuevoDormidito = new Personas (iddormidito,nombredormidito, edaddormidito);
                crud. registrarPersona (nuevoDormidito);
                break;
            case 3: 
                System.out.println("Ingrese el id del dormidito a buscar");
                iddormidito = entrada.nextInt();
                
                //Personas
                break;
            case 4:
                System.out.println("Ingrese el id del dormidito a despertar");
                int despertar = entrada.nextInt();
                
                //Primero busco
                Persona desperta
                
        
        
        }
    }while();
    
}
