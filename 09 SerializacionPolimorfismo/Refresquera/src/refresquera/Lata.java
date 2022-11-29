package refresquera;

public class Lata {

    private String nombre;
    private String nombrelata;
    private String presentacion;
    
    public Lata(String nombre, String nombrelata, String presentacion) {
        this.nombre = nombre;
        this.nombrelata = nombrelata;
        this.presentacion = presentacion;
    }

    public Lata(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrelata() {
        return nombrelata;
    }

    public void setNombrelata(String nombrelata) {
        this.nombrelata = nombrelata;
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
    mensaje += "La presentacion del producto "+this .getClass().getSimpleName()+"es: "+this.getNombrelata()+"\r\n";
    mensaje += "La envasadora del producto "+this.getClass().getSimpleName()+"es: "+this.getPresentacion()+"\r\n";
    return mensaje;
    
    }
    
    
}
