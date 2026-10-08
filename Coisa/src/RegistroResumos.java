public class RegistroResumos {
    private Resumo[] resumos;
    private int iresumo;
    private int numeroMaxDeResumos;
    private int numeroDeResumos;

    public RegistroResumos(int numeroMaxDeResumos) {
        /* construtor da classe registro resumos */
        this.numeroMaxDeResumos = numeroMaxDeResumos;
        this.resumos = new Resumo[numeroMaxDeResumos];
        this.iresumo = 0;
        this.numeroDeResumos = 0;
    }

    public void adiciona(String tema, String conteudo) {
        /* adiciona um resumo novo ao registro, se a quantidade máxima
        * de resumos tiver sido atingida, ele substitui o resumo mais antigo
        * */
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
        /* retorna um array de string com cada string sendo um resumo
        * representado pelo formato "Tema: Conteúdo"
        * */
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
        /**
         * retirna a quantidade de resumos salvos
         */
        return numeroDeResumos;
    }

    public String imprimeResumos() {
        /**
         * retorna uma string com o nome de todos os temas de resumos salvos no formato
         * - X resumo(s) cadastrado(s)
         * - Tema1 | Tema2 | Tema3
         */
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
        /**
         * retorna verdadeiro se já houver algum resumo salvo com o mesmo
         * tema e negativo caso contrário
         *
         * @param tema o tema a ser testado
         */
        for (int i = 0; i < numeroDeResumos; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] buscaResumos(String chaveDeBusca) {
        /**
         * retorna um array de string com o tema de todos os resumos
         * que contém a palavra chave da busca
         *
         * @param chaveDeBusca a palavra chave da busca
         */
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
