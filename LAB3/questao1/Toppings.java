public class Toppings implements Pizza{

    Pizza pizza;



    public Toppings(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double valor() {
        return pizza.valor();
    }

    @Override
    public String getdescricao() {
        return pizza.getdescricao();
    }
    
}
