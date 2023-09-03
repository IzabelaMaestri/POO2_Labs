public class Oregano extends Toppings{

    public Oregano(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getdescricao() {
        return pizza.getdescricao() + " com oregano";
    }

    @Override
    public double valor() {
        return pizza.valor() + 2.0;
    }
   
}