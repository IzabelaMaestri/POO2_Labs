public class Queijo extends Toppings{

    public Queijo(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getdescricao() {
        return pizza.getdescricao() + " com queijo";
    }

    @Override
    public double valor() {
        return pizza.valor() + 8.0;
    }
   
}