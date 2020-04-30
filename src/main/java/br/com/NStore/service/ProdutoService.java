package br.com.NStore.service;

import br.com.NStore.datasource.model.Produto;
import br.com.NStore.exception.ProdutoResourceException;
import br.com.NStore.repository.ProdutoRepository;
import br.com.NStore.resource.model.ProdutoResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ProdutoConversor service;

    public void cadastro(ProdutoResource produtoResource) throws ProdutoResourceException {
        Produto produto = service.conversor(produtoResource);
        produtoRepository.saveAndFlush(produto);
    }
}
