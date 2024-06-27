import java.util.*;
import java.math.BigDecimal;

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
        do {
            System.out.println("Ingrese un numero entre 0 y 99999");

            while (!scanner.hasNextInt()) {
                System.out.println("ERROR: El dato ingresado no es un número entero.");
                scanner.next(); // Descartar la entrada no válida
            }
            numero = scanner.nextInt();

            // 2. Validar que el número tenga como máximo 5 dígitos
            if (numero < 0 || numero > 99999) {
                System.out.println("Error: El número debe estar entre 0 y 99999.");
            } else {
                break;
            }
        } while (true);


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

/*
53. me ayuda a crear un programa en java con las siguientes especificaciones y me das el codigo completo:
¿Hace frío?: Vamos a desarrollar un convertidor de temperaturas para ello se presenta un menú donde indicamos
la escala de temperatura inicial, luego se pide la escala de temperatura final y, finalmente se lee la temperatura en
la escala inicial. El sistema debe entonces mostrar la temperatura inicial y la temperatura final cada una en su correspondiente escala.
Se debe programar una función que reciba temperatura inicial, escala inicial, escala final y regrese el valor de
la temperatura en la escala final obviamente el sistema no debe permitir al usuario elegir por escala final
la misma escala inicial (ni siquier debe mostrarla como opción de escala final)
PD: Las escalas de temperatura son Celsius, Fahrenheit y Kelvin
*/

    public void HaceFrio(Scanner entrada) {
        // Menú de escala inicial
        System.out.println("Seleccione la escala inicial:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int escalaInicial = entrada.nextInt();

        // Validación de escala inicial
        while (escalaInicial < 1 || escalaInicial > 3) {
            System.out.println("Opción inválida. Ingrese nuevamente:");
            escalaInicial = entrada.nextInt();
        }

        // Menú de escala final
        System.out.println("\nSeleccione la escala final (diferente a la inicial):");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int escalaFinal = entrada.nextInt();

        // Validación de escala final
        while (escalaFinal == escalaInicial) {
            System.out.println("La escala final no puede ser la misma que la inicial. Ingrese nuevamente:");
            escalaFinal = entrada.nextInt();
        }

        // Ingreso de temperatura inicial
        System.out.println("\nIngrese la temperatura en la escala inicial:");
        double temperaturaInicial = entrada.nextDouble();

        // Conversión de temperatura
        double temperaturaFinal = convertirTemperatura(temperaturaInicial, escalaInicial, escalaFinal);

        // Impresión del resultado
        System.out.println("\nTemperatura inicial: " + temperaturaInicial + "°");
        System.out.println("Temperatura final: " + temperaturaFinal + "°");
    }

    private static double convertirTemperatura(double temperaturaInicial, int escalaInicial, int escalaFinal) {
        switch (escalaInicial) {
            case 1: // Celsius
                switch (escalaFinal) {
                    case 2: // Fahrenheit
                        return (temperaturaInicial * 9 / 5) + 32;
                    case 3: // Kelvin
                        return temperaturaInicial + 273.15;
                    default:
                        return temperaturaInicial;
                }
            case 2: // Fahrenheit
                switch (escalaFinal) {
                    case 1: // Celsius
                        return (temperaturaInicial - 32) * 5 / 9;
                    case 3: // Kelvin
                        return (temperaturaInicial - 32) * 5 / 9 + 273.15;
                    default:
                        return temperaturaInicial;
                }
            case 3: // Kelvin
                switch (escalaFinal) {
                    case 1: // Celsius
                        return temperaturaInicial - 273.15;
                    case 2: // Fahrenheit
                        return (temperaturaInicial - 273.15) * 9 / 5 + 32;
                    default:
                        return temperaturaInicial;
                }
        }
        // This line shouldn't be reached because all valid cases are handled above
        return temperaturaInicial;
    }


    /*
    59. me ayudas con el codigo completo en java de este programa:
    Alineado: Escriba una función que solicite al usuario el valor del cuadrado y que verifique que solo se
    puedan ingresar numeros enteros y que muestre en el margen izquierdo de la pantalla un cuadrado relleno de
    asteriscos, cuyo lado se especiﬁque en el parámetro entero lado. Por ejemplo, si lado es 4, el método debe mostrar lo siguiente.
    */
    public void Alineado(Scanner entrada) {
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

        dibujarCuadrado(lado);
    }

    private static void dibujarCuadrado(int lado) {
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
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < lado; i++) {
            if (i == medio - 1) {
                System.out.print("(Lado = " + lado + ")");
            } else {
                System.out.print("   ");
            }
        }
    }


