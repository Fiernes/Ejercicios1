import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        EjerciciosFidel Fidel = new EjerciciosFidel();
        EjerciciosAdrian Adrian = new EjerciciosAdrian();
        EjercicioCesar cesar = new EjercicioCesar();
        ClinicaNutricion fiallos = new ClinicaNutricion();
        HospitalManagement h = new HospitalManagement();
        h.hospital();
        //5
        //Fidel.encontrarMayor(entrada);
        //11
        //Fidel.encontrarExtremos(entrada);
        //17
        //Fidel.mostrarGraficosAsteriscos(entrada);
        //23
        //Fidel.imprimirCuadradoHueco(entrada);
        //29
        //Fidel.calcularPromedio();
        //35
        //Fidel.imprimirTablaConversiones();
        //41
        //Fidel.imprimirTablaMultiplicacion(entrada);
        //47
        //Fidel.divideYSuma(entrada);
        //53
        //Fidel.HaceFrio(entrada);
        //59
        //Fidel.Alineado(entrada);
        //65
        //Fidel.Estacionamiento(entrada);
        //71
        //Fidel.TorreHanoi(entrada);
        //77
        //Fidel.Potenciando(entrada);
        //83
        //Fidel.InstrucciónAsistidaComputadora2(entrada);
        //89
        //Fidel.TeLeoVerdad(entrada);
        //95
        //Fidel.VectuEliges(entrada);
        //101
        //Fidel.OrdenamientoOptimizado(entrada);
        //107
        //Fidel.Pollos(entrada);
        //113
        //Fidel.Grafos(entrada);
        //119
        //Fidel.Clinica2();
        //4
        cesar.OperacionesBasicas();
        //10
        cesar.Cuadrado();
        //16
        cesar.SepararDigito();
        //22
        cesar.NumeroMayorMenu();
        //28
        cesar.Cifrado();
        cesar.Descifrado();
        //34
        cesar.VentaProductos();
        //40
        cesar.SeamosPositivos();
        //46
        cesar.ValorAbsoluto();
        //52
        cesar.TrazaTuDestino();
        //58
        cesar.multiplo();
        //64
        cesar.inverso();
        //70
        cesar.InstruccionAsistida();
        //76
        cesar.Alineaésta();
        //82
        cesar.coregir();
        //88
        cesar.Trigonometria();
        //94
        cesar.Vectores();
        //100
        cesar.burbuja();
        //106
        cesar.pollos();
        //12
        cesar.metereologico();
        //118
        fiallos.clinica();


    }
}
