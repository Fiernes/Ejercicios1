import java.util.Scanner;
/*Prompt-Ejericio #116:
* */

public class HospitalManagement {
    // Definición de constantes
    private static final int NUM_ESPECIALIDADES = 4;
    private static final int NUM_PISOS = 3;
    private static final int NUM_HABITACIONES = 5;
    private static final int CAMAS_POR_HABITACION = 2;

    // Matriz para representar el hospital
    // [especialidad][piso][habitacion][cama]
    private static int[][][][] hospital = new int[NUM_ESPECIALIDADES][NUM_PISOS][NUM_HABITACIONES][CAMAS_POR_HABITACION];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nBienvenido al sistema de gestión hospitalaria");
            System.out.println("1. Consultar camas libres por especialidad");
            System.out.println("2. Consultar camas por piso");
            System.out.println("3. Asignar cama");
            System.out.println("4. Liberar cama");
            System.out.println("5. Mostrar tabla de camas ocupadas");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    consultarCamasLibresPorEspecialidad(scanner);
                    break;
                case 2:
                    consultarCamasPorPiso(scanner);
                    break;
                case 3:
                    asignarCama(scanner);
                    break;
                case 4:
                    liberarCama(scanner);
                    break;
                case 5:
                    mostrarTablaCamasOcupadas();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    // Función para obtener el nombre de la especialidad según su índice
    private static String obtenerNombreEspecialidad(int indice) {
        switch (indice) {
            case 0: return "Cardiología";
            case 1: return "Neurología";
            case 2: return "Oncología";
            case 3: return "Pediatría";
            default: return "Desconocida";
        }
    }

    // Función para obtener el número cardinal del piso
    private static String obtenerNumeroCardinalPiso(int indice) {
        switch (indice) {
            case 0: return "Primer";
            case 1: return "Segundo";
            case 2: return "Tercer";
            default: return "Desconocido";
        }
    }

