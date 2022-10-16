import java.util.Scanner;
class Ejercicio{
/*
 * vamos a hacer un programa mediante el cual vamos a tener cuatro opciones que son
 * 1. otra calculadora 
 * 2. conversion de unidades 
 * 3.   Creacion de un cuadro magico 
 * 4. movimiento de un cuadro
  */

    //objetos

    Scanner entrada = new Scanner(System.in);

    //metodos o comportamientos para la clase 
    // vamos a crear un metodo para el menu 

    /* Public es el acceso a el tipo de datos, clase o metodo cualquier elemento del programa cualquiera puede acceder a el
     * 
     * Private : es de acceso controlado solo mediante reglas se puede acceder a el 
     * 
     * Protected : Se puede tener acceso solo desde la misma clase y aplicando la herencia de programacion orientada a objetos entre
     * los hijos y padres
     * 
     * Un metodo tambien es un tipo de dato aplicado 
     */

     // si esta fuera del metodo la variable puede ser local

     char op;

     public void menu (){
        System.out.println("Bienvenido a los metodos");
        System.out.println("Elige una de las siguientes opciones");
        System.out.println( "a. Calculadora");
        System.out.println( "b. Conversion");
        System.out.println( "c. Creacion de cuadros ");
        System.out.println("d. Movimiento de un cuadro0");

        op = entrada.next().charAt(0);
        switch (op) {
            case 'a':
            System.out.println("Como estas guapo vengo por tu hija");
            ejercicio1();
             break;
            case 'b':
            System.out.println("Ya duerman al depredador");
            ejercicio2();
             break;
            case 'c':
            System.out.println("Batiz es del asco");
            ejercicio3();
             break;
            case 'd':
            ejercicio4();
             break;
                
                
        
            default:
                break;
        }

}

public void ejercicio1(){
  //calculadora 
  //suma, multiplicacion, resta y divicion
  double num1 =0.00, suma =0.00, multi=0.00;
  char operacion;
  System.out.println("Seleccione la operacion que desee realizar");

  System.out.println("a- Suma y Resta");
  System.out.println("b- Multiplicacion");
  System.out.println("c- Division");

  operacion=entrada.next().charAt(0);

  switch(operacion){
    case 'a':
    do{
      System.out.println("Para detener la operacion escriba 0");
      System.out.println("Escriba todos los numeros como quiera sumar o restar");
      num1=entrada.nextDouble();
      suma+=num1;
      System.out.println("El resultado es:"+suma);
    }while(num1 !=0);
    break;
    case 
  }
}



public void ejercicio2(){

}
public void ejercicio3(){

}
public void ejercicio4(){
}
}