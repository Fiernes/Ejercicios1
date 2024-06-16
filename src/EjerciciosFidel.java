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

        entrada.close();
    }

    public void AreaCuadrado(){
        float lado = 0;

        // Ciclo while para validar la entrada del lado
        do {
            System.out.print("Ingrese el lado del cuadrado: ");
            if (!entrada.hasNextFloat()) {
                System.out.println("Error: El valor ingresado no es un número válido.");
                entrada.next(); // Limpiar el buffer de entrada
            } else {
                lado = entrada.nextFloat();
                if (lado <= 0) {
                    System.out.println("Error: El lado no puede ser menor o igual a 0.");
                }
            }
        } while (lado <= 0);

        // Se calcula el área del cuadrado
        float area = lado * lado;

        // Se calcula el perímetro del cuadrado
        float perimetro = 4 * lado;

        // Se imprimen los resultados con las fórmulas utilizadas
        System.out.println("\nÁrea:");
        System.out.println("  A = lado²");
        System.out.printf("  A = %.2f cm²\n", area);

        System.out.println("\nPerímetro:");
        System.out.println("  P = 4 * lado");
        System.out.printf("  P = %.2f cm\n", perimetro);

        entrada.close();
    }
}
