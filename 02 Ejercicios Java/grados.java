import java.util.Scanner;
public class grados{
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Double Fahrenheit, Celsius, Kelvine, Rankine, resultadoCelsiusFahrenheit, resultadosKelvine, resultadoCelsiusRankine, resultadoFahrenheitCelsius, resultadoFahrenheitKelvine,
        resultadoFahrenheitRankine, resultadoKelvineCelsius, resultadoKelvineFahrenheit, resultadoKelvineRankine, resultadoRankineCelsius, resultadoRankineFahrenheit, resultadoRankineKelvine;

        System.out.println("Chaix Padilla Leonardo");
        System.out.println("Seleccione el tipo de conversion de grados");
        
        //Menu
        System.out.println("1.Celsius a Fahrenheit");
        System.out.println("2.Celsius a Kelvine");
        System.out.println("3.Celsius a Rankine");
        //Celsius
        System.out.println("4.Fahrenheit a Celsius");
        System.out.println("5.Fahrenheit a Kelvine");
        System.out.println("6.Fahrenheit a Rankine");
        //Fahrenheit
        System.out.println("7.Kelvine a Celsius");
        System.out.println("8.Kelvine a Fahrenheit");
        System.out.println("9.Kelvine a Rankine");
        //Kelvine
        System.out.println("10.Rankine a Celsius");
        System.out.println("11.Kelvine a Fahrenheit");
        System.out.println("12.Rankine a Kelvine");
        //Rankine
        
        opcion = teclado.nextInt();

        switch(opcion){
            case 1: 
            System.out.println("Ingrese la cantidad de grados Celsius");
            Celsius=teclado.nextDouble();
            resultadoCelsiusFahrenheit=Celsius*1.8+32;
            System.out.println("Los grados en Fahrenheit son: "+ resultadoCelsiusFahrenheit);
             break;
            case 2: 
             System.out.println("Ingrese la cantidad de grados Celsius");
             Celsius=teclado.nextDouble();
             resultadosKelvine=Celsius+273.15;
             System.out.println("Los grados en Kelvines son: "+resultadosKelvine);
             break;
            case 3:
            System.out.println("Ingrese la cantidad de grados Celsius");
            Celsius=teclado.nextDouble();
            resultadoCelsiusRankine=Celsius*9/5+491.67;
            System.out.println("Los grados en Rankine son: "+resultadoCelsiusRankine);
             break;
            case 4:
            System.out.println("Ingrese la cantidad de grados Fahrenheit");
            Fahrenheit=teclado.nextDouble();
            resultadoFahrenheitCelsius=(Fahrenheit-32)*5/9;
            System.out.println("Los grados en Celsius son: "+resultadoFahrenheitCelsius);
             break;
            case 5:
            System.out.println("Ingrese la cantidad de grados en Fahrenheit");
            Fahrenheit=teclado.nextDouble();
            resultadoFahrenheitKelvine=(Fahrenheit-32)*5/9+273.15;
            System.out.println("Los grados en Kelvine son: "+resultadoFahrenheitKelvine);
             break;
            case 6:
            System.out.println("Ingrese la cantidad de grados en Fahrenheit");
            Fahrenheit=teclado.nextDouble();
            resultadoFahrenheitRankine=Fahrenheit+459.67;
            System.out.println("Los grados en Rankine son: "+resultadoFahrenheitRankine);
             break;
            case 7:
            System.out.println("Ingrese la cantidad de grados en Kelvine");
            Kelvine=teclado.nextDouble();
            resultadoKelvineCelsius=Kelvine-273.15;
            System.out.println("Los grados en Celsius son: "+resultadoKelvineCelsius);
             break;
            case 8:
            System.out.println("Ingrese la cantidad de grados en Kelvine");
            Kelvine=teclado.nextDouble();
            resultadoKelvineFahrenheit=(Kelvine-273.15)*9/5+32;
            System.out.println("Los grados en Fahrenheit son: "+resultadoKelvineFahrenheit);
             break;
            case 9:
            System.out.println("Ingrese la cantidad de grados en Kelvine");
            Kelvine=teclado.nextDouble();
            resultadoKelvineRankine=Kelvine*1.8;
            System.out.println("Los grados en Rankine son: "+resultadoKelvineRankine);
             break;
            case 10:
            System.out.println("Ingrese la cantidad de grados en Rankine");
            Rankine=teclado.nextDouble();
            resultadoRankineCelsius=(Rankine-491.67)*5/9;
            System.out.println("Los grados en Celsius son: "+resultadoRankineCelsius);
             break;
            case 11:
            System.out.println("Ingrese la cantidad de grados en Rankine");
            Rankine=teclado.nextDouble();
            resultadoRankineFahrenheit=Rankine-459.67;
            System.out.println("Los grados en Fahrenheit son: "+resultadoRankineFahrenheit);
             break;
            case 12:
            System.out.println("Ingrese la cantidad de grados en Rankine");
            Rankine=teclado.nextDouble();
            resultadoRankineKelvine=Rankine*5/9;
            System.out.println("Los grados en Kelvine son: "+resultadoRankineKelvine);
            break;



            }
            
        }




    }