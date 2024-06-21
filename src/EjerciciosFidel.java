import java.util.Locale;
import java.util.Scanner;

public class EjerciciosFidel {

    Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

    public void NumeroMayor(){
        int num1, num2;

        System.out.print("Ingrese el primer número: ");
        while (!entrada.hasNextInt()) {
            System.out.println("Error: Ingrese un número válido.");
            entrada.next(); // Descarta la entrada no válida
            System.out.print("Ingrese el primer número: ");
        }
        num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        while(!entrada.hasNextInt()){
            System.out.println("Error: Ingrese un número válido.");
            entrada.next(); // Descarta la entrada no válida
            System.out.print("Ingrese el segundo número: ");
        }
        num2 = entrada.nextInt();

        String mensaje = (num1 > num2) ? num1 + " es más grande" : (num1 < num2) ? num2 + " es más grande" : "Estos números son iguales";

        System.out.println(mensaje);
    }


    /*
    quiero que me generes un codigo en java con estas especificaciones:
    Extremos: Escriba un programa que lea cinco enteros y que determine e imprima los enteros mayor y menor en el grupo
    */
    public void Extremos(){

        int numero, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        boolean continuar = false;

        // Ciclo para leer 5 números enteros
        for (int i = 1; i <= 5; i++) {

            do{
                System.out.print("Ingrese el número " + i + ": ");
                if (!entrada.hasNextInt()){
                    continuar = true;
                    System.out.println("Error: Debe ingresar un número entero.");
                    entrada.next(); // Limpiar entrada
                }else{
                    continuar = false;

                }
            } while(continuar);

            numero = entrada.nextInt();

            // Actualizar valores máximo y mínimo
            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
        }

        // Imprimir resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
