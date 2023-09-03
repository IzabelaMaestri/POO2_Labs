public class Tomate extends Toppings{

    public Tomate(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getdescricao() {
        return pizza.getdescricao() + " com tomate";
    }

    @Override
    public double valor() {
        return pizza.valor() + 5.0;
    }
   
}