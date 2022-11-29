package pkg09pkmpolimorfismoserializacion;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    //se necestiaran guardar los diferentes tipos de barbies
    ArrayList<Barbie> listadebarbies = new ArrayList();
    
    //variables
    String rep = "si";
    String nombre = "";
    String animal = "";
    String gafas = "";
    String lenguajeprogramacion = "";
    int edad, cedula, semestre;
    String problemasmentales = "";
    String consola = "";
    String juegos = "";
    String tipoalimentos = "";
    String tipodecocina = "";
    
    //aplicamos polimorfismo
    
    
    Barbie programadora = new Programadora();
    Barbie veterinaria = new Veterinaria();
    Barbie batiziana = new Batiziana();
    Barbie gamer = new Gamer();
    Barbie cocinera = new Cocinera();
    
    
    void menu(){
        
        while(true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    String var = JOptionPane.showInputDialog("Ingresa la opcion deseada: \n"
                    + "1.- Registrar una nueva barbie programadora. \n"
                    + "2.- Registrar una nueva barbie veterinaria. \n"
                    + "3.- Registrar una nueva barbie batiziana. \n"
                    + "4. Registrar una nueva barbie gamer. \n"
                    + "5.- Registrar una nueva barbie cocinera. \n"
                    + "6.- Consultar barbies. \n"
                    + "7.- Buscar barbies. \n");
                    
                    if(var == null){
                        System.exit(0);
                    }
                    int opcion = Integer.parseInt(var);
                    
                    switch (opcion){
                        case 1: 
                            //metodo para pedir datos
                            pedirDatosProgramadora();
                            //se asignan los datos
                            programadora = new Programadora(nombre, edad, lenguajeprogramacion, gafas);
                            //el metodo para guardarlo
                            guardarProgramadora();
                            
                            break;
                        case 2:
                            //metodo para pedir datos
                            pedirDatosVeterinaria();
                            //se asignan los datos
                            veterinaria = new Veterinaria(cedula, animal, nombre, edad);
                            //metodo para guardar datos
                            guardarVeterinaria();
                            
                            break;
                        case 3: 
                            //metodo para pedir datos
                            pedirDatosBatiziana();
                            //se asignan los datos
                            batiziana = new Batiziana(nombre, edad, problemasmentales, semestre);
                            //metodo para guardar datos
                            guardarBatiziana();
                            
                            break;
                        case 4: 
                            // metodo para pedir datos
                            pedirDatosGamer();
                            //se asignan los datos
                            gamer = new Gamer (consola, juegos, nombre, edad);
                            //metodo para guardar datos
                            guardarGamer();
                            
                            break;
                        case 5:
                            //metodo para pedir datos
                            pedirDatosCocinera();
                            //se asignan los datos 
                            cocinera = new Cocinera (nombre, edad, tipoalimentos, tipodecocina);
                            //metodo para guardar los datos
                            guardarCocinera();
                            
                            break;
                        case 6: 
                            //leer barbie
                            leerBarbie();
                            break;
                        case 7: 
                            //consultar barbie
                            break;
                        default:
                                System.out.println("Opcion no valida");
                    }
                    rep = JOptionPane.showInputDialog("¿Desea repetir?");
                    //analizar la variable para repetir sea metiendo un switch o un if
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error: "+ e.getMessage());

                }
            }
        }
        
    }
    
    private void pedirDatosProgramadora(){
        //primero obtener todos los datos de la programadora
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la barbie programadora: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la barbie programdora"));
        lenguajeprogramacion = JOptionPane.showInputDialog("Ingresa los lenguajes que domina la barbie programadora");
        gafas = JOptionPane.showInputDialog("Ingresa la marca de lentes que usa la programadora");
    }
    
    private void guardarProgramadora() throws IOException{
        //para guardar necesito la lista 
        listadebarbies.add(programadora);
        guardar();
    }
    
    private void pedirDatosVeterinaria(){
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula profecional de la barbie veterinaria"));
        animal = JOptionPane.showInputDialog("Ingrese el tipo de nombre de la mascota que cuida la barbie");
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la barbie veterinaria");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la barbie veterinaria"));
    }
    
    private void guardarVeterinaria() throws IOException{
        //para guardar necesito la lista
        listadebarbies.add(veterinaria);
        guardar();
    }
    private void pedirDatosBatiziana(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la barbie batiziana");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la barbie batiziana"));
        problemasmentales = JOptionPane.showInputDialog("Ingrese los problemas mentales que tiene la barbie a causa de ser de batiz");
        semestre = Integer.parseInt (JOptionPane.showInputDialog("Ingrese en que semestre va la barbie"));
    }
    private void guardarBatiziana() throws IOException{
        listadebarbies.add(batiziana);
        guardar();
    }
    private void pedirDatosGamer(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la barbie Gamer");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la barbie gamer"));
        consola = JOptionPane.showInputDialog("Ingrese la consola en la cual juega la barbie Gamer");
        juegos = JOptionPane.showInputDialog("Ingrese los juegos que mas juega la barbie Gamer");
    }
    private void guardarGamer() throws IOException{
        listadebarbies.add(gamer);
        guardar();
    }
    private void pedirDatosCocinera(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la barbie cocinera");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la barbie cocinera"));
        tipoalimentos = JOptionPane.showInputDialog("Ingrese los tipos de alimentos que sabe preparar la barbie cocinera");
        tipodecocina = JOptionPane.showInputDialog("Ingrese el tipo de cocina en la cual se especializa la barbie cocinera");
    }
    private void guardarCocinera() throws IOException{
        listadebarbies.add(cocinera);
        guardar();
    }
     //aqui estan los metodo de archivos serializables
    
    private void leerBarbie() throws FileNotFoundException, IOException, ClassNotFoundException{
        /*
        aqui es donde vamos a aplicar la serializacion de archivos para que 
        se pueda guardar la lista de barbie y poder recuperar 
        para ello se necesita los flujos de la lectura y escritura de archivos
        */
        
        FileInputStream archivo = new FileInputStream("archivo.dat");
        //generaramos un flujo de lectura del buffer de elementos binarios o mejor 
        //dicho objetos
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        /*
        aqui es donde tenemos que empezar a transformar los bytes del buffer 
        en objetos del array
        */
        listadebarbies = (ArrayList)entrada.readObject();
        
        //se tiene que recorrer el array
        for(int i = 0; i < listadebarbies.size(); i++){
            //como voy recorriendo la lista vamos mostrandola
            Programadora fullstack = (Programadora)listadebarbies.get(i);
            
            //Imprimo los datos
            JOptionPane.showMessageDialog(null, "\n"
            + "Nombre de la programadora : " + fullstack.getNombre()+ "\n"
            + "Edad de la programadora: " + fullstack.getEdad()+ "\n"
            + "Lenguajs que domina la programadora" + fullstack.getFullstack()+"\n"
            + "las Gaffas que usa la programadora son: " + fullstack.getLentes()+ "\n"
            + "El tipo de barbie es: " + fullstack.tipobarbie());
            
            Veterinaria cedulaprofesional = (Veterinaria)listadebarbies.get(i);
            
            JOptionPane.showMessageDialog(null, "\n"
            + "Nombre de la vaterinaria: " + cedulaprofesional.getNombre()+ "\n"
            + "Edad de la veterinaria : " + cedulaprofesional.getEdad()+ "\n"
            + "Ingrese la especie del animal que cura la barbie veteriaria: "+ cedulaprofesional.getAnimalito()+"\n"
            + "Ingrese la cedula profesional de la barbie programadora : " + cedulaprofesional.getCedulaprofesional()+"\n"
            );
        }
            
        //entrada.close();
    }
    
    private void guardar() throws FileNotFoundException, IOException{
        //para guardar el archivo tenemos que escribir una salida
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        //tenemod que definir el buffer de salida del archivo
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        
        //escribimos los datos del array
        salida.writeObject(listadebarbies);
        //cerramos el flujo
        salida.close();
    }
}
