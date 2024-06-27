import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosAbner {
    private static final int NUM_LANCES = 100;
    private static final int CREDITO_INICIAL = 1000;
    private static final int MIN_APUESTA = 1;
    private static final int NUM_MIN_JUGADAS = 5;
    // Constantes para las especialidades
    private static final String[] ESPECIALIDADES = {"Cirugía general", "Ginecología y obstetricia", "Medicina interna", "Nefrología"};
    // Constantes para los pisos
    private static final String[] PISOS_CARDINALES = {"segundo", "tercero", "cuarto", "quinto", "sexto", "séptimo", "octavo", "noveno", "décimo", "onceavo", "doceavo", "treceavo"};
    // Matriz para representar el hospital
    private static final boolean[][][] habitation = new boolean[ESPECIALIDADES.length][3][10]; // [especialidad][piso][habitacion] (true = ocupada, false = libre)
    private static final List<ExpedientePaciente> expedientes = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    // Function to display the menu and return the selected option
    public static int mostrarMenu(Scanner sc) {
        System.out.println("\nMENÚ PRINCIPAL");
        System.out.println("-------------------");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("4. Opción 4");
        System.out.println("5. Opción 5");
        System.out.println("0. Salir");

        System.out.print("Ingrese su opción: ");
        int opcionElegida = sc.nextInt();

        // Validate input
        while (opcionElegida < 0 || opcionElegida > 5) {
            System.out.println("Opción no válida. Intente nuevamente.");
            System.out.print("Ingrese su opción: ");
            opcionElegida = sc.nextInt();
        }

        return opcionElegida;
    }

    private static String cifrarNumero(int numero) {
        // Extract each digit
        int digito1 = numero / 1000 % 10;
        int digito2 = numero / 100 % 10;
        int digito3 = numero / 10 % 10;
        int digito4 = numero % 10;

        // Encrypt each digit (add 7 and mod 10)
        int digito1Encriptado = (digito1 + 7) % 10;
        int digito2Encriptado = (digito2 + 7) % 10;
        int digito3Encriptado = (digito3 + 7) % 10;
        int digito4Encriptado = (digito4 + 7) % 10;

        // Swap digits (1st with 3rd, 2nd with 4th)
        int numeroCifrado = digito3Encriptado * 1000 + digito2Encriptado * 100 + digito1Encriptado * 10 + digito4Encriptado;

        return "El número cifrado es: " + numeroCifrado;
    }

    private static String descifrarNumero(int numeroCifrado) {
        // Extract each digit
        int digito1Encriptado = numeroCifrado / 1000 % 10;
        int digito2Encriptado = numeroCifrado / 100 % 10;
        int digito3Encriptado = numeroCifrado / 10 % 10;
        int digito4Encriptado = numeroCifrado % 10;

        // Decrypt each digit (subtract 7 and add 10 if negative)
        int digito1 = (digito3Encriptado - 7 + 10) % 10;
        int digito2 = (digito2Encriptado - 7 + 10) % 10;
        int digito3 = (digito1Encriptado - 7 + 10) % 10;
        int digito4 = (digito4Encriptado - 7 + 10) % 10;

        // Swap digits (1st with 3rd, 2nd with 4th)
        int numeroOriginal = digito4 * 1000 + digito2 * 100 + digito1 * 10 + digito3;

        return "El número original es: " + numeroOriginal;
    }

    private static void dibujarTrianguloInvertidoIzquierda(int i) {
    }

    private static void dibujarTrianguloPiramideInvertida(int i) {
    }

    private static void dibujarTrianguloInvertidoDerecha(int i) {
    }

    private static void dibujarTrianguloIzquierda(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void dibujarTrianguloDerecha(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = altura - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void dibujarTrianguloPiramide(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void dibujarRombo(int altura) {
        int espacios = altura - 1;

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            espacios--;
            System.out.println();
        }

        espacios = 1;
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            espacios++;
            System.out.println();
        }
    }

    private static void dibujarCuadradoVacio(int lado) {
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void dibujarCuadradoLleno(int lado) {
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int tirarMoneda(Random random) {
        return random.nextInt(2); // 0 para cara, 1 para cruz
    }

    private static int triplicarPorValor(int valor) {
        return valor * 3;
    }

    private static int triplicarPorReferencia(int cuenta) {
        cuenta *= 3;
        return cuenta;
    }

    private static int hashCode(int i, int[] listaNumeros) {
        return 0;
    }

    // Función para calcular el cuadrado de un número sin usar pow()
    private static int calcularCuadrado(int numero) {
        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            resultado += i;
        }
        return resultado;
    }

    // Función para calcular el cubo de un número sin usar pow()
    private static int calcularCubo(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Función para imprimir una matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static double ingresarApuesta(double credito, Scanner sc) {
        double apuesta;

        do {
            System.out.print("Ingrese su apuesta (entre L1.00 y L" + credito + "): ");
            apuesta = sc.nextDouble();
        } while (apuesta < MIN_APUESTA || apuesta > credito);

        return apuesta;
    }

    private static int lanzarDados(Random random) {
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int sumaDados = dado1 + dado2;

        System.out.println("\n** Lanzamiento de dados: **");
        mostrarDado(dado1);
        mostrarDado(dado2);

        return sumaDados;
    }

    private static int adivinarSuma(int sumaDados, Scanner sc) {
        int resultado;

        do {
            System.out.print("Ingrese la suma que cree que salió (entre 2 y 12): ");
            resultado = sc.nextInt();
        } while (resultado < 2 || resultado > 12);

        return resultado;
    }

    private static boolean determinarGanador(int resultado, double apuesta, double credito) {
        return resultado == lanzarDados(new Random()) && credito >= apuesta;
    }

    private static double actualizarCredito(double credito, double apuesta, boolean gano) {
        if (gano) {
            return credito + apuesta * 1.5;
        } else {
            return credito - apuesta;
        }
    }

    private static void mostrarDados(int sumaDados) {
        for (int i = 1; i <= sumaDados; i++) {
            mostrarDado(i);
        }
    }

    private static void mostrarDado(int numeroDado) {
        String[] lineasDado = new String[5];

        switch (numeroDado) {
            case 1:
                lineasDado[0] = "   +";
                lineasDado[1] = "   |";
                lineasDado[2] = "   o";
                lineasDado[3] = "   |";
                lineasDado[4] = "   +";
                break;
            case 2:
                lineasDado[0] = "   +   +";
                lineasDado[1] = "   |   |";
        }
    }

    // Función para llenar una matriz con números impares aleatorios
    private static void llenarMatrizImparesAleatorios(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numeroImpar;
                do {
                    numeroImpar = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
                } while (numeroImpar % 2 == 0); // Si es par, genera otro hasta que sea impar
                matriz[i][j] = numeroImpar;
            }
        }
    }

    // Función para mostrar una matriz
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void mostrarTablaHabitacionesOcupadas() {
    }

    private static void liberarHabitacion() {
    }

    private static void asignarHabitacion() {
    }

    // Menú principal
    private static void mostrarMenu() {
        System.out.println("\n**Sistema de gestión de habitaciones: Hospital General de Latveria**");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1. Consultar habitaciones libres por especialidad");
        System.out.println("2. Consultar habitaciones por piso");
        System.out.println("3. Asignar habitación");
        System.out.println("4. Liberar habitación");
        System.out.println("5. Mostrar tabla de habitaciones ocupadas");
        System.out.println("0. Salir");
        System.out.print("Ingrese la opción deseada: ");
    }

    // Consultar habitaciones libres por especialidad
    private static void consultarHabitacionesLibresPorEspecialidad(Scanner sc) {
        System.out.print("Ingrese el nombre de la especialidad (en minúscula): ");
        sc.next();

        int indiceEspecialidad = buscarIndiceEspecialidad();
        if (indiceEspecialidad == -1) {
            System.out.println("Especialidad no válida.");
            return;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nPiso " + PISOS_CARDINALES[i] + ":");
            for (int j = 0; j < 10; j++) {
                System.out.print((habitation[indiceEspecialidad][i][j] ? "Ocupada" : "Libre") + "\t");
                if (j % 5 == 4) {
                    System.out.println();
                }
            }
        }
    }

    private static int buscarIndiceEspecialidad() {
        return 0;
    }

    // Consultar habitaciones por piso
    private static void consultarHabitacionesPorPiso(Scanner sc) {
        System.out.print("Ingrese el número del piso (entre 2 y 13): ");
        int piso = sc.nextInt();

        if (piso < 2 || piso > 13) {
            System.out.println("Piso no válido.");
            return;
        }

        for (int i = 0; i < ESPECIALIDADES.length; i++) {
            System.out.println("\n" + ESPECIALIDADES[i] + ":");
            for (int j = 0; j < 10; j++) {
                PrintStream printf = System.out.printf("%snull", habitation[i][piso - 2][j] ? "Ocupada (" + obtenerNumeroExpediente() + ")" : "Libre");
            }
        }
    }

    private static String obtenerNumeroExpediente() {
        return null;
    }

    private static void mostrarExpedientes() {
    }

    private static void mostrarEstadisticasInternosPorEspecialidad() {
    }

    private static void internarPaciente() {
    }

    private static void darAltaPaciente() {
    }

    // Menú principal
    private static void mostrarMenu() {
        System.out.println("\n**Sistema de gestión de expedientes de pacientes**");
        System.out.println("--------------------------------------------------");
        System.out.println("1. Agregar expediente");
        System.out.println("2. Modificar expediente");
        System.out.println("3. Dar de alta paciente");
        System.out.println("4. Internarse en el hospital");
        System.out.println("5. Mostrar estadísticas de pacientes internos por especialidad");
        System.out.println("6. Mostrar todos los expedientes");
        System.out.println("0. Salir");
        System.out.print("Ingrese la opción deseada: ");
    }

    // Agregar expediente
    private static void agregarExpediente() {
        // Crear un nuevo objeto ExpedientePaciente
        ExpedientePaciente expediente = new ExpedientePaciente();

        // Solicitar datos al usuario
        System.out.print("Ingrese el primer nombre: ");
        expediente.setPrimerNombre(sc.nextLine());

        System.out.print("Ingrese el primer apellido: ");
        expediente.setPrimerApellido(sc.nextLine());

        System.out.print("Ingrese el celular (dígitos solamente): ");
        expediente.setCelular(sc.nextLong());

        System.out.print("Ingrese el sexo (M/F): ");
        expediente.setSexo(sc.next().charAt(0));

        System.out.print("Ingrese el peso (en kg): ");
        expediente.setPeso(sc.nextDouble());

        System.out.print("Ingrese la estatura (en cm): ");
        expediente.setEstatura(sc.nextDouble());

        expediente.calcularIMC();

        System.out.print("Ingrese el diagnóstico: ");
        expediente.setDx(sc.nextLine());

        // Agregar el expediente a la lista
        expedientes.add(expediente);

        System.out.println("\nExpediente agregado exitosamente.");
    }

    // Modificar expediente
    private static void modificarExpediente() {
        System.out.print("Ingrese el número de expediente a modificar: ");
        sc.nextInt();

        ExpedientePaciente expediente = buscarExpediente();
        if (expediente == null) {
            System.out.println("Expediente no encontrado.");
            return;
        }

        System.out.println("\nDatos actuales del paciente:");
        mostrarDatosExpediente();

        System.out.print("\n¿Desea modificar alguno de estos datos? (S/N): ");
        String respuesta = sc.next().toUpperCase();
        if (!respuesta.equals("S")) {
            return;
        }

        System.out.print("Ingrese el nuevo celular (dígitos solamente) (o presione Enter para no modificar): ");
        long nuevoCelular = sc.nextLong();
        if (nuevoCelular != 0) {
            expediente.setCelular(nuevoCelular);
        }

        System.out.print("Ingrese la nueva estatura (en cm) (o presione Enter para no modificar): ");{
        }
    }

    private static void mostrarDatosExpediente() {
    }

    private static ExpedientePaciente buscarExpediente() {
        return null;
    }

    /*
    7. Jugando con tres números: Escriba un programa que reciba tres enteros del teclado e imprima la suma, promedi
    o, producto, menor y mayor de esos números.
    El diálogo de la pantalla debe aparecer de la siguiente manera
    */
public void jugandocon3numeros(Scanner entrada) {

    Scanner sc = new Scanner(System.in);

    // Se solicitan los tres números al usuario
    System.out.print("Ingrese el primer número: ");
    double num1 = sc.nextDouble();

    System.out.print("Ingrese el segundo número: ");
    double num2 = sc.nextDouble();

    System.out.print("Ingrese el tercer número: ");
    double num3 = sc.nextDouble();

    // Se calculan la suma, el promedio y el producto
    double suma = num1 + num2 + num3;
    double promedio = suma / 3;
    double producto = num1 * num2 * num3;

    // Se identifican el menor y el mayor número
    double menor = Math.min(num1, Math.min(num2, num3));
    double mayor = Math.max(num1, Math.max(num2, num3));

    // Se muestran los resultados al usuario
    System.out.println("\nSuma: " + suma);
    System.out.println("Promedio: " + promedio);
    System.out.println("Producto: " + producto);
    System.out.println("Menor número: " + menor);
    System.out.println("Mayor número: " + mayor);
}
    /*
    13. Par o impar: Escriba un programa que lea un entero
    y que determine e imprima si es impar o par

    */
    public void ParImpar(Scanner entrada) {
        Scanner sc = new Scanner(System.in);

            // Se solicita el número entero al usuario
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();

            // Se determina si el número es par o impar
            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par");
            } else {
                System.out.println(numero + " es un número impar");
            }
    }
/*
19. Gasto lo que no tengo: Desarrolle una aplicación en JAVA que determine si alguno de los clientes de una tienda de departamentos se ha excedido del límite de crédito en una cuenta. Para cada cliente se tienen los siguientes datos:
a. Número de cuenta (un entero)
b. Saldo al inicio del mes
c. Total de todos los artículos cargados por el cliente en el mes
d. Total de todos los créditos aplicados a la cuenta del cliente en el mes
 e. Límite de crédito permitido.

 */
    public void gastosquenotengo(Scanner entrada) {
        Scanner sc = new Scanner(System.in);

        // Ciclo para procesar clientes
        while (true) {
            System.out.println("\nNuevo cliente:");

            // Se solicitan los datos del cliente
            System.out.print("Número de cuenta: ");
            int numeroCuenta = sc.nextInt();

            System.out.print("Saldo al inicio del mes: ");
            double saldoInicial = sc.nextDouble();

            System.out.print("Total de artículos cargados: ");
            double totalArticulos = sc.nextDouble();

            System.out.print("Total de créditos aplicados: ");
            double totalCreditos = sc.nextDouble();

            System.out.print("Límite de crédito: ");
            double limiteCredito = sc.nextDouble();

            // Se calcula el nuevo saldo
            double nuevoSaldo = saldoInicial + totalArticulos - totalCreditos;

            // Se determina si el cliente ha excedido el límite de crédito
            boolean excedeLimite = nuevoSaldo > limiteCredito;

            // Se muestra el resultado para el cliente actual
            System.out.println("\nCliente " + numeroCuenta + ":");
            System.out.println("Nuevo saldo: " + nuevoSaldo);
            if (excedeLimite) {
                System.out.println("¡Se excedió el límite de su crédito!");
                System.out.println("Límite de crédito: " + limiteCredito);
            } else {
                System.out.println("El cliente no excedió el límite de crédito.");
            }

            // Se pregunta al usuario si desea procesar otro cliente
            System.out.print("\n¿Desea procesar otro cliente? (s/n): ");
            String continuar = sc.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break; // Salir del ciclo si el usuario ingresa algo diferente a "s"
            }
        }

        System.out.println("\nProceso de control de crédito finalizado.");
    }
