import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
Autor: Adrian Wasani Martinez Bonilla.
* */
public class EjerciciosAdrian {

    /* Prompt-Ejercicio #1: Crea un encabezado para mis programas en JAVA que irá antes de los programas como comentario, el encabezado contendrá: nombre, apodo, correo electrónico, fecha, código correlativo
    al ejercicio que estoy desarrollando y un espacio para escribir un análisis/resumen de mi ejercicio, también debe existir una versión corta de este encabezado para cuando trabaje con
    otras personas. Para este caso este encabezado irá junto a un programa el cual mostrará como salida un saludo al usuario. El programa se llamará EjemploSello.
    * */
    public void EjemploSaludo () {

        System.out.println("¡Hola, mundo!");
    }

    /*Prompt-Ejercicio #2: Basado en el programa anterior ahora debe mostrar como salida el encabezado antes definido. El nombre del programa será "MostrandoSello".
    * */
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

    /*
    * Prompt-Ejercicio #8: Partiendo del código anterior quiero que me hagas un programa que reciba cuatro números enteros y los ordene de mayor a
    * menor y los muestre ordenados ascendentemente de izquierda a derecha y luego que muestre su suma, promedio, producto, menor y mayor valor.
    * */
    public void OrdenarNumeros() {
        Scanner sc = new Scanner(System.in);

        // Se solicitan los cuatro números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        int num4 = sc.nextInt();

        // Se ordenan los números de mayor a menor utilizando un arreglo temporal
        int[] numeros = {num1, num2, num3, num4};
        int temp;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Se muestran los números ordenados de menor a mayor
        System.out.println("\nNúmeros ordenados de mayor a menor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Se calculan la suma, el promedio y el producto
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double promedio = (double) suma / numeros.length;
        int producto = 1;
        for (int numero : numeros) {
            producto *= numero;
        }

        // Se muestran los resultados al usuario
        System.out.println("\nSuma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Producto: " + producto);
        System.out.println("Menor número: " + numeros[numeros.length - 1]);
        System.out.println("Mayor número: " + numeros[0]);
    }


    /*Prompt-Ejercicio #14: Crea un programa en JAVA llamado "TableroDamas" el cual muestra como salida un patrón de tablero de damas con sus ocho filas y columnas.
    * */
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

    /*Prompt-Ejercicio #20: Crea un programa en JAVA que calculará el pago a los vendedores de una empresa. Para ello se parte del sueldo base para cada empleado que es de $200 por
    semana además de una comisión equivalente al 9% de las ventas brutas durante la semana. El programa mediante un ciclo while recibirá como entrada el total de ventas brutas de cada
    vendedor, luego del cálculo debe mostrar como salida el sueldo total de ese vendedor.
    * */
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

    /*Prompt-Ejercicio #26: Crea un programa en JAVA que se llamará "CopiarPegar" el cual utiliza una instrucción while y la secuencia de escape de tabulación \t para imprimir una tabla 
    que contiene cuatro columnas y cinco filas en donde las columnas irán del siguiente orden: N, 10*N, 100*N y 1000*N, donde "N" son los números del 1 al 5 mostrados en cada fila en función
     de lo que cada columna, por ejemplo, en la primera columna que es N los valores se muestran de esta manera: 1, 2, 3, 4, 5.
    * */
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

    /*Prompt-Ejercicio #32: Crea un programa en JAVA llamado "Factorial" El programa consiste en utilizar una función for para evaluar las factoriales enteras del 1 al 5 basado
    en la siguiente fórmula: n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n mayores o iguales a 1), los resultados los debe mostrar en formato de tabulación.
    * */
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

    /*Prompt-Ejercicio #38: Crea un programa en JAVA llamado "Rombo" que imprima la figura de un rombo utilizando instrucciones de salida que impriman asteriscos o un solo espacio en blanco.
    Maximiza el uso de la repetición con instrucciones for anidadas y minimiza el número de instrucciones de salida.
    * */
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

     /*Prompt-Ejercicio #44: Crea un programa en JAVA, MenuProgram: este programa muestra un menú llamando a una función que presenta cinco opciones al usuario y devuelve la opción elegida, las opciones del menú principal
     serán las siguientes enumeradas en este orden: 1. África, 2. América. 3. Asia, 4. Europa y la opción 5 será para salir del programa, al seleccionar la opción 1 (África) debe mostrar: 1. Nigeria y 2. Seychelles. En la
     opción 2 (América) debe mostrar: 1. Estados Unidos y 2. Guyana. En la opción 3 (Asia) debe mostrar: 1. India y 2. Tuvalu. En la opción 4 (Europa) debe mostrar: 1. Alemania y 2. Luxemburgo. Todas las opciones antes mostradas
     deben tener una tercera opción para regresar al menú principal y al seleccionar las otras opciones solo debe mostrar que se seleccionó dicha opción, también es necesario validar la entrada de opciones validas al usuario y no
      se puede mostrar o validar nada desde el main, todo debe hacerse desde la función.
     * */
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

    /*Prompt-Ejercicio #50: Crea un programa en JAVA, FiguraV2: Hacer un programa que elija entre cualquiera de las siguientes figuras: Círculo, cuadrado, triángulo, rectángulo y
    rombo y depende de la figura elegida solicite la información necesaria para hacer el cálculo de su área y de su perímetro. Debe mostrar la figura seleccionada
    (nombre y dibujada), las entradas del usuario y los resultados obtenidos.
    * */
    public void FiguraV2() {
        Scanner scanner = new Scanner(System.in);

        // Display the menu and get the user's choice
        System.out.println("Seleccione la figura que desea calcular:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Rombo");
        System.out.print("Su elección: ");
        int choice = scanner.nextInt();

        // Calculate and display the area and perimeter based on the user's choice
        switch (choice) {
            case 1:
                calculateCircleAreaAndPerimeter(scanner);
                break;
            case 2:
                calculateSquareAreaAndPerimeter(scanner);
                break;
            case 3:
                calculateTriangleAreaAndPerimeter(scanner);
                break;
            case 4:
                calculateRectangleAreaAndPerimeter(scanner);
                break;
            case 5:
                calculateRhombusAreaAndPerimeter(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void calculateCircleAreaAndPerimeter(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("\nFigura seleccionada: Círculo");
        System.out.println("Radio: " + radius);
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimeter);

        // Draw a simple circle using ASCII characters (for demonstration only)
        for (int i = 0; i <= radius; i++) {
            for (int j = (int) -radius; j <= radius; j++) {
                double x = i - (radius / 2);
                double y = j - (radius / 2);
                if (Math.sqrt(x * x + y * y) <= radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void calculateSquareAreaAndPerimeter(Scanner scanner) {
        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        double sideLength = scanner.nextDouble();

        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;

        System.out.println("\nFigura seleccionada: Cuadrado");
        System.out.println("Longitud del lado: " + sideLength);
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimeter);

        // Draw a simple square using ASCII characters (for demonstration only)
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void calculateTriangleAreaAndPerimeter(Scanner scanner) {
        System.out.print("Ingrese la longitud de la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.print("Ingrese la longitud del lado 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado 3: ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        System.out.println("\nFigura seleccionada: Triángulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + height);
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimeter);

        // Draw a simple triangle using ASCII characters (for demonstration only)
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= base; j++) {
                if (i <= (height / base) * j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void calculateRectangleAreaAndPerimeter(Scanner scanner) {
        System.out.print("Ingrese la longitud de la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double height = scanner.nextDouble();

        double area = base * height;
        double perimeter = 2 * (base + height);

        System.out.println("\nFigura seleccionada: Rectángulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + height);
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimeter);

        // Draw a simple rectangle using ASCII characters (for demonstration only)
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void calculateRhombusAreaAndPerimeter(Scanner scanner) {
        System.out.print("Ingrese la longitud del lado del rombo: ");
        double sideLength = scanner.nextDouble();

        System.out.print("Ingrese el ángulo agudo del rombo en grados: ");
        double angle = scanner.nextDouble();

        double area = sideLength * sideLength * Math.sin(Math.toRadians(angle));
        double perimeter = 4 * sideLength;

        System.out.println("\nFigura seleccionada: Rombo");
        System.out.println("Longitud del lado: " + sideLength);
        System.out.println("Ángulo agudo: " + angle + " grados");
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimeter);

        // Draw a simple rhombus using ASCII characters (for demonstration only)
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < sideLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*Prompt-Ejercicio #56: Crea un programa en JAVA, AlineaNombre: que utilice una función getline con las líbrerias string e iostream, mediante un ciclo solicite al usuario ingrese cinco nombres formados por el primer
     nombre y primer apellido y lo imprima en pantalla alineado a la izquierda. No utilizar arreglos e importante la validación de las entradas.
    * */
    public void AlineaNombre() {
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


    /*Prompt-Ejercicio #62: Crea un programa en JAVA, DisminuyeNum: que reciba tres números de tipo double y que los pase a una función que duelva el mismo número más pequeño.
    Importante la validación de entrada para cada número
    * */
    public void DisminuyeNum() {
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

    /*Prompt-Ejercicio #68: Crea un programa en JAVA que consiste en lo siguiente: el programa debe servir de ayuda para un estudiante de escuela primaria, para que aprenda a multiplicar.
    Use la función rand para producir dos enteros positivos de un dígito. El programa debe entonces mostrar una pregunta al usuario, como: ¿Cuánto es 6 por 7? El estudiante entonces debe
    escribir la respuesta. Luego, el programa debe veriﬁcar la respuesta del estudiante. ¡Si es correcta, debe imprimir "Muy bien!" y hacer otra pregunta de multiplicación. Si la respuesta
    es incorrecta, debe imprimir "No. Por favor intenta de nuevo." y deje que el estudiante intente la misma pregunta varias veces, hasta que esté correcta.
    * */

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


    /*Prompt-Ejercicio #74: Crea un programa en JAVA, Elevation que consiste en:  hacer un programa que involucre dos funciones para elevar al cuadrado y para elevar al cubo sin embargo estas funciones tienen que llevar el mismo nombre la única diferencia en cada par es que una hace uso de paso de parámetros por valor y la otra lo hace por referencia.
    El programa tendrá dos funciones llamadas elevarCd (para elevar al cuadrado)y elevarCb (para elevar al cubo) entonces, al arrancar y luego de dar la bienvenida al usuario presentará una tabla con cinco columnas en la primera aparecerán los números del cero (0) al diez (10), en la segunda el cuadrado de estos números obtenidos por valor, en la tercera
    el cuadrado obtenido por referencia, en la cuarta el cubo obtenido por valor y en la última el cubo obtenido por referencia.
    * */
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


    /*Prompt-Ejercicio #80: A raíz de este código créame una librería propia para usar en otros códigos.
    * */
        public void MiLibreria() {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingrese un número del 1 al 15: ");
            int numeroUsuario = entrada.nextInt();

            TablaMultiplicacion.generarTabla(numeroUsuario);
        }


    /*Prompt-Ejercicio #86: Crea un programa en JAVA, ImpArchivo: que escriba un mensaje, escrito por el usuario, en un archivo de texto para ello se debe pedir al usuario
    el mensaje. Algo importante a considerar es la validación para el ingreso del nombre de archivo, que sea de la manera que lo exige el programa.
    * */
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

        /*Prompt-Ejercicio #92: Incorpora al código lo siguiente (Ejercicio #91 de está guia): una función espar(float) que; retornando un booleano, determina si el valor recibido es par, también usando la función espar() contar
        los números pares e impares de la salida final (los cinco números, después de la tabla aparezca también el total de pares, total de impares y total de haber sumado los valores, los cuadrados y los cubos, luego ya por ultimo
         muestra el total de cuadrados, total de cubos, total de pares e impares no son variables diferentes, todas son parte del vector TOTALES.
        * */
        public void ejercicio91() {
            // ... (código para solicitar y validar el número inicial, leer la lista de números y los números clave, igual que antes)

            // Generar y mostrar la tabla
            System.out.println("\nTabla:");
            System.out.println("Número clave\tPosición en la lista\tValor\tCuadrado\tCubo");
            int[] numerosClave = new int[0];
            float[] totales = new float[4]; // Inicializar vector TOTALES con 4 posiciones: 0=pares, 1=impares, 2=sumaValores, 3=sumaCubos

            for (int i = 0; i < numerosClave.length; i++) {
                int[] listaNumeros = new int[0];
                int posicionLista = hashCode(numerosClave[i], listaNumeros); // Implementar función hashCode correctamente
                float valor = listaNumeros[posicionLista];
                float cuadrado = calcularCuadrado(valor); // Implementar función calcularCuadrado
                float cubo = calcularCubo(valor); // Implementar función calcularCubo

                System.out.println(numerosClave[i] + "\t\t" + (posicionLista + 1) + "\t" + valor + "\t" + cuadrado + "\t" + cubo);

                // Actualizar vector TOTALES
                totales[0] += espar(valor) ? 1 : 0; // Contar pares con función espar
                totales[1] += !espar(valor) ? 1 : 0; // Contar impares con función espar
                totales[2] += valor;
                totales[2] += cuadrado;
                totales[3] += cubo;
            }

            // Mostrar estadísticas finales
            System.out.println("\nEstadísticas:");
            System.out.println("Total pares: " + totales[0]);
            System.out.println("Total impares: " + totales[1]);
            System.out.println("Suma valores: " + totales[2]);
            System.out.println("Suma cuadrados: " + totales[2]); // Suma de valores ya incluye cuadrados
            System.out.println("Suma cubos: " + totales[3]);
        }

        // Función para determinar si un número es par (retorna true) o impar (retorna false)
        private boolean espar(float valor) {
            return valor % 2 == 0;
        }

        // Implementar la función calcularCuadrado que eleva un valor float al cuadrado
        private float calcularCuadrado(float valor) {
            return valor * valor;
        }

        // Implementar la función calcularCubo que eleva un valor float al cubo
        private float calcularCubo(float valor) {
            return (float) Math.pow(valor, 3);
        }

        // Implementar la función hashCode de forma adecuada según el contexto del código
        private int hashCode(int numeroClave, int[] listaNumeros) {
            // Implementar la lógica para calcular el hash code considerando el número clave y la lista de números
            return 0; // Reemplazar con la implementación correcta
        }


    /*Prompt-Ejercicio #98: Crea un programa en JAVA, MatrizV2:Que haga una matriz de 5x5 con números aleatorios (menores a 100) y muestre el total de números pares en las filas en una columna extra y en una fila adicional
    el total de números impares de cada columna.
    * */
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


    /*Prompt-Ejercicio #104: Crea un programa en JAVA, MatrizSentido que hará lo siguiente: Use un arreglo bidimensional para resolver el siguiente problema: una compañía tiene cuatro vendedores (1 a 4) que
    venden cinco productos distintos (1 a 5). Una vez al día, cada vendedor pasa una nota por cada tipo de producto vendido. Cada nota contiene lo siguiente: El número del vendedor, el número del producto y
    el valor total en dólares de ese producto vendido en ese día. Así, cada vendedor pasa entre 0 y 5 notas de venta por día. Suponga que está disponible la información sobre todas las notas del mes pasado.
    Escriba un programa que lea toda esta información para las ventas del último mes y que resuma las ventas totales por vendedor, por producto. Todos los totales deben guardarse en el arreglo bidimensional
    ventas. Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular, donde cada columna representa a un vendedor específico y cada ﬁla represente a un producto. Saque
    el total de cada ﬁla para obtener las ventas totales de cada producto durante el último mes. Saque el total de cada columna para obtener las ventas totales de cada producto durante el último mes. Su impresión
    tabular debe incluir estos totales cruzados a la derecha de las ﬁlas totalizadas, y en la parte inferior de las columnas totalizadas. 
    * */
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


    /*Prompt-Ejercicio #110: Crea un programa en JAVA, PhdMatriz que consiste en: Pedir al usuario que ingrese un número mayor a 2 y menor a 15, con ese número crear una matriz cuadrada y llenarla con números
    positivos (generados con una función) entonces una vez llena la matriz mostrarla (usando una función para eso) e inmediatamente después mostrar su transpuesta (con otra función).
    * */
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
