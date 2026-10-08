import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private Double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        /**
         * construtor base da classe disciplina
         *
         * @param nomeDisciplina nome da disciplina
         */
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new Double[4];
        this.pesos = new int[4];
        Arrays.fill(this.pesos, 1);
        Arrays.fill(this.notas, 0.0);
    }

    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        /**
         * construtor da classe disciplina que recebe parãmetros diferentes dos base
         *
         * @param nomeDisciplina nome da disciplina
         *
         * @param numNotas número de notas que a disciplina tem
         *
         * @param pesos os pesos de cada nota
         */
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new Double[numNotas];
        this.pesos = pesos;
        Arrays.fill(this.notas, 0.0);
    }

    public void cadastraHoras(int horas) {
        /**
         * adiciona um intervalo de tempo à soma total de horas de estudo
         *
         * @param horas o intervalo de tempo a ser adicionado
         */
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        /**
         * adiciona uma nota específica ao sistema
         *
         * @param nota a nota que será adicionada
         *
         * @param valorNota o valor da nota que será adicionada
         */
        this.notas[nota-1] = valorNota;
    }

    private double media() {
        /**
         * retorna a média do aluno em double
         */
        double acc = 0.0;
        int p = 0;
        for (int i = 0; i < this.notas.length; i++) {
            acc += this.notas[i] * this.pesos[i];
            p += this.pesos[i];
        }
        return acc / p;
    }

    public boolean aprovado() {
        /**
         * retorna verdadeiro se a média do aluno for superior ou igual a 7
         */
        if (media() >= 7.0) {
            return true;
        } else {return false;}
    }

    @Override
    public String toString() {
        /**
         * retorna uma síntese em string dos dados e notas da disciplina
         */
        return nomeDisciplina + " " + Integer.toString(horasDeEstudo) + " " + media() + " " + Arrays.toString(notas);
    }
}
