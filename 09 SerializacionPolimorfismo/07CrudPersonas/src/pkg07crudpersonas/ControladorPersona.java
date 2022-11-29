
package pkg07crudpersonas;
/* *Registrer, consul, udate, deleta 
*registrar a todas las personas 
*consultar todas las personas 
*actualizar datos de persona
*eliminar persona
*
*/

import java.util.ArrayList;
public class ControladorPersona {
    
    /*
    vamos a ocupar un tipo de dato especial que sea capaz de almacenar diferentes tipos de datos y objetos
    ¿por que?
    necesitamos tener una lista de personas que van a poder registrarse, actualizar ñps datos, eliminar una cuenta y/o consultar y buscar 
    los diferentes registros
    
    
    para ello tenemos que ocupar Arraylist
    */
    
    // lo primero es crear el objeto
    
    public static ArrayList<Personas> listadepersonas = new ArrayList <Personas>();
    
    
    public ArrayList <Personas> mostrarPersonas(){
    return listadepersonas;
    
    
    }
    
    //rl mryofo que se encarga de registrar a una persona
    
    public void registrarPersona(Personas p){
    
        listadepersonas.add(p);
    }
    
    
    //buscar a una persona por id 
    
    public Personas buscarPersonas(int id){
    
    // primero necesito un objeto para almacenar a la persona
    
    Personas encontrada = new Personas();
    
    for (Personas p : listadepersonas){
    if( id == p.getId()){
        encontrada = p;
    }else {
        System.out.println("Persona no encontrada");
    }
    }
        return null;
        }
    public void actualizarPersona(Personas personaActualiza){
    /*
        *primero tengo que buscarla
        *despues ob
        */
    
    Personas PersonasActualizar = buscarPersonas(personaActualiza.getId());
    
    listadepersonas.remove(PersonasActualizar);
    listadepersonas.add(personaActualiza);
    }
    
    public void eliminarPersonas (Personas personaeliminar){
    listadepersonas.remove(personaeliminar);
    }
    
    
    
}
