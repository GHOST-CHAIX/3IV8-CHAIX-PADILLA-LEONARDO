import java.util.Scanner;
public class Descuento {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Double edad, pago, resultado1,resultado2,resultado3;
        int opcion;
    System.out.println("Chaix Padilla Leonardo");
    System.out.println("Ingrese su edad");
  edad =teclado.nextDouble();
  if(edad >= 65){
      System.out.println("Usted por su edad cuenta con un descuento del 40%");
      System.out.println("Ingrese la cantidad a pagar para aplicar el descuento");
      pago=teclado.nextDouble();
      resultado1=pago-(pago*.40);
      System.out.println("El pago ya con el descuento aplicado es de: $"+resultado1);
  }else{
      if(edad<=21){
          System.out.println("¿Tus padres son socios?");

          System.out.println("1. Si");
          System.out.println("2. No");
          opcion=teclado.nextInt();
          switch(opcion){
              case 1:
              System.out.println("Usted cuenta con el descuento del 45%");
              System.out.println("Ingrese la cantidad a pagar para aplicar el descuento");
              pago=teclado.nextDouble();
              resultado2=pago-(pago*.45);
              System.out.println("El pago ya con el descuento aplicado es de: $"+resultado2);
               break;
              case 2:
              System.out.println("Sus padres no son socios, usted solo cuenta con el descuento del 25%");
              System.out.println("Ingrese la cantidad a pagar para aplicar el descuento");
              pago=teclado.nextDouble();
              resultado3=pago-(pago*.25);
              System.out.println("El pago ya con el descuento aplicado es de: $"+resultado3);
              break;
          }

      }else{
          if(edad>=21 ||edad<=65){
              System.out.println("Usted no cuenta con algun descuento");
              System.out.println("Ingrese la cantidad a pagar");
              pago=teclado.nextDouble();
              System.out.println("Proceda a pagar la cantidad de: $"+pago);
            }
        }
        
        }
    }
}