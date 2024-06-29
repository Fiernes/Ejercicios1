//Esta es una libreria del ejercicio 84//
import java.util.Scanner;

public class TiposDeFiguras {
    private static final Scanner sc = new Scanner(System.in);

    public static void verificarLadosRectangulo(int ladoLargo, int ladoCorto) {
        while (ladoCorto > ladoLargo) {
            System.out.println("Error: El lado corto no puede ser mayor que el lado largo.");
            System.out.print("Ingrese el lado corto nuevamente: ");
            ladoCorto = sc.nextInt();
        }
    }

    public static void dibujarCuadradoVacio(int lado, char caracter) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void dibujarCuadradoLleno(int lado, char caracter) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static void dibujarCuadradoMitadLleno(int lado, char caracter) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i < lado / 2) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void dibujarRectanguloVacio(int ladoLargo, int ladoCorto, char caracter) {
        verificarLadosRectangulo(ladoLargo, ladoCorto);

        for (int i = 0; i < ladoLargo; i++) {
            for (int j = 0; j < ladoCorto; j++) {
                if (i == 0 || i == ladoLargo - 1 || j == 0 || j == ladoCorto - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void dibujarRectanguloLleno(int ladoLargo, int ladoCorto, char caracter) {
        verificarLadosRectangulo(ladoLargo, ladoCorto);

        for (int i = 0; i < ladoLargo; i++) {
            for (int j = 0; j < ladoCorto; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static void dibujarTriangulo(int altura, char caracter) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
