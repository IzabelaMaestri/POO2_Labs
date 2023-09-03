
public class Cafeteria {

    public static void main(String[] args) {

        System.out.println("Espresso com Nutella");
        Cafe cafeEspresso = new Espresso();
        Cafe toppingNutella = new Nutella(cafeEspresso);

        Cafe espressoNutella = toppingNutella;

        String descricaoEsNut = espressoNutella.getDescricao();
        double valorEsNut = espressoNutella.calculaCusto();

        System.out.println("Descrição: " + descricaoEsNut);
        System.out.println("Valor: R$" + valorEsNut);



        System.out.println("\nEspresso Nutella e Canela");
        Cafe espressoNutCan = new Canela(espressoNutella);

        String descricaoEspNutCan = espressoNutCan.getDescricao();
        double valorEspNutCan  = espressoNutCan.calculaCusto();

        System.out.println("Descrição: " + descricaoEspNutCan);
        System.out.println("Valor: R$ " + valorEspNutCan);



        System.out.println("\nDescafeinado com Leite");
        Cafe cafeDescafeinado = new Decaf();
        Cafe toppingLeite= new Leite(cafeDescafeinado);

        Cafe descafeinadoLeite = toppingLeite;

        String descricaoDesLei = descafeinadoLeite.getDescricao();
        double valorDesLei = descafeinadoLeite.calculaCusto();

        System.out.println("Descrição: " + descricaoDesLei);
        System.out.println("Valor: R$" + valorDesLei);



        System.out.println("\nDescafeinado com Chocolate");
        Cafe cafeDescafeinado2 = new Decaf();
        Cafe toppingChocolate= new Chocolate(cafeDescafeinado2);

        Cafe descafeinadoChocolate2 = toppingChocolate;

        String descricaoDeschoc = descafeinadoChocolate2.getDescricao();
        double valorDesChoc = descafeinadoChocolate2.calculaCusto();

        System.out.println("Descrição: " + descricaoDeschoc);
        System.out.println("Valor: R$" + valorDesChoc);
    }

}