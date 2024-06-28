import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


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
    }
    public void Cuadrado(){
        Scanner sc = new Scanner(System.in);

        // Se declara e inicializa la variable para el lado del cuadrado
        float lado;

        // Se solicita al usuario el lado del cuadrado
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = sc.nextFloat();

        // Se calculan el área y el perímetro
        float area = lado * lado;
        float perimetro = 4 * lado;

        // Se imprimen los resultados
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

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

//ejercicio 28

    public void Cifrado() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un entero de cuatro dígitos:");
        int dato = sc.nextInt();

        // Descomponer en dígitos
        int primerDigito = (dato / 1000 + 7) % 10;
        int segundoDigito = (dato / 100 % 10 + 7) % 10;
        int tercerDigito = (dato / 10 % 10 + 7) % 10;
        int cuartoDigito = (dato % 10 + 7) % 10;

        // Rearranging the digits
        int datoCifrado = tercerDigito * 1000 + cuartoDigito * 100 + primerDigito * 10 + segundoDigito;

        System.out.println("Dato cifrado: " + datoCifrado);
    }
    public void Descifrado() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dato cifrado de cuatro dígitos:");
        int datoCifrado = sc.nextInt();

        // Descomponer en dígitos
        int tercerDigito = (datoCifrado / 1000 + 3) % 10;
        int cuartoDigito = (datoCifrado / 100 % 10 + 3) % 10;
        int primerDigito = (datoCifrado / 10 % 10 + 3) % 10;
        int segundoDigito = (datoCifrado % 10 + 3) % 10;

        // Rearranging the digits
        int datoOriginal = primerDigito * 1000 + segundoDigito * 100 + tercerDigito * 10 + cuartoDigito;

        System.out.println("Dato original: " + datoOriginal);

        // Menú para finalizar el programa
        System.out.println("\n¿Desea continuar? (1 para sí, 0 para no):");
        int continuar = sc.nextInt();

        while (continuar != 0 && continuar != 1) {
            System.out.println("Opción no válida. Ingrese 1 para sí o 0 para no:");
            continuar = sc.nextInt();
        }

        if (continuar == 0) {
            System.out.println("Programa finalizado.");
        }
    }

    //Ejecicio 34
    public void VentaProductos (){
            Scanner entrada = new Scanner(System.in);

            // Inicialización de variables
            double totalVenta = 0.0;
            boolean continuar = true;

            // Ciclo controlado por centinela para iterar hasta que el usuario decida salir
            while (continuar) {
                System.out.print("Ingrese el número del producto (1-5) o 0 para salir: ");
                int numeroProducto = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea

                if (numeroProducto == 0) {
                    continuar = false;
                } else if (numeroProducto >= 1 && numeroProducto <= 5) {
                    System.out.print("Ingrese la cantidad vendida: ");
                    int cantidadVendida = entrada.nextInt();
                    entrada.nextLine(); // Consumir el salto de línea

                    double precioUnitario = calcularPrecioUnitario(numeroProducto);
                    double precioVentaProducto = precioUnitario * cantidadVendida;

                    System.out.printf("Producto %d: $%.2f x %d = $%.2f\n", numeroProducto, precioUnitario, cantidadVendida, precioVentaProducto);

                    totalVenta += precioVentaProducto;
                } else {
                    System.out.println("Error: Número de producto no válido.");
                }
            }

            // Impresión del total de venta
            System.out.printf("\nTotal de venta: $%.2f\n", totalVenta);
        }

        private static double calcularPrecioUnitario(int numeroProducto) {
            switch (numeroProducto) {
                case 1:
                    return 2.98;
                case 2:
                    return 4.50;
                case 3:
                    return 9.98;
                case 4:
                    return 4.49;
                case 5:
                    return 6.87;
                default:
                    return 0.0; // Precio por defecto para productos no válidos
            }
        }
