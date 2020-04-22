package br.com.NStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.NStore.datasource.model.Imposto;
import br.com.NStore.exception.ImpostoNotFoundException;
import br.com.NStore.exception.ImpostoResourceException;
import br.com.NStore.repository.ImpostoRepository;
import br.com.NStore.resource.model.ImpostoResource;

@Service
public class ImpostoService {

    @Autowired
    ImpostoRepository impostoRepository;
    
    @Autowired
    private ImpostoConversor service;
    
    
    public void cadastro(ImpostoResource impostoResource) throws ImpostoResourceException {
        Imposto imposto = service.conversor(impostoResource);
        impostoRepository.saveAndFlush(imposto);
    }

    public List<Imposto> buscarTodos(){
        List<Imposto> lista = impostoRepository.findAll();
        return lista;
    }

    public Imposto buscarPorId(Long id) throws ImpostoNotFoundException {
        Optional<Imposto> optionalImposto = getOptional(id);
        Imposto imposto = null;
        if(!optionalImposto.isPresent()){
            throw new ImpostoNotFoundException("Imposto não encontrado através do id: "+id);
        }else{
            imposto = optionalImposto.get();
        }
        return imposto;
    }

    private Optional<Imposto> getOptional(Long id) {
        return impostoRepository.findById(id);
    }

    public void deletarPorId(Long id) throws ImpostoNotFoundException {
        Optional<Imposto> optionalImposto = getOptional(id);
        if(!optionalImposto.isPresent()){
            throw new ImpostoNotFoundException("Imposto não encontrado através do id: "+id);
        }else{
            impostoRepository.delete(optionalImposto.get());
        }
    }
}
