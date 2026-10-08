public class RegistroResumos {
    private Resumo[] resumos;
    private int iresumo;
    private int numeroMaxDeResumos;
    private int numeroDeResumos;

    public RegistroResumos(int numeroMaxDeResumos) {
        this.numeroMaxDeResumos = numeroMaxDeResumos;
        this.resumos = new Resumo[numeroMaxDeResumos];
        this.iresumo = 0;
        this.numeroDeResumos = 0;
    }

    public void adiciona(String tema, String conteudo) {
        Resumo resumo = new Resumo(tema, conteudo);
        this.resumos[this.iresumo] = resumo;
        this.iresumo++;
        if (this.iresumo == numeroMaxDeResumos) {
            this.iresumo = 0;
        }
        if (this.numeroDeResumos < numeroMaxDeResumos) {
            this.numeroDeResumos++;
        }
    }

    public String[] pegaResumos() {
        String[] ress = new String[numeroDeResumos];
        int ires = 0;
        for (int i = 0; i < numeroDeResumos; i++) {
            if (resumos[i] != null) {
                ress[ires] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
                ires++;
            }
        }
        return ress;
    }

    public int conta() {
        return numeroDeResumos;
    }

    public String imprimeResumos() {
        String temp = ("- " + numeroDeResumos + " resumo(s) cadastrado(s)" + "\n" + "- ");
        for (int i = 0; i < numeroDeResumos; i++) {
            temp += resumos[i].getTema();
            if (i != numeroDeResumos-1) {
                temp += " | ";
            }
        }
        return temp;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < numeroDeResumos; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] buscaResumos(String chaveDeBusca) {
        String[] temp = new String[numeroDeResumos];
        int t = 0;
        for (int i = 0; i < numeroDeResumos; i++) {
            if (resumos[i].contemChave(chaveDeBusca)) {
                temp[i] = resumos[i].getTema();
                t++;
            }
        }
        String[] ress = new String[t];
        for (int j = 0; j < t; j++) {
            if (temp[j] != null) {
                ress[j] = temp[j];
            }
        }
        return ress;
    }
}
