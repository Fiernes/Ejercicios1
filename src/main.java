import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        HospitalManagement h = new HospitalManagement();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione el número del ejercicio (1-121) o 0 para salir:");
            int seleccion = entrada.nextInt();

            if (seleccion == 0) {
                continuar = false;
            } else if (seleccion > 0 && seleccion <= 121) {
                ejecutarEjercicio(seleccion, entrada);
            } else {
                System.out.println("Selección inválida. Intente de nuevo.");
            }
        }

        System.out.println("Programa finalizado.");
        entrada.close();
    }

    public static void ejecutarEjercicio(int numeroEjercicio, Scanner entrada) {
        EjerciciosFidel Fidel = new EjerciciosFidel();
        EjerciciosAdrian Adrian = new EjerciciosAdrian();
        EjercicioCesar cesar = new EjercicioCesar();
        ClinicaNutricion fiallos = new ClinicaNutricion();
        switch (numeroEjercicio) {
            case 5:
                Fidel.encontrarMayor(entrada);
                break;
            case 11:
                Fidel.encontrarExtremos(entrada);
                break;
            case 17:
                menuIdiomaOFinalizar(entrada);
                Fidel.mostrarGraficosAsteriscos(entrada);
                break;
            case 23:
                Fidel.imprimirCuadradoHueco(entrada);
                break;
            case 29:
                Fidel.calcularPromedio();
                break;
            case 35:
                Fidel.imprimirTablaConversiones();
                break;
            case 41:
                Fidel.imprimirTablaMultiplicacion(entrada);
                break;
            case 47:
                Fidel.divideYSuma(entrada);
                break;
            case 53:
                Fidel.HaceFrio(entrada);
                break;
            case 59:
                Fidel.Alineado(entrada);
                break;
            case 65:
                Fidel.Estacionamiento(entrada);
                break;
            case 71:
                Fidel.TorreHanoi(entrada);
                break;
            case 77:
                Fidel.Potenciando(entrada);
                break;
            case 83:
                Fidel.InstrucciónAsistidaComputadora2(entrada);
                break;
            case 89:
                Fidel.TeLeoVerdad(entrada);
                break;
            case 95:
                Fidel.VectuEliges(entrada);
                break;
            case 101:
                Fidel.OrdenamientoOptimizado(entrada);
                break;
            case 107:
                Fidel.Pollos(entrada);
                break;
            case 113:
                Fidel.Grafos(entrada);
                break;
            case 119:
                Fidel.Clinica2();
                break;
            case 4:
                cesar.OperacionesBasicas();
                break;
            case 10:
                cesar.Cuadrado();
                break;
            case 16:
                cesar.SepararDigito();
                break;
            case 22:
                cesar.NumeroMayorMenu();
                break;
            case 28:
                cesar.Cifrado();
                cesar.Descifrado();
                break;
            case 34:
                cesar.VentaProductos();
                break;
            case 40:
                cesar.SeamosPositivos();
                break;
            case 46:
                cesar.ValorAbsoluto();
                break;
            case 52:
                cesar.TrazaTuDestino();
                break;
            case 58:
                cesar.multiplo();
                break;
            case 64:
                cesar.inverso();
                break;
            case 70:
                cesar.InstruccionAsistida();
                break;
            case 76:
                cesar.Alineaésta();
                break;
            case 82:
                cesar.coregir();
                break;
            case 88:
                cesar.Trigonometria();
                break;
            case 94:
                cesar.Vectores();
                break;
            case 100:
                cesar.burbuja();
                break;
            case 106:
                cesar.pollos();
                break;
            case 12:
                cesar.metereologico();
                break;
            case 118:
                fiallos.clinica();
                break;
            default:
                System.out.println("Ejercicio no implementado.");
                break;
        }
    }

    public static void menuIdiomaOFinalizar(Scanner entrada) {
        System.out.println("Seleccione una opción: 1. Cambiar idioma 2. Finalizar programa");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                cambiarIdioma(entrada);
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Regresando al menú principal.");
        }
    }

    public static void cambiarIdioma(Scanner entrada) {
        System.out.println("Función de cambiar idioma no implementada.");
        // Aquí podrías agregar la lógica para cambiar el idioma.
    }
}


