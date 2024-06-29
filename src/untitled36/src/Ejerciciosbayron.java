import java.io.*;
import java.util.Random;
import java.util.Scanner;

 class EjerciciosBayron {

     /*
      Ejercicio 3 Crear un programa que solicite al usuario dos números, los obtenga y luego imprima la suma
       y la diferencia del primero con el segundo número.
     */
     public void OperacionesBasicas() {
         // Se crea un objeto Scanner para leer la entrada del usuario
         Scanner entrada = new Scanner(System.in);

         // Se solicitan al usuario dos números
         System.out.print("Ingrese el primer número: ");
         float numero1 = entrada.nextFloat();

         System.out.print("Ingrese el segundo número: ");
         float numero2 = entrada.nextFloat();

         // Se calculan la suma y la diferencia
         float suma = numero1 + numero2;
         float diferencia = numero1 - numero2;

         // Se imprimen los resultados
         System.out.println("La suma de los números es: " + suma);
         System.out.println("La diferencia de los números es: " + diferencia);
     }

     /*
     Ejercicio 9 Crear un programa que lea el radio de un círculo como un número entero y que imprima
      su diámetro, circunferencia y área. Utilizar el valor constante 3.14159 para π. Realizar
       todos los cálculos en instrucciones de salida.
     */
     public void Circulo() {
         // Se crea un objeto Scanner para leer la entrada del usuario
         Scanner entrada = new Scanner(System.in);

         // Se solicita al usuario que ingrese el radio del círculo
         System.out.print("Ingrese el radio del círculo (número entero): ");
         int radio = entrada.nextInt();

         // Se calcula el diámetro
         int diametro = 2 * radio;

         // Se calcula la circunferencia
         double pi = 3.14159;
         double circunferencia = 2 * pi * radio;

         // Se calcula el área
         double area = pi * radio * radio;

         // Se imprimen los resultados
         System.out.println("El diámetro del círculo es: " + diametro);
         System.out.println("La circunferencia del círculo es: " + circunferencia);
         System.out.println("El área del círculo es: " + area);

     }

     /*
     Ejercicio #15 Escriba un programa en java que imprima un cuadro, un óvalo,
      una flecha y un diamante como se muestra a continuación
     */
     public void Figuras() {
         imprimirCuadro();
         imprimirOvalo();
         imprimirFlecha();
         imprimirDiamante();
     }

     private static void imprimirCuadro() {
         System.out.println("Cuadro:");
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }

     private static void imprimirOvalo() {
         System.out.println("Óvalo:");
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 9; j++) {
                 int distanciaX = Math.abs(4 - j);
                 int distanciaY = Math.abs(2 - i);
                 if (distanciaX + distanciaY <= 3) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }

     private static void imprimirFlecha() {
         System.out.println("Flecha:");
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 9; j++) {
                 if (i == 0 && j >= 4) {
                     System.out.print("*");
                 } else if (j == 4 && i > 0) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }

     private static void imprimirDiamante() {
         System.out.println("Diamante:");
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 9; j++) {
                 int distanciaX = Math.abs(4 - j);
                 int distanciaY = Math.abs(2 - i);
                 if (distanciaX + distanciaY <= 4 - i) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }

     }

     /*Ejercicio 21 Este programa en Java utiliza un ciclo while para calcular el sueldo bruto
      de cada empleado en una empresa. El programa toma como entrada la información de cada empleado,
       como su nombre, horas trabajadas y tarifa por hora, y calcula el sueldo bruto considerando
        el pago normal para las primeras 40 horas y el pago y medio para las horas extra.
     */
     public void NominaSimple() {
         Scanner entrada = new Scanner(System.in);

         System.out.print("Ingrese el número de empleados: ");
         int numeroEmpleados = entrada.nextInt();

         for (int i = 1; i <= numeroEmpleados; i++) {
             System.out.println("\nEmpleado #" + i);

             System.out.print("Ingrese el nombre del empleado: ");
             String nombre = entrada.next();

             System.out.print("Ingrese las horas trabajadas: ");
             int horasTrabajadas = entrada.nextInt();

             System.out.print("Ingrese la tarifa por hora: ");
             double tarifaHora = entrada.nextDouble();

             double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaHora);

             System.out.println("El sueldo bruto de " + nombre + " es: $" + sueldoBruto);
         }
     }

     private static double calcularSueldoBruto(int horasTrabajadas, double tarifaHora) {
         double sueldoNormal = 40 * tarifaHora;
         double horasExtra = Math.max(0, horasTrabajadas - 40);
         double sueldoExtra = horasExtra * tarifaHora * 1.5;

         return sueldoNormal + sueldoExtra;
     }

     /*
      Ejercicio 27  Desarrollar un programa que utilice un ciclo for para calcular la suma de una secuencia
       de números enteros. El número de valores a sumar se indica al inicio de la secuencia.
     */
     public void SumaSecuenciaEnteros() {
         Scanner sc = new Scanner(System.in);

         // Solicitor al usurious la secuencia de merinos
         System.out.print("Ingress una secuencia de merinos enters (paradise por spacious): ");
         String secuencia = sc.nextLine();

         /* Divider la secuencia en un irregular de strings */
         String[] numerosString = secuencia.split(" ");

         // Converter los strings a enters y oftener la cantidad de valores
         int cantidadValores = Integer.parseInt(numerosString[0]);
         int suma = 0;

         // Summary los valor's utilization un buckle for
         for (int i = 1; i <= cantidadValores; i++) {
             int valor = Integer.parseInt(numerosString[i]);
             suma += valor;
         }

         // Impair el resultant de la suma
         System.out.println("La suma de la secuencia es: " + suma);
     }

     /*
     Ejercicio 33 necesito ayuda para escribir un programa en Java que genere patrones utilizando ciclos for.
     El programa debe imprimir los siguientes patrones por separado, uno debajo del otro, usando ciclos for
     para generarlos. Todos los asteriscos (*) deben imprimirse mediante una sola instrucción de la forma
     System.out.print('*');. Los patrones son: 1) un triángulo rectángulo con base y altura de 10 asteriscos,
     2) un triángulo rectángulo invertido con base y altura de 10 asteriscos, 3) un triángulo rectángulo
     alineado a la derecha con base y altura de 10 asteriscos, 4) un triángulo rectángulo invertido alineado
     a la derecha con base y altura de 10 asteriscos. El programa debe usar ciclos for anidados para generar
     estos patrones y debe combinarlos en un solo programa que los imprima uno debajo del otro. Además,
     si es posible, me gustaría obtener crédito adicional combinando el código de los cuatro patrones
     separados en un solo programa que imprima los cuatro patrones uno al lado del otro, haciendo
     un uso inteligente de los ciclos for anidados. Por favor, proporciona el código en Java que
     cumpla con estos requisitos.
     */
     public void PatronesAsteriscos() {

         class PatronesAsteriscos {

             public static void main(String[] args) {
                 // Patrón triangular rectángulo creciente
                 System.out.println("Patrón triángulo rectángulo creciente:");
                 for (int i = 1; i <= 5; i++) {
                     for (int j = 1; j <= i; j++) {
                         System.out.print('*');
                     }
                     System.out.println();
                 }

                 // Patrón triángulo rectángulo decreciente
                 System.out.println("\nPatrón triángulo rectángulo decreciente:");
                 for (int i = 5; i >= 1; i--) {
                     for (int j = 1; j <= i; j++) {
                         System.out.print('*');
                     }
                     System.out.println();
                 }

                 // Patrón triángulo rectángulo inverter (esquinas superiores e inferiores)
                 System.out.println("\nPatrón triángulo rectángulo invertido:");
                 for (int i = 1; i <= 5; i++) {
                     for (int j = 1; j <= 5 - i; j++) {
                         System.out.print(' ');
                     }
                     for (int j = 1; j <= i; j++) {
                         System.out.print('*');
                     }
                     System.out.println();
                 }

                 // Patrón triángulo rectángulo centrado (con espacios en blanco)
                 System.out.println("\nPatrón triángulo rectángulo centrado:");
                 for (int i = 1; i <= 5; i++) {
                     for (int j = 1; j <= 5 - i; j++) {
                         System.out.print(' ');
                     }
                     for (int j = 1; j <= i; j++) {
                         System.out.print('*');
                     }
                     System.out.println();
                 }

                 // Patrones combinados uno al lado del otro (crédito adicional)
                 System.out.println("\nPatrones combinados:");
                 for (int i = 1; i <= 5; i++) {
                     for (int j = 1; j <= i; j++) {
                         System.out.print('*');
                     }
                     System.out.print(' '); // Separador entre patrones

                     for (int j = 5 - i; j >= 1; j--) {
                         System.out.print('*');
                     }
                     System.out.print(' '); // Separador entre patrones

                     for (int j = 1; j <= 5 - i; j++) {
                         System.out.print(' ');
                     }
                     for (int j = 1; j <= i; j++) {
                         System.out.print('*');
                     }
                     System.out.print(' '); // Separador entre patrones

                     for (int j = i; j >= 1; j--) {
                         System.out.print('*');
                     }
                     System.out.println();
                 }
             }


             /*
             Ejercicio 63 necesito ayuda para escribir dos programas en Java. El primero debe contener
              una función que devuelva el número más pequeño de un conjunto de números proporcionados
               como parámetros. El segundo programa debe incluir una función llamada perfecto que determine
                si un número es un número perfecto, es decir, si la suma de sus divisores, excluyendo
                 el número en sí, es igual al número. Este programa debe usar la función perfecto para
                  encontrar e imprimir todos los números perfectos entre 1 y 1000, mostrando también sus
                   divisores para confirmar que son realmente perfectos. Adicionalmente, el programa debe
                    probar números mucho más grandes que 1000 para evaluar el rendimiento del sistema.
                     Proporcione el código en Java que cumpla con estos requisitos.
             */
             public void NumerosPerfectos() {
                 Scanner scanner = new Scanner(System.in);

                 System.out.print("Ingrese la cantidad de números: ");
                 int cantidad = scanner.nextInt();

                 int[] numeros = new int[cantidad];

                 System.out.println("Ingrese los números:");
                 for (int i = 0; i < cantidad; i++) {
                     numeros[i] = scanner.nextInt();
                 }

                 int minimo = encontrarMinimo(numeros);
                 System.out.println("El número más pequeño es: " + minimo);
             }

             private static int encontrarMinimo(int[] numeros) {
                 int minimo = numeros[0];
                 for (int i = 1; i < numeros.length; i++) {
                     if (numeros[i] < minimo) {
                         minimo = numeros[i];
                     }
                 }
                 return minimo;
             }

             /*
             Ejercicio 69 necesito ayuda para modificar un programa en Java basado en el ejercicio
              "Las computadoras en la educación" para implementar la instrucción asistida por computadora
             (CAI) y evitar la fatiga de los estudiantes variando el diálogo de la computadora.
             El programa debe imprimir diversos comentarios para cada respuesta correcta e incorrecta,
             eligiendo aleatoriamente entre las siguientes opciones para respuestas correctas:
             "¡Muy bien!", "¡Excelente!", "¡Buen trabajo!" y "¡Sigue así!"; y para respuestas incorrectas:
              "No. Por favor intenta de nuevo.", "Incorrecto. Intenta una vez más.", "¡No te rindas!" y "No.
              Sigue intentando.". Use el generador de números aleatorios para seleccionar un número entre
              1 y 4 para cada contestación y utilice una instrucción switch para emitir los comentarios apropiados.
              Proporcione el código en Java que cumpla con estos requisitos.
             */
             public void RandomArithmetic() {
                 final int MAX_ATTEMPTS = 3; // Maximum number of attempts
                 Random random = new Random();
                 Scanner scanner = new Scanner(System.in);

                 int attempts = 0; // Track the number of attempts
                 boolean correctAnswer = false; // Flag to indicate if the answer is correct

                 while (attempts < MAX_ATTEMPTS && !correctAnswer) {
                     int num1 = random.nextInt(100) + 1; // Generate random numbers between 1 and 100
                     int num2 = random.nextInt(100) + 1;
                     int operator = random.nextInt(4) + 1; // 1: +, 2: -, 3: *, 4: /

                     char operationSymbol = getOperatorSymbol(operator);
                     System.out.printf("¿Cuánto es %d %c %d?: ", num1, operationSymbol, num2);
                     int userAnswer = scanner.nextInt();

                     int correctResult = calculateResult(num1, num2, operator);
                     correctAnswer = userAnswer == correctResult;

                     if (correctAnswer) {
                         System.out.println(getRandomCorrectComment(random));
                     } else {
                         System.out.println(getRandomIncorrectComment(random));
                         System.out.printf("Respuesta incorrecta. El resultado correcto es %d.\n", correctResult);
                     }

                     attempts++; // Increment the attempt counter

                     if (attempts < MAX_ATTEMPTS && !correctAnswer) {
                         System.out.print("¿Desea intentar de nuevo? (s/n): ");
                         String continueInput = scanner.next().toLowerCase();
                         if (!continueInput.equals("s")) {
                             break; // Exit the loop if the user doesn't want to continue
                         }
                     }
                 }

                 if (correctAnswer) {
                     System.out.println("¡Felicidades! Has completado el ejercicio correctamente.");
                 } else {
                     System.out.println("Has alcanzado el número máximo de intentos. El ejercicio no se completó.");
                 }

                 scanner.close();
             }

             private static char getOperatorSymbol(int operator) {
                 if (operator == 1) {
                     return '+';
                 } else if (operator == 2) {
                     return '-';
                 } else if (operator == 3) {
                     return '*';
                 } else if (operator == 4) {
                     return '/';
                 }
                 return '?'; // Invalid operator
             }

             private static int calculateResult(int num1, int num2, int operator) {
                 if (operator == 1) {
                     return num1 + num2;
                 } else if (operator == 2) {
                     return num1 - num2;
                 } else if (operator == 3) {
                     return num1 * num2;
                 } else if (operator == 4) {
                     return num1 / num2;
                 }
                 return 0; // Invalid operator
             }

             private static String getRandomCorrectComment(Random random) {
                 int commentIndex = random.nextInt(4) + 1;
                 if (commentIndex == 1) {
                     return "Muy bien!";
                 } else if (commentIndex == 2) {
                     return "¡Excelente!";
                 } else if (commentIndex == 3) {
                     return "¡Buen trabajo!";
                 } else {
                     return "¡Sigue así!";
                 }
             }

             private static String getRandomIncorrectComment(Random random) {
                 int commentIndex = random.nextInt(4) + 1;
                 if (commentIndex == 1) {
                     return "No. Por favor intenta de nuevo.";
                 } else if (commentIndex == 2) {
                     return "Incorrecto. Intenta una vez más.";
                 } else if (commentIndex == 3) {
                     return "No te rindas!";
                 } else {
                     return "No. Sigue intentando.";
                 }

             }

             /*
             Ejercicio 75 necesito ayuda para escribir un programa en Java que, usando la librería Math,
             muestre en forma tabular los grados desde 0° a 360° junto con sus valores de seno, coseno y tangente.
             El programa debe cumplir con las siguientes restricciones: la tabla debe tener columnas de un ancho
              de 15 caracteres, los resultados deben mostrarse con tres cifras decimales, el programa debe hacer
             una pausa cada 50 valores y solicitar que se presione una tecla para continuar, y después
             de cada pausa, los encabezados de las columnas deben volver a aparecer. Proporcione el código
              en Java que cumpla con estos requisitos.
             */
             public void TrigonometricTable() {
                 final double START_ANGLE = 0; // Starting angle in degrees
                 final double END_ANGLE = 360; // Ending angle in degrees
                 final double ANGLE_INCREMENT = 1; // Increment in degrees for each calculation
                 final int BLOCK_SIZE = 50; // Number of results per block
                 final int COLUMN_WIDTH = 15; // Width of each column in characters

                 Scanner scanner = new Scanner(System.in);

                 System.out.printf("%s%s%s\n", formatColumn("Angle (deg)", COLUMN_WIDTH), formatColumn("Sin", COLUMN_WIDTH), formatColumn("Cos", COLUMN_WIDTH), formatColumn("Tan", COLUMN_WIDTH));

                 double angle = START_ANGLE;
                 int count = 0;

                 while (angle <= END_ANGLE) {
                     double sinValue = Math.sin(Math.toRadians(angle));
                     double cosValue = Math.cos(Math.toRadians(angle));
                     double tanValue = Math.tan(Math.toRadians(angle));

                     System.out.printf("%s%s%s%s\n", formatValue(angle, COLUMN_WIDTH), formatValue(sinValue, COLUMN_WIDTH), formatValue(cosValue, COLUMN_WIDTH), formatValue(tanValue, COLUMN_WIDTH));

                     count++;

                     if (count % BLOCK_SIZE == 0) {
                         System.out.print("\nPresione cualquier tecla para continuar...\n");
                         scanner.nextLine();

                         System.out.printf("%s%s%s%s\n", formatColumn("Angle (deg)", COLUMN_WIDTH), formatColumn("Sin", COLUMN_WIDTH), formatColumn("Cos", COLUMN_WIDTH), formatColumn("Tan", COLUMN_WIDTH));
                     }

                     angle += ANGLE_INCREMENT;
                 }

                 scanner.close();
             }

             private static String formatColumn(String text, int width) {
                 return String.format("%-" + width + "s", text);
             }

             private static String formatValue(double value, int width) {
                 return String.format("%-" + width + ".3f", value);
             }
        /*
        87.  Agregando al archivo: USando como base el ejercicio “Imprimiendo en un archivo” vamos ahora a permitir
         agregar varios mensajes, en diferentes líneas, entonces se presentará un menú con las siguientes opciones:
         a.       Mostrar contenido del archivo: MUestra los mensajes dentro del archivo
         b.      Agregar mensaje: Permite agregar un nuevo mensaje.
        */

             public void ArchivoMensajes() {

                 Scanner scanner = new Scanner(System.in);

                 while (true) {
                     System.out.println("\nMenú de Mensajes:");
                     System.out.println("1. Mostrar contenido del archivo");
                     System.out.println("2. Agregar mensaje");
                     System.out.println("3. Salir");

                     System.out.print("Seleccione una opción: ");
                     int opcion = scanner.nextInt();
                     scanner.nextLine(); // Consume remaining newline

                     switch (opcion) {
                         case 1:
                             mostrarContenidoArchivo();
                             break;
                         case 2:
                             agregarMensaje(scanner);
                             break;
                         case 3:
                             System.out.println("Saliendo del programa...");
                             return;
                         default:
                             System.out.println("Opción no válida. Intente nuevamente.");
                     }
                 }
             }

             private static void mostrarContenidoArchivo() {
                 // Implement code to read and display the contents of the file
                 // ...
             }

             private static void agregarMensaje(Scanner scanner) {
                 // Implement code to prompt for and append the message to the file
                 // ...
             }

             // Consider adding functions for other menu options, such as searching or deleting messages


             /* ejercicio # 99 Crea un programa que utilice un arreglo unidimensional para calcular los salarios de vendedores
             basados en una comisión semanal más un salario base.
             Determina cuántos vendedores están en diferentes rangos de salario y grafica estos rangos en barras horizontales.
             */
             public void PagosVendedores() {
                 final int SALARY_BASE = 200;
                 final double COMMISSION_RATE = 0.09;
                 final int NUM_VENDEDORES = 10; // Cambiado a 10 para simplificar la demostración
                 double[] ventas = new double[NUM_VENDEDORES];
                 double[] comisiones = new double[NUM_VENDEDORES];
                 double[] pagosTotales = new double[NUM_VENDEDORES];

                 Scanner scanner = new Scanner(System.in);

                 // Ingreso de ventas y cálculo de pagos
                 for (int i = 0; i < NUM_VENDEDORES; ++i) {
                     System.out.print("Ingrese las ventas del vendedor " + (i + 1) + ": ");
                     ventas[i] = scanner.nextDouble();

                     comisiones[i] = ventas[i] * COMMISSION_RATE;
                     pagosTotales[i] = SALARY_BASE + comisiones[i];
                 }

                 // Mostrar tabla de pagos
                 System.out.println("\nTabla de pagos de los vendedores:");
                 System.out.println("---------------------------------");
                 System.out.println("Vendedor\tVentas\t\tComisión\tTotal a Pagar");
                 System.out.println("---------------------------------");
                 for (int i = 0; i < NUM_VENDEDORES; ++i) {
                     System.out.printf("%d\t\t$%.2f\t$%.2f\t\t$%.2f\n", (i + 1), ventas[i], comisiones[i], pagosTotales[i]);
                 }
             }
         }
     }


            /*ejercicio # 117 "En este ejercicio en Java, se define una clase Persona con campos para primerNombre,
               a kilogramos, convertir estatura de centímetros a metros, calcular el IMC y asignar un diagnóstico basado
          en el IMC. Se crean dos instancias de Persona, se inicializan y se leen los datos de una persona con
         estatura en centímetros y peso en libras. Se calcula el IMC y se asigna un diagnóstico. Se imprime
         la información de la primera persona. Luego, se copia la información de la primera persona a la
         segunda. Si el diagnóstico no es 'Normopeso', se ajusta el IMC a 22.9 y el peso correspondiente,
         y se imprime una tabla comparativa antes y después de los ajustes."
             */
         public void Persona () {
             class Persona {
                 String primerNombre;
                 String primerApellido;
                 String celular;
                 int sexo; // 1 para masculino, 2 para femenino
                 double peso; // en kilogramos
                 double estatura; // en metros
                 double IMC;
                 String dx;

                 public Persona() {
                     this.primerNombre = "";
                     this.primerApellido = "";
                     this.celular = "";
                     this.sexo = 0;
                     this.peso = 0.0;
                     this.estatura = 0.0;
                     this.IMC = 0.0;
                     this.dx = "";
                 }
             }

             class Main {
                 public static void main(String[] args) {
                     Scanner scanner = new Scanner(System.in);

                     Persona persona1 = new Persona();
                     Persona persona2 = new Persona();

                     leerDatos(persona1, scanner);
                     imprimirPersona(persona1);

                     System.out.print("¿Desea convertir el peso a libras? (s/n): ");
                     if (scanner.next().equalsIgnoreCase("s")) {
                         System.out.printf("Peso en libras: %.2f lbs%n", kilogramosALibras(persona1.peso));
                     }

                     System.out.print("¿Desea convertir la estatura a centimetros? (s/n): ");
                     if (scanner.next().equalsIgnoreCase("s")) {
                         System.out.printf("Estatura en centimetros: %.2f cm%n", metrosACentimetros(persona1.estatura));
                     }

                     copiarPersona(persona2, persona1);
                     imprimirComparacion(persona1, persona2);

                     scanner.close();
                 }

                 public static void leerDatos(Persona p, Scanner scanner) {
                     System.out.print("Ingrese el primer nombre: ");
                     p.primerNombre = scanner.next();
                     System.out.print("Ingrese el primer apellido: ");
                     p.primerApellido = scanner.next();
                     System.out.print("Ingrese el celular: ");
                     p.celular = scanner.next();
                     System.out.print("Ingrese el sexo (1 para masculino, 2 para femenino): ");
                     p.sexo = scanner.nextInt();

                     System.out.print("Ingrese el peso en kilogramos: ");
                     p.peso = scanner.nextDouble();
                     System.out.print("Ingrese la estatura en centimetros: ");
                     double estaturaCm = scanner.nextDouble();
                     p.estatura = centimetrosAMetros(estaturaCm);

                     p.IMC = calcularIMC(p.peso, p.estatura);
                     asignarDx(p);
                 }

                 public static double librasAKilogramos(double libras) {
                     return libras * 0.453592;
                 }

                 public static double kilogramosALibras(double kilogramos) {
                     return kilogramos / 0.453592;
                 }

                 public static double centimetrosAMetros(double centimetros) {
                     return centimetros / 100.0;
                 }

                 public static double metrosACentimetros(double metros) {
                     return metros * 100.0;
                 }

                 public static double calcularIMC(double peso, double estatura) {
                     return peso / (estatura * estatura);
                 }

                 public static void asignarDx(Persona p) {
                     if (p.IMC < 18.5) {
                         p.dx = "Bajo peso";
                     } else if (p.IMC < 24.9) {
                         p.dx = "Normopeso";
                     } else if (p.IMC < 29.9) {
                         p.dx = "Sobrepeso";
                     } else {
                         p.dx = "Obesidad";
                     }
                 }

                 public static void imprimirPersona(Persona p) {
                     System.out.println("Nombre: " + p.primerNombre + " " + p.primerApellido);
                     System.out.println("Celular: " + p.celular);
                     System.out.println("Sexo: " + (p.sexo == 1 ? "Masculino" : "Femenino"));
                     System.out.println("Peso: " + p.peso + " kg");
                     System.out.println("Estatura: " + p.estatura + " m");
                     System.out.println("IMC: " + p.IMC);
                     System.out.println("Diagnostico: " + p.dx);
                 }

                 public static void copiarPersona(Persona destino, Persona origen) {
                     destino.primerNombre = origen.primerNombre;
                     destino.primerApellido = origen.primerApellido;
                     destino.celular = origen.celular;
                     destino.sexo = origen.sexo;
                     destino.peso = origen.peso;
                     destino.estatura = origen.estatura;
                     destino.IMC = origen.IMC;
                     destino.dx = origen.dx;

                     if (!origen.dx.equals("Normopeso")) {
                         destino.IMC = 22.9;
                         destino.peso = 22.9 * (destino.estatura * destino.estatura);
                         asignarDx(destino);
                     }
                 }

                 public static void imprimirComparacion(Persona p1, Persona p2) {
                     System.out.println("Comparacion de Personas");
                     System.out.println("------------------------");
                     System.out.println("Nombre: " + p1.primerNombre + " " + p1.primerApellido);
                     System.out.println("Celular: " + p1.celular);
                     System.out.println("Sexo: " + (p1.sexo == 1 ? "Masculino" : "Femenino"));
                     System.out.println("Peso (Antes): " + p1.peso + " kg, Peso (Ahora): " + p2.peso + " kg");
                     System.out.println("Estatura: " + p1.estatura + " m");
                     System.out.println("IMC (Antes): " + p1.IMC + ", IMC (Ahora): " + p2.IMC);
                     System.out.println("Diagnostico (Antes): " + p1.dx + ", Diagnostico (Ahora): " + p2.dx);
                 }
             }
         }
     }


































