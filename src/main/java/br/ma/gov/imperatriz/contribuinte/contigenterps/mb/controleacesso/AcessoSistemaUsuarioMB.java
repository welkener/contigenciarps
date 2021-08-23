package br.ma.gov.imperatriz.contribuinte.contigenterps.mb.controleacesso;


import br.ma.gov.imperatriz.contribuinte.contigenterps.bo.controleacesso.AcessoSistemaBO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.AcessoSistema;
import br.ma.gov.imperatriz.contribuinte.contigenterps.util.SessaoUtils;
import java.io.Serializable;
import com.xpert.core.crud.AbstractBaseBean;
import com.xpert.core.crud.AbstractBusinessObject;
import javax.ejb.EJB;
import com.xpert.persistence.query.Restriction;
import com.xpert.persistence.query.Restrictions;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author ayslan
 */
@Named
@ViewScoped
public class AcessoSistemaUsuarioMB extends AbstractBaseBean<AcessoSistema> implements Serializable {

    @EJB
    private AcessoSistemaBO acessoSistemaBO;

    @Override
    public AbstractBusinessObject getBO() {
        return acessoSistemaBO;
    }

    @Override
    public String getDataModelOrder() {
        return "id DESC";
    }

    @Override
    public List<Restriction> getDataModelRestrictions() {
        return new Restrictions().add("usuario", SessaoUtils.getUser());
    }
    
    
}
