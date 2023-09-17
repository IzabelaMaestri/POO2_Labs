// Classe concreta que implementa o serviço de pesquisa de cliente

import java.util.ArrayList;
import java.util.List;

class ClienteServiceImpl implements ClienteService {
    private List<Cliente> listaDeClientes;

    public ClienteServiceImpl() {
        listaDeClientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }

    @Override
    public Cliente buscarCliente(int id) {
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getId() == id) {
                return cliente; // Retorna o cliente encontrado
            }
        }
        return null; // Cliente não encontrado
    }
}