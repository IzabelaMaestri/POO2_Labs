
public class Pizzaria {

    public static void main(String[] args) {

        System.out.println("Pizza Marguerita");
        Pizza massaMarguerita = new MassaFinaPizza();
        Pizza toppingTomate = new Tomate(massaMarguerita);
        Pizza toppingQueijo = new Queijo(toppingTomate);

        Pizza marguerita = toppingQueijo;

        String descricaoMarg = marguerita.getdescricao();
        double valorMarg = marguerita.valor();

        System.out.println("Descrição: " + descricaoMarg);
        System.out.println("Valor: R$ " + valorMarg);


        System.out.println("\nPizza Portuguesa");
        Pizza massaPortuguesa = new MassaEspessaPizza();
        Pizza toppingTomatePort = new Tomate(massaPortuguesa);
        Pizza toppingQueijoPort = new Queijo(toppingTomatePort);
        Pizza toppingOvoPort = new Ovo(toppingQueijoPort);

        Pizza portuguesa = toppingOvoPort;

        String descricaoPort = portuguesa.getdescricao();
        double valorPort = portuguesa.valor();

        System.out.println("Descrição: " + descricaoPort);
        System.out.println("Valor: R$ " + valorPort);

        System.out.println("\nPizza Marguerita com oregano");
        Pizza margueritaOregano = new Oregano(marguerita);

        String descricaoMargOreg = margueritaOregano.getdescricao();
        double valorMargOreg = margueritaOregano.valor();

        System.out.println("Descrição: " + descricaoMargOreg);
        System.out.println("Valor: R$ " + valorMargOreg);
    }

}
