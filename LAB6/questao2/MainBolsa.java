public class MainBolsa {

    public static void main(String... args) {

        Acao acao = new Acao();

        Investidor investidor = new Investidor();
        
        investidor.setValorAcaoMax(35.0);
        investidor.setValorAcaoMin(5.0);

        acao.addObserver(investidor);

        acao.setValorAcao(20.0);

        acao.setValorAcao(2.0);

        acao.setValorAcao(200.0);

    }

}