/*
25. ¿A poco hacen uno v2?:Escriba un programa que lea tres enteros distintos de cero,
y que determine e imprima si podrían ser los lados de un triángulo recto


 */



    public void triangulorecto(Scanner entrada) {
        Scanner sc = new Scanner(System.in);

        // Se solicitan los tres números al usuario
        System.out.print("Ingrese el primer número (distinto de cero): ");
        int num1 = sc.nextInt();
        while (num1 == 0) {
            System.out.print("Error: El número debe ser distinto de cero. Ingrese nuevamente: ");
            num1 = sc.nextInt();
        }

        System.out.print("Ingrese el segundo número (distinto de cero): ");
        int num2 = sc.nextInt();
        while (num2 == 0) {
            System.out.print("Error: El número debe ser distinto de cero. Ingrese nuevamente: ");
            num2 = sc.nextInt();
        }

        System.out.print("Ingrese el tercer número (distinto de cero): ");
        int num3 = sc.nextInt();
        while (num3 == 0) {
            System.out.print("Error: El número debe ser distinto de cero. Ingrese nuevamente: ");
            num3 = sc.nextInt();
        }

        // Se ordenan los números de mayor a menor
        int mayor = Math.max(Math.max(num1, num2), num3);
        int medio = Math.max(Math.min(num1, num2), Math.min(num3, mayor));
        int menor = Math.min(num1, num2);

        // Se verifica si se cumple el teorema de Pitágoras
        boolean esTrianguloRectangulo = (medio * medio) == (mayor * mayor - menor * menor);

        // Se muestra el resultado
        System.out.println("\n¿Los números " + num1 + ", " + num2 + " y " + num3 + " podrían ser los lados de un triángulo rectángulo?");
        if (esTrianguloRectangulo) {
            System.out.println("¡Sí, podrían ser los lados de un triángulo rectángulo!");
        } else {
            System.out.println("No, no podrían ser los lados de un triángulo rectángulo.");
        }
    }
