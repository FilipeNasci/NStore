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

import br.com.NStore.datasource.model.Categoria;
import br.com.NStore.exception.CategoiaResourceException;
import br.com.NStore.exception.CategoriaNotFoundException;
import br.com.NStore.resource.model.CategoriaResource;
import br.com.NStore.service.CategoriaService;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(path = "/listarTodas")
    public List<Categoria> buscarImpostos(){
        return categoriaService.buscarTodos();
    }

    @GetMapping(path = "/listar-id/{id}")
    public Categoria buscarPorId(@PathVariable(name = "id", required = true) Long id) throws CategoriaNotFoundException {
        return categoriaService.buscarPorId(id);
    }

    @PostMapping(path = "/save")
    public void inserirCategoia(@RequestBody CategoriaResource categoriaResource) throws CategoiaResourceException {
        categoriaService.cadastro(categoriaResource);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable (name = "id", required = true) Long id) throws CategoriaNotFoundException {
        categoriaService.deletarPorId(id);
    }
}
