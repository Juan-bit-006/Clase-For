import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadPersonas = 2;
        int contadorPersonas = 0;
        double acumuladorEdad = 0;
        double acumuladorEstatura = 0;


        for (int numeropersona = 1; numeropersona <= cantidadPersonas; numeropersona++) {
            

            System.out.print("Ingrese la edad de la persona " + numeropersona + ": ");
            double edad = sc.nextDouble();

            System.out.print("Ingrese el estado civil de la persona " + numeropersona + " (1. Soltero, 2. Casado): ");
            double estadoCivil = sc.nextDouble();

            System.out.print("Ingrese la estatura de la persona " + numeropersona + " en cms: ");
            double estatura = sc.nextDouble();

            System.out.print("Ingrese el sexo de la persona " + numeropersona + " (1. Hombre, 2. Mujer): ");
            double sexo = sc.nextDouble();
          
            if ((edad >= 18) && (estadoCivil == 1) && (estatura > 170) && (sexo == 1)) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
                
            }
            
        }
        sc.close();    

        double promedioEdad = acumuladorEdad / contadorPersonas;
        double promedioEstatura = acumuladorEstatura / contadorPersonas;
        double porcentajePersonas = (contadorPersonas / (double) cantidadPersonas) * 100;

        System.out.println("El promedio de edad de las personas que cumplen es " + promedioEdad + " años");
        System.out.println("El promedio de estatura de las personas que cumplen es " + promedioEstatura + " centimetros");
        System.out.println("El porcentaje de las personas que cumplen con la condición es del " + porcentajePersonas + " %");
        
    }
    
}