/*
65. quiero hacer este programa en java:
Aparcar si puedes: Un estacionamiento cobra una cuota mínima de $2.00 por estacionarse hasta tres horas.
El estacionamiento cobra $0.50 adicionales por cada hora o fracción que se pase de tres horas. El cargo máximo para
cualquier periodo dado de 24 horas es de $10.00. Suponga que ningún auto se estaciona durante más de 24 horas a la vez.
Escriba un programa que calcule y muestre los cargos por estacionamiento para cada uno de tres clientes que estacionaron su auto
ayer en este estacionamiento. Debe introducir las horas de estacionamiento para cada cliente. El programa debe imprimir los
resultados en un formato tabular ordenado, debe calcular e imprimir el total de los recibos de ayer. El programa debe utilizar la
función calcularCargos para determinar el cargo para cada cliente.
me das el codigo completo.
*/

    public void Estacionamiento(Scanner entrada) {

        // Se declaran las variables necesarias
        double totalRecibos = 0.0;
        int horasCliente;

        // Se procesa la información de cada cliente
        for (int cliente = 1; cliente <= 3; cliente++) {
            System.out.print("Ingrese las horas estacionadas por el cliente " + cliente + ": ");
            horasCliente = entrada.nextInt();

            // Se calcula el cargo para el cliente actual
            double cargoCliente = calcularCargo(horasCliente);

            // Se actualiza el total de recibos
            totalRecibos += cargoCliente;

            // Se imprime la información del cliente actual
            System.out.println("Cliente " + cliente + ": $" + cargoCliente);
        }

        // Se imprime el total de recibos
        System.out.println("\nTotal de recibos: $" + totalRecibos);
    }

    public static double calcularCargo(int horasEstacionadas) {
        double cargo = 2.0; // Cuota mínima

        // Se calcula el cargo adicional por horas adicionales
        if (horasEstacionadas > 3) {
            int horasAdicionales = horasEstacionadas - 3;
            cargo += horasAdicionales * 0.5;
        }

        // Se asegura que el cargo no exceda el máximo
        if (cargo > 10.0) {
            cargo = 10.0;
        }

        return cargo;
    }


    /*
    71. sabes cual es este problema Hanoi: Busque el problema de las torres de hanoi y copie el código en JAVA, documente las líneas y haga una salida elegante.
    */
    public void TorreHanoi(Scanner entrada) {
        int n; // Cantidad de discos
        System.out.println("Cuandos discos desea");
        n = entrada.nextInt(); //Se solicita al usuario elegir la cantidad de discos entre mayor el numero mayor el numero de movimientos
        moverDiscos(n, 1, 3, 2); // Mover discos de la torre 1 a la 3 usando la 2 como auxiliar
    }

    public static void moverDiscos(int n, int origen, int destino, int auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        moverDiscos(n - 1, origen, auxiliar, destino); // Mover n-1 discos a la torre auxiliar
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);  // Mover disco n a destino
        moverDiscos(n - 1, auxiliar, destino, origen); // Mover n-1 discos de la auxiliar a destino
    }

    /*

77. como harias este programa en java:
Potenciando: Vamos a crear un programa que compare nuestras capacidades con las de otros programadores para ello vamosa
crear una función que permita elevar un número a cualquier potencia recuerde que
a.Usted debe saber como calcular potencias.
b.Un número elevado a un número negativo también tiene potencia.
c.Todo número elevado a la cero es igual a 1 sin excepción.
Una vez creada la función vamos a pedir al usuario que ingrese dos números con las siguientes restricciones:
a.Ambos ángulos deben estar entre -50 y 50.
b.El segundo número debe ser mayor que el primero si el usuario ingresa un número menor debe preguntarle si desea cambiar el segundo por el
primero y dejar el primero por el segundo. Es decir si num1= 15 y num2 = -15 el sistema debe preguntar “¿Desea que el primer número sea -15 y
el segundo 15 (1= si, 2 = volver a leer ambos números? : “ y bueno, actuar conforme lo que decida el usuario en cuanto a los valores de los números.
Una vez leídos los números se pedirán tres exponentes (todos entre -10 y 10) y luego el programa debe mostrar la siguiente tabla:

  Num
 Potencia P1
 pow(Num, P1)
 Potencia P2
 Pow(Num, P2)
 Potencia P3
 pow(Num, P3)

  Donde Potencia P1, Potencia P2 y Potencia P3 son potencias obtenidas con la función que usted creó y Pow(Num, P1), Pow(Num, P2) y Pow(Num, P3) son
   potencias obtenidas usando la función pow de la biblioteca math.h (en java de la clase math). Esta tabla debe satisfacer las siguientes características:
a.La tabla debe estar correctamente construida con columnas de un ancho de 15.
b.Deben usarse solamente tres cifras decimales en los resultados mostrados.
c.La primera columna está formada por todos los números entre el primero y el segundo número incluyéndolos.
    */

    public void Potenciando(Scanner entrada) {

        // Solicitar números al usuario
        int num1, num2;
        do {
            System.out.print("Ingrese el primer número (-50 a 50): ");
            num1 = entrada.nextInt();
        } while (num1 < -50 || num1 > 50);

        do {
            System.out.print("Ingrese el segundo número (-50 a 50): ");
            num2 = entrada.nextInt();
        } while (num2 < -50 || num2 > 50 || num2 <= num1);

        System.out.print("¿Desea que el primer número sea " + num2 + " y el segundo " + num1 + " (1=si, 2=no)? ");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Solicitar exponentes
        int[] exponentes = new int[3];
        for (int i = 0; i < exponentes.length; i++) {
            do {
                System.out.print("Ingrese el exponente " + (i + 1) + " (-10 a 10): ");
                exponentes[i] = entrada.nextInt();
            } while (exponentes[i] < -10 || exponentes[i] > 10);
        }

        // Generar y mostrar la tabla
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Num", "Potencia P1", "pow(Num, P1)", "Potencia P2", "pow(Num, P2)", "Potencia P3", "pow(Num, P3)");
        for (int i = num1; i <= num2; i++) {
            for (int j = 0; j < exponentes.length; j++) {
                double potenciaCalculada = potencia(i, exponentes[j]);
                double potenciaMath = Math.pow(i, exponentes[j]);
                System.out.printf("%-15d%-15d%-15.3f%-15d%-15.3f%-15.3f\n", i, exponentes[j], potenciaCalculada, exponentes[j], potenciaMath, potenciaMath);
            }
        }
    }

    // Función para calcular potencias
    double potencia (double base, int exponente){
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * potencia(base, exponente - 1);
        } else {
            return 1 / potencia(base, -exponente);
        }
    }

