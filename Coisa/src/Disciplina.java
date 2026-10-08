import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private Double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new Double[4];
        this.pesos = new int[4];
        Arrays.fill(this.pesos, 1);
        Arrays.fill(this.notas, 0.0);
    }

    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new Double[numNotas];
        this.pesos = pesos;
        Arrays.fill(this.notas, 0.0);
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }

    public boolean aprovado() {
        return (notas[0] + notas[1] + notas[2] + notas[3])/4 >= 7;
    }

    private double media() {
        double acc = 0.0;
        int p = 0;
        for (int i = 0; i < this.notas.length; i++) {
            acc += this.notas[i] * this.pesos[i];
            p += this.pesos[i];
        }
        return acc / p;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + Integer.toString(horasDeEstudo) + " " + media() + " " + Arrays.toString(notas);
    }
}