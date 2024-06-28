import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClinicaNutricion2 {
    private List<Pacient> pacientes;
    private List<ExpedientePago> expedientesPago;

    // Constructor
    public ClinicaNutricion2() {
        this.pacientes = new ArrayList<>();
        this.expedientesPago = new ArrayList<>();
    }

    // Método para agregar un paciente
    public void agregarPaciente(Pacient paciente) {
        this.pacientes.add(paciente);
        this.expedientesPago.add(new ExpedientePago(paciente.getExpediente()));
    }

    // Método para registrar una consulta
    public void registrarConsulta(int expediente, Fecha fecha, double monto, double pago) {
        for (ExpedientePago expedientePago : expedientesPago) {
            if (expedientePago.getExpediente() == expediente) {
                expedientePago.agregarConsulta(fecha, monto, pago);
                break;
            }
        }
    }

    // Método para abonar deuda
    public void abonarDeuda(int expediente, double abono) {
        for (ExpedientePago expedientePago : expedientesPago) {
            if (expedientePago.getExpediente() == expediente) {
                expedientePago.abonarDeuda(abono);
                break;
            }
        }
    }

    // Método para mostrar deudores
    public void mostrarDeudores() {
        expedientesPago.stream()
                .filter(e -> e.getPendiente() > 0)
                .sorted(Comparator.comparingDouble(ExpedientePago::getPendiente).reversed())
                .forEach(System.out::println);
    }
}
