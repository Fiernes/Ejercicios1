import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        EjerciciosFidel Fidel = new EjerciciosFidel();
        //Fidel.encontrarMayor(entrada);
        //Fidel.encontrarExtremos(entrada);
        //Fidel.mostrarGraficosAsteriscos(entrada);
        //Fidel.imprimirCuadradoHueco(entrada);
        //Fidel.calcularPromedio();
        //Fidel.imprimirTablaConversiones();
        //Fidel.imprimirTablaMultiplicacion(entrada);
        Fidel.divideYSuma(entrada);
    }
}