/*
83. como hago esto: Modifique el programa del ejercicio “Instrucción asistida por computadora” para implementar una librería propia.
en este codigo: public void InstruccionAsistida() { Scanner scanner = new Scanner(System.in); boolean continuar = true; while (continuar) {
int correctas = 0; int incorrectas = 0; for (int i = 0; i < 10; i++) { System.out.print("Pregunta " + (i + 1) + ": ");
String respuesta = scanner.next(); if (esCorrecta(respuesta)) { correctas++; } else { incorrectas++; } }
double porcentajeCorrectas = calcularPorcentaje(correctas); System.out.println("Porcentaje de respuestas correctas: " + porcentajeCorrectas + "%");
if (porcentajeCorrectas < 75) { System.out.println("Por favor pida ayuda adicional a su instructor."); continuar = false; } else {
continuar = preguntarContinuar(scanner); } } scanner.close(); } public boolean esCorrecta(String respuesta) {
Aquí implementas la lógica para determinar si la respuesta es correcta o no // Por ejemplo, compara la respuesta con una cadena que consideres correcta
return respuesta.equalsIgnoreCase("si"); // Cambia esto por la lógica correcta } public double calcularPorcentaje(int correctas) { return (double) correctas / 10 * 100; }
public boolean preguntarContinuar(Scanner scanner) { System.out.print("¿Desea continuar? (s/n): "); String respuesta = scanner.next(); return respuesta.equalsIgnoreCase("s"); }
*/
    public void InstrucciónAsistidaComputadora2(Scanner entrada){

        InstruccionAsistidaLib lib = new InstruccionAsistidaLib(); // Crear una instancia de la librería
        boolean continuar = true;

        while (continuar) {
            int correctas = 0;
            int incorrectas = 0;

            // Obtener las preguntas de la librería
            Map<String, String[]> preguntas = lib.obtenerPreguntas();
            int preguntaNumero = 1;

            for (Map.Entry<String, String[]> entra : preguntas.entrySet()) {
                System.out.print("Pregunta " + preguntaNumero + ": " + entra.getKey() + "\n");
                System.out.println(entra.getValue()[0]);
                System.out.println(entra.getValue()[1]);
                System.out.print("Seleccione la opción correcta (1 o 2): ");
                String respuesta = entrada.nextLine();

                // Verificar si la respuesta es correcta
                if (respuesta.equals("1")) {
                    correctas++;
                } else {
                    incorrectas++;
                }
                preguntaNumero++;
            }

            double porcentajeCorrectas = lib.calcularPorcentaje(correctas); // Usar el método de la librería
            System.out.println("Porcentaje de respuestas correctas: " + porcentajeCorrectas + "%");

            if (porcentajeCorrectas < 75) {
                System.out.println("Por favor pida ayuda adicional a su instructor.");
                continuar = false;
            } else {
                continuar = lib.preguntarContinuar(entrada); // Usar el método de la librería
            }
        }
    }

