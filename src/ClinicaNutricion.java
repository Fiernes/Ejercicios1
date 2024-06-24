import java.util.ArrayList;
import java.util.Scanner;

public class ClinicaNutricion {

    private final int MAX_PACIENTES = 50;
    private int numPacientes = 0;
    ArrayList<Paciente> listaPacientes = new ArrayList<>();
    int opcion;

    public void clinica() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Ver pacientes");
            System.out.println("3. Modificar paciente");
            System.out.println("4. Estadísticas");
            System.out.println("5. Salir");

            do {
                System.out.print("Ingrese una opcion: ");
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    break;
                } else {
                    System.out.println("ERROR DATO INGRESADO NO VALIDO");
                    scanner.next(); // Limpiar el buffer de entrada
                }
            } while (true);

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
            paciente.setNombre(scanner.next());
            System.out.print("Apellido: ");
            paciente.setApellido(scanner.next());
            System.out.print("Sexo (M/F): ");
            paciente.setSexo(scanner.next().charAt(0));
            System.out.print("Celular: ");
            paciente.setCelular(scanner.nextInt());
            System.out.print("Peso (lb): ");
            paciente.setPeso(scanner.nextDouble());
            System.out.print("Estatura (cm): ");
            paciente.setEstatura(scanner.nextDouble());
            System.out.print("IMC: ");
            paciente.setImc(scanner.nextDouble());
            System.out.print("Diagnóstico: ");
            paciente.setDiagnostico(scanner.next());
            paciente.setExpediente(numPacientes);
            listaPacientes.add(paciente); // Agregar paciente a la lista
            numPacientes++; // Incrementar numPacientes
            System.out.println("Paciente agregado con éxito!");
        } else {
            System.out.println("No se pueden agregar más pacientes");
        }
    }

    void verPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados");
        } else {
            System.out.println("Pacientes:");
            for (int i = 0; i < numPacientes; i++) {
                System.out.println("Nombre: " + listaPacientes.get(i).getNombre());
                System.out.println("Apellido: " + listaPacientes.get(i).getApellido());
                System.out.println("Sexo: " + listaPacientes.get(i).getSexo());
                System.out.println("Celular: " + listaPacientes.get(i).getCelular());
                System.out.println("Peso: " + listaPacientes.get(i).getPeso());
                System.out.println("Estatura: " + listaPacientes.get(i).getEstatura());
                System.out.println("IMC: " + listaPacientes.get(i).getImc());
                System.out.println("Diagnóstico: " + listaPacientes.get(i).getDiagnostico());
            }
        }
    }

    private void modificarPaciente(Scanner scanner) {
        System.out.print("Expediente del paciente a modificar: ");
        int expediente = scanner.nextInt();

        for (int i = 0; i < numPacientes; i++) {
            if (listaPacientes.get(i).getExpediente() == expediente) {
                System.out.print("Celular: ");
                listaPacientes.get(i).setCelular(scanner.nextInt());
                System.out.print("Peso (lb): ");
                listaPacientes.get(i).setPeso(scanner.nextDouble());
                System.out.print("Estatura (cm): ");
                listaPacientes.get(i).setEstatura(scanner.nextDouble());

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
            if (listaPacientes.get(i).getSexo() == 'M') {
                hombres++;
            } else {
                mujeres++;
            }

            if (listaPacientes.get(i).getImc() < 175) {
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