/*
31. No pases de 15: Escriba un programa que utilice una instrucción for para calcular e imprimir
el producto de los enteros impares del 1 al 15


 */
    public void impar(Scanner entrada) {

        int producto = 1;

        for (int numero = 1; numero <= 15; numero++) {

            if (numero % 2 != 0) {

                producto *= numero;
            }
        }


        System.out.println("El producto de los números impares del 1 al 15 es: " + producto);
    }
/*
Día de pago: Una empresa paga a sus empleados como gerentes (quienes reciben un salario semanal fijo),
trabajadores por horas (que reciben un sueldo fi jo por hora para las primeras 40 horas que trabajen y
 “tiempo y medio”, 1.5 veces su sueldo por horas, para las horas extra trabajadas), empleados por comisión
 (que reciben $250 más 5.7 por ciento de sus ventas totales por semana), o trabajadores por piezas (que reciben una
 cantidad fi ja de dinero por cada artículo que producen; cada trabajador por piezas en esta empresa trabaja sólo en un tipo de artículo). Escriba un programa para calcular el sueldo semanal para cada empleado. No necesita saber cuántos empleados hay de antemano. Cada tipo de empleado tiene
  su propio código de pago: los gerentes tienen el código 1, los trabajadores por horas tienen
 el código 2, los trabajadores por comisión tienen el código 3 y los trabajadores por piezas tienen el código
 4. Use una instrucción switch para calcular el sueldo de cada empleado, de acuerdo con el código de pago de cada uno. Dentro del switch, pida al usuario (es decir, el cajero de nóminas) que introduzca los hechos apropiados que su programa necesita para
 calcular el sueldo de cada empleado, de acuerdo con su código de pago


 */
    public void diadepago (Scanner entrada) {
        Scanner sc = new Scanner(System.in);

        // Loop to process multiple employees
        while (true) {
            System.out.print("Ingrese el código de pago del empleado (1: Gerente, 2: Horas, 3: Comisión, 4: Piezas, 0: Salir): ");
            int codigoPago = sc.nextInt();

            if (codigoPago == 0) {
                break; // Exit the loop if code is 0
            }

            switch (codigoPago) {
                case 1: // Gerente (fixed salary)
                    System.out.print("Ingrese el salario semanal del gerente: ");
                    double salarioFijoGerente = sc.nextDouble();
                    System.out.println("El sueldo semanal del gerente es: $" + salarioFijoGerente);
                    break;

                case 2: // Trabajador por horas (hourly wage)
                    System.out.print("Ingrese las horas trabajadas por el empleado: ");
                    int horasTrabajadas = sc.nextInt();

                    System.out.print("Ingrese el salario por hora del empleado: ");
                    double salarioHora = sc.nextDouble();

                    double pagoHorasNormales = horasTrabajadas <= 40 ? horasTrabajadas * salarioHora : 40 * salarioHora;
                    double pagoHorasExtra = (horasTrabajadas - 40) * salarioHora * 1.5;

                    double sueldoTotalHoras = pagoHorasNormales + pagoHorasExtra;
                    System.out.println("El sueldo semanal del trabajador por horas es: $" + sueldoTotalHoras);
                    break;

                case 3: // Trabajador por comisión (commission-based)
                    System.out.print("Ingrese las ventas totales del empleado: ");
                    double ventasTotales = sc.nextDouble();

                    double sueldoBaseComision = 250;
                    double comisionVentas = ventasTotales * 0.057;

                    double sueldoTotalComision = sueldoBaseComision + comisionVentas;
                    System.out.println("El sueldo semanal del trabajador por comisión es: $" + sueldoTotalComision);
                    break;

                case 4: // Trabajador por piezas (piece-rate)
                    System.out.print("Ingrese la cantidad de piezas producidas por el empleado: ");
                    int piezasProducidas = sc.nextInt();

                    System.out.print("Ingrese el pago por pieza del empleado: ");
                    double pagoPieza = sc.nextDouble();

                    double sueldoTotalPiezas = piezasProducidas * pagoPieza;
                    System.out.println("El sueldo semanal del trabajador por piezas es: $" + sueldoTotalPiezas);
                    break;

                default:
                    System.out.println("Código de pago no válido. Intente de nuevo.");
            }
        }
    }
