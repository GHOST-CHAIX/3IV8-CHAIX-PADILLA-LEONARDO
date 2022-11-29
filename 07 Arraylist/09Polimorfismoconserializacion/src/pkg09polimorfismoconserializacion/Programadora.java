package pkg09polimorfismoconserializacion;
public class Programadora extends Barbie{

    
    private String FullStac;
    private String lentes;
    
    public Programadora(){
}
    public Programadora(String FullStac, String lentes) {
        this.FullStac = FullStac;
        this.lentes = lentes;
    }

    Programadora(String nombre, int edad, String lenguaje, String lentes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFullStac() {
        return FullStac;
    }

    public void setFullStac(String FullStac) {
        this.FullStac = FullStac;
    }

    public String getLentes() {
        return lentes;
    }

    public void setLentes(String lentes) {
        this.lentes = lentes;
    }
    
    
    
    
    
    
    String tipobarbie(){
    return ("Programadora");
    }
}
