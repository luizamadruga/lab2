public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getTema() {
        return this.tema;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public boolean contemChave(String chave) {
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
