package br.com.NStore.controller;

import br.com.NStore.datasource.model.Cliente;
import br.com.NStore.datasource.model.Imposto;
import br.com.NStore.exception.ClienteNotFoundException;
import br.com.NStore.exception.ImpostoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.NStore.exception.ClienteResourceException;
import br.com.NStore.resource.model.ClienteResource;
import br.com.NStore.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(path = "listarTodos")
    public List<Cliente> listarTodos(){
        return clienteService.buscarTodos();
    }

    @GetMapping(path = "/listar-id/{id}")
    public Cliente buscarPorId(@PathVariable (name = "id", required = true) Long id) throws ClienteNotFoundException {
        return clienteService.buscarPorId(id);
    }

    @PostMapping(path = "/save")
    public void inserirCliente(@RequestBody ClienteResource clienteResource) throws ClienteResourceException {
        clienteService.cadastro(clienteResource);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable (name = "id", required = true) Long id) throws ClienteNotFoundException {
        clienteService.deletarPorId(id);
    }
}
