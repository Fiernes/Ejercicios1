//Esta es una libreria del ejercicio 78 para el ejercicio Simple venta//

public class CalculosVenta {

    public static double calcularTotalAntesDescuento(int cantidad, double precioUnitario) {
        return cantidad * precioUnitario;
    }

    public static double calcularDescuentoTerceraEdad(double total) {
        return total * 0.3;
    }

    public static double calcularDescuentoPorRango(double total) {
        if (total <= 100) {
            return total * 0.1;
        } else if (total <= 300) {
            return total * 0.15;
        } else if (total <= 500) {
            return total * 0.2;
        } else {
            return total * 0.25;
        }
    }

    public static double calcularSubtotal(double totalAntesDescuento, double descuento) {
        return totalAntesDescuento - descuento;
    }

    public static double calcularImpuesto(double subtotal, double descuento) {
        if (descuento <= 0.15) {
            return subtotal * 0.12;
        } else {
            return subtotal * 0.15;
        }
    }

    public static double calcularTotalFinal(double subtotal, double impuesto) {
        return subtotal + impuesto;
    }

}
