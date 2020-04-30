package br.com.NStore.service;

import org.springframework.stereotype.Component;

import br.com.NStore.datasource.model.Cliente;
import br.com.NStore.exception.ClienteResourceException;
import br.com.NStore.resource.model.ClienteResource;

@Component
public class ClienteConversor {

    public Cliente conversor(ClienteResource clienteResource) throws ClienteResourceException {
        try {
            Cliente cliente = new Cliente();
            cliente.setNome(clienteResource.getNome());
            cliente.setCpf(clienteResource.getCpf());
            cliente.setTelefone(clienteResource.getTelefone());
            cliente.setEmail(clienteResource.getEmail());
            cliente.setEndereco((clienteResource.getEndereco()));
            return cliente;
        }catch (Exception e){
            throw new ClienteResourceException("Falha ao converter o resource para entidade, resource: "+clienteResource);
        }
    }
}
