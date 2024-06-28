public class Fecha {
    private int agno;
    private int mes;
    private int dia;

    // Constructor
    public Fecha(int agno, int mes, int dia) {
        this.agno = agno;
        this.mes = mes;
        this.dia = dia;
    }

    // Getters y Setters
    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + agno;
    }
}
