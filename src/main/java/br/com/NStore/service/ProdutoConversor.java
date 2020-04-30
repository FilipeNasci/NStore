package br.com.NStore.service;

import br.com.NStore.datasource.model.Imposto;
import br.com.NStore.datasource.model.Produto;
import br.com.NStore.exception.ProdutoResourceException;
import br.com.NStore.resource.model.ProdutoResource;
import org.springframework.stereotype.Component;

@Component
public class ProdutoConversor {

    public Produto conversor(ProdutoResource produtoResource) throws ProdutoResourceException {
        try{
            Produto produto = new Produto();
            Long idCategoria = checkCategoria(produtoResource.getIdCatergoria());
            produto.setNome(produtoResource.getNome());
            produto.setIdCatergoria(idCategoria);
            produto.setDescrição(produtoResource.getDescrição());
            produto.setMarca(produtoResource.getMarca());
            return produto;
        }catch (Exception e){
            throw new ProdutoResourceException("Falha ao converter o resource para entidade, resource: "+produtoResource);
        }
    }

    public Long checkCategoria(String idCategoriaResource){
        return Long.parseLong(idCategoriaResource);
    }
}
