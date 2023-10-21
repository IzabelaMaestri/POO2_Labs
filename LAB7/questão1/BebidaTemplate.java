
public abstract class BebidaTemplate {
    
    public void aqueceAgua(){
        System.out.println("Aquecendo a água");
    }

    public void colocaNaXicara(){
        System.out.println("Colocando na Xicara");
    }

    abstract void preparaBebida();

    abstract void adicionaCodimentos();

    public void preparaPedido(){
        aqueceAgua();
        colocaNaXicara();
        preparaBebida();
        adicionaCodimentos();
    }
}
