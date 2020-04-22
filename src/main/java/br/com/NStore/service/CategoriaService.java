package br.com.NStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.NStore.datasource.model.Categoria;
import br.com.NStore.exception.CategoiaResourceException;
import br.com.NStore.exception.CategoriaNotFoundException;
import br.com.NStore.repository.CategoriaRepository;
import br.com.NStore.resource.model.CategoriaResource;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    private CategoriaConversor service;

    public List<Categoria> buscarTodos(){
        List<Categoria> lista = categoriaRepository.findAll();
        return lista;
    }

    public void cadastro(CategoriaResource categoriaResource) throws CategoiaResourceException {
        Categoria categoria = service.conversor(categoriaResource);
        categoriaRepository.saveAndFlush(categoria);
    }

    private Optional<Categoria> getOptional(Long id){
        return categoriaRepository.findById(id);
    }

    public Categoria buscarPorId(Long id) throws CategoriaNotFoundException {
        Optional<Categoria> optionalCategoria = getOptional(id);
        Categoria categoria = null;
        if(!(getOptional(id).isPresent())){
            throw new CategoriaNotFoundException("Categoria não encontrada através do id: " + id);
        }else{
            categoria = optionalCategoria.get();
        }
        return categoria;
    }

    public void deletarPorId(Long id) throws CategoriaNotFoundException {
        Optional<Categoria> optionalCategoria = getOptional(id);
        if(!optionalCategoria.isPresent()){
            throw new CategoriaNotFoundException("Categoria não encontrada através do id: " + id);
        }else{
            categoriaRepository.delete(optionalCategoria.get());
        }
    }
}
