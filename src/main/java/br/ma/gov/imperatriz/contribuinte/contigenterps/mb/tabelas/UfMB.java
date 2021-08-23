package br.ma.gov.imperatriz.contribuinte.contigenterps.mb.tabelas;


import java.io.Serializable;
import com.xpert.core.crud.AbstractBaseBean;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named; 
import br.ma.gov.imperatriz.contribuinte.contigenterps.bo.tabelas.UfBO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.tabelas.Uf;

/**
 *
 * @author ayslanms
 */
@Named
@ViewScoped
public class UfMB extends AbstractBaseBean<Uf> implements Serializable {

    @EJB
    private UfBO ufBO;

    @Override
    public UfBO getBO() {
        return ufBO;
    }

    @Override
    public String getDataModelOrder() {
        return "nome";
    }
}
