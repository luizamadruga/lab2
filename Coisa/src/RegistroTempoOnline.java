public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoInvestidoOnline) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoInvestidoOnline = tempoInvestidoOnline;
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