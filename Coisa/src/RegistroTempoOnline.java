public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return tempoInvestidoOnline >= tempoEsperado;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + Integer.toString(tempoInvestidoOnline) + "/" + Integer.toString(tempoEsperado);
    }
}