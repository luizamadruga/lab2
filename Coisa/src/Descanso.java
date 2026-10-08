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
    /*
    No método defineNumerosSemanas(int valor) eu mudaria o nome do parametro para um nome mais intuitivo , exemplo: int semanas , int semana entre outos.
    */
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    public String getStatusGeral() {
        if (horasDeDescanso / numeroSemanas >= 26) {
            return "descansado";
        } else {return "cansado";}  /* eu quebraria uma linha para melhorar a legibilidade */
    }
}
