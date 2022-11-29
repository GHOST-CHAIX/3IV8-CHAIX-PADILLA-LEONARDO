public class Perro extends Animal {
    /*la palabra reservada extens es para heredar  */

    private String ladrido;
    public Perro(){

    }
    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido){
        /*Para obtener o acceder a los atriburos heredados debemos hacer uso de la palabra  */
        super(nombre, raza, tipo_alimento, edad, ladrido);
        this.ladrido = ladrido;

    }

    public String getLadrido(){
        return ladrido;
    }
    public void setLadrido(){
        this.ladrido = ladrido;
    }





     public void mostrarPerro(){
        System.out.println("El nombre del perro es: "+getNombre()+"\n"
        +"Su raza es: "+getRaza()+"\n"
        + "Se alimenta de: "+getTipo_alimento()+"\n"
        +"Su edad es: "+getEdad()+"\n"
        +"Su ladrido es: "+ladrido+"\n"
        
        );
     }


}
