import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class EjerciciosAdrian {

    public void EjemploSaludo () {

        System.out.println("¡Hola, mundo!");
    }

    public void MostrandoSello() {
        // Impresión del encabezado completo (incluyendo análisis/resumen)
        System.out.println("/**");
        System.out.println(" * **Nombre:** [Tu nombre completo]");
        System.out.println(" * **Apodo:** [Tu apodo]");
        System.out.println(" * **Correo electrónico:** [Tu correo electrónico]");
        System.out.println(" * **Fecha:** 2024-06-19");
        System.out.println(" * **Código correlativo:** [Número de ejercicio]");
        System.out.println(" *");
        System.out.println(" * **Análisis/Resumen:**");
        System.out.println(" * Este programa muestra el encabezado definido anteriormente.");
        System.out.println(" *");
        System.out.println(" * **MostrandoSello:**");
        System.out.println(" * Este programa muestra el encabezado completo del ejercicio.");
        System.out.println(" */");
    }

    public void TableroDamas() {

        // Tamaño del tablero
        int filas = 8;
        int columnas = 8;

        // Caracteres para representar las casillas
        String casillaBlanca = " ";
        String casillaNegra = "\u2588"; // Caracter Unicode para casilla negra

        // Crear el tablero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Alternar color de casillas
                if ((i + j) % 2 == 0) {
                    System.out.print(casillaBlanca);
                } else {
                    System.out.print(casillaNegra);
                }
            }
            System.out.println();
        }
    }

    public void CalculadoraSueldoVendedor() {
        Scanner sc = new Scanner(System.in);

        // Sueldo base por semana
        double sueldoBase = 200.0;

        // Ciclo para calcular el sueldo de cada vendedor
        while (true) {
            System.out.print("Ingrese el total de ventas brutas del vendedor: ");
            double ventasBrutas = sc.nextDouble();

            // Calcular la comisión
            double comision = ventasBrutas * 0.09;

            // Calcular el sueldo total
            double sueldoTotal = sueldoBase + comision;

            // Mostrar el sueldo total del vendedor
            System.out.printf("El sueldo total del vendedor es: $%.2f\n", sueldoTotal);

            // Preguntar si se desea calcular el sueldo de otro vendedor
            System.out.print("¿Desea calcular el sueldo de otro vendedor? (s/n): ");
            String continuar = sc.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        sc.close();
    }

    public void CopiarPegar() {
        // Encabezado de la tabla
        System.out.println("N\t10*N\t100*N\t1000*N");

        // Ciclo para imprimir las filas
        int n = 1;
        while (n <= 5) {
            // Impresión de la fila actual
            System.out.printf("%d\t%d\t%d\t%d\n", n, 10 * n, 100 * n, 1000 * n);
            n++;
        }
    }

    public void Factorial() {
        // Ciclo for para calcular factoriales del 1 al 5
        for (int n = 1; n <= 5; n++) {
            int factorial = 1; // Acumulador del factorial

            // Cálculo del factorial utilizando un bucle for anidado
            for (int i = n; i >= 1; i--) {
                factorial *= i;
            }

            // Impresión del resultado en formato de tabulación
            System.out.println(n + "! = " + factorial);
        }
    }

    public void Rombo() {
        int altura = 5; // Ajusta la altura del rombo aquí

        // Imprime la parte superior del rombo
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" "); // Espacio en blanco
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Asterisco
            }
            System.out.println(); // Salto de línea
        }

        // Imprime la parte inferior del rombo (invertir el bucle for superior)
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" "); // Espacio en blanco
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Asterisco
            }
            System.out.println(); // Salto de línea
        }
    }


    public void MenuProgram () {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            option = showMenu(scanner);

            switch (option) {
                case 1:
                    showAfricaOptions(scanner);
                    break;
                case 2:
                    showAmericaOptions(scanner);
                    break;
                case 3:
                    showAsiaOptions(scanner);
                    break;
                case 4:
                    showEuropeOptions(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 5);

        scanner.close();
    }

    private static int showMenu(Scanner scanner) {
        System.out.println("\nMENÚ PRINCIPAL");
        System.out.println("1. África");
        System.out.println("2. América");
        System.out.println("3. Asia");
        System.out.println("4. Europa");
        System.out.println("5. Salir");

        System.out.print("Ingrese su opción: ");
        return scanner.nextInt();
    }

    private static void showAfricaOptions(Scanner scanner) {
        System.out.println("\nÁFRICA");
        System.out.println("1. Nigeria");
        System.out.println("2. Seychelles");
        System.out.println("3. Regresar al menú principal");

        System.out.print("Ingrese su opción: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Ha seleccionado Nigeria.");
                break;
            case 2:
                System.out.println("Ha seleccionado Seychelles.");
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void showAmericaOptions(Scanner scanner) {
        System.out.println("\nAMÉRICA");
        System.out.println("1. Estados Unidos");
        System.out.println("2. Guyana");
        System.out.println("3. Regresar al menú principal");

        System.out.print("Ingrese su opción: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Ha seleccionado Estados Unidos.");
                break;
            case 2:
                System.out.println("Ha seleccionado Guyana.");
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void showAsiaOptions(Scanner scanner) {
        System.out.println("\nASIA");
        System.out.println("1. India");
        System.out.println("2. Tuvalu");
        System.out.println("3. Regresar al menú principal");

        System.out.print("Ingrese su opción: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Ha seleccionado India.");
                break;
            case 2:
                System.out.println("Ha seleccionado Tuvalu.");
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void showEuropeOptions(Scanner scanner) {
        System.out.println("\nEUROPA");
        System.out.println("1. Alemania");
        System.out.println("2. Luxemburgo");
        System.out.println("3. Regresar al menú principal");

        System.out.print("Ingrese su opción: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Ha seleccionado Alemania.");
                break;
            case 2:
                System.out.println("Ha seleccionado Luxemburgo.");
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }


    public void AlineaNombre(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreCompleto;

        // Ciclo para solicitar y validar 5 nombres
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el nombre " + i + ": ");
            nombreCompleto = sc.nextLine();

            // Validación de entrada (solo dos palabras)
            while (!validarNombre(nombreCompleto)) {
                System.out.print("Error: Ingrese un nombre válido (primer nombre y primer apellido). ");
                nombreCompleto = sc.nextLine();
            }

            // Impresión del nombre alineado a la izquierda
            System.out.format("%-25s\n", nombreCompleto);
        }
    }

    // Función para validar la entrada (primer nombre y primer apellido)
    private static boolean validarNombre(String nombreCompleto) {
        String[] palabras = nombreCompleto.split(" ");
        return palabras.length == 2;
    }



    public void DisminuyeNum(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y validar el primer número
        double num1 = solicitarNumeroDouble(sc, "Ingrese el primer número: ");

        // Solicitar y validar el segundo número
        double num2 = solicitarNumeroDouble(sc, "Ingrese el segundo número: ");

        // Solicitar y validar el tercer número
        double num3 = solicitarNumeroDouble(sc, "Ingrese el tercer número: ");

        // Calcular el número más pequeño
        double menor = obtenerNumeroMenor(num1, num2, num3);

        // Mostrar el resultado
        System.out.println("El número más pequeño es: " + menor);
    }

    private static double solicitarNumeroDouble(Scanner sc, String mensaje) {
        double numero;

        do {
            System.out.print(mensaje);
            while (!sc.hasNextDouble()) {
                System.out.print("Error: Ingrese un número válido: ");
                sc.next();
            }

            numero = sc.nextDouble();
            sc.nextLine(); // Consumir el salto de línea

            if (numero <= 0) {
                System.out.println("Error: El número debe ser mayor que cero.");
            }
        } while (numero <= 0);

        return numero;
    }

    private static double obtenerNumeroMenor(double num1, double num2, double num3) {
        double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        return menor;
    }



    public void MultiplicacionPrimaria() {
        // Generador de números aleatorios
        Random random = new Random();

        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Ciclo principal del programa
        while (true) {
            // Generar dos números aleatorios de un dígito
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);

            // Crear la pregunta de multiplicación
            System.out.print("¿Cuánto es " + num1 + " x " + num2 + "? ");

            // Leer la respuesta del usuario
            int respuesta = scanner.nextInt();

            // Verificar la respuesta del usuario
            if (respuesta == num1 * num2) {
                System.out.println("¡Muy bien!");
            } else {
                System.out.println("No. Inténtalo de nuevo.");

                // Permitir que el estudiante intente de nuevo hasta que la respuesta sea correcta
                while (respuesta != num1 * num2) {
                    System.out.print("¿Cuánto es " + num1 + " x " + num2 + "? ");
                    respuesta = scanner.nextInt();
                }

                System.out.println("¡Muy bien!");
            }
        }
    }



    public void Elevation() {
        // Bienvenida al usuario
        System.out.println("¡Bienvenido al programa Elevation!");

        // Mostrar la tabla de resultados
        mostrarTablaElevacion();
    }

    // Función para elevar al cuadrado por valor
    static int elevarCdValor(int numero) {
        return numero * numero;
    }

    // Función para elevar al cuadrado por referencia
    static int elevarCdReferencia(int numero) {
        numero *= numero;
        return numero;
    }

    // Función para elevar al cubo por valor
    static int elevarCbValor(int numero) {
        return numero * numero * numero;
    }

    // Función para elevar al cubo por referencia
    static int elevarCbReferencia(int numero) {
        numero *= numero * numero;
        return numero;
    }

    // Función para mostrar la tabla de resultados
    static void mostrarTablaElevacion() {
        System.out.println("------------------------------------------------------");
        System.out.printf("| %4s | %10s | %10s | %10s | %10s |\n", "Número", "Elevado al Cuadrado (Valor)", "Elevado al Cuadrado (Referencia)", "Elevado al Cubo (Valor)", "Elevado al Cubo (Referencia)");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i <= 10; i++) {
            int numero = i;
            int cuadradoValor = elevarCdValor(numero);
            int cuadradoReferencia = elevarCdReferencia(numero);
            int cuboValor = elevarCbValor(numero);
            int cuboReferencia = elevarCbReferencia(numero);

            System.out.printf("| %4d | %10d | %10d | %10d | %10d |\n", numero, cuadradoValor, cuadradoReferencia, cuboValor, cuboReferencia);
        }

        System.out.println("------------------------------------------------------");
    }



    public void ImpArchivo() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the message
        System.out.print("Ingrese el mensaje: ");
        String message = scanner.nextLine();

        // Prompt the user for the filename
        System.out.print("Ingrese el nombre del archivo (debe terminar en .txt): ");
        String filename = scanner.nextLine();

        // Validate the filename
        if (!filename.endsWith(".txt")) {
            System.out.println("Error: El nombre del archivo debe terminar en .txt");
            return;
        }

        // Write the message to the file
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(message);
            System.out.println("Mensaje escrito exitosamente en el archivo: " + filename);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }


    }



    public void MatrizV2() {
        int[][] matriz = new int[5][5];
        Random aleatorio = new Random();

        // Llenar matriz con números aleatorios menores a 100
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(100);
            }
        }

        // Mostrar matriz
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Agregar columna para total de pares por fila
        int[] totalParesFila = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    totalParesFila[i]++;
                }
            }
        }

        // Agregar fila para total de impares por columna
        int[] totalImparesColumna = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] % 2 != 0) {
                    totalImparesColumna[j]++;
                }
            }
        }

        // Mostrar matriz con columna de totales de pares por fila
        System.out.println("\nMatriz con columna de totales de pares por fila:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print(totalParesFila[i] + "\t");
            System.out.println();
        }

        // Mostrar fila con totales de impares por columna
        System.out.println("\nFila con totales de impares por columna:");
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print(totalImparesColumna[j] + "\t");
        }
    }



    public void MatrizSentido() {
        // Declaración del arreglo bidimensional ventas
        int[][] ventas = new int[5][4]; // 5 filas (productos) y 4 columnas (vendedores)

        // Leer y procesar las notas de venta del mes pasado
        leerNotasVenta(ventas);

        // Mostrar los resultados en formato tabular
        mostrarResultados(ventas);
    }

    private static void leerNotasVenta(int[][] ventas) {
        // Simulación de lectura de datos (reemplazar con código real de lectura de notas)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las notas de venta del mes pasado:");

        while (true) {
            System.out.print("Número de vendedor (1-4): ");
            int vendedor = scanner.nextInt();

            System.out.print("Número de producto (1-5): ");
            int producto = scanner.nextInt();

            System.out.print("Valor de venta: ");
            int valorVenta = scanner.nextInt();

            if (vendedor < 1 || vendedor > 4 || producto < 1 || producto > 5 || valorVenta < 0) {
                System.out.println("Datos inválidos. Intente nuevamente.");
            } else {
                ventas[producto - 1][vendedor - 1] += valorVenta; // Actualizar valor en la matriz
            }

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }

    private static void mostrarResultados(int[][] ventas) {
        // Mostrar encabezados de las columnas (vendedores)
        System.out.println("\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal Producto");

        // Mostrar filas de productos y sus ventas
        for (int i = 0; i < ventas.length; i++) {
            int totalProducto = 0; // Acumulador para total de producto

            System.out.print("Producto " + (i + 1) + "\t");

            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print(ventas[i][j] + "\t\t");
                totalProducto += ventas[i][j];
            }

            System.out.println(totalProducto); // Mostrar total de producto
        }

        // Mostrar total de ventas por vendedor
        System.out.print("Total Vendedor\t");
        for (int[] fila : ventas) {
            int totalVendedor = 0;

            for (int valor : fila) {
                totalVendedor += valor;
            }

            System.out.print(totalVendedor + "\t\t");
        }
    }


    public void PhdMatriz() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        // Se pide al usuario el tamaño de la matriz
        int n;
        do {
            System.out.print("Ingrese un número mayor a 2 y menor a 15: ");
            n = sc.nextInt();
        } while (n <= 2 || n >= 15);

        // Se crea la matriz
        int[][] matriz = new int[n][n];

        // Se llena la matriz con números positivos aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
            }
        }

        // Se muestra la matriz original
        System.out.println("\nMatriz original:");
        mostrarMatriz(matriz);

        // Se obtiene la transpuesta de la matriz
        int[][] transpuesta = obtenerTraspuesta(matriz);

        // Se muestra la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        mostrarMatriz(transpuesta);
    }

    // Función para mostrar una matriz
    static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    // Función para obtener la transpuesta de una matriz
    static int[][] obtenerTraspuesta(int[][] matriz) {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

}
