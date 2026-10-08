public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        /**
         * construtor da classe Resumo
         *
         * @param tema o tema do resumo
         *
         * @param conteudo o conteúdo do resumo
         */
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getTema() {
        /**
         * retorna o tema do resumo
         */
        return this.tema;
    }

    public String getConteudo() {
        /**
         * retorna o conteúdo do resumo
         */
        return this.conteudo;
    }

    public boolean contemChave(String chave) {
        /**
         * retorna verdadeiro se a string do conteúdo contiver a palavra chave
         *
         * @param chave a palavra chave da busca
         */
        String[] cont = this.conteudo.split(" ");
        int n = cont.length;
        for (int i = 0; i < n; i++) {
            if (cont[i].equals(chave)) {
                return true;
            }
        }
        return false;
    }
}
