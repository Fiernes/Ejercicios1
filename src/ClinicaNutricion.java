import java.util.Scanner;

public class ClinicaNutricion {
    private final int MAX_PACIENTES = 50;
    private Paciente[] pacientes = new Paciente[MAX_PACIENTES];
    private int numPacientes = 0;

    public ClinicaNutricion() {} // constructor

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Ver pacientes");
            System.out.println("3. Modificar paciente");
            System.out.println("4. Estadísticas");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarPaciente(scanner);
                    break;
                case 2:
                    verPacientes();
                    break;
                case 3:
                    modificarPaciente(scanner);
                    break;
                case 4:
                    estadisticas();
                    break;
                case 5:
                    System.out.println("Adiós!");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private void agregarPaciente(Scanner scanner) {
        if (numPacientes < MAX_PACIENTES) {
            Paciente paciente = new Paciente();
            System.out.print("Nombre: ");
            paciente.nombre = scanner.next();
            System.out.print("Apellido: ");
            paciente.apellido = scanner.next();
            System.out.print("Sexo (M/F): ");
            paciente.sexo = scanner.next().charAt(0);
            System.out.print("Celular: ");
            paciente.celular = scanner.next();
            System.out.print("Peso (lb): ");
            paciente.peso = scanner.nextDouble();
            System.out.print("Estatura (cm): ");
            paciente.estatura = scanner.nextDouble();
            System.out.print("IMC: ");
            paciente.imc = scanner.nextDouble();
            System.out.print("Diagnóstico: ");
            paciente.diagnostico = scanner.next();

            pacientes[numPacientes] = paciente;
            numPacientes++;

            System.out.println("Paciente agregado con éxito!");
        } else {
            System.out.println("No se pueden agregar más pacientes");
        }
    }

    private void verPacientes() {
        System.out.println("Pacientes:");
        for (int i = 0; i < numPacientes; i++) {
            System.out.println(pacientes[i].toString());
        }
    }

    private void modificarPaciente(Scanner scanner) {
        System.out.print("Expediente del paciente a modificar: ");
        int expediente = scanner.nextInt();

        for (int i = 0; i < numPacientes; i++) {
            if (pacientes[i].expediente == expediente) {
                System.out.print("Celular: ");
                pacientes[i].celular = scanner.next();
                System.out.print("Peso (lb): ");
                pacientes[i].peso = scanner.nextDouble();
                System.out.print("Estatura (cm): ");
                pacientes[i].estatura = scanner.nextDouble();

                System.out.println("Paciente modificado con éxito!");
                return;
            }
        }

        System.out.println("Paciente no encontrado");
    }

    private void estadisticas() {
        int hombres = 0;
        int mujeres = 0;
        int normopeso = 0;
        int sobrepeso = 0;

        for (int i = 0; i < numPacientes; i++) {
            if (pacientes[i].sexo == 'M') {
                hombres++;
            } else {
                mujeres++;
            }

            if (pacientes[i].imc < 25) {
                normopeso++;
            } else {
                sobrepeso++;
            }
        }

        System.out.println("Estadísticas:");
        System.out.println("Hombres: " + hombres);
        System.out.println("Mujeres: " + mujeres);
        System.out.println("Normopeso: " + normopeso);
        System.out.println("Sobrepeso: " + sobrepeso);
    }
}

class Paciente {
    int expediente;
    String nombre;
    String apellido;
    char sexo;
    String celular;
    double peso;
    double estatura;
    double imc;
    String diagnostico;

    public Paciente() {}

    public Paciente(int expediente, String nombre, String apellido, char sexo, String celular, double peso, double estatura, double imc, String diagnostico) {
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

    @Override
    public String toString() {
        return "Expediente: " + expediente + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Sexo: " + sexo + ", Celular: " + celular + ", Peso: " + peso + ", Estatura: " + estatura + ", IMC: " + imc + ", Diagnóstico: " + diagnostico;
    }
}

    class Main {
    public static void main(String[] args) {
        ClinicaNutricion clinica = new ClinicaNutricion();
        clinica.run();
    }
}