/*
43. Hagamos un menú: Vamos a hacer un programa que muestre un menú llamando a una función que presenta las opciones al usuario y devuelve la opción elegida considere:
a. Mostrar mínimo cinco opciones.
b. Validar la entrada de opciones válidas.
c. No se puede mostrar o validar nada desde el main, todo debe hacerse desde la función.
 */
    public void menuopciones(Scanner entrada) {
        Scanner sc = new Scanner(System.in);

        // Call the menu function and get the selected option
        int opcionElegida = mostrarMenu(sc);

        // Process the selected option
        switch (opcionElegida) {
            case 1:
                System.out.println("Ha elegido la opción 1.");
                break;
            case 2:
                System.out.println("Ha elegido la opción 2.");
                break;
            case 3:
                System.out.println("Ha elegido la opción 3.");
                break;
            case 4:
                System.out.println("Ha elegido la opción 4.");
                break;
            case 5:
                System.out.println("Ha elegido la opción 5.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
/*

49. Cripto-funciones: Tomaremos como base el
ejercicio “Criptografía” de esta guía, vamos ahora a hacer que codificar y decodificar sean funciones.

 */
    public void criptofuncion(Scanner entrada) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elija una operación:");
        System.out.println("1. Cifrar");
        System.out.println("2. Descifrar");
        System.out.print("Ingrese su opción: ");

        int opcion = sc.nextInt();

        while (opcion < 1 || opcion > 2) {
            System.out.println("Opción no válida. Intente nuevamente.");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
        }

        System.out.print("Ingrese el número de cuatro dígitos: ");
        int numero = sc.nextInt();

        while (numero < 1000 || numero > 9999) {
            System.out.println("Error: El número debe ser de cuatro dígitos.");
            System.out.print("Ingrese el número de cuatro dígitos: ");
            numero = sc.nextInt();
        }

        String resultado;
        if (opcion == 1) {
            resultado = cifrarNumero(numero);
        } else {
            resultado = descifrarNumero(numero);
        }

        System.out.println(resultado);
    }
/*

55. El dado está en el aire: Haciendo uso de las clases en JAVA con prestaciones similares a las stdlib y time de C++ vamos a hacer un programa que sirva para, usando funciones, jugar un pequeño juego con dados. Al comenzar la partida el usuario tiene un crédito
 de L. 1000.00 y se le pide ingresar una pequeña apuesta
(de entre 1 y su cantidad de dinero) luego se le explica que se van a lanzar dos datos y el
 tiene que adivinar qué cifra se obtiene al sumar las caras superiores de los dados (de entre 2 y 12) entonces el programa lanza los dados y los muestra en pantalla (si, dibuja dos cuadrados con los puntos correspondientes
 a los valores obtenidos en la tirada) seguido de un mensaje que nos retroalimenta sobre
  si el usuario ha ganado o perdido, si ha ganado se le regresa lo que apostó más
 la mitad de ese valor si pierde no se le dá nada.
 El juego debe parar cuando el usuario se quede sin dinero o, si ya ha jugado al menos cinco (5) veces y no ha perdido todo decida retirarse.
Lanzar los dados, sumar los dados, dibujar dados, cálculo de ganancia serán las funciones obligatorias en el programa. (Si, se puede dibujar un dado sobre otro o en una función uno a la par del otro)

 */
    public void dados (Scanner entrada) {
        // Constantes
        final int NUMERO_SIMULACIONES = 36000; // Número de lanzamientos de dados
        final int MAX_SUMA = 12; // Suma máxima posible (1 + 6)
        final int MIN_SUMA = 2; // Suma mínima posible (1 + 1)

        // Arreglo para almacenar las frecuencias de las sumas
        int[] frecuenciasSumas = new int[MAX_SUMA - MIN_SUMA + 1];

        // Simular lanzamientos de dados
        Random random = new Random();
        for (int i = 0; i < NUMERO_SIMULACIONES; i++) {
            int dado1 = random.nextInt(6) + 1; // Valor del dado 1
            int dado2 = random.nextInt(6) + 1; // Valor del dado 2
            int suma = dado1 + dado2;

            // Incrementar la frecuencia de la suma obtenida
            frecuenciasSumas[suma - MIN_SUMA]++;
        }

        // Imprimir resultados en formato tabular
        System.out.println("\nSuma\tFrecuencia");
        System.out.println("----\t---------");
        for (int suma = MIN_SUMA; suma <= MAX_SUMA; suma++) {
            System.out.println(suma + "\t" + frecuenciasSumas[suma - MIN_SUMA]);
        }
    }
/*
61. Dibujando como se debe: Use técnicas similares a las desarrolladas en los ejercicios “Figuras v2” y
“Alinea ésta” para producir un programa que grafique un amplio rango de figuras (triángulo alineado a la izquierda,
a la derecha, estilo pirámide, rombo, cuadrado vacío, cuadrado lleno, triángulo invertido alineado a la izquierda, triángulo
invertido alineado a la derecha y triángulo estilo pirámide invertida) cada figura es una función distinta.
 */
    public void ejercicio61(Scanner entrada) {
        // Example usage of the shape drawing functions
        System.out.println("Triángulo alineado a la izquierda:");
        dibujarTrianguloIzquierda(5);

        System.out.println("\nTriángulo alineado a la derecha:");
        dibujarTrianguloDerecha(5);

        System.out.println("\nTriángulo estilo pirámide:");
        dibujarTrianguloPiramide(5);

        System.out.println("\nRombo:");
        dibujarRombo(5);

        System.out.println("\nCuadrado vacío:");
        dibujarCuadradoVacio(5);

        System.out.println("\nCuadrado lleno:");
        dibujarCuadradoLleno(5);

        System.out.println("\nTriángulo invertido alineado a la izquierda:");
        dibujarTrianguloInvertidoIzquierda(5);

        System.out.println("\nTriángulo invertido alineado a la derecha:");
        dibujarTrianguloInvertidoDerecha(5);

        System.out.println("\nTriángulo estilo pirámide invertida:");
        dibujarTrianguloPiramideInvertida(5);
    }
/*
67. Toss a coin: Escriba un programa que simule el lanzamiento de monedas. Cada vez que se lance la moneda,
el programa debe imprimir Cara o Cruz. Deje que el programa lance la moneda 100 veces y cuente el número de
veces que aparezca cada uno de los lados de la moneda. Imprima los resultados. El programa debe llamar a un método separado,
llamado tirar, que no reciba argumentos y devuelva 0 en caso de cara y 1 en caso de cruz.
[Nota: si el programa simula en forma realista el lanzamiento de monedas, cada lado de
la moneda debe aparecer aproximadamente la mitad del tiempo].

 */
    public void lanzamientomoneda(Scanner entrada) {
        Random random = new Random();

        int numeroCaras = 0;
        int numeroCruces = 0;

        for (int i = 0; i < NUM_LANCES; i++) {
            int resultadoLanzamiento = tirarMoneda(random);
            if (resultadoLanzamiento == 0) {
                numeroCaras++;
                System.out.println("Cara");
            } else {
                numeroCruces++;
                System.out.println("Cruz");
            }
        }

        System.out.println("\n** Resultados: **");
        System.out.println("Número de caras: " + numeroCaras);
        System.out.println("Número de cruces: " + numeroCruces);
    }
/*

73. Pan comido: Escriba un programa completo en JAVA con las dos funciones alternativas que se especifican a continuación, de las cuales cada una simplemente triplica la variable cuenta definida en main. Después compare y contraste ambos métodos. Estas dos funciones son:
 a. la función triplicarPorValor, que pasa una copia de cuenta por valor, triplica la copia y devuelve el nuevo valor, y
b. la función triplicarPorReferencia, que pasa cuenta por referencia a través de un parámetro por referencia y triplica el valor original de cuenta a través de su alias (es decir, el parámetro por referencia).

 */
    public void pancomido(Scanner entrada) {
        int cuenta = 5;

        int resultadoValor = triplicarPorValor(cuenta);
        System.out.println("Resultado triplicarPorValor: " + resultadoValor); // 15

        int resultadoReferencia = triplicarPorReferencia(cuenta);
        System.out.println("Resultado triplicarPorReferencia: " + resultadoReferencia); // 15

        System.out.println("Valor final de cuenta: " + cuenta); // 5 (sin cambios)
    }
/*

91. Te leo, te pongo atención y te supero: Modifique el programa “Te leo y te pongo atención” para que
 la tabla muestre además las columnas “cuadrado”y “cubo” todos los valores de estas columnas corresponden al cuadrado y a cubo de
cada número en la columna valor y deben ser calculados sin usar la función POW() (usted debe programar esas funciones).

 */
    public void ejercicio91(Scanner entrada) {
        new Scanner(System.in);

        // ... (código para solicitar y validar el número inicial, leer la lista de números y los números clave, igual que antes)

        // Generar y mostrar la tabla
        System.out.println("\nTabla:");
        System.out.println("Número clave\tPosición en la lista\tValor\tCuadrado\tCubo");
        int[] numerosClave = new int[0];
        for (int i = 0; i < numerosClave.length; i++) {
            int[] listaNumeros = new int[0];
            int posicionLista = hashCode(numerosClave[i], listaNumeros);
            int valor = listaNumeros[posicionLista];
            int cuadrado = calcularCuadrado(valor);
            int cubo = calcularCubo(valor);

            System.out.println(numerosClave[i] + "\t\t" + (posicionLista + 1) + "\t" + valor + "\t" + cuadrado + "\t" + cubo);
        }
    }
/*
97. Matriz: Haga un programa que solicite al usuario dos números enteros M y N entre 2 y 5, crear una
matriz MxN y primero inicializarla en cero, mandarla a imprimir, luego sustituir las filas impares por números
aleatorios y mandarla a imprimir, finalmente sustituir
 las columnas pares y mandar a imprimir la matriz en este estado final. (los números aleatorios menores que 80)
 */
    public void matriz(Scanner entrada) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Solicitar dimensiones de la matriz
        int filas;
        do {
            System.out.print("Ingrese el número de filas (entre 2 y 5): ");
            filas = sc.nextInt();
        } while (filas < 2 || filas > 5);

        int columnas;
        do {
            System.out.print("Ingrese el número de columnas (entre 2 y 5): ");
            columnas = sc.nextInt();
        } while (columnas < 2 || columnas > 5);

        // Crear e inicializar matriz en cero
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 0;
            }
        }

        // Imprimir matriz inicial
        System.out.println("\nMatriz inicial:");
        imprimirMatriz(matriz);

        // Sustituir filas impares por números aleatorios
        for (int i = 0; i < filas; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = random.nextInt(80);
                }
            }
        }

        // Imprimir matriz con filas impares modificadas
        System.out.println("\nMatriz con filas impares modificadas:");
        imprimirMatriz(matriz);

        // Sustituir columnas pares por números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j % 2 == 0) {
                    matriz[i][j] = random.nextInt(80);
                }
            }
        }

        // Imprimir matriz final
        System.out.println("\nMatriz final:");
        imprimirMatriz(matriz);
    }
