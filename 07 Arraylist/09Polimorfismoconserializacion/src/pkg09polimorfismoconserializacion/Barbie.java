package pkg09polimorfismoconserializacion;
/*
esta clase es la clase abstracta por que es la que es capaz 
de transformarse en las demas 

vamos a poder guardar el registro de barbbies

*/
import java.io.Serializable;
// nos sirve para poder generar archivos desde binario 
public abstract class Barbie implements Serializable{



    private String nombre;
    private int edad;
    
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
    
    //metodo que facilita la transformacion
    //para que la barbie sea lo que quiera ser
    
    abstract String tipobarbie();
}
