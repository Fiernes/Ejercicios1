public class TablaMultiplicacion {
/*Clase que como libreria se i
* */
    private static final int MINIMO = 1;
    private static final int MAXIMO = 15;

    /**
     * Genera y muestra la tabla de multiplicación del número especificado.
     *
     * @param numero el número del que se desea generar la tabla de multiplicación.
     */
    public static void generarTabla(int numero) {
        validarNumero(numero);

        System.out.println("\nTabla del 1 al " + numero);

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Valida que el número ingresado esté dentro del rango permitido.
     *
     * @param numero el número a validar.
     * @throws IllegalArgumentException si el número no está dentro del rango permitido.
     */
    private static void validarNumero(int numero) {
        if (numero < MINIMO || numero > MAXIMO) {
            throw new IllegalArgumentException("El número debe estar entre " + MINIMO + " y " + MAXIMO);
        }
    }
}
