import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class EjerciciosNataly {

    /* 6. Aritmetica truqueada: crea un código sobre “Aritmética básica” la cual consta de suma, resta,
 multiplicación y división. Se ingresa dos números enteros, en el caso de la resta
 siempre se le va a restar el número mayor al menor y que nunca se permita la
 división por cero, si el usuario ingresa un cero se le mostrará un mensaje al usuario
 que no se mostrará la división, luego de eso se deben ordenar los números de los
 resultados de las operaciones aritméticas, los números deben ser ordenados de
 mayor a menor y para finalizar imprimiendo las operaciones aritméticas y el orden de los números.
    */
    public void Aritmetica() {
        Scanner sc = new Scanner(System.in);

        // Ingresar números enteros al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        // Realizar las operaciones aritméticas
        int suma = num1 + num2;
        int resta = Math.max(num1, num2) - Math.min(num1, num2);
        int multiplicacion = num1 * num2;

        // Validar y realizar la división
        int division = 0;
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Ordenar los resultados de mayor a menor
        int[] resultados = {suma, resta, multiplicacion, division};
        Arrays.sort(resultados);

        // Mostrar los resultados
        System.out.println("\nResultados ordenados de mayor a menor:");
        for (int resultado : resultados) {
            System.out.println(resultado);
        }

        // Mostrar las operaciones aritméticas
        System.out.println("\nOperaciones aritméticas:");
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(Math.max(num1, num2) + " - " + Math.min(num1, num2) + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + division);
        }
    }


    /* 12. Pares e impares ordenados: Crea un código sobre números pares e impares, se ingresan cinco números,
luego se deben de ordenar los números de menor a mayor y diga cuántos
son pares y cuántos son impares.
    */
    public void ParesImpares() {
        Scanner sc = new Scanner(System.in);

        // Ingreso de los cinco números
        int[] numeros = new int[5];
        System.out.println("Ingrese cinco números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        // Ordenamiento de los números de menor a mayor
        Arrays.sort(numeros);

        // Conteo de números pares e impares
        int pares = 0;
        int impares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Impresión de los resultados
        System.out.println("\nNúmeros ordenados de menor a mayor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }


    /* 18. A ellos les gusta la gasolina: Crea un programa con ciclos sobre conductores
   que se preocupan acerca del kilometrajede sus automóviles.
   Un conductor ha llevado el registro de varios reabastecimientos
   de gasolina, registrando los kilómetros conducidos y los litros usados en cada
   reabastecimiento. Desarrolle un programa en JAVA que utilice una instrucción while
   para recibir como entrada los kilómetros conducidos y los litros usados (ambos
   como enteros) por cada reabastecimiento. El programa debe calcular y mostrar los
   kilómetros por litro obtenidos en cada reabastecimiento, y debe imprimir el total de
   kilómetros por litro obtenidos en todos los reabastecimientos.
    */
    public void Gasolina() {
        Scanner sc = new Scanner(System.in);

        double totalKilometros = 0;
        double totalLitros = 0;

        // Bucle while para recibir datos de cada reabastecimiento
        while (true) {
            System.out.print("Ingrese los kilómetros conducidos: ");
            int kilometros = sc.nextInt();

            if (kilometros == 0) {
                break; // Salir del bucle si se ingresan 0 kilómetros
            }

            System.out.print("Ingrese los litros usados: ");
            int litros = sc.nextInt();

            if (litros == 0) {
                System.out.println("Error: No se pueden usar 0 litros.");
                continue; // Ignorar este reabastecimiento si se usan 0 litros
            }

            // Calcular kilómetros por litro para este reabastecimiento
            double kilometrosPorLitro = (double) kilometros / litros;

            // Mostrar resultados para este reabastecimiento
            System.out.printf("Kilómetros por litro: %.2f\n", kilometrosPorLitro);

            // Actualizar totales
            totalKilometros += kilometros;
            totalLitros += litros;
        }

        // Calcular y mostrar el total de kilómetros por litro
        if (totalLitros > 0) {
            double kilometrosPorLitroTotal = totalKilometros / totalLitros;
            System.out.printf("\nTotal de kilómetros por litro: %.2f\n", kilometrosPorLitroTotal);
        } else {
            System.out.println("No se han registrado reabastecimientos válidos.");
        }
    }


    /* 24. ¿Apoco hacen uno?: Crea un programa que lea tres valores double distintos de cero,
y que determine e imprima los lados de un triángulo utilizando ciclos
    */
    public void ApocoHacenUno() {
        Scanner sc = new Scanner(System.in);

        // Ingreso de los lados del triángulo
        double ladoA, ladoB, ladoC;
        do {
            System.out.print("Ingrese el lado A: ");
            ladoA = sc.nextDouble();
        } while (ladoA <= 0);

        do {
            System.out.print("Ingrese el lado B: ");
            ladoB = sc.nextDouble();
        } while (ladoB <= 0);

        do {
            System.out.print("Ingrese el lado C: ");
            ladoC = sc.nextDouble();
        } while (ladoC <= 0);

        // Determinar si los lados forman un triángulo válido
        boolean esTriangulo = validarTriangulo(ladoA, ladoB, ladoC);

        if (esTriangulo) {
            // Calcular y mostrar los lados del triángulo
            calcularLadosTriangulo(ladoA, ladoB, ladoC);
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }
    }

    private static boolean validarTriangulo(double ladoA, double ladoB, double ladoC) {
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }

    private static void calcularLadosTriangulo(double ladoA, double ladoB, double ladoC) {
        double ladoMayor, ladoMedio, ladoMenor;

        // Ordenar los lados de mayor a menor
        if (ladoA > ladoB) {
            if (ladoA > ladoC) {
                ladoMayor = ladoA;
                ladoMedio = ladoB;
                ladoMenor = ladoC;
            } else {
                ladoMayor = ladoC;
                ladoMedio = ladoA;
                ladoMenor = ladoB;
            }
        } else {
            if (ladoB > ladoC) {
                ladoMayor = ladoB;
                ladoMedio = ladoA;
                ladoMenor = ladoC;
            } else {
                ladoMayor = ladoC;
                ladoMedio = ladoB;
                ladoMenor = ladoA;
            }
        }

        // Imprimir los lados del triángulo
        System.out.println("\nLados del triángulo:");
        System.out.println("Lado mayor: " + ladoMayor);
        System.out.println("Lado medio: " + ladoMedio);
        System.out.println("Lado menor: " + ladoMenor);
    }


    /* 30. El menor de todos tus males:
    Crea un programa que utilice una función; en donde utilice una instrucción for para
    encontrar el número menor de varios enteros, en donde el usuario ingrese la
    cantidad de números por encontrar.
     */
    public void NumeroMenor() {
        Scanner sc = new Scanner(System.in);

        // Ingresar la cantidad de números
        System.out.print("Ingrese la cantidad de números a evaluar: ");
        int cantidadNumeros = sc.nextInt();

        // Ingresar los números
        int[] numeros = new int[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Encontrar el número menor
        int menor = encontrarMenor(numeros);

        // Mostrar el resultado
        System.out.println("El número menor es: " + menor);
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }


    /* 36. Un cuento de cinco druidas: Crea un programa que lea cinco números,
    debe validar que ninguno sea menor que uno o mayor que doce, luego los ordene
    de menor a mayor y, finalmente, muestre una gráfica de barras horizontales de
    estos cinco números.
     */
    public void CuentoCincoDruidas() {
        // Variables para almacenar los números
        int[] numeros = new int[5];

        // Leer los números del usuario
        leerNumeros(numeros);

        // Validar que los números estén entre 1 y 12
        validarNumeros(numeros);

        // Ordenar los números de menor a mayor
        ordenarNumeros(numeros);

        // Imprimir la gráfica de barras horizontales
        imprimirGraficaBarras(numeros);
    }

    private static void leerNumeros(int[] numeros) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
    }

    private static void validarNumeros(int[] numeros) {
        boolean valido = true;

        for (int numero : numeros) {
            if (numero < 1 || numero > 12) {
                valido = false;
                break;
            }
        }

        if (!valido) {
            System.out.println("Error: Todos los números deben estar entre 1 y 12. Intente nuevamente.");
            System.exit(1); // Terminar el programa
        }
    }

    private static void ordenarNumeros(int[] numeros) {
        Arrays.sort(numeros);
    }

    private static void imprimirGraficaBarras(int[] numeros) {
        System.out.println("\n**Gráfica de barras horizontales:**");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ": ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/* 42. De las bermudas: Crea un programa que pida al usuario una altura con números enteros y luego
dibuje un triángulo con esa altura, por ejemplo, si ingresa siete se debe mostrar la figura con
asteriscos
 */
public void Bermudas () {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la altura del triángulo (número entero): ");
    int altura = sc.nextInt();

    if (altura <= 0) {
        System.out.println("Error: La altura debe ser un número entero positivo.");
        return;
    }

    // Dibujar el triángulo
    for (int i = 1; i <= altura; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}


    /* 48. Druidas suben de nivel: Modificame el codigo anterior de CincoDruidas de la siguiente forma:
    Vamos a mejorar el programa “Un cuento de cinco druidas” para hacer la lectura de los números mediante
    una función (haga uso de variables globales para esto) y que la impresión de las gráficas sea hecha
    mediante una o varias funciones que reciban el número e impriman la salida de asteriscos en horizontal.
     */
    // Variables globales para almacenar los números y las categorías
    static int[] numeros = new int[5]; // Arreglo de números ingresados
    static String[] categorias = {"Número 1", "Número 2", "Número 3", "Número 4", "Número 5"}; // Categorías de las barras

    // Método principal
    public void DruidasSubenDeNivel() {
        leerNumeros(); // Función para leer y validar los números
        ordenarNumeros(); // Función para ordenar los números
        imprimirGraficaBarras(); // Función para imprimir la gráfica de barras horizontales
    }

    private static void leerNumeros() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero;
            while (!sc.hasNextInt() || (numero = sc.nextInt()) < 1 || numero > 12) {
                System.out.println("Error: El número debe estar entre 1 y 12. Intente nuevamente:");
                sc.next(); // Descartar la entrada no válida
            }
            numeros[i] = numero;
        }
    }

    private static void ordenarNumeros() {
        Arrays.sort(numeros);
    }

    private static void imprimirGraficaBarras() {
        System.out.println("\n**Gráfica de barras horizontales (generada con asteriscos)**");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(categorias[i] + ": ");
            imprimirBarraAsteriscos(numeros[i]); // Función para imprimir la barra de asteriscos
        }
    }

    // Función auxiliar para imprimir una barra de asteriscos
    private static void imprimirBarraAsteriscos(int valor) {
        for (int i = 0; i < valor; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    /* 48.1 Simple venta: Crea un programa que lea la cantidad total de un artículo y su precio unitario
     obtenga el total de esa venta y sobre éste calcule el impuesto, el descuento, muestre el subtotal
     y el total considerando los siguiente:
    a.Si la persona es de la 3era edad el descuento es del 30%
    b.Si la persona no es de la tercera edad entonces:
                          i.Si el total está entre 0 y 100 obtiene un 10% de descuento,
                          ii.Si está entre 100 y 300 obtiene un 15% de descuento,
                          iii.Si está entre 300 y 500 un 20% y,
                          iv.Si sobrepasa los 500 un 25%.
    c.El impuesto será del 12% si el descuento es menor o igual a 15% y de 15% en caso contrario.
    */
    public void SimpleVenta() {
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese la cantidad del artículo: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = sc.nextDouble();

        System.out.print("¿Es la persona de la tercera edad? (1: Sí, 0: No): ");
        int esTerceraEdad = sc.nextInt();

        // Cálculo del total antes de descuentos
        double totalAntesDescuento = cantidad * precioUnitario;

        // Cálculo del descuento
        double descuento = 0;
        if (esTerceraEdad == 1) {
            descuento = totalAntesDescuento * 0.3; // Descuento del 30% para tercera edad
        } else {
            if (totalAntesDescuento <= 100) {
                descuento = totalAntesDescuento * 0.1; // Descuento 10%
            } else if (totalAntesDescuento <= 300) {
                descuento = totalAntesDescuento * 0.15; // Descuento 15%
            } else if (totalAntesDescuento <= 500) {
                descuento = totalAntesDescuento * 0.2; // Descuento 20%
            } else {
                descuento = totalAntesDescuento * 0.25; // Descuento 25%
            }
        }

        // Cálculo del subtotal
        double subtotal = totalAntesDescuento - descuento;

        // Cálculo del impuesto
        double impuesto;
        if (descuento <= 0.15) {
            impuesto = subtotal * 0.12; // Impuesto 12%
        } else {
            impuesto = subtotal * 0.15; // Impuesto 15%
        }

        // Cálculo del total final
        double totalFinal = subtotal + impuesto;

        // Impresión de resultados
        System.out.println("\n**Resultados de la venta:**");
        System.out.println("Cantidad del artículo: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total antes de descuento: $" + totalAntesDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total final: $" + totalFinal);
    }


    /* 54. Imprimiendo líneas: Crea un programa con prestaciones similares a las librerías stdlib y time vamos
    a hacer un programa que sirva para imprimir líneas de la siguiente manera:
    a. Pedir al usuario el ingreso de un número entero con un carácter “X” que oscile
    entre cinco (5) y veinte (20) incluyéndolos.
    b. Pedir al usuario el ingreso un numero con un carácter “Y”.
    c. Haciendo uso de una función imprimir línea se imprimirán X líneas donde cada
    una de ellas deberá imprimir separado por un espacio en blanco tantos caracteres Y
    como arroje la función rand (que oscilará entre los primeros quince números
    positivos) usando como semilla de srand time(NULL).
    d. Se deben contar la cantidad total de caracteres impresos porque después se
    imprimirá de nuevo X cantidad de líneas, pero la cantidad de Y caracteres de cada
    línea no dependerá de time(NULL) sino del número total de caracteres que se
    contaron de la primera salida.
    Las X líneas se imprimen con una función que recibe el número X y los caracteres de
    cada línea se imprimen con una función que recibe el carácter que ingresó el usuario
    seguido del número de veces que debe escribirlo en esa línea.
     */
    public void ImprimiendoLineas() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Validar la entrada del usuario (número X)
        int numeroLineasX = 0;
        while (true) {
            try {
                System.out.print("Ingrese un número entre 5 y 20 (incluidos) con un carácter 'X': ");
                numeroLineasX = sc.nextInt();
                if (numeroLineasX >= 5 && numeroLineasX <= 20) {
                    break;
                } else {
                    System.out.println("Error: El número debe estar entre 5 y 20.");
                }
            } catch (InputMismatchException e) {
                sc.next(); // Limpiar la entrada incorrecta
                System.out.println("Error: Debe ingresar un número entero.");
            }
        }

        // Validar la entrada del usuario (caracter Y)
        System.out.print("Ingrese un caracter para las líneas (Y): ");
        String caracterY = sc.next();

        // Imprimir las líneas con caracteres aleatorios
        imprimirLineasAleatorias(numeroLineasX, caracterY, random);
    }

    public void imprimirLinea(String caracter, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }

    public void imprimirLineasAleatorias(int numeroLineasX, String caracterY, Random random) {
        int totalCaracteres = 0;

        for (int i = 0; i < numeroLineasX; i++) {
            int cantidadCaracteresAleatorios = random.nextInt(15) + 1; // Entre 1 y 15
            imprimirLinea(caracterY, cantidadCaracteresAleatorios);
            totalCaracteres += cantidadCaracteresAleatorios;
        }

        for (int i = 0; i < numeroLineasX; i++) {
            imprimirLinea(caracterY, totalCaracteres);
        }
    }


    /* 60. Alinea ésta: Crea un programa en donde se le pida al usuario ingresar un numero entero para
    formar un cuadrado del carácter numeral (#) mediante una función y ciclo.
     */
    public void AlineaEsta (Scanner entrada) {
        int lado;

        do {
            System.out.print("Ingrese el lado del cuadrado (numero entero): ");

            try {
                lado = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor numerico entero.");
                entrada.next(); // Limpiar la entrada incorrecta
                lado = -1; // Para que el bucle continue
            }
        } while (lado <= 0);

        dibujarCuadrado(lado, '#');
    }

    private static void dibujarCuadrado(int lado, char caracterRelleno) {
        int medio, impar;

        if (lado % 2 == 0) {
            medio = lado / 2;
        } else {
            impar = lado + 1;
            medio = impar / 2;
        }

        for (int fila = 1; fila <= lado; fila++) {
            for (int columna = 1; columna <= lado; columna++) {
                if (fila == medio && columna == lado) {
                    System.out.print("* (Lado = " + lado + ")"); // Imprimir el valor dentro del cuadrado
                } else if (fila == 1 || fila == lado || columna == 1 || columna == lado) {
                    System.out.print("#"); // Caracter de borde
                } else {
                    System.out.print(caracterRelleno);
                }
            }
            System.out.println();
        }

        for (int i = 0; i < lado; i++) {
            if (i == medio - 1) {
                System.out.print("(Lado = " + lado + ")");
            } else {
                System.out.print(" "); // Espacio entre el borde y el texto
            }
        }
    }


    /* 66. ¿Qué tan bueno de 1 a 4?: Crea un programa en java llamado PuntosCalidad: que reciba como entrada el
    promedio de un estudiante, en donde el usuario ingrese la nota del estudiante, si la nota esta entre
    90 y 100 debe de devolver 4 el promedio, si esta entre 80 y 89 el promedio debe ser 3, si se encuentra entre
    70 y 79 el promedio es 2, si esta entre 60 y 69 será 1 el promedio, si es menor de 60 el promedio es 0.
     */
    public void PromedioEstudiante() {
        Scanner sc = new Scanner(System.in);

        // Ingresar la nota del estudiante
        System.out.print("Ingrese la nota del estudiante: ");
        int nota = sc.nextInt();

        // Calcular los puntos de calidad
        int puntosCalidad = calcularPuntosCalidad(nota);

        // Mostrar el resultado
        System.out.println("El estudiante obtuvo " + puntosCalidad + " puntos de calidad.");
    }

    public static int calcularPuntosCalidad(int nota) {
        if (nota >= 90 && nota <= 100) {
            return 4;
        } else if (nota >= 80 && nota < 90) {
            return 3;
        } else if (nota >= 70 && nota < 80) {
            return 2;
        } else if (nota >= 60 && nota < 70) {
            return 1;
        } else {
            return 0;
        }
    }


    /* 72. Círculo de nuevo: Escriba un programa que pida al usuario el radio de un círculo y después
    llame a una función inline areaCirculo para calcular el área de ese círculo.
     */
    public void CirculoNuevo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        // Cálculo del área utilizando una función inline
        double area = Math.PI * Math.pow(radio, 2); // Math.PI para el valor de π

        System.out.println("El área del círculo es: " + area);
    }


    /* 78. Modifique el programa del ejercicio “Simple venta” para implementar una librería propia.
     */
    public void VentaModificada() {
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese la cantidad del artículo: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = sc.nextDouble();

        System.out.print("¿Es la persona de la tercera edad? (1: Sí, 0: No): ");
        int esTerceraEdad = sc.nextInt();

        // Cálculo del total antes de descuentos
        double totalAntesDescuento = CalculosVenta.calcularTotalAntesDescuento(cantidad, precioUnitario);

        // Cálculo del descuento
        double descuento;
        if (esTerceraEdad == 1) {
            descuento = CalculosVenta.calcularDescuentoTerceraEdad(totalAntesDescuento);
        } else {
            descuento = CalculosVenta.calcularDescuentoPorRango(totalAntesDescuento);
        }

        // Cálculo del subtotal
        double subtotal = CalculosVenta.calcularSubtotal(totalAntesDescuento, descuento);

        // Cálculo del impuesto
        double impuesto = CalculosVenta.calcularImpuesto(subtotal, descuento);

        // Cálculo del total final
        double totalFinal = CalculosVenta.calcularTotalFinal(subtotal, impuesto);

        // Impresión de resultados
        System.out.println("\n**Resultados de la venta:**");
        System.out.println("Cantidad del artículo: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total antes de descuento: $" + totalAntesDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total final: $" + totalFinal);
    }


    /* 84. Nos gustan los ángulos rectos: Cree una librería que imprima diversos tipos de cuadrados:
a.Cuadrado solo con el borde y vacío por dentro.
b.Cuadrado lleno.
c.Cuadrado solo la mitad lleno.
d.Rectángulo vacío.
e.Rectángulo lleno.
f.Triángulo (como sea)

Y ahora haga un programa que pregunte al usuario qué desea dibujar según el menú de los tipos de cuadrado
 en la librería y con qué carácter lo desea y lo presente en pantalla (el usuario debe poder ingresar la
 longitud de los lados de los cuadrados y la altura del triángulo).
Si elige rectángulo se debe leer el lado más largo y lado más corto y asegurarse que el lado más largo sea
el doble del lado más corto utilizando una función.
     */
    public void AngulosRectos() {
        Scanner sc = new Scanner(System.in);

        int opcion;
        char caracter;
        int lado, ladoLargo, ladoCorto, altura;

        do {
            System.out.println("\n**Menú de figuras:**");
            System.out.println("1. Cuadrado vacío");
            System.out.println("2. Cuadrado lleno");
            System.out.println("3. Cuadrado mitad lleno");
            System.out.println("4. Rectángulo vacío");
            System.out.println("5. Rectángulo lleno");
            System.out.println("6. Triángulo");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    lado = sc.nextInt();
                    System.out.print("Ingrese el caracter a utilizar: ");
                    caracter = sc.next().charAt(0);
                    TiposDeFiguras.dibujarCuadradoVacio(lado, caracter);
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    lado = sc.nextInt();
                    System.out.print("Ingrese el caracter a utilizar: ");
                    caracter = sc.next().charAt(0);
                    TiposDeFiguras.dibujarCuadradoLleno(lado, caracter);
                    break;
                case 3:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    lado = sc.nextInt();
                    System.out.print("Ingrese el caracter a utilizar: ");
                    caracter = sc.next().charAt(0);
                    TiposDeFiguras.dibujarCuadradoMitadLleno(lado, caracter);
                    break;
                case 4:
                    System.out.print("Ingrese el lado largo del rectángulo: ");
                    ladoLargo = sc.nextInt();
                    System.out.print("Ingrese el lado corto del rectángulo: ");
                    ladoCorto = sc.nextInt();
                    System.out.print("Ingrese el caracter a utilizar: ");
                    caracter = sc.next().charAt(0);
                    TiposDeFiguras.dibujarRectanguloVacio(ladoLargo, ladoCorto, caracter);
                    break;
                case 5:
                    System.out.print("Ingrese el lado largo del rectángulo: ");
                    ladoLargo = sc.nextInt();
                    System.out.print("Ingrese el lado corto del rectángulo: ");
                    ladoCorto = sc.nextInt();
                    System.out.print("Ingrese el caracter a utilizar: ");
                    caracter = sc.next().charAt(0);
                    TiposDeFiguras.dibujarRectanguloLleno(ladoLargo, ladoCorto, caracter);
                    break;
                case 6:
                    System.out.print("Ingrese la altura del triángulo: ");
                    altura = sc.nextInt();
                    System.out.print("Ingrese el caracter a utilizar: ");
                    caracter = sc.next().charAt(0);
                    TiposDeFiguras.dibujarTriangulo(altura, caracter);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }


    /* 90.  Te leo y te pongo atención: Modifique el programa anterior para que,
    usando una función, no permita ingresar valores repetidos.
     */
    public void TeLeoVerdad() {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario un número entero entre 10 y 100
        System.out.print("Ingrese un número entero mayor que 10 y menor que 100: ");
        int numeroPrincipal = sc.nextInt();

        // Validar que el número ingresado esté dentro del rango
        while (numeroPrincipal <= 10 || numeroPrincipal >= 100) {
            System.out.println("Error: El número debe ser mayor que 10 y menor que 100.");
            System.out.print("Ingrese un número entero mayor que 10 y menor que 100: ");
            numeroPrincipal = sc.nextInt();
        }

        // Leer tantos números como el número principal
        int[] numerosLista = new int[numeroPrincipal];
        System.out.println("\nIngrese " + numeroPrincipal + " números:");
        for (int i = 0; i < numeroPrincipal; i++) {
            numerosLista[i] = pedirNumeroSinRepetir(numerosLista, sc, "Número " + (i + 1) + ": ");
        }

        // Mostrar la lista de números separados por coma
        System.out.print("\nLista de números: ");
        for (int i = 0; i < numeroPrincipal - 1; i++) {
            System.out.print(numerosLista[i] + ", ");
        }
        System.out.println(numerosLista[numeroPrincipal - 1] + " y");

        // Solicitar al usuario cinco números entre 0 y el número principal
        System.out.println("\nIngrese cinco números entre 0 y " + numeroPrincipal + ": ");
        int[] numerosComparacion = new int[5];
        for (int i = 0; i < 5; i++) {
            numerosComparacion[i] = pedirNumeroSinRepetir(numerosComparacion, sc, "Número " + (i + 1) + ": ");
        }

        // Mostrar la tabla comparativa
        System.out.println("\nTabla comparativa:");
        System.out.println("Número | Posición en la lista");
        System.out.println("-------|--------------------");
        for (int numeroComparacion : numerosComparacion) {
            for (int i = 0; i < numeroPrincipal; i++) {
                if (numerosLista[i] == numeroComparacion) {
                    System.out.println(numeroComparacion + " | " + (i + 1));
                    break;
                }
            }
        }
    }

    private static int pedirNumeroSinRepetir(int[] listaExistente, Scanner sc, String mensaje) {
        int numero;
        do {
            System.out.print(mensaje);
            numero = sc.nextInt();
        } while (existeNumero(listaExistente, numero));
        return numero;
    }

    private static boolean existeNumero(int[] lista, int numero) {
        for (int elemento : lista) {
            if (elemento == numero) {
                return true;
            }
        }
        return false;
    }


    /*
96.  Vectores: Agrega funciones al siguiente código del programa vectores, para totalizar números pares, números impares,
y junto con la salida mostrar no solo el arreglo ordenado sino el mayor de los elementos menos el menor
y los totales de pares e impares.
/codigo de Vectocien
 ......
 /
     */
    private static final int VECTOR_SIZE = 100; // Tamaño del vector

    public void Vectores() {
        int[] vector = new int[VECTOR_SIZE];

        // Inicializar el vector con números aleatorios entre 0 y 99
        inicializarVector(vector);

        // Imprimir el vector original
        imprimirVector(vector);

        // Ordenar el vector
        ordenarVector(vector);

        // Imprimir el vector ordenado
        imprimirVector(vector);

        // Calcular y mostrar el total del vector
        int total = sumarVector(vector);
        System.out.println("Total: " + total);

        // Calcular y mostrar el total de pares e impares
        int totalPares = calcularTotalPares(vector);
        int totalImpares = calcularTotalImpares(vector);
        System.out.println("Total pares: " + totalPares);
        System.out.println("Total impares: " + totalImpares);

        // Calcular y mostrar la diferencia entre máximo y mínimo
        int diferenciaMaxMin = calcularDiferenciaMaxMin(vector);
        System.out.println("Diferencia máximo - mínimo: " + diferenciaMaxMin);
    }

    private static void inicializarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
    }

    private static void imprimirVector(int[] vector) {
        System.out.print("Vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    private static void ordenarVector(int[] vector) {
        Arrays.sort(vector);
    }

    private static int sumarVector(int[] vector) {
        int total = 0;
        for (int elemento : vector) {
            total += elemento;
        }
        return total;
    }

    private static int calcularTotalPares(int[] vector) {
        int totalPares = 0;
        for (int elemento : vector) {
            if (elemento % 2 == 0) {
                totalPares += elemento;
            }
        }
        return totalPares;
    }

    private static int calcularTotalImpares(int[] vector) {
        int totalImpares = 0;
        for (int elemento : vector) {
            if (elemento % 2 != 0) {
                totalImpares += elemento;
            }
        }
        return totalImpares;
    }

    private static int calcularDiferenciaMaxMin(int[] vector) {
        int max = vector[0];
        int min = vector[0];
        for (int elemento : vector) {
            max = Math.max(max, elemento);
            min = Math.min(min, elemento);
        }
        return max - min;
    }


    /*
    102. Una dimensión: Crea un programa llamado Una dimensión: Use un arreglo unidimensional para resolver
    el siguiente problema;
Recibir como entrada 20 números, cada uno de los cuales debe estar entre 10 y 100, inclusive. A medida que se lea
cada número, validarlo y almacenarlo en el arreglo, sólo si no es un duplicado de un número ya leído.
Después de leer todos los valores, mostrar sólo los valores únicos que el usuario introdujo.
Prepárese para el “peor caso”, en el que los 20 números son diferentes. Use el arreglo más pequeño que
sea posible para resolver este problema
     */
    private static final int NUMEROS_A_LEER = 20; // Cantidad de números a leer
    private static final int RANGO_INFERIOR = 10; // Rango inferior válido
    private static final int RANGO_SUPERIOR = 100; // Rango superior válido

    public void UnaDimension() {
        Scanner scanner = new Scanner(System.in);

        // Arreglo para almacenar los números únicos
        int[] numerosUnicos = new int[NUMEROS_A_LEER]; // Tamaño máximo posible (peor caso)

        // Contador de números únicos leídos
        int contadorUnicos = 0;

        System.out.println("Ingrese 20 números entre 10 y 100 (sin duplicados):");

        // Bucle para leer y validar los números
        for (int i = 0; i < NUMEROS_A_LEER; i++) {
            int numero;
            do {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numero = scanner.nextInt();
            } while (!validarNumero(numero));

            // Si el número es único, almacenarlo y actualizar el contador
            if (!esDuplicado(numerosUnicos, contadorUnicos, numero)) {
                numerosUnicos[contadorUnicos] = numero;
                contadorUnicos++;
            }
        }

        // Reducir el tamaño del arreglo si es necesario (optimización)
        if (contadorUnicos < NUMEROS_A_LEER) {
            int[] numerosUnicosReducido = new int[contadorUnicos];
            System.arraycopy(numerosUnicos, 0, numerosUnicosReducido, 0, contadorUnicos);
            numerosUnicos = numerosUnicosReducido;
        }

        System.out.println("\nNúmeros únicos ingresados:");
        for (int i = 0; i < contadorUnicos; i++) {
            System.out.print(numerosUnicos[i] + " ");
        }
    }

    private static boolean validarNumero(int numero) {
        return RANGO_INFERIOR <= numero && numero <= RANGO_SUPERIOR;
    }

    private static boolean esDuplicado(int[] numeros, int contadorUnicos, int numero) {
        for (int i = 0; i < contadorUnicos; i++) {
            if (numeros[i] == numero) {
                System.out.println("El número " + numero + " ya ha sido ingresado. Intente nuevamente.");
                return true;
            }
        }
        return false;
    }


    /*
    108. Matrices, matrices: Crea un programa de matrices, la matriz debe de ser 5x5
    pero el llenado de la misma se hará de la siguiente manera:
a.  Una función que inicializa la matriz en 0.
b.  Una función imprimirá la matriz.
c.  Con la matriz visible en pantalla vamos a pedirle al usuario que ingrese un valor para la posición [ i ] [ j ]  donde:
                                       i. Los valores de i y de j pertenecen a la matriz.
                                      ii. Los valores de i y de j se generan aleatoriamente.
                                     iii. Si la casilla [ i ] [ j ]  tiene un valor diferente a cero entonces no
                                          debo pedirlo, así evitamos repetir celdas.
d. Cada vez que el usuario ingrese un valor se debe limpiar la pantalla, mostrar la matriz actualizada donde se refleje que
se guardó en la posición [ i ] [ j ] el valor que dijo el usuario y pedir un nuevo valor [ i ] [ j ]
e. Seguir haciendo los incisos c y d hasta que la matriz esté completa.
*/
    private static int[][] matriz = new int[5][5]; // Matriz 5x5
    private static Scanner scanner = new Scanner(System.in);

    public void Matriz5x5() {
        inicializarMatriz(); // Inicializar matriz en 0
        mostrarMatriz(); // Imprimir matriz

        while (!estaCompleta()) { // Ciclo para llenar la matriz
            pedirPosicionValor(); // Pedir posición y valor al usuario
            mostrarMatriz(); // Mostrar matriz actualizada
        }

        System.out.println("¡Matriz completa!");
    }

    private static void inicializarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    private static void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean estaCompleta() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void pedirPosicionValor() {
        int i, j;

        do {
            i = generarAleatorio(0, matriz.length - 1);
            j = generarAleatorio(0, matriz[0].length - 1);
        } while (matriz[i][j] != 0); // Evitar celdas repetidas

        System.out.print("Ingrese valor para [" + i + "," + j + "]: ");
        matriz[i][j] = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.println("\nLimpiando pantalla...");
        for (int k = 0; k < 50; k++) { // Limpiar pantalla con caracteres vacíos
            System.out.print("\n");
        }
    }

    private static int generarAleatorio(int minimo, int maximo) {
        return (int) Math.floor(Math.random() * (maximo - minimo + 1)) + minimo;
    }


    /*
    114. Valles: Una matriz tiene un valle si el valor de una de sus celdas es menor que el de cualquiera de
    sus 8 celdas vecinas. Haga un programa que lea una matriz (el usuario te indicará cuántas filas y columnas)
    y nos diga si la matriz tiene un valle o no. En caso afirmativo, nos mostrará en pantalla las coordenadas
    de todos los valles, sus valores y el de sus celdas vecinas. La matriz debe tener un número de filas y
    columnas mayor o igual que 3 y menor o igual que 10.
Las casillas que no tienen 8 vecinos no se consideran candidatas a ser valle (pues no tienen 8 vecinos).
Aquí un ejemplo de la salida esperada para esta matriz de 4 × 5:
En 955,945,876 el valle es 4 y, en 329,618,638 el valle es 1; note que al usuario se le  indican las celdas
numeradas desde 1 y no desde 0.
     */
    // Tamaño mínimo para filas y columnas (inclusive)
    private static final int MIN_SIZE = 3;
    // Tamaño máximo para filas y columnas (inclusive)
    private static final int MAX_SIZE = 10;

    public void Valles() {
        Scanner scanner = new Scanner(System.in);

        // Lee el número de filas y columnas del usuario
        int rows, columns;
        do {
            System.out.print("Ingrese el número de filas (entre " + MIN_SIZE + " y " + MAX_SIZE + "): ");
            rows = scanner.nextInt();
        } while (!isValidSize(rows, MIN_SIZE, MAX_SIZE));

        do {
            System.out.print("Ingrese el número de columnas (entre " + MIN_SIZE + " y " + MAX_SIZE + "): ");
            columns = scanner.nextInt();
        } while (!isValidSize(columns, MIN_SIZE, MAX_SIZE));

        // Crea la matriz y lee sus valores
        int[][] matrix = new int[rows][columns];
        System.out.println("\nIngrese los valores de la matriz:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Valor en [" + (i + 1) + "," + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Revisa si hay valles y muestra los resultados
        boolean hasValleys = false;
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < columns - 1; j++) {
                if (isValley(matrix, i, j)) {
                    hasValleys = true;
                    System.out.println("\nValle encontrado en [" + (i + 1) + "," + (j + 1) + "]:");
                    System.out.println("Valor del valle: " + matrix[i][j]);
                    displayValleyNeighbors(matrix, i, j);
                }
            }
        }

        if (!hasValleys) {
            System.out.println("\nNo se encontraron valles en la matriz.");
        }
    }

    // Verifica si el tamaño está dentro del rango válido
    private static boolean isValidSize(int size, int min, int max) {
        return min <= size && size <= max;
    }

    // Determina si una celda es un valle
    private static boolean isValley(int[][] matrix, int row, int col) {
        int valleyValue = matrix[row][col];

        // Revisa las 8 celdas vecinas
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i == row && j == col) {
                    continue; // Omite la celda actual
                }

                if (matrix[i][j] <= valleyValue) {
                    return false; // No es un valle si algún vecino es igual o mayor
                }
            }
        }

        return true; // Todos los vecinos son menores, es un valle
    }

    // Muestra los valores de las celdas vecinas de un valle
    private static void displayValleyNeighbors(int[][] matrix, int row, int col) {
        System.out.println("Vecinos:");
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i == row && j == col) {
                    continue; // Omite la celda actual
                }

                System.out.print("[" + (i + 1) + "," + (j + 1) + "] = " + matrix[i][j] + "; ");
            }
            System.out.println();
        }
    }


    /*
    120. Las cosas como son: EL sistema anterior se puede mejorar incluyendo el valor de la consulta
    en la fecha, haga las modificaciones requeridas. Ahora fechac se llama consulta, lleva año, mes,
    día, valor de la consulta y si pagó cuánto pagó en esa consulta, ya sabemos que pudo no pagar
    o pagar menos y aumentar la deuda.
     */


}