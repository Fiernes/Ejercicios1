import java.util.Locale;
import java.util.Scanner;

public class main {
    static EjerciciosFidel Fidel = new EjerciciosFidel();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        boolean continuar;

        Fidel.Bienvenida();

        while (continuar) {
            Fidel.PresionarEnter();
            System.out.println("Seleccione el número del ejercicio (1-122) o 0 para salir:");
            int seleccion = entrada.nextInt();
            if (seleccion == 0) {
                continuar = false;
            } else if (seleccion > 0 && seleccion <= 122) {
                if (seleccion >= 17){
                    menuIdioma(entrada);
                    Fidel.PresionarEnter();
                    System.out.println("¿Desea continuar o finalizar el programa y volver al menu principal?");
                    System.out.println("1. Finalizar");
                    System.out.println("2. Continuar");
                    int opci = entrada.nextInt();
                    if(opci == 2){
                        ejecutarEjercicio(seleccion, entrada);
                    }
                }else{
                    ejecutarEjercicio(seleccion, entrada);
                }
            } else {
                System.out.println("Selección inválida. Intente de nuevo.");
            }
        }

        System.out.println("Programa finalizado.");
        entrada.close();
    }

    public static void ejecutarEjercicio(int numeroEjercicio, Scanner entrada) {
        EjerciciosAdrian Adrian = new EjerciciosAdrian();
        EjercicioCesar cesar = new EjercicioCesar();
        ClinicaNutricion fiallos = new ClinicaNutricion();
        EjerciciosNataly Nataly = new EjerciciosNataly ();
        HospitalManagement Hospital = new HospitalManagement();
        EjerciciosAbner abner  = new EjerciciosAbner();

        switch (numeroEjercicio) {
            case 1:
                Adrian.EjemploSaludo();
                break;
            case 2:
                Adrian.MostrandoSello();
                break;
            case 3:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                    break;
            case 4:
                cesar.OperacionesBasicas();
                break;
            case 5:
                Fidel.encontrarMayor(entrada);
                break;
            case 6:
                Nataly.Aritmetica();
                break;
            case 7:
                abner.jugandocon3numeros(entrada);
                break;
            case 8:
                Adrian.OrdenarNumeros();
                break;
            case 9:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 10:
                cesar.Cuadrado();
                break;
            case 11:
                Fidel.encontrarExtremos(entrada);
                break;
            case 12:
                Nataly.ParesImpares();
                break;
            case 13:
                abner.ParImpar(entrada);
                break;
            case 14:
                Adrian.TableroDamas();
                break;
            case 15:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 16:
                cesar.SepararDigito();
                break;
            case 17:
                Fidel.mostrarGraficosAsteriscos(entrada);
                break;
            case 18:
                Nataly.Gasolina();
                break;
            case 19:
                abner.gastosquenotengo(entrada);
                break;
            case 20:
                Adrian.CalculadoraSueldoVendedor();
                break;
            case 21:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 22:
                cesar.NumeroMayorMenu();
                break;
            case 23:
                Fidel.imprimirCuadradoHueco(entrada);
                break;
            case 24:
                Nataly.ApocoHacenUno();
                break;
            case 25:
                abner.triangulorecto(entrada);
                break;
            case 26:
                Adrian.CopiarPegar();
                break;
            case 28:
                cesar.Cifrado();
                cesar.Descifrado();
                break;
            case 27:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 29:
                Fidel.calcularPromedio();
                break;
            case 30:
                Nataly.NumeroMenor();
                break;
            case 31:
                abner.impar(entrada);
                break;
            case 32:
                Adrian.Factorial();
                break;
            case 33:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 34:
                cesar.VentaProductos();
                break;
            case 35:
                Fidel.imprimirTablaConversiones();
                break;
            case 36:
                Nataly.CuentoCincoDruidas();
                break;
            case 37:
                abner.diadepago(entrada);
                break;
            case 38:
                Adrian.Rombo();
                break;
            case 39:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 40:
                cesar.SeamosPositivos();
                break;
            case 41:
                Fidel.imprimirTablaMultiplicacion(entrada);
                break;
            case 42:
                Nataly.Bermudas();
                break;
            case 43:
                abner.menuopciones(entrada);
                break;
            case 44:
                Adrian.MenuProgram();
                break;
            case 45:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 46:
                cesar.ValorAbsoluto();
                break;
            case 47:
                Fidel.divideYSuma(entrada);
                break;
            case 48:
                Nataly.DruidasSubenDeNivel();
                break;
            case 49:
                abner.criptofuncion(entrada);
                break;
            case 50:
                Adrian.FiguraV2();
                break;
            case 51:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 52:
                cesar.TrazaTuDestino();
                break;
            case 53:
                Fidel.HaceFrio(entrada);
                break;
            case 54:
                Nataly.ImprimiendoLineas();
                break;
            case 55:
                abner.dados(entrada);
                break;
            case 56:
                Adrian.AlineaNombre();
                break;
            case 57:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 58:
                cesar.multiplo();
                break;
            case 59:
                Fidel.Alineado(entrada);
                break;
            case 60:
                Nataly.AlineaEsta(entrada);
                break;
            case 61:
                abner.ejercicio61(entrada);
                break;
            case 62:
                Adrian.DisminuyeNum();
                break;
            case 63:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 64:
                cesar.inverso();
                break;
            case 65:
                Fidel.Estacionamiento(entrada);
                break;
            case 66:
                Nataly.PromedioEstudiante();
                break;
            case 67:
                abner.lanzamientomoneda(entrada);
                break;
            case 68:
                Adrian.MultiplicacionPrimaria();
                break;
            case 69:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 70:
                cesar.InstruccionAsistida();
                break;
            case 71:
                Fidel.TorreHanoi(entrada);
                break;
            case 72:
                Nataly.CirculoNuevo();
                break;
            case 73:
                abner.pancomido(entrada);
                break;
            case 74:
                Adrian.Elevation();
                break;
            case 75:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 76:
                cesar.Alineaésta();
                break;
            case 77:
                Fidel.Potenciando(entrada);
                break;
            case 78:
                Nataly.VentaModificada();
                break;
            case 80:
                Adrian.MiLibreria();
                break;
            case 82:
                cesar.coregir();
                break;
            case 83:
                Fidel.InstrucciónAsistidaComputadora2(entrada);
                break;
            case 84:
                Nataly.AngulosRectos();
                break;
            case 86:
                Adrian.ImpArchivo();
                break;
            case 87:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 88:
                cesar.Trigonometria();
                break;
            case 89:
                Fidel.TeLeoVerdad(entrada);
                break;
            case 90:
                Nataly.TeLeoVerdad();
                break;
            case 91:
                abner.ejercicio91(entrada);
                break;
            case 92:
                Adrian.ejercicio91();
                break;
            case 94:
                cesar.Vectores();
                break;
            case 95:
                Fidel.VectuEliges(entrada);
                break;
            case 96:
                Nataly.Vectores();
                break;
            case 97:
                abner.matriz(entrada);
                break;
            case 98:
                Adrian.MatrizV2();
                break;
            case 99:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 100:
                cesar.burbuja();
                break;
            case 101:
                Fidel.OrdenamientoOptimizado(entrada);
                break;
            case 102:
                Nataly.UnaDimension();
                break;
            case 103:
                abner.lanzamientodado(entrada);
                break;
            case 104:
                Adrian.MatrizSentido();
                break;
            case 105:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 106:
                cesar.pollos();
                break;
            case 107:
                Fidel.Pollos(entrada);
                break;
            case 108:
                Nataly.Matriz5x5();
                break;
            case 109:
                abner.ejercicio109(entrada);
                break;
            case 110:
                Adrian.PhdMatriz();
                break;
            case 111:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 112:
                cesar.metereologico();
                break;
            case 113:
                Fidel.Grafos(entrada);
                break;
            case 114:
                Nataly.Valles();
                break;
            case 115:
                abner.hospital(entrada);
                break;
            case 116:
                Hospital.hospital();
                break;
            case 117:
                System.out.println("No se pueden mostrar por que el compañero los hizo pero con errores");
                break;
            case 118:
                fiallos.clinica();
                break;
            case 119:
                Fidel.Clinica2(entrada);
                break;
            case 121:
                //abner.registro(entrada);
                break;
            case 122:
                Nataly.SimpleVenta();
                break;
            default:
                System.out.println("Ejercicio no implementado.");
                break;
        }

    }

    public static void menuIdioma(Scanner entrada) {
        System.out.println("Seleccione un idioma:");
        System.out.println("1. Español");
        System.out.println("2. Inglés");
        System.out.println("3. Francés");
        System.out.println("4. Alemán");
        System.out.println("5. Italiano");
        System.out.println("6. Portugués");
        System.out.println("7. Ruso");
        System.out.println("8. Chino");
        System.out.println("9. Japonés");
        System.out.println("10. Árabe");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Español:");
                System.out.println("Programa creado por:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "Esperamos que los programas le sean de utilidad y que esté bien diseñado para satisfacer sus necesidades.\n " +
                        "Agradecemos su preferencia y cualquier problema, por favor comuníquelo lo más pronto posible a nuestras oficinas.");
                break;
            case 2:
                System.out.println("Inglés:");
                System.out.println("Program created by:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "We hope the programs are useful to you and are well designed to meet your needs.\n " +
                        "Thank you for choosing our software, and please report any issues to our offices as soon as possible.");
                break;
            case 3:
                System.out.println("Francés:");
                System.out.println("Programme créé par :\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "Nous espérons que les programmes vous seront utiles et qu'ils sont bien conçus pour répondre à vos besoins.\n " +
                        "Nous vous remercions d'utiliser notre logiciel et nous vous prions de nous signaler tout problème dès que possible.");
                break;
            case 4:
                System.out.println("Alemán:");
                System.out.println("Programm erstellt von:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "Wir hoffen, dass die Programme nützlich für Sie sind und gut gestaltet sind, um Ihren Bedürfnissen gerecht zu werden. \n" +
                        "Vielen Dank für die Verwendung unserer Software, und bitte melden Sie Probleme so schnell wie möglich in unseren Büros.");
                break;
            case 5:
                System.out.println("Italiano:");
                System.out.println("Programma creato da:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "Speriamo che i programmi siano utili e ben progettati per soddisfare le vostre esigenze.\n " +
                        "Grazie per aver scelto il nostro software, e vi preghiamo di segnalare eventuali problemi ai nostri uffici il prima possibile.");
                break;
            case 6:
                System.out.println("Portugués:");
                System.out.println("Programa criado por:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "Esperamos que os programas sejam úteis e bem projetados para atender às suas necessidades.\n " +
                        "Agradecemos por escolher nosso software e solicitamos que relatem quaisquer problemas aos nossos escritórios o mais rápido possível.");
                break;
            case 7:
                System.out.println("Ruso:");
                System.out.println("Программа создана:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "Надеемся, что программы будут полезны и хорошо разработаны для удовлетворения ваших потребностей.\n " +
                        "Благодарим вас за выбор нашего программного обеспечения и просим сообщать о любых проблемах в наши офисы как можно скорее.");
                break;
            case 8:
                System.out.println("Chino:");
                System.out.println("程序创建者:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "我们希望这些程序对您有所帮助，并且设计良好，以满足您的需求。\n " +
                        "感谢您选择我们的软件，请尽快将任何问题报告给我们的办公室。");
                break;
            case 9:
                System.out.println("Japonés:");
                System.out.println("プログラム作成者:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "プログラムが役立つことを願い、あなたのニーズを満たすために良く設計されています。 \n" +
                        "当社のソフトウェアを選んでいただきありがとうございます。何か問題があれば、できるだけ早く弊社にご連絡ください。");
                break;
            case 10:
                System.out.println("Árabe:");
                System.out.println("البرنامج من إعداد:\n" +
                        "Abner Mauricio Valiente Vasquez\n" +
                        "20171004164\n" +
                        "Adrian Wasani Martinez Bonilla\n" +
                        "20221004796\n" +
                        "Bayron Alexander Aguilera Funez\n" +
                        "20211001769\n" +
                        "Cesar Manuel Vasquez Fiallos\n" +
                        "20221031703\n" +
                        "Fidel Ernesto Gutierrez Membreño\n" +
                        "20171031307\n" +
                        "Nataly Yaneth Turcios Rios\n" +
                        "20221004636\n" +
                        "نأمل أن تكون البرامج مفيدة لك ومصممة بشكل جيد لتلبية احتياجاتك. \n" +
                        "نشكرك على اختيار برنامجنا، ويرجى الإبلاغ عن أي مشاكل إلى مكاتبنا في أقرب وقت ممكن.");
                break;
            default:
                System.out.println("Opción inválida. Por favor seleccione una opción del 1 al 10.");
                break;
        }
    }

    public static void ContinuarOFinalizar(Scanner entrada) {
        System.out.println("¿Desea continuar o finalizar el programa y volver al menu principal?");

    }
}




