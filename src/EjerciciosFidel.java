import java.util.Locale;
import java.util.Scanner;

public class EjerciciosFidel {

    /*
     5. BUSCANDO AL MAYOR: Escriba un programa que pida al usuario que escriba dos enteros y que
     verifique que solo se acepten números enteros y cuando se ingrese otro valor diga "ERROR DATO INGRESADO NO VALIDO"
     y esa verificación quiero que sea con un do{}while();, que obtenga los números del usuario e imprima el número más grande,
     seguido de las palabras "es más grande". Si los números son iguales, imprima el mensaje "Estos números son iguales."
    */

    public void encontrarMayor(Scanner entrada) {
        int num1, num2;

        // Bucle para verificar que solo se ingresen números enteros
        do {
            System.out.print("Ingrese el primer número: ");
            if (entrada.hasNextInt()) {
                num1 = entrada.nextInt();
                break;
            } else {
                System.out.println("ERROR DATO INGRESADO NO VALIDO");
                entrada.next(); // Limpiar el buffer de entrada
            }
        } while (true);

        do {
            System.out.print("Ingrese el segundo número: ");
            if (entrada.hasNextInt()) {
                num2 = entrada.nextInt();
                break;
            } else {
                System.out.println("ERROR DATO INGRESADO NO VALIDO");
                entrada.next(); // Limpiar el buffer de entrada
            }
        } while (true);

        // Determinar el número mayor y mostrar el resultado
        if (num1 > num2) {
            System.out.println(num1 + " es más grande");
        } else if (num1 < num2) {
            System.out.println(num2 + " es más grande");
        } else {
            System.out.println("Estos números son iguales.");
        }
    }

    /*
    11. Extremos: Escriba un programa que lea cinco enteros y que verifique que solo se permitan
    el ingreso de numeros enteros y que si se ingresa un valor no valido que diga "ERROR DATO INGRESADO NO VALIDO"
    y que determine e imprima los enteros mayor y menor en el grupo
    */

    public void encontrarExtremos(Scanner entrada) {
        int[] numeros = new int[5]; // Arreglo para almacenar los números
        int i = 0;

        // Bucle para leer y validar los números
        do {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            if (entrada.hasNextInt()) {
                numeros[i] = entrada.nextInt();
                i++;
                if (i == 5) {
                    break; // Salir del bucle si se han ingresado 5 números
                }
            } else {
                System.out.println("ERROR DATO INGRESADO NO VALIDO");
                entrada.next(); // Limpiar el buffer de entrada
            }
        } while (true);

        // Encontrar el máximo y el mínimo
        int maximo = numeros[0];
        int minimo = numeros[0];
        for (int j = 1; j < numeros.length; j++) {
            if (numeros[j] > maximo) {
                maximo = numeros[j];
            } else if (numeros[j] < minimo) {
                minimo = numeros[j];
            }
        }

        // Imprimir el máximo y el mínimo
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
    }

    /*
    17. Tomando como base el ejercicio “par o impar” ahora usted lo que debe hacer es agarrar ese número y mostrar
    gráficas horizontales de la siguiente manera y verificar que solo se acepten numeros enteros y si se
    ingresa un dato no valido que aparezca un error "ERROR DATO INGRESADO NO VALIDO" :
     1. tantos asteriscos como unidades posea el número.
     2. Cada asterisco de la gráfica representa dos unidades.
     3. Cada asterisco de la gráfica representa cinco unidades.
    Por ejemplo si se lee el 15:
    Número 15 es impar:
    15 | * * * * * * * * * * * * * * *(15 asteriscos, cada uno vale 1)
    15 | * * * * * * * * (8 asteriscos, cada uno vale 2)
    15 | * * *(3 asteriscos, cada uno vale 5)
    */
    public void mostrarGraficosAsteriscos(Scanner entrada) {
        int numero;

        // Bucle para verificar que solo se ingrese un número entero
        do {
            System.out.print("Ingrese un número entero: ");
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                break;
            } else {
                System.out.println("ERROR DATO INGRESADO NO VALIDO");
                entrada.next(); // Limpiar el buffer de entrada
            }
        } while (true);

        // Imprimir el número y si es par o impar
        System.out.print("Número " + numero + " es ");
        if (numero % 2 == 0) {
            System.out.println("par:");
        } else {
            System.out.println("impar:");
        }

