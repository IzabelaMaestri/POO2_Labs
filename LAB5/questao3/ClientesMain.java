public class ClientesMain {
    public static void main(String[] args) {
        // Crie o Proxy do serviço de pesquisa de cliente
        ClienteService clienteService = new ClienteServiceProxy();

        // Realize a pesquisa de cliente
        Cliente cliente1 = clienteService.buscarCliente(2);
        Cliente cliente2 = clienteService.buscarCliente(4);
    }
}
