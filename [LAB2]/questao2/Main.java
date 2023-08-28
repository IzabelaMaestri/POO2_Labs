public class Main {

    public static void main(String[] args) {
        //Foi feito um Singleton pelo fato de que um fabricante de carros pode criar o mesmo carro inúmeras vezes.
        //Sendo assim não há a necessidade de se criar uma nova instância todas as vezes que houver
        //a necessidade de se criar um novo carro.
        //Por isso a "Fábrica Honda" é aberta uma única vez e ela fabrica vários carros diferentes. (Vide retorno no console)
        Honda honda = Honda.getInstance(); 
        
        //Foi feito um Factory, pois cada veículo é único, então há a necesidade de se criar uma instância nova de 
        //um novo veículo toda vez que uma "fabricante" criá-lo.
        IVehicle city = honda.makeVehicle("City");

        city.start();
        city.drive();
        city.stop();

        IVehicle civic = honda.makeVehicle("Civic");

        civic.start();
        civic.drive();
        civic.stop();

        IVehicle fit = honda.makeVehicle("Fit");

        fit.start();
        fit.drive();
        fit.stop();

        System.out.println("-------------------------------------------");

        Toyota toyota = Toyota.getInstance(); 
        
        IVehicle corolla = toyota.makeVehicle("Corolla");

        corolla.start();
        corolla.drive();
        corolla.stop();

        IVehicle hilux = toyota.makeVehicle("Hilux");

        hilux.start();
        hilux.drive();
        hilux.stop();

        IVehicle etios = toyota.makeVehicle("Etios");

        etios.start();
        etios.drive();
        etios.stop();


    }
}
