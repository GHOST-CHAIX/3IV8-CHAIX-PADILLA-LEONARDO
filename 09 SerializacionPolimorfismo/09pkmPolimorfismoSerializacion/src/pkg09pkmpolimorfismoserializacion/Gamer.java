package pkg09pkmpolimorfismoserializacion;

public class Gamer extends Barbie{

    private String consola;
    private String juegos;
    
    public Gamer(){
        
    }
    
    public Gamer(String consola, String juegos) {
        this.consola = consola;
        this.juegos = juegos;
    }

    public Gamer(String consola, String juegos, String nombre, int edad) {
        super(nombre, edad);
        this.consola = consola;
        this.juegos = juegos;
    }
    
     public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getJuegos() {
        return juegos;
    }

    public void setJuegos(String juegos) {
        this.juegos = juegos;
    }

    @Override
    String tipobarbie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
