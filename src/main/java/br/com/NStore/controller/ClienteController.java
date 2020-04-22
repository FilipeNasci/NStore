package br.com.NStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.NStore.exception.ClienteResourceException;
import br.com.NStore.resource.model.ClienteResource;
import br.com.NStore.service.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(path = "/save")
    public void inserirCliente(@RequestBody ClienteResource clienteResource) throws ClienteResourceException {
        clienteService.cadastro(clienteResource);
    }
}
