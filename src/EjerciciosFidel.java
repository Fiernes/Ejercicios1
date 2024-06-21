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
}
