import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Bayron {
// Ejercicio 3 Crear un programa que solicite al usuario dos números, los obtenga y luego imprima la suma y la diferencia del primero con el segundo número.


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




// Ejercicio 9 Crear un programa que lea el radio de un círculo como un número entero y que imprima su diámetro, circunferencia y área. Utilizar el valor constante 3.14159 para π. Realizar todos los cálculos en instrucciones de salida.


            public void  círculo {
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




// Ejercicio 15 Desarrollar un programa para generar e imprimir en la consola cuatro figuras utilizando caracteres ASCII (*): un cuadro, un óvalo, una flecha apuntando a la derecha y un diamante.
    {

            public void  paintComponent(Graphics g) {
                super.paintComponent(g);
                this.setBackground(Color.WHITE);

                // Draw square
                g.setColor(Color.RED);
                g.fillRect(50, 50, 100, 100);

                // Draw oval
                g.setColor(Color.GREEN);
                g.fillOval(200, 50, 100, 100);

                // Draw arrow
                g.setColor(Color.BLUE);
                g.drawLine(350, 100, 400, 50);
                g.drawLine(350, 100, 400, 150);
                g.drawLine(400, 50, 400, 150);

                // Draw diamond
                g.setColor(Color.MAGENTA);
                g.drawLine(500, 100, 550, 50);
                g.drawLine(550, 50, 600, 100);
                g.drawLine(600, 100, 550, 150);
                g.drawLine(550, 150, 500, 100);
            }

            public static void main(String[] args) {
                Shapes shapes = new Shapes();
                JFrame frame = new JFrame();
                frame.setSize(700, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(shapes);
                frame.setVisible(true);
            }


//  Ejercicio 21 Este programa en Java utiliza un ciclo while para calcular el sueldo bruto de cada empleado en una empresa. El programa toma como entrada la información de cada empleado, como su nombre, horas trabajadas y tarifa por hora, y calcula el sueldo bruto considerando el pago normal para las primeras 40 horas y el pago y medio para las horas extra.



            public void NominaSimple () {
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
        }


// Ejercicio 27  Desarrollar un programa que utilice un ciclo for para calcular la suma de una secuencia de números enteros. El número de valores a sumar se indica al inicio de la secuencia.




            public void SumaSecuenciaEnteros () {
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
        }


// Ejercicio 33 necesito ayuda para escribir un programa en Java que genere patrones utilizando ciclos for. El programa debe imprimir los siguientes patrones por separado, uno debajo del otro, usando ciclos for para generarlos. Todos los asteriscos (*) deben imprimirse mediante una sola instrucción de la forma System.out.print('*');. Los patrones son: 1) un triángulo rectángulo con base y altura de 10 asteriscos, 2) un triángulo rectángulo invertido con base y altura de 10 asteriscos, 3) un triángulo rectángulo alineado a la derecha con base y altura de 10 asteriscos, 4) un triángulo rectángulo invertido alineado a la derecha con base y altura de 10 asteriscos. El programa debe usar ciclos for anidados para generar estos patrones y debe combinarlos en un solo programa que los imprima uno debajo del otro. Además, si es posible, me gustaría obtener crédito adicional combinando el código de los cuatro patrones separados en un solo programa que imprima los cuatro patrones uno al lado del otro, haciendo un uso inteligente de los ciclos for anidados. Por favor, proporciona el código en Java que cumpla con estos requisitos.

            public void PatronesAsteriscos () {
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




//  Ejercicio 39 necesito ayuda para modificar un programa en Java que lea un número impar en el rango de 1 a 19, especificando el número de filas en un rombo, y luego muestre un rombo del tamaño apropiado. El programa debe asegurarse de que el número de filas sea impar y dentro del rango permitido antes de imprimir el rombo. Proporcione el código en Java que cumpla con estos requisitos.


            public void RomboAsteriscos () {
                Scanner sc = new Scanner(System.in);

                // Solicitar el número de filas
                System.out.print("Ingrese el número de filas impar entre 1 y 19: ");
                int filas;

                do {
                    filas = sc.nextInt();
                } while (!validarNumeroImpar(filas) || filas < 1 || filas > 19);

                // Calcular el tamaño del rombo (número impar)
                int tamano = filas * 2 - 1;

                // Generar el rombo
                generarRombo(tamano, filas);
            }

            private static boolean validarNumeroImpar(int numero) {
                return numero % 2 != 0;
            }

            private static void generarRombo(int tamano, int filas) {
                int mitad = tamano / 2;

                // Filas superiores
                for (int i = 1; i <= filas; i++) {
                    for (int j = 1; j <= mitad - i + 1; j++) {
                        System.out.print(' ');
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }

                // Fila central
                for (int i = 1; i <= tamano; i++) {
                    System.out.print('*');
                }
                System.out.println();

                // Filas inferiores (en orden inverso a las superiores)
                for (int i = filas; i >= 1; i--) {
                    for (int j = 1; j <= mitad - i + 1; j++) {
                        System.out.print(' ');
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }
            }
        }

//  Ejercicio 45 necesito ayuda para escribir un programa en Java que pida dos números y eleve el primer número al segundo considerando los casos en que el segundo número sea positivo, negativo o cero, sin usar la librería math.h. Por favor, proporcione el código en Java que cumpla con estos requisitos.


            public void ExponenciacionSinMathPow () {
                Scanner sc = new Scanner(System.in);

                // Solicitar base y exponente al usuario
                System.out.print("Ingrese la base: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese el exponente: ");
                int exponente = sc.nextInt();

                // Calcular la potencia utilizando la función exponenciar
                double resultado = exponenciar(base, exponente);

                // Mostrar el resultado
                System.out.println("Resultado: " + resultado);
            }

            private static double exponenciar(double base, int exponente) {
                if (exponente == 0) {
                    return 1; // Cualquier número elevado a 0 es 1
                } else if (exponente > 0) {
                    double potencia = 1; // Variable para almacenar la potencia acumulada
                    for (int i = 1; i <= exponente; i++) {
                        potencia *= base; // Multiplicar la potencia por la base
                    }
                    return potencia;
                } else {
                    // Para potencias negativas, invertimos la base y cambiamos el signo del exponente
                    return 1 / exponenciar(1 / base, -exponente);
                }
            }
        }


//  Ejercicio 51 necesito ayuda para escribir un programa en Java que permita al usuario elegir entre las siguientes figuras: esfera, cubo, pirámide, cilindro y paralelogramo. Dependiendo de la figura elegida, el programa debe solicitar la información necesaria para calcular su área y perímetro, mostrar el nombre de la figura seleccionada, dibujar una cara en 2D, y presentar las entradas del usuario junto con los resultados obtenidos. Por favor, proporcione el código en Java que cumpla con estos requisitos.




            public void CalculadoraGeometricaFigura () {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Por favor, elige una figura: Esfera, Cubo, Pirámide, Cilindro, Paralelogramo");
                String figura = scanner.nextLine();

                switch (figura.toLowerCase()) {
                    case "esfera":
                        calcularEsfera(scanner);
                        break;
                    case "cubo":
                        calcularCubo(scanner);
                        break;
                    case "pirámide":
                        calcularPiramide(scanner);
                        break;
                    case "cilindro":
                        calcularCilindro(scanner);
                        break;
                    case "paralelogramo":
                        calcularParalelogramo(scanner);
                        break;
                    default:
                        System.out.println("Figura desconocida.");
                }

                scanner.close(); // Cerrar el scanner al finalizar su uso
            }

            public static void calcularEsfera(Scanner scanner) {
                System.out.print("Ingrese el radio de la esfera: ");
                double radio = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                Sphere esfera = new Sphere(radio);
                esfera.draw2DRepresentation();

                double area = esfera.getArea();

                System.out.println("\nEsfera:");
                System.out.println("Radio: " + radio);
                System.out.println("Área: " + area);
            }

            public static void calcularCubo(Scanner scanner) {
                System.out.print("Ingrese el lado del cubo: ");
                double lado = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                Cube cubo = new Cube(lado);
                cubo.draw2DRepresentation();

                double area = cubo.getArea();

                System.out.println("\nCubo:");
                System.out.println("Lado: " + lado);
                System.out.println("Área: " + area);
            }

            public static void calcularPiramide(Scanner scanner) {
                System.out.print("Ingrese el lado de la base de la pirámide: ");
                double ladoBase = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                System.out.print("Ingrese la altura de la pirámide: ");
                double altura = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                Pyramid piramide = new Pyramid(ladoBase, altura);
                piramide.draw2DRepresentation();

                double areaTotal = piramide.getArea();

                System.out.println("\nPirámide:");
                System.out.println("Lado de la base: " + ladoBase);
                System.out.println("Altura: " + altura);
                System.out.println("Área total: " + areaTotal);
            }

            public static void calcularCilindro(Scanner scanner) {
                System.out.print("Ingrese el radio del cilindro: ");
                double radio = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                System.out.print("Ingrese la altura del cilindro: ");
                double altura = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                Cylinder cilindro = new Cylinder(radio, altura);
                cilindro.draw2DRepresentation();

                double areaTotal = cilindro.getArea();

                System.out.println("\nCilindro:");
                System.out.println("Radio: " + radio);
                System.out.println("Altura: " + altura);
                System.out.println("Área total: " + areaTotal);
            }

            public static void calcularParalelogramo(Scanner scanner) {
                System.out.print("Ingrese la base del paralelogramo: ");
                double base = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                System.out.print("Ingrese la altura del paralelogramo: ");
                double altura = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                Parallelogram paralelogramo = new Parallelogram(base, altura);
                paralelogramo.draw2DRepresentation();

                double area = paralelogramo.getArea();

                System.out.println("\nParalelogramo:");
                System.out.println("Base: " + base);
                System.out.println("Altura: " + altura);
                System.out.println("Área: " + area);
            }
        }

        class Sphere {
            private final double radius;

            public Sphere(double radius) {
                this.radius = radius;
            }

            public double getArea() {
                return 4 * Math.PI * radius * radius;
            }

            public void draw2DRepresentation() {
                // Implementación del dibujo en 2D para la esfera
                System.out.println("  *  ");
                System.out.println("***");
                System.out.println("  *  ");
            }
        }

        class Cube {
            private final double sideLength;

            public Cube(double sideLength) {
                this.sideLength = sideLength;
            }

            public double getArea() {
                return 6 * sideLength * sideLength;
            }

            public void draw2DRepresentation() {
                // Implementación del dibujo en 2D para el cubo
                System.out.println(" _______ ");
                System.out.println("/       /|");
                System.out.println("|      | |");
                System.out.println("|______|/");
            }
        }

        class Pyramid {
            private final double baseLength;
            private final double height;

            public Pyramid(double baseLength, double height) {
                this.baseLength = baseLength;
                this.height = height;
            }

            public double getArea() {
                double baseArea = baseLength * baseLength;
                double lateralArea = 4 * (baseLength * height / 2);
                return baseArea + lateralArea;
            }

            public void draw2DRepresentation() {
                // Implementación del dibujo en 2D para la pirámide
                System.out.println("   /\\   ");
                System.out.println("  /  \\  ");
                System.out.println(" /    \\ ");
                System.out.println("/______\\");
            }
        }

        class Cylinder {
            private final double radius;
            private final double height;

            public Cylinder(double radius, double height) {
                this.radius = radius;
                this.height = height;
            }

            public double getArea() {
                double baseArea = Math.PI * radius * radius;
                double lateralArea = 2 * Math.PI * radius * height;
                return 2 * baseArea + lateralArea;
            }

            public void draw2DRepresentation() {
                // Implementación del dibujo en 2D para el cilindro
                System.out.println(" _____ ");
                System.out.println("/     \\");
                System.out.println("|     |");
                System.out.println("|     |");
                System.out.println("|     |");
                System.out.println("\\_____/ ");
            }
        }

        class Parallelogram {
            private final double baseLength;
            private final double height;

            public Parallelogram(double baseLength, double height) {
                this.baseLength = baseLength;
                this.height = height;
            }

            public double getArea() {
                return baseLength * height;
            }

            public void draw2DRepresentation() {
                // Implementación del dibujo en 2D para el paralelogramo
                System.out.println("  /\\ ");
                System.out.println(" /  \\ ");
                System.out.println("/____\\");
            }
        }

// Ejercicio 57 necesito ayuda para escribir un programa en Java que, usando la librería math y su función sqrt, pida la longitud de ambos lados de un triángulo rectángulo y calcule la hipotenusa. Las funciones para elevar números al cuadrado y obtener la hipotenusa deben ser programadas manualmente. Proporcione el código en Java que cumpla con estos requisitos.




            public  void HypotenuseCalculator  () {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese la longitud del primer lado: ");
                double firstLegLength = scanner.nextDouble();

                validateInput(firstLegLength, "primer lado");

                System.out.print("Ingrese la longitud del segundo lado: ");
                double secondLegLength = scanner.nextDouble();

                validateInput(secondLegLength, "segundo lado");

                double hypotenuse = calculateHypotenuse(firstLegLength, secondLegLength);
                System.out.printf("La longitud de la hipotenusa es: %.2f\n", hypotenuse);

                scanner.close();
            }

            private static void validateInput(double value, String legName) {
                if (value <= 0) {
                    System.out.println("Error: Ingrese una longitud válida (número positivo) para el " + legName);
                    System.exit(1); // Exit the program if invalid input
                }


            private static double calculateHypotenuse(double firstLegLength, double secondLegLength) {
                return Math.sqrt(firstLegLength * firstLegLength + secondLegLength * secondLegLength);





//Ejercicio 63 necesito ayuda para escribir dos programas en Java. El primero debe contener una función que devuelva el número más pequeño de un conjunto de números proporcionados como parámetros. El segundo programa debe incluir una función llamada perfecto que determine si un número es un número perfecto, es decir, si la suma de sus divisores, excluyendo el número en sí, es igual al número. Este programa debe usar la función perfecto para encontrar e imprimir todos los números perfectos entre 1 y 1000, mostrando también sus divisores para confirmar que son realmente perfectos. Adicionalmente, el programa debe probar números mucho más grandes que 1000 para evaluar el rendimiento del sistema. Proporcione el código en Java que cumpla con estos requisitos.


            // Función para verificar si un número es perfecto
            public void NumerosPerfectos () {
                int sumaDivisores = 0;
                for (int i = 1; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        sumaDivisores += i;
                    }
                }
                return sumaDivisores == numero;
            }

            public static void main(String[] args) {
                System.out.println("Números perfectos entre 1 y 1000:");

                for (int num = 1; num <= 1000; num++) {
                    if (perfecto(num)) {
                        System.out.print(num + " es un número perfecto. Divisores: ");
                        // Imprimir los divisores del número perfecto
                        for (int i = 1; i <= num / 2; i++) {
                            if (num % i == 0) {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
        }


//Ejercicio 69 necesito ayuda para modificar un programa en Java basado en el ejercicio "Las computadoras en la educación" para implementar la instrucción asistida por computadora (CAI) y evitar la fatiga de los estudiantes variando el diálogo de la computadora. El programa debe imprimir diversos comentarios para cada respuesta correcta e incorrecta, eligiendo aleatoriamente entre las siguientes opciones para respuestas correctas: "¡Muy bien!", "¡Excelente!", "¡Buen trabajo!" y "¡Sigue así!"; y para respuestas incorrectas: "No. Por favor intenta de nuevo.", "Incorrecto. Intenta una vez más.", "¡No te rindas!" y "No. Sigue intentando.". Use el generador de números aleatorios para seleccionar un número entre 1 y 4 para cada contestación y utilice una instrucción switch para emitir los comentarios apropiados. Proporcione el código en Java que cumpla con estos requisitos.




            private static final int MAX_ATTEMPTS = 3; // Maximum number of attempts

            public void RandomArithmetic () {
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
        }


//Ejercicio 75 necesito ayuda para escribir un programa en Java que, usando la librería Math, muestre en forma tabular los grados desde 0° a 360° junto con sus valores de seno, coseno y tangente. El programa debe cumplir con las siguientes restricciones: la tabla debe tener columnas de un ancho de 15 caracteres, los resultados deben mostrarse con tres cifras decimales, el programa debe hacer una pausa cada 50 valores y solicitar que se presione una tecla para continuar, y después de cada pausa, los encabezados de las columnas deben volver a aparecer. Proporcione el código en Java que cumpla con estos requisitos.



            private static final double START_ANGLE = 0; // Starting angle in degrees
            private static final double END_ANGLE = 360; // Ending angle in degrees
            private static final double ANGLE_INCREMENT = 1; // Increment in degrees for each calculation
            private static final int BLOCK_SIZE = 50; // Number of results per block
            private static final int COLUMN_WIDTH = 15; // Width of each column in characters

            public void TrigonometricTable () {
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


//ejercicio #81  Mejora el programa anterior para incluir gráficas de barras horizontales que representen los totales de vendedores
// en cada rango de salario utilizando iomanip para controlar el formato
        class MyLibrary

            // Validar la entrada del usuario (número X)
            public int validarNumeroEntero(int min, int max, String mensaje) {
                Scanner sc = new Scanner(System.in);
                int numero = 0;
                while (true) {
                    try {
                        System.out.print(mensaje);
                        numero = sc.nextInt();
                        if (numero >= min && numero <= max) {
                            break;
                        } else {
                            System.out.println("Error: El número debe estar entre " + min + " y " + max + ".");
                        }
                    } catch (InputMismatchException e) {
                        sc.next(); // Limpiar la entrada incorrecta
                        System.out.println("Error: Debe ingresar un número entero.");
                    }
                }
                return numero;
            }

            // Validar la entrada del usuario (caracter Y)
            public char validarCaracter(String mensaje) {
                Scanner sc = new Scanner(System.in);
                System.out.print(mensaje);
                return sc.next().charAt(0);
            }

            // Imprimir una línea con un carácter específico
            public void imprimirLinea(char caracter, int cantidad) {
                for (int i = 0; i < cantidad; i++) {
                    System.out.print(caracter + " ");
                }
                System.out.println();
            }

            // Imprimir líneas con caracteres aleatorios
            public int imprimirLineasAleatorias(int numeroLineasX, char caracterY, Random random) {
                int totalCaracteres = 0;

                for (int i = 0; i < numeroLineasX; i++) {
                    int cantidadCaracteresAleatorios = random.nextInt(15) + 1; // Entre 1 y 15
                    imprimirLinea(caracterY, cantidadCaracteresAleatorios);
                    totalCaracteres += cantidadCaracteresAleatorios;
                }

                return totalCaracteres;
            }

            // Imprimir líneas con un número fijo de caracteres
            public void imprimirLineasFijas(int numeroLineasX, char caracterY, int cantidad) {
                for (int i = 0; i < numeroLineasX; i++) {
                    imprimirLinea(caracterY, cantidad);
                }
            }
        }




// 87.  Agregando al archivo: USando como base el ejercicio “Imprimiendo en un archivo” vamos ahora a permitir agregar varios mensajes, en diferentes líneas, entonces se presentará un menú con las siguientes opciones:
// a.       Mostrar contenido del archivo: MUestra los mensajes dentro del archivo
// b.      Agregar mensaje: Permite agregar un nuevo mensaje.

        class ArchivoMensajes {

            private static final String NOMBRE_ARCHIVO_POR_DEFECTO = "mensajes.txt";

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    switch (opcion) {
                        case 1:
                            mostrarContenidoArchivo();
                            break;
                        case 2:
                            agregarMensaje(scanner);
                            break;
                        case 0:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                } while (opcion != 0);
            }

            private static void mostrarMenu() {
                System.out.println("\nMENÚ DE ARCHIVO DE MENSAJES");
                System.out.println("-------------------------");
                System.out.println("1. Mostrar contenido del archivo");
                System.out.println("2. Agregar mensaje");
                System.out.println("0. Salir");
                System.out.print("Ingrese la opción deseada: ");
            }

            private static void mostrarContenidoArchivo() {
                String nombreArchivo = NOMBRE_ARCHIVO_POR_DEFECTO;

                try (FileReader fileReader = new FileReader(nombreArchivo);
                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    String linea;
                    while ((linea = bufferedReader.readLine()) != null) {
                        System.out.println(linea);
                    }
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo: " + e.getMessage());
                }
            }

            private static void agregarMensaje(Scanner scanner) {
                String mensaje;
                String nombreArchivo = NOMBRE_ARCHIVO_POR_DEFECTO;

                System.out.print("Ingrese el mensaje a agregar: ");
                mensaje = scanner.nextLine();

                try (FileWriter fileWriter = new FileWriter(nombreArchivo, true);
                     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                    bufferedWriter.write(mensaje + "\n"); // Agregar salto de línea al final
                    System.out.println("Mensaje agregado exitosamente al archivo.");
                } catch (IOException e) {
                    System.out.println("Error al escribir en el archivo: " + e.getMessage());
                }
            }
        }



// ejercicio # 99 Crea un programa que utilice un arreglo unidimensional para calcular los salarios de vendedores
// basados en una comisión semanal más un salario base.
//Determina cuántos vendedores están en diferentes rangos de salario y grafica estos rangos en barras horizontales.
        class PagosVendedores {

            public static void main(String[] args) {
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


// ejercicio # 105 "En este ejercicio se realizan varias operaciones con matrices en Java. Primero, se crean dos matrices cuadradas del mismo orden. Ambas matrices se llenan con números aleatorios y se muestran en pantalla, seguido por la presentación de su suma. Luego, se reinician las matrices a cero y se llena la primera con números aleatorios, mientras que la segunda se convierte en la transpuesta de la primera. Finalmente, las matrices se reinician nuevamente a cero y se llena la primera con números impares, mientras que la segunda se llena con los mismos números pero cada uno reducido en una unidad."
        class Matrices {

            private static final int MAX = 10;


            public static void main(String[] args) {
                int filas = 10; // Adjust rows and columns as needed
                int columnas = 10;

                int[][] matriz = new int[filas][columnas];

                inicializarMatriz(matriz, filas, columnas);
                rellenarMatrizAleatorios(matriz, filas, columnas);

                System.out.println("Matriz original:");
                imprimirMatriz(matriz, filas, columnas);

                System.out.println("\nDiagonal principal:");
                imprimirDiagonalPrincipal(matriz, filas, columnas);

                System.out.println("\nDiagonales (principal y secundaria):");
                imprimirDiagonales(matriz, filas, columnas);

                System.out.println("\nElementos no diagonales:");
                imprimirNoDiagonales(matriz, filas, columnas);
            }

            private static void inicializarMatriz(int[][] matriz, int filas, int columnas) {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matriz[i][j] = 0;
                    }
                }
            }

            private static void rellenarMatrizAleatorios(int[][] matriz, int filas, int columnas) {
                Random random = new Random();
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matriz[i][j] = random.nextInt(100) + 1; // Generate random numbers between 1 and 100 (inclusive)
                    }
                }
            }

            private static void imprimirMatriz(int[][] matriz, int filas, int columnas) {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            private static void imprimirDiagonalPrincipal(int[][] matriz, int filas, int columnas) {
                for (int i = 0; i < filas; i++) {
                    System.out.print(matriz[i][i] + " ");
                }
                System.out.println();
            }

            private static void imprimirDiagonales(int[][] matriz, int filas, int columnas) {
                // Print primary diagonal
                for (int i = 0; i < filas; i++) {
                    System.out.print(matriz[i][i] + " ");
                }
                System.out.println();

                // Print secondary diagonal
                for (int i = filas - 1; i >= 0; i--) {
                    System.out.print(matriz[i][i] + " ");
                }
                System.out.println();
            }

            private static void imprimirNoDiagonales(int[][] matriz, int filas, int columnas) {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i != j) {
                            System.out.print(matriz[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }


// ejercicio 111 "En este ejercicio se realizan varias operaciones con matrices en Java. Primero,
// se crean dos matrices cuadradas del mismo orden. Ambas matrices se llenan con números aleatorios
// y se muestran en pantalla, seguido por la presentación de su suma. Luego, se reinician las matrices
// a cero y se llena la primera con números aleatorios, mientras que la segunda se convierte en la
// transpuesta de la primera. Finalmente, las matrices se reinician nuevamente a cero y se llena la
// primera con números impares, mientras que la segunda se llena con los mismos números pero cada uno
// reducido en una unidad."

        class OperacionesMatrices {

            private static final int TAM_MATRIZ = 3; // Dimensión de la matriz (cambia para ajustar el tamaño)

            public static void main(String[] args) {
                // Generador de números aleatorios
                Random random = new Random();

                // Matrices
                int[][] matrizA = new int[TAM_MATRIZ][TAM_MATRIZ];
                int[][] matrizB = new int[TAM_MATRIZ][TAM_MATRIZ];

                // Operación a: Llenar, mostrar y sumar matrices
                llenarMatricesAleatorias(matrizA, random);
                llenarMatricesAleatorias(matrizB, random);
                mostrarMatriz("Matriz A:", matrizA);
                mostrarMatriz("Matriz B:", matrizB);
                int[][] matrizSuma = sumarMatrices(matrizA, matrizB);
                mostrarMatriz("Suma:", matrizSuma);

                // Reiniciar matrices
                reiniciarMatriz(matrizA);
                reiniciarMatriz(matrizB);

                // Operación b: Llenar primera, transponer segunda
                llenarMatricesAleatorias(matrizA, random);
                transponerMatriz(matrizA, matrizB);
                mostrarMatriz("Matriz A:", matrizA);
                mostrarMatriz("Transpuesta B:", matrizB);

                // Reiniciar matrices
                reiniciarMatriz(matrizA);
                reiniciarMatriz(matrizB);

                // Operación c: Llenar con impares y restar uno
                llenarMatrizImpares(matrizA);
                restarUno(matrizA, matrizB);
                mostrarMatriz("Matriz A:", matrizA);
                mostrarMatriz("Resta -1:", matrizB);
            }

            private static void reiniciarMatriz(int[][] matrizA) {
            }

            // Función para llenar matrices con números aleatorios
            private static void llenarMatricesAleatorias(int[][] matriz, Random random) {
                for (int i = 0; i < TAM_MATRIZ; i++) {
                    for (int j = 0; j < TAM_MATRIZ; j++) {
                        matriz[i][j] = random.nextInt(100) + 1; // Números entre 1 y 100
                    }
                }
            }

            // Función para mostrar una matriz
            private static void mostrarMatriz(String titulo, int[][] matriz) {
                System.out.println(titulo);
                for (int i = 0; i < TAM_MATRIZ; i++) {
                    for (int j = 0; j < TAM_MATRIZ; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            // Función para sumar dos matrices
            private static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
                int[][] matrizSuma = new int[TAM_MATRIZ][TAM_MATRIZ];
                for (int i = 0; i < TAM_MATRIZ; i++) {
                    for (int j = 0; j < TAM_MATRIZ; j++) {
                        matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
                    }
                }
                return matrizSuma;
            }

            // Función para transponer una matriz (convertir filas en columnas)
            private static void transponerMatriz(int[][] matrizOrigen, int[][] matrizTranspuesta) {
                for (int i = 0; i < TAM_MATRIZ; i++) {
                    for (int j = 0; j < TAM_MATRIZ; j++) {
                        matrizTranspuesta[j][i] = matrizOrigen[i][j];
                    }
                }
            }

            // Función para llenar una matriz con números impares
            private static void llenarMatrizImpares(int[][] matriz) {
                int valor = 1;
                for (int i = 0; i < TAM_MATRIZ; i++) {
                    for (int j = 0; j < TAM_MATRIZ; j++) {
                        matriz[i][j] = valor;
                        valor += 2;
                    }
                }
            }

            // Función para restar uno a cada elemento de una matriz en otra
            private static void restarUno(int[][] matrizA, int[][] matrizB) {
                for (int j = 0; j < TAM_MATRIZ; j++) ;
                for (int j = 0; j < TAM_MATRIZ; j++) ;
                for (int j = 0; j < TAM_MATRIZ; j++) {
                    ;
                };
            }
        }

        //ejercicio # 117 "En este ejercicio en Java, se define una clase Persona con campos para primerNombre,
// primerApellido, celular, sexo, peso, estatura, IMC y dx. Se implementan métodos para convertir libras
// a kilogramos, convertir estatura de centímetros a metros, calcular el IMC y asignar un diagnóstico basado
// en el IMC. Se crean dos instancias de Persona, se inicializan y se leen los datos de una persona con
// estatura en centímetros y peso en libras. Se calcula el IMC y se asigna un diagnóstico. Se imprime
// la información de la primera persona. Luego, se copia la información de la primera persona a la
// segunda. Si el diagnóstico no es 'Normopeso', se ajusta el IMC a 22.9 y el peso correspondiente,
// y se imprime una tabla comparativa antes y después de los ajustes."
        class Persona {

            // Atributos de la clase Persona
            char[] primerNombre = new char[50];
            char[] primerApellido = new char[50];
            char[] celular = new char[8];
            int sexo;
            double peso;
            double estatura;
            double IMC;
            char dx;

            // Constructor de la clase Persona
            public Persona(char[] primerNombre, char[] primerApellido, char[] celular, int sexo, double peso, double estatura) {
                this.primerNombre = primerNombre;
                this.primerApellido = primerApellido;
                this.celular = celular;
                this.sexo = sexo;
                this.peso = peso;
                this.estatura = estatura;
                this.IMC = calcularIMC(convertirLibrasAKilos(peso), convertirCmAMetros(estatura));
                this.dx = asignarDx(IMC);
            }

            // Función para convertir libras a kilogramos
            private double convertirLibrasAKilos(double libras) {
                return libras * 0.453592;
            }

            // Función para convertir centímetros a metros
            private double convertirCmAMetros(double cm) {
                return cm / 100;
            }

            // Función para calcular el IMC
            protected double calcularIMC(double pesoKg, double estaturaMetros) {
                return pesoKg / (estaturaMetros * estaturaMetros);
            }

            // Función para asignar el diagnóstico
            protected char asignarDx(double IMC) {
                if (IMC < 18.5) {
                    return 'D'; // Bajo peso
                } else if (IMC < 25) {
                    return 'N'; // Normopeso
                } else if (IMC < 30) {
                    return 'S'; // Sobrepeso
                } else {
                    return 'O'; // Obesidad
                }
            }

            // Función para imprimir la información de la persona
            public void imprimirInformacion() {
                System.out.println("Primer nombre: " + new String(primerNombre));
                System.out.println("Primer apellido: " + new String(primerApellido));
                System.out.println("Celular: " + new String(celular));
                System.out.println("Sexo: " + (sexo == 1 ? "Masculino" : "Femenino"));
                System.out.println("Peso (kg): " + peso);
                System.out.println("Estatura (m): " + estatura);
                System.out.println("IMC: " + IMC);
                System.out.println("Diagnóstico: " + dx);
                System.out.println();
            }
        }

        class Main {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Lectura de datos de la persona 1
                System.out.println("Ingrese datos de Persona 1:");
                System.out.print("Primer nombre: ");
                sc.nextLine(); // Se consume el salto de línea anterior
                char[] primerNombre1 = sc.nextLine().toCharArray();
                System.out.print("Primer apellido: ");
                char[] primerApellido1 = sc.nextLine().toCharArray();
                System.out.print("Celular: ");
                char[] celular1 = sc.nextLine().toCharArray();
                System.out.print("Sexo (1 - Masculino, 2 - Femenino): ");
                int sexo1 = sc.nextInt();
                System.out.print("Peso (libras): ");
                double peso1 = sc.nextDouble();
                System.out.print("Estatura (cm): ");
                double estatura1 = sc.nextDouble();

                // Creación de la persona 1
                Persona persona1 = new Persona(primerNombre1, primerApellido1, celular1, sexo1, peso1, estatura1);

                // Lectura de datos de la persona 2
                System.out.println("\nIngrese datos de Persona 2:");
                System.out.print("Primer nombre: ");
                sc.nextLine(); // Se consume el salto de línea anterior
                char[] primerNombre2 = sc.nextLine().toCharArray();
                System.out.print("Primer apellido: ");
                char[] primerApellido2 = sc.nextLine().toCharArray();
                System.out.print("Celular: ");
                char[] celular2 = sc.nextLine().toCharArray();
                System.out.print("Sexo (1 - Masculino, 2 - Femenino): ");
                int sexo2 = sc.nextInt();
                System.out.print("Peso (libras): ");
                double peso2 = sc.nextDouble();
                System.out.print("Estatura (cm): ");
                double estatura2 = sc.nextDouble();

                // Creación de la persona 2
                Persona persona2 = new Persona(primerNombre2, primerApellido2, celular2, sexo2, peso2, estatura2);

                // Impresión de la información de la persona 1 y persona 2
                System.out.println("\nInformación de Persona 1:");
                persona1.imprimirInformacion();
                System.out.println("Información de Persona 2:");
                persona2.imprimirInformacion();

                // Comparación y ajustes según diagnóstico de Persona 1
                if (persona1.dx != 'N') {
                    double nuevoPeso = 22.9 * Math.pow(persona2.estatura / 100, 2); // IMC deseado de 22.9
                    double nuevaEstatura = persona2.estatura / 100; // Convertir estatura a metros

                    // Actualizar datos de persona 2
                    persona2.peso = nuevoPeso;
                    persona2.estatura = nuevaEstatura;
                    persona2.IMC = persona2.calcularIMC(nuevoPeso, nuevaEstatura);
                    persona2.dx = persona2.asignarDx(persona2.IMC);
                }

                // Impresión de tabla comparativa de Persona 1 y Persona 2
                System.out.println("\nTabla comparativa de Persona 1 y Persona 2:");
                System.out.println("--------------------------------------------------");
                System.out.println("Persona 1:");
                persona1.imprimirInformacion();
                System.out.println("Persona 2:");
                persona2.imprimirInformacion();
                System.out.println("--------------------------------------------------");
            }
}
