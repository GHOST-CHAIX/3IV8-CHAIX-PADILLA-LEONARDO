package pkg09pkmpolimorfismoserializacion;

public class Cocinera extends Barbie{
    
      private String tipoalimentos;
    private String tipodecocina;
    
    public Cocinera(){
        
    }
    
    public Cocinera(String tipoalimentos, String tipodecocina){
        this.tipoalimentos = tipoalimentos;
        this.tipodecocina = tipodecocina;
    }
    
    public Cocinera (String nombre, int edad, String tipoalimentos, String tipodecocina){
        super(nombre, edad);
        this.tipoalimentos = tipoalimentos;
        this.tipodecocina = tipodecocina;
        
    }

    public String getTipoalimentos() {
        return tipoalimentos;
    }

    public void setTipoalimentos(String tipoalimentos) {
        this.tipoalimentos = tipoalimentos;
    }

    public String getTipodecocina() {
        return tipodecocina;
    }

    public void setTipodecocina(String tipodecocina) {
        this.tipodecocina = tipodecocina;
    }

    @Override
    String tipobarbie() {
        return("cocinera");
    }  
}
