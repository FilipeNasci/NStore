package br.com.NStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.NStore.datasource.model.Imposto;
import br.com.NStore.exception.ImpostoNotFoundException;
import br.com.NStore.exception.ImpostoResourceException;
import br.com.NStore.resource.model.ImpostoResource;
import br.com.NStore.service.ImpostoService;

@RestController
@RequestMapping(value = "/imposto")
public class ImpostoController {

    @Autowired
    private ImpostoService impostoService;

    @GetMapping(path = "/listarTodos")
    public List<Imposto> buscarImpostos(){
        return impostoService.buscarTodos();
    }

    @GetMapping(path = "/listar-id/{id}")
    public Imposto buscarPorId(@PathVariable (name = "id", required = true) Long id) throws ImpostoNotFoundException {
        return impostoService.buscarPorId(id);
    }

    @PostMapping(path = "/save")
    public void inserirImposto(@RequestBody ImpostoResource imposto) throws ImpostoResourceException {
    	impostoService.cadastro(imposto);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable (name = "id", required = true) Long id) throws ImpostoNotFoundException {
    	impostoService.deletarPorId(id);
    }
}
