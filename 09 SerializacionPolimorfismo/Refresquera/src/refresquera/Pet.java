package refresquera;

public class Pet {
    
    private String nombre;
    private String envasadora;
    private String presentacion;
    
    public Pet(){
    
}
    
    public Pet(String nombre, String envasadora, String presentacion) {
        this.nombre = nombre;
        this.envasadora = envasadora;
        this.presentacion = presentacion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnvasadora() {
        return envasadora;
    }

    public void setEnvasadora(String envasadora) {
        this.envasadora = envasadora;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    
    public String imprimir(){
    String mensaje = "";
    mensaje += "***";
    mensaje += "El nombre del producto "+ this.getClass().getSimpleName()+ " guardado es: "+this.getNombre()+"\r\n";
    mensaje += "La presentacion del producto "+this .getClass().getSimpleName()+"es: "+this.getPresentacion()+"\r\n";
    mensaje += "La envasadora del producto "+this.getClass().getSimpleName()+"es: "+this.getEnvasadora()+"\r\n";
    return mensaje;
    
    }
    
    
    
    
}
