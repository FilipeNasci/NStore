package br.com.NStore.service;

import org.springframework.stereotype.Component;

import br.com.NStore.datasource.model.Categoria;
import br.com.NStore.exception.CategoiaResourceException;
import br.com.NStore.resource.model.CategoriaResource;

@Component
public class CategoriaConversor {

    public Categoria conversor(CategoriaResource categoriaResource) throws CategoiaResourceException {

        try{
            Categoria categoria = new Categoria();
            categoria.setNome(categoriaResource.getNome());
            return categoria;
        }catch (Exception e){
            throw new CategoiaResourceException("Falha ao converter o resource para entidade, resource: "+categoriaResource);
        }
    }
}
