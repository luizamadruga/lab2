public class Descanso {
    private int horasDeDescanso;
    private int numeroSemanas;

    public Descanso() {
        /**
         * construtor da classe descanso
         */
        this.horasDeDescanso = 0;
        this.numeroSemanas = 1;
    }

    public void defineHorasDescanso(int valor) {
        /**
         * define o valor do atributo descanso para a quantidade
         * de horas de descanso obtidas no total
         *
         * @param valor horas de descanso obtidas no total
         */
        this.horasDeDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        /**
         * define o valor para o atributo que guarda a quantidade de semanas
         *
         * @param valor a quantidade de semanas
         */
        this.numeroSemanas = valor;
    }

    public String getStatusGeral() {
        /**
         * retorna "cansado" se o tempo de descanso for inferior a 26 horas semanais
         */
        if (horasDeDescanso / numeroSemanas >= 26) {
            return "descansado";
        } else {return "cansado";}
    }
}
