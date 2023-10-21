public class Capuccino extends BebidaTemplate {

    @Override
    void preparaBebida() {
        System.out.println("Acionando o pó de café");
    }

    @Override
    void adicionaCodimentos() {
        System.out.println("Adicionando o leite em pó");
    }
    
}
