package br.ma.gov.imperatriz.contribuinte.contigenterps.mb.email;


import java.io.Serializable;
import com.xpert.core.crud.AbstractBaseBean;
import javax.ejb.EJB;
import br.ma.gov.imperatriz.contribuinte.contigenterps.bo.email.ModeloEmailBO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.email.ModeloEmail;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author ayslan
 */
@Named
@ViewScoped
public class ModeloEmailMB extends AbstractBaseBean<ModeloEmail> implements Serializable {

    @EJB
    private ModeloEmailBO modeloEmailBO;

    @Override
    public ModeloEmailBO getBO() {
        return modeloEmailBO;
    }

    @Override
    public String getDataModelOrder() {
        return "assunto";
    }
}
