public class Pacient {
    private int expediente;
    private String nombre;
    private String sexo;
    private String diagnostico;

    // Constructor
    public Pacient(int expediente, String nombre, String sexo, String diagnostico) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.sexo = sexo;
        this.diagnostico = diagnostico;
    }

    // Getters y Setters
    public int getExpediente() {
        return expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    @Override
    public String toString() {
        return "Expediente: " + expediente + ", Nombre: " + nombre + ", Sexo: " + sexo + ", Diagnostico: " + diagnostico;
    }
}
