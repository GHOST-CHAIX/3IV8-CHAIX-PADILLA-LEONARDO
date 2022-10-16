import java.util.Scanner;
public class binario {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int decimal,modulo;
        String binario="";

        System.out.println("Ingrese el numero decimal");
        decimal =teclado.nextInt();

        while(decimal>0){
            modulo=(decimal%2);
            binario= modulo + binario;
            decimal=decimal/2;
        }
        System.out.println("El numero binario es: "+binario);
    }
}