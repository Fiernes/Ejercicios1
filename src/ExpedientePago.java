public class ExpedientePago {
    private int expediente;
    private Fecha[] consultas;
    private double[] monto;
    private double pagado;
    private double pendiente;
    private int cantidadConsultas;

    // Constructor
    public ExpedientePago(int expediente) {
        this.expediente = expediente;
        this.consultas = new Fecha[100];
        this.monto = new double[100];
        this.pagado = 0;
        this.pendiente = 0;
        this.cantidadConsultas = 0;
    }

    // Métodos para agregar una consulta
    public void agregarConsulta(Fecha fecha, double monto, double pago) {
        if (cantidadConsultas < 100) {
            this.consultas[cantidadConsultas] = fecha;
            this.monto[cantidadConsultas] = monto;
            this.pagado += pago;
            this.pendiente += (monto - pago);
            cantidadConsultas++;
        } else {
            System.out.println("El paciente ha alcanzado el límite de 100 consultas.");
        }
    }

    // Métodos para abonar a la deuda
    public void abonarDeuda(double abono) {
        this.pagado += abono;
        this.pendiente -= abono;
    }

    // Getters y Setters
    public int getExpediente() {
        return expediente;
    }

    public double getPagado() {
        return pagado;
    }

    public double getPendiente() {
        return pendiente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Expediente: ").append(expediente).append("\n");
        sb.append("Consultas:\n");
        for (int i = 0; i < cantidadConsultas; i++) {
            sb.append(consultas[i]).append(" - ").append(monto[i]).append("\n");
        }
        sb.append("Total Pagado: ").append(pagado).append("\n");
        sb.append("Total Pendiente: ").append(pendiente).append("\n");
        return sb.toString();
    }
}