/*
103. Emprendiendo para casinos: Escriba un programa para simular el tiro de dos dados.
El programa debe utilizar rand para tirar el primer dado, y de nuevo para tirar el segundo dado.
 Después debe calcularse la suma de los dos valores. [Nota: cada dado puede mostrar un valor entero del
  1 al 6, por lo que la suma de los valores variará del 2 al 12, siendo 7 la suma más frecuente, mientras
  que 2 y 12 serán las sumas menos frecuentes]. En la figura 7.32 se muestran las 36 posibles combinaciones
  de los dos dados. Su programa debe tirar los dados 36,000 veces. Utilice un arreglo unidimensional para registrar
   el número de veces que aparezca cada una de las posibles sumas. Imprima los resultados en formato tabular.
 Determine además si los totales son razonables
(es decir, hay seis formas de tirar un 7, por lo que aproximadamente una sexta parte de los tiros deben ser 7)
*/
    public void lanzamientodado(Scanner entrada) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double credito = CREDITO_INICIAL;
        int numeroJugadas = 0;

        while (credito > 0 && (numeroJugadas < NUM_MIN_JUGADAS || credito > MIN_APUESTA)) {
            numeroJugadas++;

            System.out.println("\n** Ronda " + numeroJugadas + " **");
            System.out.printf("Crédito disponible: L%.2f\n", credito);

            double apuesta = ingresarApuesta(credito, sc);
            int sumaDados = lanzarDados(random);
            int resultado = adivinarSuma(sumaDados, sc);

            boolean gano = determinarGanador(resultado, apuesta, credito);
            credito = actualizarCredito(credito, apuesta, gano);

            System.out.println("\n** Resultado: **");
            mostrarDados(sumaDados);
            System.out.printf("Su apuesta: L%.2f\n", apuesta);

            if (gano) {
                System.out.println("¡Ha ganado!");
                System.out.printf("Ganancia: L%.2f\n", apuesta * 1.5);
            } else {
                System.out.println("Lo siento, ha perdido.");
            }

            System.out.println("\n** Presione Enter para continuar... **");
            sc.nextLine(); // Consume el caracter de 'Enter'
        }

        System.out.println("\n** Fin del juego. **");
        System.out.printf("Crédito final: L%.2f\n", credito);
    }
