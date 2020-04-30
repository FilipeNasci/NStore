package br.com.NStore.service;

import br.com.NStore.datasource.model.Imposto;
import br.com.NStore.exception.ClienteNotFoundException;
import br.com.NStore.exception.ImpostoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.NStore.datasource.model.Cliente;
import br.com.NStore.exception.ClienteResourceException;
import br.com.NStore.repository.ClienteRepository;
import br.com.NStore.resource.model.ClienteResource;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteConversor service;

    @Autowired
    private ClienteRepository clienteRepository;

    public void cadastro(ClienteResource clienteResource) throws ClienteResourceException {
        Cliente cliente = service.conversor(clienteResource);
        clienteRepository.saveAndFlush(cliente);
    }

    public List<Cliente> buscarTodos(){
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

    public Cliente buscarPorId(Long id) throws ClienteNotFoundException {
        Cliente cliente = null;
        Optional<Cliente> clienteOptional = getOptional(id);
        if (!clienteOptional.isPresent()){
            throw new ClienteNotFoundException("Cliente não encontrado através do id: " + id);
        }else{
            cliente = clienteOptional.get();
        }
        return cliente;
    }

    private Optional<Cliente> getOptional(Long id) {
        return clienteRepository.findById(id);
    }

    public void deletarPorId(Long id) throws ClienteNotFoundException {
        Optional<Cliente> optionalCliente = getOptional(id);
        if(!optionalCliente.isPresent()){
            throw new ClienteNotFoundException("Cliente não encontrado através do id: "+id);
        }else{
            clienteRepository.delete(optionalCliente.get());
        }
    }
}
