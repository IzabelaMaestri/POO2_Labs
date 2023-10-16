public class AcaoBroker {

    

    public void analisaAcao(double valorAcao, double valorAcaoMax, double valorAcaoMin){
        if(valorAcao > valorAcaoMax){
            System.out.println("Vender ação!");
        }
        if(valorAcao <= valorAcaoMin){
            System.out.println("Comprar ação!");
        }

    }
}
