public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        /**
         * construtor base da classe RegistroTempoOnline
         *
         * @param nomeDisciplina o nome da disciplina cujo tempo online será registrado
         */
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        /**
         * contrutor da classe RegistroTempoOnline que recebe um parâmetro extra
         * para casos onde o tempo online esperado seja diferente do padrão
         *
         * @param nomeDisciplina o nome da disciplina cujo tempo online será registrado
         *
         * @param tempoEsperado o tempo onlina que se espera investir na disciplina
         */
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;

    public void adicionaTempoOnline(int tempo) {
        /**
         * adiciona um intervalo de tempo em horas à soma total de tempo online investido naquela disciplina
         *
         * @param tempo o intervalo de tempo a ser adicionado
         */
        this.tempoInvestidoOnline += tempo;

    public boolean atingiuMetaTempoOnline() {
        /**
         * retorna verdadeiro caso a soma total de tempo investidoonline naquela disciplina seja
         * igual ou superior ao tempo esperado
         */
        return tempoInvestidoOnline >= tempoEsperado;
    
    @Override
    public String toString() {
        /**
         * retorna uma string que sitetiza os dados armazenados no formato
         * DISCIPLINA X/Y
         * onde X é a soma do tempo investido online e Y é a meta de tempo
         */
        return nomeDisciplina + " " + Integer.toString(tempoInvestidoOnline) + "/" + Integer.toString(tempoEsperado);
