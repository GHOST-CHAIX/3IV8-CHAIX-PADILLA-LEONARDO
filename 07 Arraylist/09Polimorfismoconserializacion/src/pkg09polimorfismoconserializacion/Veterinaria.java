
package pkg09polimorfismoconserializacion;


public class Veterinaria extends Barbie{
    
    
    private String cedulaprofecional;
    private String animalito;
    
    public Veterinaria(){
    
    }

    public Veterinaria(String cedulaprofecional, String animalito) {
        this.cedulaprofecional = cedulaprofecional;
        this.animalito = animalito;
    }

    Veterinaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCedulaprofecional() {
        return cedulaprofecional;
    }

    public void setCedulaprofecional(String cedulaprofecional) {
        this.cedulaprofecional = cedulaprofecional;
    }

    public String getAnimalito() {
        return animalito;
    }

    public void setAnimalito(String animalito) {
        this.animalito = animalito;
    }
    
    
    
    
    
    String tipobarbie(){
    return ("Veterinaria");
    }
}