    // Consultar camas libres por especialidad
    private static void consultarCamasLibresPorEspecialidad(Scanner scanner) {
        System.out.println("\nConsultar camas libres por especialidad");
        System.out.println("Elija una especialidad:");

        for (int especialidad = 0; especialidad < NUM_ESPECIALIDADES; especialidad++) {
            System.out.println((especialidad + 1) + ". " + obtenerNombreEspecialidad(especialidad));
        }

        System.out.print("Especialidad: ");
        int especialidadSeleccionada = scanner.nextInt() - 1;

        if (especialidadSeleccionada < 0 || especialidadSeleccionada >= NUM_ESPECIALIDADES) {
            System.out.println("Especialidad inválida.");
            return;
        }

        System.out.println("Camas libres por piso y habitación:");

        for (int piso = 0; piso < NUM_PISOS; piso++) {
            System.out.println(obtenerNumeroCardinalPiso(piso) + " piso:");

            for (int habitacion = 0; habitacion < NUM_HABITACIONES; habitacion++) {
                System.out.print("Habitación " + (habitacion + 1) + ": ");

                for (int cama = 0; cama < CAMAS_POR_HABITACION; cama++) {
                    if (hospital[especialidadSeleccionada][piso][habitacion][cama] == 0) {
                        System.out.print("Cama " + (cama + 1) + " libre | ");
                    } else {
                        System.out.print("Cama " + (cama + 1) + " ocupada | ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Consultar camas por piso
    private static void consultarCamasPorPiso(Scanner scanner) {
        System.out.println("\nConsultar camas por piso");
        System.out.println("Elija una especialidad:");

        for (int especialidad = 0; especialidad < NUM_ESPECIALIDADES; especialidad++) {
            System.out.println((especialidad + 1) + ". " + obtenerNombreEspecialidad(especialidad));
        }

        System.out.print("Especialidad: ");
        int especialidadSeleccionada = scanner.nextInt() - 1;

        if (especialidadSeleccionada < 0 || especialidadSeleccionada >= NUM_ESPECIALIDADES) {
            System.out.println("Especialidad inválida.");
            return;
        }

        System.out.println("Elija un piso (1-3): ");
        int pisoSeleccionado = scanner.nextInt() - 1;

        if (pisoSeleccionado < 0 || pisoSeleccionado >= NUM_PISOS) {
            System.out.println("Piso inválido.");
            return;
        }

        System.out.println("Estado de las habitaciones en el " + obtenerNumeroCardinalPiso(pisoSeleccionado) + " piso:");

        for (int habitacion = 0; habitacion < NUM_HABITACIONES; habitacion++) {
            System.out.print("Habitación " + (habitacion + 1) + ": ");

            for (int cama = 0; cama < CAMAS_POR_HABITACION; cama++) {
                if (hospital[especialidadSeleccionada][pisoSeleccionado][habitacion][cama] == 0) {
                    System.out.print("Cama " + (cama + 1) + " libre | ");
                } else {
                    System.out.print("Cama " + (cama + 1) + " ocupada (" + hospital[especialidadSeleccionada][pisoSeleccionado][habitacion][cama] + ") | ");
                }
            }
            System.out.println();
        }
    }

    // Asignar cama a un paciente
    private static void asignarCama(Scanner scanner) {
        System.out.println("\nAsignar cama a un paciente");
        System.out.println("Elija una especialidad:");

        for (int especialidad = 0; especialidad < NUM_ESPECIALIDADES; especialidad++) {
            System.out.println((especialidad + 1) + ". " + obtenerNombreEspecialidad(especialidad));
        }

        System.out.print("Especialidad: ");
        int especialidadSeleccionada = scanner.nextInt() - 1;

        if (especialidadSeleccionada < 0 || especialidadSeleccionada >= NUM_ESPECIALIDADES) {
            System.out.println("Especialidad inválida.");
            return;
        }

        System.out.println("Elija un piso (1-3): ");
        int pisoSeleccionado = scanner.nextInt() - 1;

        if (pisoSeleccionado < 0 || pisoSeleccionado >= NUM_PISOS) {
            System.out.println("Piso inválido.");
            return;
        }

        System.out.println("Elija una habitación (1-5): ");
        int habitacionSeleccionada = scanner.nextInt() - 1;

        if (habitacionSeleccionada < 0 || habitacionSeleccionada >= NUM_HABITACIONES) {
            System.out.println("Habitación inválida.");
            return;
        }

        System.out.println("Elija una cama (1-2): ");
        int camaSeleccionada = scanner.nextInt() - 1;

        if (camaSeleccionada < 0 || camaSeleccionada >= CAMAS_POR_HABITACION) {
            System.out.println("Cama inválida.");
            return;
        }

        if (hospital[especialidadSeleccionada][pisoSeleccionado][habitacionSeleccionada][camaSeleccionada] != 0) {
            System.out.println("La cama seleccionada está ocupada. No se puede asignar.");
        } else {
            System.out.print("Ingrese el número de expediente del paciente (1-999): ");
            int numeroExpediente = scanner.nextInt();
            hospital[especialidadSeleccionada][pisoSeleccionado][habitacionSeleccionada][camaSeleccionada] = numeroExpediente;
            System.out.println("Cama asignada correctamente al paciente con expediente " + numeroExpediente);
        }
    }

    // Liberar cama
    private static void liberarCama(Scanner scanner) {
        System.out.println("\nLiberar cama");
        System.out.println("Elija una especialidad:");

        for (int especialidad = 0; especialidad < NUM_ESPECIALIDADES; especialidad++) {
            System.out.println((especialidad + 1) + ". " + obtenerNombreEspecialidad(especialidad));
        }

        System.out.print("Especialidad: ");
        int especialidadSeleccionada = scanner.nextInt() - 1;

        if (especialidadSeleccionada < 0 || especialidadSeleccionada >= NUM_ESPECIALIDADES) {
            System.out.println("Especialidad inválida.");
            return;
        }

        System.out.println("Elija un piso (1-3): ");
        int pisoSeleccionado = scanner.nextInt() - 1;

        if (pisoSeleccionado < 0 || pisoSeleccionado >= NUM_PISOS) {
            System.out.println("Piso inválido.");
            return;
        }

        System.out.println("Elija una habitación (1-5): ");
        int habitacionSeleccionada = scanner.nextInt() - 1;

        if (habitacionSeleccionada < 0 || habitacionSeleccionada >= NUM_HABITACIONES) {
            System.out.println("Habitación inválida.");
            return;
        }

        System.out.println("Elija una cama (1-2): ");
        int camaSeleccionada = scanner.nextInt() - 1;

        if (camaSeleccionada < 0 || camaSeleccionada >= CAMAS_POR_HABITACION) {
            System.out.println("Cama inválida.");
            return;
        }

        if (hospital[especialidadSeleccionada][pisoSeleccionado][habitacionSeleccionada][camaSeleccionada] == 0) {
            System.out.println("La cama seleccionada ya está libre.");
        } else {
            hospital[especialidadSeleccionada][pisoSeleccionado][habitacionSeleccionada][camaSeleccionada] = 0;
            System.out.println("Cama liberada correctamente.");
        }
    }

    // Mostrar tabla de camas ocupadas
    private static void mostrarTablaCamasOcupadas() {
        System.out.println("\nTabla de camas ocupadas:");
        System.out.println("Especialidad | Piso | Habitación | Cama | Paciente");
        System.out.println("-----------------------------------------------");

        for (int especialidad = 0; especialidad < NUM_ESPECIALIDADES; especialidad++) {
            for (int piso = 0; piso < NUM_PISOS; piso++) {
                for (int habitacion = 0; habitacion < NUM_HABITACIONES; habitacion++) {
                    for (int cama = 0; cama < CAMAS_POR_HABITACION; cama++) {
                        if (hospital[especialidad][piso][habitacion][cama] != 0) {
                            System.out.printf("%-12s | %-4s | %-10s | %-4s | %-8d\n",
                                    obtenerNombreEspecialidad(especialidad),
                                    obtenerNumeroCardinalPiso(piso),
                                    "Habitación " + (habitacion + 1),
                                    "Cama " + (cama + 1),
                                    hospital[especialidad][piso][habitacion][cama]);
                        }
                    }
                }
            }
        }
    }
}

