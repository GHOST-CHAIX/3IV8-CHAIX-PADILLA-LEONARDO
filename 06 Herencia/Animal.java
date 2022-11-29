import javax.naming.AuthenticationException;

public class Animal {
    /*Establecemos el encapsulamiento: Que es poder restringir el aceso a los datos. Vamos a poder  */
    
    private String nombre,raza, tipo_alimento;
    private int edad;
    /*Definimos el constructor 
     * este nos sirve 
     */

     public Animal(){
        //vacio
     }

     //sobre carga de metodos

     public Animal(String nombre, String raza, String tipo_alimento, int edad){

        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
     }
     /* Hace falta poder enviar y obtener los valores correspondientes de los valores
      * donde ocupamos 
      get: obtener / recibir 
      set: asignar / enviar 
      */
      //get
      public String getNombre(){
        return nombre;
      }

      ///set

      public void setNombre(String nombre){
        this.nombre = nombre;
      }
      public String getRaza(){
        return raza;
      }

      ///set

      public void setRaza(String raza){
        this.raza = raza;
      }
      public String getTipo_alimento(){
        return tipo_alimento;
      }

      ///set

      public void setTipo_alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
      }
      public int getEdad(){
        return edad;
      }

      ///set

      public void setEdad(int edad){
        this.edad = edad;
      }
}
