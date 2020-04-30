package br.com.NStore.controller;

import br.com.NStore.exception.ProdutoResourceException;
import br.com.NStore.resource.model.ProdutoResource;
import br.com.NStore.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @PostMapping(path = "/save")
    public void inserirProduto(@RequestBody ProdutoResource produtoResource) throws ProdutoResourceException {
        service.cadastro(produtoResource);
    }
}
