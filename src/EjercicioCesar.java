import java.util.Scanner;

public class EjercicioCesar {

    public void OperacionesBasicas(){
        Scanner sc = new Scanner(System.in);

        // Se declaran e inicializan las variables
        double num1, num2;

        // Se solicitan los dos números al usuario
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();

        // Se realizan las operaciones
        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double cociente = 0;

        // Verificar si el segundo número es diferente de cero antes de dividir
        if (num2 != 0) {
            cociente = num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
        }

        // Se imprimen los resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("El producto es: " + producto);
        if (num2 != 0) {
            System.out.println("El cociente es: " + cociente);
        }

        sc.close();
    }


        public void SepararDigito(){
            // Crear un objeto Scanner para obtener la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese un número entero de cinco dígitos
            System.out.print("Ingrese un número entero de cinco dígitos: ");
            int numero = scanner.nextInt();

            // Verificar que el número tiene cinco dígitos
            if (numero >= 10000 && numero <= 99999) {
                // Separar los dígitos individuales usando operadores de división entera y módulo
                int digito1 = numero / 10000;
                int digito2 = (numero / 1000) % 10;
                int digito3 = (numero / 100) % 10;
                int digito4 = (numero / 10) % 10;
                int digito5 = numero % 10;

                // Imprimir los dígitos separados por tres espacios
                System.out.println(digito1 + "   " + digito2 + "   " + digito3 + "   " + digito4 + "   " + digito5);
            } else {
                // Si el número no tiene cinco dígitos, imprimir un mensaje de error
                System.out.println("El número ingresado no tiene cinco dígitos.");
            }

            // Cerrar el objeto Scanner
            scanner.close();
        }
        public void NumeroMayorMenu(){
            Scanner entrada = new Scanner(System.in);
            int contador = 0;
            int numeroMayor = Integer.MIN_VALUE; // Usar el valor mínimo posible para un entero en Java
            boolean continuar = true;

            while (contador < 10 && continuar) {
                System.out.print("Ingrese un número (o escriba 'salir' para terminar): ");
                String valor = entrada.next();

                if (valor.equalsIgnoreCase("salir")) {
                    continuar = false;
                } else {
                    try {
                        int numero = Integer.parseInt(valor);
                        if (numero > numeroMayor) {
                            numeroMayor = numero;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El valor ingresado no es un número válido.");
                    }
                }

                contador++;
            }

            if (numeroMayor != Integer.MIN_VALUE) {
                System.out.println("El número mayor ingresado es: " + numeroMayor);
            } else {
                System.out.println("No se ingresaron números válidos.");
            }
        }
}


