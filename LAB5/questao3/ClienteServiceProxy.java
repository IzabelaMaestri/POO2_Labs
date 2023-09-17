// Classe Proxy que controla o acesso ao serviço de pesquisa de cliente
class ClienteServiceProxy implements ClienteService {
    private ClienteServiceImpl clienteService;

    public ClienteServiceProxy() {
        clienteService = new ClienteServiceImpl();
        // Adicione alguns clientes fictícios à lista de consultas
        clienteService.adicionarCliente(new Cliente(1, "Cliente A"));
        clienteService.adicionarCliente(new Cliente(2, "Cliente B"));
        clienteService.adicionarCliente(new Cliente(3, "Cliente C"));
    }

    @Override
    public Cliente buscarCliente(int id) {
        System.out.println("Pesquisando cliente com ID: " + id);

        // Busca o cliente
        Cliente cliente = clienteService.buscarCliente(id);

        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }

        return cliente;
    }
}
