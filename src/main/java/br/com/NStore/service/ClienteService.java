package br.com.NStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.NStore.datasource.model.Cliente;
import br.com.NStore.exception.ClienteResourceException;
import br.com.NStore.repository.ClienteRepository;
import br.com.NStore.resource.model.ClienteResource;

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
}
