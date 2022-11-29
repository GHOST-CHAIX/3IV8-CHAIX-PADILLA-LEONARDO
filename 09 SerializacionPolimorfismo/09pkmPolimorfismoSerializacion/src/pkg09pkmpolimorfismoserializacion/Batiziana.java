
package pkg09pkmpolimorfismoserializacion;


public class Batiziana extends Barbie{
    
    private String problemasmentales;
    private int semestre;
    
    public Batiziana(){
        
    }
    
    public Batiziana(String problemasmentales, int semestre, String nombre, int edad){
        super(nombre, edad);
        this.problemasmentales = problemasmentales;
        this.semestre = semestre;
    }
    
    public String getProblemasmentales(){
        return problemasmentales;
    }
    
    public void setProblemasmentales(String problemasmentales){
        this.problemasmentales = problemasmentales;
    }
    
    public int getSemestre(){
        return semestre;
    }
    
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    @Override
    String tipobarbie() {
        return ("Batiziana");
    }
    
}
