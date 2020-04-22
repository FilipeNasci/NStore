package br.com.NStore.service;

import org.springframework.stereotype.Component;

import br.com.NStore.datasource.model.Imposto;
import br.com.NStore.exception.ImpostoResourceException;
import br.com.NStore.resource.model.ImpostoResource;

@Component
public class ImpostoConversor {

    public Imposto conversor(ImpostoResource impostoResource) throws ImpostoResourceException {

        try {
            Imposto imposto = new Imposto();
            Long aliquotaImposto = checkAliquota(impostoResource.getAliquota());
            imposto.setAliquota(aliquotaImposto);
            imposto.setNome(impostoResource.getNome());
            return imposto;
        }catch (Exception e){
            throw new ImpostoResourceException("Falha ao converter o resource para entidade, resource: "+impostoResource);
        }
    }

    private long checkAliquota(String aliquota){
        return Long.parseLong(aliquota);
    }
}
