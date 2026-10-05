public class RegistroResumos {
    private String[] tema;
    private String[] conteudo;
    private int itema;
    private int numeroMaxDeResumos;
    private int numeroDeResumos;

    public RegistroResumos(int numeroMaxDeResumos) {
        this.numeroMaxDeResumos = numeroMaxDeResumos;
        this.tema = new String[numeroMaxDeResumos];
        this.itema = 0;
        this.conteudo = new String[numeroMaxDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        this.tema[this.itema] = tema;
        this.conteudo[this.itema] = conteudo;
        this.itema++;
        if (this.itema == numeroMaxDeResumos) {
            this.itema = 0;
        }
        if (this.numeroDeResumos < numeroMaxDeResumos) {
            this.numeroDeResumos++;
        }
    }

    public String[] pegaResumos() {
        String[] resumos = new String[numeroDeResumos];
        int iresumo = 0;
        for (int i = 0; i < numeroDeResumos; i++) {
            if (tema[i] != null) {
                resumos[iresumo] = this.tema[i] + ": " + this.conteudo[i];
                iresumo++;
            }
        }
        return resumos;
    }

    public String imprimeResumos() {

    }
}
