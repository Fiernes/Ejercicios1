public class Paciente {
    private int expediente;
    private String nombre;
    private String apellido;
    private  char sexo;
    private int celular;
    private  double peso;
    private double estatura;
    private  double imc;
    private String diagnostico;

    public Paciente() {
    }

    public Paciente(int expediente, String nombre, String apellido, char sexo, int celular, double peso, double estatura, double imc, String diagnostico) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.celular = celular;
        this.peso = peso;
        this.estatura = estatura;
        this.imc = imc;
        this.diagnostico = diagnostico;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}