/*
89. me generas el codigo en java de esto:
Te leo, de verdad: Hacer un programa que pida al usuario un número entero mayor que diez y menor que cien, luego leer
tantos números como el que haya ingresado el usuario entonces muestre en una lista todos los números separados por coma
(el último lleva punto después de él y la letra “y” en lugar de coma antes que él. Y pida al usuario cinco números (almacenados en un solo arreglo)
esos números deben estar entre 0 y el primer número que se le pidió ingresar al usuario y, finalmente mostrar una tabla donde aparezcan estos
cinco números en la primera columna y en la segunda el número de la lista de números en la posición de la primera columna. Así:
*/
    public void TeLeoVerdad(Scanner entrada) {

        // Pedir al usuario un número entero mayor que diez y menor que cien
        int numeroLimite;
        do {
            System.out.print("Ingrese un número entero mayor que diez y menor que cien: ");
            numeroLimite = entrada.nextInt();
        } while (numeroLimite <= 10 || numeroLimite >= 100);

        // Leer tantos números como el que haya ingresado el usuario
        int[] listaNumeros = new int[numeroLimite];
        for (int i = 0; i < numeroLimite; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            listaNumeros[i] = entrada.nextInt();
        }

        // Mostrar la lista de números separados por coma
        System.out.print("Lista de números: ");
        for (int i = 0; i < numeroLimite - 1; i++) {
            int n = numeroLimite - i;
            if(n == 2){
                System.out.println("Y " + listaNumeros[i]);
            }else{
                System.out.print(listaNumeros[i] + ", ");
            }
        }

        // Pedir al usuario cinco números entre 0 y el primer número ingresado
        int[] numerosComparacion = new int[5];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Ingrese el número " + (i + 1) + " entre 0 y " + numeroLimite + ": ");
                numerosComparacion[i] = entrada.nextInt();
            } while (numerosComparacion[i] < 0 || numerosComparacion[i] >= numeroLimite);
        }

        // Mostrar la tabla con los números y su posición en la lista
        System.out.println("\nTabla:");
        System.out.printf("%-10s | %-20s\n", "Número", "Posición en la lista");
        for (int numero : numerosComparacion) {
            int posicion = buscarPosicion(listaNumeros, numero);
            System.out.printf("%-10d | %-20d\n", numero, posicion);
        }
    }

    // Método para buscar la posición de un número en la lista
    private static int buscarPosicion(int[] lista, int numero) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numero) {
                return i + 1;
            }
        }
        return -1;
    }

    /*
    95. me ayuda a generar Vectueliges: Haga un programa que solicite a un usuario un número entre 10 y 100,
    luego cree un vector con esa cantidad de números aleatorios, los presente tal como se crearon, los ordene y los
    presente ordenados de mayor a menor. en java
    */
    public void VectuEliges(Scanner entrada){
        Random random = new Random();

        // Solicitar número al usuario
        int numeroElementos;
        do {
            System.out.print("Ingrese un número entre 10 y 100: ");
            numeroElementos = entrada.nextInt();
        } while (numeroElementos < 10 || numeroElementos > 100);

        // Crear vector y generar números aleatorios
        int[] vector = new int[numeroElementos];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(101);
        }

        // Mostrar vector original
        System.out.println("\nVector original:");
        for (int elemento : vector) {
            System.out.print(elemento + " ");
        }

        // Ordenar vector de mayor a menor
        Arrays.sort(vector);

        // Mostrar vector ordenado
        System.out.println("\nVector ordenado de mayor a menor:");
        for (int elemento : vector) {
            System.out.print(elemento + " ");
        }
    }


    /*
    101. me haces esto:
En lugar de realizar nueve comparaciones en cada pasada, modiﬁque el ordenamiento de burbuja para que realice ocho comparaciones en la
segunda pasada, siete en la tercera, y así en lo sucesivo.
Los datos en el arreglo tal vez se encuentren ya en el orden apropiado, o casi apropiado, así que ¿para qué realizar nueve pasadas,
si basta con menos? Modiﬁque el ordenamiento para comprobar al ﬁnal de cada pasada si se han realizado intercambios. Si no se ha realizado ninguno,
los datos ya deben estar en el orden apropiado, por lo que el programa debe terminar. Si se han realizado intercambios, por lo menos se necesita una
pasada más. en este codigo:
public void burbuja() {
Scanner scanner = new Scanner(System.in);
int[] arreglo = new int[10];
System.out.println("Ingrese los 10 elementos del arreglo:");
for (int i = 0; i < arreglo.length; i++) {
arreglo[i] = scanner.nextInt();
}
ordenarArreglo(arreglo);
System.out.println("Arreglo ordenado:");
imprimirArreglo(arreglo);
System.out.println("¿Desea continuar? (s/n)");
String respuesta = scanner.next();
if (respuesta.equalsIgnoreCase("s")) {
} else {
System.out.println("Adiós!");
}
}
public void ordenarArreglo(int[] arreglo) {
int n = arreglo.length;
boolean swapped;
do {
swapped = false;
for (int i = 0; i < n - 1; i++) {
if (arreglo[i] > arreglo[i + 1]) {
int temp = arreglo[i];
arreglo[i] = arreglo[i + 1];
arreglo[i + 1] = temp;
swapped = true;
}
}
n--;
} while (swapped);
}
public void imprimirArreglo(int[] arreglo) {
for (int i = 0; i < arreglo.length; i++) {
System.out.print(arreglo[i] + " ");
}
System.out.println();
}
    */
    public void OrdenamientoOptimizado(Scanner entrada){
        Random random = new Random();
        int DimensionArreglo;

        System.out.println("Ingrese la dimension del arreglo:");
        DimensionArreglo = entrada.nextInt();

        int[] arreglo = new int[DimensionArreglo];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101);
            System.out.print(arreglo[i] + ", ");
        }

        ordenarArreglo(arreglo);

        System.out.println(" ");
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);

        System.out.println("¿Desea continuar? (s/n)");
        String respuesta = entrada.next();
        if (respuesta.equalsIgnoreCase("s")) {
            // Continuar con otro arreglo
        } else {
            System.out.println("Adiós!");
        }
    }

    public static void ordenarArreglo(int[] arreglo) {
        int n = arreglo.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println();
    }
}