// ejercicio 40
    public void SeamosPositivos (){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();

    boolean continuar = true;

    while (continuar) {
        System.out.println("Ingrese una serie de números enteros no negativos. Para detener, ingrese un número negativo:");

        int num;
        while (true) {
            num = sc.nextInt();
            if (num < 0) {
                break;
            }
            numeros.add(num);
        }

        imprimirTabla(numeros);

        System.out.println("\n¿Desea continuar? (1 para sí, 0 para no):");
        int opcion = sc.nextInt();

        while (opcion != 0 && opcion != 1) {
            System.out.println("Opción no válida. Ingrese 1 para sí o 0 para no:");
            opcion = sc.nextInt();
        }

        if (opcion == 0) {
            continuar = false;
            System.out.println("Programa finalizado.");
        } else {
            numeros.clear(); // Limpiar la lista para una nueva entrada de números
        }
    }
}

    public static void imprimirTabla(ArrayList<Integer> numeros) {
        int totalN = 0, totalN2 = 0, totalN3 = 0, total2N_1 = 0;
        int count = numeros.size();

        System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", "#", "N", "N^2", "N^3", "2N-1");

        for (int i = 0; i < count; i++) {
            int n = numeros.get(i);
            int n2 = n * n;
            int n3 = n * n * n;
            int twoNMinusOne = 2 * n - 1;

            totalN += n;
            totalN2 += n2;
            totalN3 += n3;
            total2N_1 += twoNMinusOne;

            System.out.printf("%-5d %-5d %-5d %-5d %-5d%n", (i + 1), n, n2, n3, twoNMinusOne);
        }

        System.out.printf("%-5s %-5d %-5d %-5d %-5d%n", "Totales", totalN, totalN2, totalN3, total2N_1);
        if (count > 0) {
            System.out.printf("%-5s %-5d %-5d %-5d %-5d%n", "Promedios", totalN / count, totalN2 / count, totalN3 / count, total2N_1 / count);
        }
    }
    // ejercicio 46

    public void ValorAbsoluto() {
        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un número: ");
            int numero = entrada.nextInt();

            System.out.println("El valor absoluto de " + numero + " es: " + calcularValorAbsoluto(numero));

            System.out.print("¿Desea continuar? (s/n): ");
            String respuesta = entrada.next().toLowerCase();

            if (!respuesta.equals("s")) {
                continuar = false;
            }
        }

        System.out.println("Gracias por usar el programa.");
    }

    private int calcularValorAbsoluto(int numero) {
        if (numero >= 0) {
            return numero;
        } else {
            return -numero;
        }
    }

    //ejercicio 52

    public void TrazaTuDestino() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un entero entre 1 y 50: ");
            int cantidadNumeros = scanner.nextInt();

            if (cantidadNumeros < 1 || cantidadNumeros > 50) {
                System.out.println("Error: el número debe estar entre 1 y 50");
                continue;
            }

            int pares = 0;
            int impares = 0;
            int unaCifra = 0;
            int dosCifras = 0;
            int tresCifras = 0;
            int masDeTresCifras = 0;

            for (int i = 0; i < cantidadNumeros; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (esPar(numero)) {
                    pares++;
                } else {
                    impares++;
                }

                int cifras = cantidadCifras(numero);
                switch (cifras) {
                    case 1:
                        unaCifra++;
                        break;
                    case 2:
                        dosCifras++;
                        break;
                    case 3:
                        tresCifras++;
                        break;
                    default:
                        masDeTresCifras++;
                }
            }

            System.out.println("Resumen:");
            System.out.println("Cantidad de números pares: " + pares);
            System.out.println("Cantidad de números impares: " + impares);
            System.out.println("Cantidad de números de una cifra: " + unaCifra);
            System.out.println("Cantidad de números de dos cifras: " + dosCifras);
            System.out.println("Cantidad de números de tres cifras: " + tresCifras);
            System.out.println("Cantidad de números de más de tres cifras: " + masDeTresCifras);

            System.out.print("¿Desea continuar? (s/n): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public int cantidadCifras(int numero) {
        int cifras = 0;
        while (numero > 0) {
            numero /= 10;
            cifras++;
        }
        return cifras;
    }

        // ejercicio 58

    public void multiplo() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el primer entero: ");
            int a = scanner.nextInt();
            System.out.print("Ingrese el segundo entero: ");
            int b = scanner.nextInt();

            if (esMultiplo(a, b)) {
                System.out.println(b + " es múltiplo de " + a);
            } else {
                System.out.println(b + " no es múltiplo de " + a);
            }

            System.out.print("¿Desea continuar? (s/n): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }
    public boolean esMultiplo(int a, int b) {
        return b % a == 0;
    }

    //Ejercicio 64
    public void inverso() {


        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            int invertido = invertirDigitos(numero);
            System.out.println("El número con sus dígitos invertidos es: " + invertido);

            System.out.print("¿Desea continuar? (s/n): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }

    public int invertirDigitos(int numero) {
        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }

    // ejercicio 70
    public void InstruccionAsistida() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int correctas = 0;
            int incorrectas = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Pregunta " + (i + 1) + ": ");
                String respuesta = scanner.next();
                if (esCorrecta(respuesta)) {
                    correctas++;
                } else {
                    incorrectas++;
                }
            }

            double porcentajeCorrectas = calcularPorcentaje(correctas);
            System.out.println("Porcentaje de respuestas correctas: " + porcentajeCorrectas + "%");

            if (porcentajeCorrectas < 75) {
                System.out.println("Por favor pida ayuda adicional a su instructor.");
                continuar = false;
            } else {
                continuar = preguntarContinuar(scanner);
            }
        }

        scanner.close();
    }

    public boolean esCorrecta(String respuesta) {
        // Aquí implementas la lógica para determinar si la respuesta es correcta o no
        // Por ejemplo, compara la respuesta con una cadena que consideres correcta
        return respuesta.equalsIgnoreCase("si"); // Cambia esto por la lógica correcta
    }

    public double calcularPorcentaje(int correctas) {
        return (double) correctas / 10 * 100;
    }
    public boolean preguntarContinuar(Scanner scanner) {
        System.out.print("¿Desea continuar? (s/n): ");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("s");
    }

    // ejercicio 70
    public void Trigonometria() {
        Scanner scanner = new Scanner(System.in);
        int respuesta;

        do {
            float angulo1 = solicitarAngulo(scanner, "Ingrese el primer ángulo (entre 0 y 360): ");
            float angulo2 = solicitarAngulo(scanner, "Ingrese el segundo ángulo (entre 0 y 360): ");

            if (angulo2 < angulo1) {
                System.out.print("¿Desea que el primer ángulo sea " + angulo2 + " y el segundo " + angulo1 + "? (1= sí, 2= volver a leer ambos ángulos): ");
                respuesta = scanner.nextInt();

                if (respuesta == 1) {
                    float temp = angulo1;
                    angulo1 = angulo2;
                    angulo2 = temp;
                } else {
                    continue;
                }
            }

            imprimirTabla(angulo1, angulo2);

            System.out.print("¿Desea continuar? (1= sí, 2= salir): ");
            respuesta = scanner.nextInt();
        } while (respuesta == 1);
    }

    public float solicitarAngulo(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        float angulo = scanner.nextFloat();

        while (angulo < 0 || angulo > 360) {
            System.out.print("Ángulo inválido. " + mensaje);
            angulo = scanner.nextFloat();
        }

        return angulo;
    }

    public  void imprimirTabla(float angulo1, float angulo2) {
        System.out.println("Ángulo\tSen\tCos\tTan");
        System.out.printf("%.2f\t%.4f\t%.4f\t%.4f\n", angulo1, (float) Math.sin(Math.toRadians(angulo1)), (float) Math.cos(Math.toRadians(angulo1)), (float) Math.tan(Math.toRadians(angulo1)));
        System.out.printf("%.2f\t%.4f\t%.4f\t%.4f\n", angulo2, (float) Math.sin(Math.toRadians(angulo2)), (float) Math.cos(Math.toRadians(angulo2)), (float) Math.tan(Math.toRadians(angulo2)));
    }

   // ejercicio 82

       public void Alineaésta(){
           imprimirCuadrado(4, '#');
       }
       public static void imprimirCuadrado(int lado, char caracterRelleno) {
           for (int i = 0; i < lado; i++) {
               for (int j = 0; j < lado; j++) {
                   System.out.print(caracterRelleno + " ");
               }
               System.out.println();
           }
       }

    //ejercicio88

        public void coregir(){
            imprimirerror(4, '#');
        }
        public void imprimirerror(int lado, char caracterRelleno) {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    System.out.print(caracterRelleno + " ");
                }
                System.out.print("^^@^^");
            }
        }

    // ejercicio 94
   public void Vectores() {

        int[] vector = new int[100];
        inicializarVector(vector);
        imprimirVector(vector);
        ordenarVector(vector);
        imprimirVector(vector);
        int total = sumarVector(vector);
        System.out.println("Total: " + total);
    }

    public void inicializarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // números aleatorios entre 0 y 99
        }
    }
    public void imprimirVector(int[] vector) {
        System.out.print("Vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    public void ordenarVector(int[] vector) {
        Arrays.sort(vector);
    }

    public int sumarVector(int[] vector) {
        int total = 0;
        for (int i = 0; i < vector.length; i++) {
            total += vector[i];
        }
        return total;
    }

    //ejercicio 100
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

        // ejercicio 106
        public void pollos() {
                Scanner scanner = new Scanner(System.in);
                int[][] ventasPorDia = new int[5][6]; // 5 sucursales, 6 días (lunes a sábado)

                System.out.println("Ingrese las ventas por día para cada sucursal:");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Sucursal " + (i + 1) + ":");
                    for (int j = 0; j < 6; j++) {
                        System.out.print("Día " + (j + 1) + ": ");
                        ventasPorDia[i][j] = scanner.nextInt();
                    }
                }

                imprimirMatriz(ventasPorDia, "Ventas por día por sucursal");

                int[][] ventasTotales = calcularVentasTotales(ventasPorDia);

                imprimirMatriz(ventasTotales, "Ventas totales por día y sucursa ");

                System.out.println("¿Desea continuar? (s/n)");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("s")) {
                } else {
                    System.out.println("Adiós!");
                }
            }

            public static void imprimirMatriz(int[][] matriz, String titulo) {
                System.out.println(titulo);
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println(" = ");
            }

            public static int[][] calcularVentasTotales(int[][] ventasPorDia) {
                int[][] ventasTotales = new int[6][6]; // 6 días, 6 columnas (5 sucursales + total)

                // Calcular ventas totales por día
                for (int j = 0; j < 6; j++) {
                    int totalDia = 0;
                    for (int i = 0; i < 5; i++) {
                        totalDia += ventasPorDia[i][j];
                    }
                    ventasTotales[j][5] = totalDia;
                }


                // Calcular ventas totales por sucursal
                for (int i = 0; i < 5; i++) {
                    int totalSucursal = 0;
                    for (int j = 0; j < 6; j++) {
                        totalSucursal += ventasPorDia[i][j];
                    }
                    ventasTotales[5][i] = totalSucursal;
                }

                // Copiar ventas por día a la nueva matriz
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 6; j++) {
                        ventasTotales[j][i] = ventasPorDia[i][j];
                    }
                }
                return ventasTotales;
            }

            //ejercicio 112
            public void metereologico (){
                    Scanner scanner = new Scanner(System.in);
                    Random random = new Random();

                    int[][] temperatura = new int[7][24]; // 7 días, 24 horas

                    // Llenar la matriz con valores aleatorios entre -10 y 40
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 24; j++) {
                            temperatura[i][j] = random.nextInt(51) - 10; // -10 a 40
                        }
                    }

                    System.out.println("Matriz de temperaturas:");
                    imprimirMatriz(temperatura);

                    int maxSemana = maximoSemana(temperatura);
                    int minSemana = minimoSemana(temperatura);

                    System.out.println("Máxima temperatura de la semana: " + maxSemana);
                    System.out.println("Mínima temperatura de la semana: " + minSemana);

                    int[] maxDia = new int[7];
                    int[] minDia = new int[7];
                    for (int i = 0; i < 7; i++) {
                        maxDia[i] = maximoDia(temperatura, i);
                        minDia[i] = minimoDia(temperatura, i);
                    }

                    System.out.println("Máxima temperatura de cada día:");
                    imprimirArray(maxDia);
                    System.out.println("Mínima temperatura de cada día:");
                    imprimirArray(minDia);

                    double mediaSemana = mediaSemana(temperatura);
                    System.out.println("Temperatura media de la semana: " + mediaSemana);

                    double[] mediaDia = new double[7];
                    for (int i = 0; i < 7; i++) {
                        mediaDia[i] = mediaDia(temperatura, i);
                    }

                    System.out.println("Temperatura media de cada día:");
                    imprimirArray(mediaDia);

                    int diasSuperiores = diasSuperiores(temperatura, 30);
                    System.out.println("Días con temperatura media superior a 30 grados: " + diasSuperiores);

                    System.out.println("¿Desea continuar? (s/n)");
                    String respuesta = scanner.next();
                    if (respuesta.equalsIgnoreCase("s")) {

                    } else {
                        System.out.println("Adiós!");
                    }
                }

                public  void imprimirMatriz(int[][] matriz) {
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }

                public void imprimirArray(int[] array) {
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                }

                public void imprimirArray(double[] array) {
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                }

                public int maximoSemana(int[][] temperatura) {
                    int max = temperatura[0][0];
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 24; j++) {
                            if (temperatura[i][j] > max) {
                                max = temperatura[i][j];
                            }
                        }
                    }
                    return max;
                }

                public int minimoSemana(int[][] temperatura) {
                    int min = temperatura[0][0];
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 24; j++) {
                            if (temperatura[i][j] < min) {
                                min = temperatura[i][j];
                            }
                        }
                    }
                    return min;
                }

                public int maximoDia(int[][] temperatura, int dia) {
                    int max = temperatura[dia][0];
                    for (int j = 0; j < 24; j++) {
                        if (temperatura[dia][j] > max) {
                            max = temperatura[dia][j];
                        }
                    }
                    return max;
                }

                public int minimoDia(int[][] temperatura, int dia) {
                    int min = temperatura[dia][0];
                    for (int j = 0; j < 24; j++) {
                        if (temperatura[dia][j] < min) {
                            min = temperatura[dia][j];
                        }
                    }
                    return min;
                }

                public double mediaSemana(int[][] temperatura) {
                    int suma = 0;
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 24; j++) {
                            suma += temperatura[i][j];
                        }
                    }
                    return (double) suma / (7 * 24);
                }

                public double mediaDia(int[][] temperatura, int dia) {
                    int suma = 0;
                    for (int j = 0; j < 24; j++) {
                        suma += temperatura[dia][j];
                    }
                    return (double) suma / 24;
                }

                public int diasSuperiores(int[][] temperatura, int umbral) {
                    int dias = 0;
                    for (int i = 0; i < 7; i++) {
                        if (mediaDia(temperatura, i) > umbral) {
                            dias++;
                        }
                    }
                    return dias;
                }
}




