package pkg09pkmpolimorfismoserializacion;

/*
importaremos una libreria que permite la 
serializacion de las barbies
*/
import java.io.Serializable;
//esta libreria permite crear archivos de manera binaria
public abstract class Barbie implements Serializable{

    private String nombre;
    private int edad;
    
    public Barbie(){
        
    }
    
    public Barbie(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //necesitamos un metodo que nos permita 
    //crear barbies con base a lo que quieran ser!!
    abstract String tipobarbie();
    
    
    
}