        // Mostrar gráficos de asteriscos
        mostrarGraficoUnidades(numero);
        mostrarGraficoDosUnidades(numero);
        mostrarGraficoCincoUnidades(numero);
    }

    // Función para mostrar gráfico de asteriscos (unidades)
    private static void mostrarGraficoUnidades(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println(); // Saltos de línea para cada gráfico
    }

    // Función para mostrar gráfico de asteriscos (dos unidades)
    private static void mostrarGraficoDosUnidades(int numero) {
        for (int i = 0; i < numero / 2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Función para mostrar gráfico de asteriscos (cinco unidades)
    private static void mostrarGraficoCincoUnidades(int numero) {
        for (int i = 0; i < numero / 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /*
    23. Escriba un programa que pida al usuario que introduzca el tamaño del lado de un cuadrado y
    que verifique que solo se acepten valores enteros y que si se ingresa otro valor que no se entero que se
    muestre este error  "ERROR DATO INGRESADO NO VALIDO" y que muestre un cuadrado hueco de ese tamaño,
    compuesto de asteriscos y espacios en blanco. Su programa debe funcionar con cuadrados que tengan lados de todas las longitudes entre 1 y 20.
    Por ejemplo, si su programa lee un tamaño de 5, debe imprimir.
    * * * * *
    *       *
    *       *
    *       *
    * * * * *
    */
    public void imprimirCuadradoHueco(Scanner entrada) {
        int lado;

        // Bucle para verificar que solo se ingrese un número entero válido
        do {
            System.out.print("Ingrese el tamaño del lado del cuadrado (entre 1 y 20): ");
            if (entrada.hasNextInt()) {
                lado = entrada.nextInt();
                if (lado >= 1 && lado <= 20) {
                    break; // Salir del bucle si el valor está dentro del rango
                } else {
                    System.out.println("ERROR: El tamaño debe estar entre 1 y 20.");
                }
            } else {
                System.out.println("ERROR DATO INGRESADO NO VALIDO");
                entrada.next(); // Limpiar el buffer de entrada
            }
        } while (true);

        // Imprimir el cuadrado hueco
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("*"); // Imprimir asterisco en los bordes
                } else {
                    System.out.print(" "); // Imprimir espacio en el interior
                }
            }
            System.out.println(); // Salto de línea para cada fila
        }
    }

    /*
    29. Promedio: Escriba un programa que utilice una instrucción for para calcular e imprimir en consola
    el promedio de varios enteros por medio de consola de intellij sin retornar valores. Suponga que el último valor
    leído es el valor centinela 9999. Una secuencia típica de entrada podría ser: 10 8 11 7 9 9999 lo cual indica que el
    programa debe calcular el promedio de todos los valores antes del 9999.
    */
    public void calcularPromedio() {

        int suma = 0;
        int contador = 0;
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese números enteros y presione enter (9999 para terminar):");

        do {
            numero = entrada.nextInt();

            if (numero != 9999) {
                suma += numero;
                contador++;
            }
        } while (numero != 9999);

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }

    /*
    35. Convertidor: Escriba un programa que imprima una tabla de los equivalentes binario, octal y hexadecimal de los números decimales en el rango 1 al 256
    */
    public void imprimirTablaConversiones() {

        // Encabezados de la tabla
        System.out.println("Decimal\t   Binario\t   Octal\t   Hexadecimal");

        // Bucle para cada número decimal del 1 al 256
        for (int decimal = 1; decimal <= 256; decimal++) {

            // Conversión a binario
            String binario = Integer.toBinaryString(decimal);
            while (binario.length() < 8) {
                binario = "0" + binario; // Agregar ceros a la izquierda para completar 8 bits
            }

            // Conversión a octal
            String octal = Integer.toOctalString(decimal);
            while (octal.length() < 3) {
                octal = "0" + octal; // Agregar ceros a la izquierda para completar 3 dígitos
            }

            // Conversión a hexadecimal
            String hexadecimal = Integer.toHexString(decimal);
            while (hexadecimal.length() < 2) {
                hexadecimal = "0" + hexadecimal; // Agregar ceros a la izquierda para completar 2 dígitos
            }

            // Imprimir la fila de la tabla
            System.out.println(decimal + "\t      " + binario + "\t    " + octal + "\t          " + hexadecimal);
        }
    }

    /*
    41. Tablita: Escriba un programa que luego dar la bienvenida al usuario le muestre la siguiente tabla y entonces
    le pida un número del 1 al 15 y que agregue las verificacion que solo se puedan ingresar numeros enteros y que muestre
    un mensaje de error "ERROR DATO INGRESADO NO VALIDO", tras validar la entrada debe entonces crear una tabla que vaya
    desde 1 hasta el número que el usuario haya indicado. Se aclara que la tabla se debe generar con ciclos y no con condicionales anidados.
    */
    public void imprimirTablaMultiplicacion(Scanner entrada) {
        mostrarMenu();
        int numeroUsuario = obtenerNumeroUsuario(entrada);
        generarTabla(numeroUsuario);
    }

    private void mostrarMenu() {
        System.out.println("**************************************************");
        System.out.println("Bienvenido a la Tablita Mágica");
        System.out.println("**************************************************");
    }

    private int obtenerNumeroUsuario(Scanner entrada) {
        System.out.print("Ingrese un número del 1 al 15: ");

        while (!entrada.hasNextInt()) {
            System.out.println("ERROR: El dato ingresado no es un número entero.");
            System.out.print("Ingrese un número del 1 al 15: ");
            entrada.next(); // Descartar la entrada no válida
        }

        int numeroUsuario = entrada.nextInt();
        if (numeroUsuario < 1 || numeroUsuario > 15) {
            System.out.println("ERROR: El número debe estar entre 1 y 15.");
            return obtenerNumeroUsuario(entrada); // Solicitar de nuevo el número
        }

        return numeroUsuario;
    }

    private void generarTabla(int numeroUsuario) {
        System.out.println("\nTabla del 1 al " + numeroUsuario);

        for (int i = 1; i <= numeroUsuario; i++) {
            for (int j = 1; j <= numeroUsuario; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    /*
    47. Divide y sumarás: un metodo que reciba como entrada un objeto Scanner y se debe leer un número cualquiera (de no más de cinco dígitos)
    y que se valide que solo se permitan numeros enteros pero que no modifique el orden de los numeros y mostrar el número descompuesto por sus
    dígitos y la suma de estos. Por ejemplo si se lee 431: 431 = 4, 3 y 1 su suma es 4+3+1 = 8 Se debe respetar ese formato de salida es decir:
    Numero = (dígitos separados por coma y el último antecedido por la letra “y”) “su suma es” dígitos separados por el signo más (+) = <suma de los dígitos>
    */

    public void divideYSuma(Scanner scanner) {
        // 1. Leer el número del Scanner
        int numero;
        do{
            System.out.println("Ingrese un numero entre 0 y 99999");

            while (!scanner.hasNextInt()) {
                System.out.println("ERROR: El dato ingresado no es un número entero.");
                scanner.next(); // Descartar la entrada no válida
            }
            numero = scanner.nextInt();

            // 2. Validar que el número tenga como máximo 5 dígitos
            if (numero < 0 || numero > 99999) {
                System.out.println("Error: El número debe estar entre 0 y 99999.");
            }else{
                break;
            }
        }while(true);


        // 3. Separar los dígitos del número en un array
        int[] digitos = new int[5];
        for (int i = 0; i < digitos.length; i++) {
            digitos[i] = numero % 10;
            numero /= 10;
        }

        for (int i = 0; i < digitos.length / 2; i++) {
            int temp = digitos[i];
            digitos[i] = digitos[digitos.length - i - 1];
            digitos[digitos.length - i - 1] = temp;
        }

        // 5. Generar la cadena de salida con el número descompuesto y su suma
        String cadenaSalida = "Número = ";
        for (int i = 0; i < digitos.length - 1; i++) {
            cadenaSalida += digitos[i] + ", ";
        }
        cadenaSalida += digitos[digitos.length - 1] + " y su suma es ";

        int suma = 0;
        for (int digito : digitos) {
            suma += digito;
            cadenaSalida += digito + "+";
        }
        cadenaSalida = cadenaSalida.substring(0, cadenaSalida.length() - 1) + " = " + suma;

        // 6. Mostrar la cadena de salida
        System.out.println(cadenaSalida);
    }


}