/*
109. Maestro en matrices: Pedir al usuario que ingrese un número mayor a 2 y menor a 15,
con ese número crear una matriz cuadrada y llenarla con números
 positivos impares (generados con una función) entonces una vez llena la matriz mostrarla
  (usando una función para eso)
 */
    public void ejercicio109(Scanner entrada) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Solicitar dimensiones de la matriz
        int dimension;
        do {
            System.out.print("Ingrese un número mayor a 2 y menor a 15: ");
            dimension = sc.nextInt();
        } while (dimension <= 2 || dimension >= 15);

        // Crear matriz
        int[][] matriz = new int[dimension][dimension];

        // Llenar matriz con números impares aleatorios
        llenarMatrizImparesAleatorios(matriz, random);

        // Mostrar matriz
        mostrarMatriz(matriz);
    }
/*

115. Sistema de salud de Latveria: El hospital general de Latveria cuenta con las siguientes 4
especialidades:
a. Cirugía general.
b. Ginecología y obstetricia.
c. Medicina interna y
d. Nefrología.
Estas especialidades comparten un edificio y cada una de ellas tiene asignado un tres pisos de esta
forma:
Especialidad Pisos Asignados
Cirugía general 2, 3, 4
Ginecología y
obstetricia
5, 6, 7
Medicina interna 8, 9, 10
Nefrología 11, 12, 13
Además cada uno de los pisos posee diez habitaciones las cuales pueden estar libres u ocupadas.
Se debe hacer un programa para gestionar estas habitaciones con las siguientes opciones:
1. Consultar habitaciones libres por especialidad: El encargado elige la especialidad
y el sistema muestra por cada piso las habitaciones indicando cuales están vacías y
cuáles están ocupadas (no dice quién la ocupa).
2. Consultar habitaciones por piso: Se puede no solo ver el resumen del inciso 1 sino
que se debe programar la opción de poder elegir especialidad seguido de uno de los
tres pisos y entonces mostrar una matriz donde se vea el piso y sus habitaciones,
donde las habitaciones libres estarán vacías pero las ocupadas mostrarán el número
del expediente del paciente que la ocupa.
3. Asignar habitación: Poder en cualquier habitación independiente del piso y la
especialidad asignar un paciente, esto se logra facilitando luego del habitación el
número de expediente del paciente, número conformado por a lo más tres cifras.
Obviamente solo pueden asignarse habitaciones vacías.
4. Liberar habitación: Una vez que el paciente se ha dado de alta es necesario indicar
que la habitación queda libre para poder asignarse.
5. Mostrar tabla de habitaciones ocupadas:
Especialidad | piso | Habitación | Paciente
Solo usar número para las habitaciones, las especialidades saldrán con nombre y los pisos son
números ordinales por lo que deberá aparecer su respectivo cardinal (usar función para obtenerla)
Nota: Debe usar una matriz de tres dimensiones para representar el hospital con sus
especialidades, piso y habitaciones.


 */
    public void hospital(Scanner entrada) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    consultarHabitacionesLibresPorEspecialidad(sc);
                    break;
                case 2:
                    consultarHabitacionesPorPiso(sc);
                    break;
                case 3:
                    asignarHabitacion();
                    break;
                case 4:
                    liberarHabitacion();
                    break;
                case 5:
                    mostrarTablaHabitacionesOcupadas();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

        sc.close();
    }
/*
121. Registro V2: Vamos bien, muy satisfecho con sus avances, vamos a hacer con el ejercicio “Registros” lo que hizo con la clínica para ir mejorando; es decir, agregar expedientes de pacientes, pero este expediente no solo guarda el diagnóstico del peso sino la especialidad que lo está atendiendo y si está o no interno en el hospital, si está interno en que cama de qué habitación de qué piso. Uno puede modificar celular, estatura, peso y ahora:
 1. Si está interno darle de alta, eso significa borrar la información de cama, habitación, piso y especialidad.
2. Si no está interno entonces puede internarse y agregar para ello especialidad, piso, habitación y cama. Ahora las estadísticas muestran pacientes internos por especialidad.

*/
    public void registro(Scanner entrada) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarExpediente();
                    break;
                case 2:
                    modificarExpediente();
                    break;
                case 3:
                    darAltaPaciente();
                    break;
                case 4:
                    internarPaciente();
                    break;
                case 5:
                    mostrarEstadisticasInternosPorEspecialidad();
                    break;
                case 6:
                    mostrarExpedientes();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}































