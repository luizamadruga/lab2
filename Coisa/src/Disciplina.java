import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
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
        return (notas[0] + notas[1] + notas[2] + notas[3])/4;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + Integer.toString(horasDeEstudo) + " " + media() + " " + Arrays.toString(notas);
    }
}
