/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09polimorfismoconserializacion;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    
    //necesito poder guardar las diferentes barbies 
    
    ArrayList<Barbie> listabarbies= new ArrayList();
    
    //variables
    String rep="si";
    String nombre="";
    String animal="";
    String lentes ="";
    String lenguaje = "";
    int edad, cedula;
    //se lo que tu quieras ser con barbie 
    //aplicamos polimorfismo 
    
    Barbie Programadora = new Programadora();
    Barbie Veterinaria = new Veterinaria();
    
    void menu(){
    
        while(true)
            while(rep.equalsIgnoreCase("si")){
            
            try{
                String var = JOptionPane.showInputDialog("Ingresa la opcion deseada:\n"
                + "1. Registrar una nueva Barbie programadora"
                + "2. Registrar ia mieba barbie Veterinaria "
                + "3. Consultar barbies"
                + "4. Buscar barbies "
                + "Se lo que quieras ser con barbie");
                
                if (var == null){
                    System.exit(0);
                }
                int opcion;
                opcion = Integer.parseInt(var);
                switch (opcion){
                    case 1:
                        pedirDatosProgramadora();
                        
                        Programadora = 
                                new Programadora(nombre, edad, lenguaje, lentes);
                        guardarProgramadora();
                        
                        break;
                        
                    case 2:
                        pedirDatosVeterinaria();
                        break;
                    case 3:
                        break;
                    case 4;
                        break;
                    default 
                        
                        
                
                }
                rep = JOptionPane.showInputDialog("¿Desea repertir?");
                
            }catch (Exception e){
                }
            }
                
        }

    private void pedirDatosVeterinaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pedirDatosProgramadora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void guardarProgramadora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }    
    
    
    
    
    
    
    
}
