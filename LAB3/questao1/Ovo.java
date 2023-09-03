public class Ovo extends Toppings{

    public Ovo(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getdescricao() {
        return pizza.getdescricao() + " com ovo";
    }

    @Override
    public double valor() {
        return pizza.valor() + 3.0;
    }
   
}
