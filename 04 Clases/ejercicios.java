import java.lang.Math;
import java.util.Scanner;
class ejercicios{
    public static void main(String[] args){
        double edad,edadactual,radio,area,perimetro,base,altura,lado,lado1,lado2,lado3,tiempo,saldorestante,saldo;
        int Opcion, figuras,numcelular,casillas;
        String respuesta;
        Scanner entrada = new Scanner(System.in);

        do {
            
            System.out.println("Seleccione lo que quiera realizar");

        //Menu 
        System.out.println("1-Calcule su edad");
        System.out.println("2-Calcule el Area-Perimetro");
        System.out.println("3-Calcule el costo de sus Llamadas");
        System.out.println("4-Calcule el sueldo del empleado");
        Opcion=entrada.nextInt();
        switch (Opcion) {
            case 1:
            //!calcular la edad
            System.out.println("Ingrese exclusivamente su año de nacimiento");
            edad=entrada.nextInt();
            edadactual=2022-edad;
            System.out.println("Su edad es "+edadactual);
        break;
            case 2:
            //?area y perimetro
            System.out.println("Seleccione la figura para sacar su perimetro y area");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Triangulo");
            figuras = entrada.nextInt();
            switch (figuras) {
                case 1:
                //circulo
                System.out.println("Ingrese las medidas correspondientes para calcular el area y perimetro");
                System.out.println("Ingrese el radio ");
                radio = entrada.nextDouble();
                area=Math.PI * (radio*radio);
                perimetro=(2*Math.PI)*radio;
                System.out.println("El area del circulo es: "+area+" y su perimetro es: "+perimetro);
                break;
                 case 2:
                 //Rectangulo
                 System.out.println("Ingrese las medidas para calcular el area y perimetro");
                 System.out.println("Ingrese la medida de la base");
                 base = entrada.nextDouble();
                 System.out.println("Ingrese la medidad de la altura");
                 altura = entrada.nextDouble();
                 area=base*altura;
                 perimetro=2*(base+altura);
                 System.out.println("El area del rectangulo es: "+area+" y su perimetro es: "+perimetro);
                break;
                 case 3:
                 //Cuadrado
                 System.out.println("Ingrese la medida del lado para calcular el area y perimetro");
                 System.out.println("Ingrese la medida de uno de los lados");
                 lado = entrada.nextDouble();
                 area = lado*lado;
                 perimetro = lado*4;
                 System.out.println("El area del cuadrado es: "+area+" y su perimetro es: "+perimetro);
                break;
                 case 4:
                 //triangulo
                 System.out.println("Ingrese las medidas del triangulo");
                 System.out.println("Ingrese la medida de la base");
                 base = entrada.nextDouble();
                 System.out.println("Ingrese la medida de la altura");
                 altura = entrada.nextDouble();
                 System.out.println("Ingrese las medidad de los tres lados");
                 lado1 = entrada.nextDouble();
                 lado2 = entrada.nextDouble();
                 lado3 = entrada.nextDouble();
                 area = base*altura/2;
                 perimetro = lado1+lado2+lado3;
                 System.out.println("El area del triangulo es: "+area+" y su perimetro es: "+perimetro);
            }
        break;
            case 3:
            saldo = 50;
            System.out.println("Seleccione el tipo de llamada que realizo");
            //menu
            System.out.println("1.Llamada Local");
            System.out.println("2.Llamada Internacional");
            System.out.println("3.Llamada a Celular");
            Opcion = entrada.nextInt();
            switch (Opcion){
                case 1:
                //llamada local
                System.out.println("Su saldo actual es de: "+saldo);
                System.out.println("Cuantos minutos llevo la llamda");
                tiempo = entrada.nextDouble();
                saldorestante = saldo-(tiempo*0.5);
                System.out.println("Su saldo restante por el tiempo de llamada es de: "+saldorestante);
                break;
                case 2:
                //llamada internacional
                System.out.println("Su saldo actual es de: "+saldo);
                System.out.println("Cuantos minutos llevo la llamada");
                tiempo = entrada.nextDouble();
                saldorestante= saldo-(tiempo*0.6);
                System.out.println("Su saldo restante por el tiempo de llamada es de: "+saldorestante);
                break;
                case 3:
                //llamada a celular 
                System.out.println("Su saldo actual es de: "+saldo);
                System.out.println("Cuantos minutos llevo la llamada");
                tiempo = entrada.nextDouble();
                saldorestante = saldo-(tiempo*0.2);
                System.out.println("Su saldo restante por el tiempo de la llamada es de: "+saldorestante);
                break;

            }
        break;
        case 4:
        //Salario de un trabajador
        //este ejercicio va a estar pesadillo lo voy a realizar en otro avr que tal sale

        break;
        }//primer switcht
        entrada.nextLine();
        System.out.println("Desea continuar S / N");
        respuesta = entrada.nextLine();
        } while (respuesta.equals("S"));
        
    }//metodo
}//clase