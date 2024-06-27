import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InstruccionAsistidaLib {
    // Método para verificar si la respuesta es correcta
    public boolean esCorrecta(String respuesta, String respuestaCorrecta) {
        return respuesta.equalsIgnoreCase(respuestaCorrecta);
    }

    // Método para calcular el porcentaje de respuestas correctas
    public double calcularPorcentaje(int correctas) {
        return (double) correctas / 10 * 100;
    }

    // Método para preguntar si se desea continuar
    public boolean preguntarContinuar(Scanner scanner) {
        System.out.print("¿Desea continuar? (s/n): ");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("s");
    }

    // Método para obtener las preguntas y sus respuestas correctas con opciones de respuesta
    public Map<String, String[]> obtenerPreguntas() {
        Map<String, String[]> preguntas = new HashMap<>();
        preguntas.put("¿Cuál es la capital de Francia?", new String[]{"1. París", "2. Falso"});
        preguntas.put("¿Cuál es el río más largo del mundo?", new String[]{"1. Nilo", "2. Falso"});
        preguntas.put("¿Quién pintó la Mona Lisa?", new String[]{"1. Leonardo da Vinci", "2. Falso"});
        preguntas.put("¿Cuál es el planeta más cercano al sol?", new String[]{"1. Mercurio", "2. Falso"});
        preguntas.put("¿En qué año llegó el hombre a la luna?", new String[]{"1. 1969", "2. Falso"});
        preguntas.put("¿Quién escribió 'Don Quijote de la Mancha'?", new String[]{"1. Miguel de Cervantes", "2. Falso"});
        preguntas.put("¿Cuál es el metal más abundante en la Tierra?", new String[]{"1. Aluminio", "2. Falso"});
        preguntas.put("¿Cuál es el océano más grande del mundo?", new String[]{"1. Pacífico", "2. Falso"});
        preguntas.put("¿Cuál es la montaña más alta del mundo?", new String[]{"1. Everest", "2. Falso"});
        preguntas.put("¿Quién desarrolló la teoría de la relatividad?", new String[]{"1. Albert Einstein", "2. Falso"});
        return preguntas;
    }
}
