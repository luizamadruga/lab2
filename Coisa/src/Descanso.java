public class Descanso {
    private int horasDeDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.horasDeDescanso = 0;
        this.numeroSemanas = 1;
    }

    public void defineHorasDescanso(int valor) {
        this.horasDeDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    public String getStatusGeral() {
        if (horasDeDescanso / numeroSemanas >= 26) {
            return "descansado";
        } else {return "cansado";}
    }
}
