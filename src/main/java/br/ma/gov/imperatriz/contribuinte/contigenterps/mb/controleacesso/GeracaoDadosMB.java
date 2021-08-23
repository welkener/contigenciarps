package br.ma.gov.imperatriz.contribuinte.contigenterps.mb.controleacesso;

import br.ma.gov.imperatriz.contribuinte.contigenterps.GeracaoDadosSistema;
import com.xpert.faces.utils.FacesMessageUtils;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author ayslan
 *
 */
@Named
@SessionScoped
public class GeracaoDadosMB implements Serializable {

    @EJB
    private GeracaoDadosSistema geracaoDadosSistema;

    public void gerarDados() {
        try {
            geracaoDadosSistema.generate();
            FacesMessageUtils.sucess();
        } catch (Exception ex) {
            FacesMessageUtils.fatal("Um erro aconteceu na geração. Erro: " + ex.getMessage() + ". Mais detalhes no log.");
        }
    }
}
