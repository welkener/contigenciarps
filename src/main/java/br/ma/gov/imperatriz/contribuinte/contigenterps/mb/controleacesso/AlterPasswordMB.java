package br.ma.gov.imperatriz.contribuinte.contigenterps.mb.controleacesso;

import br.ma.gov.imperatriz.contribuinte.contigenterps.bo.controleacesso.AlterPasswordBO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.SolicitacaoRecuperacaoSenha;
import com.xpert.core.exception.BusinessException;
import com.xpert.faces.utils.FacesMessageUtils;
import com.xpert.faces.utils.FacesUtils;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Ayslan
 */
@Named
@RequestScoped
public class AlterPasswordMB {

    @EJB
    private AlterPasswordBO alterPasswordBO;
    @Inject
    private SessaoUsuarioMB sessaoUsuarioMB;
    private String currentPassword;
    private String password;
    private String confirmPassword;

     public void save() {
        try {
            alterPasswordBO.save(sessaoUsuarioMB.getUser(), password, confirmPassword, currentPassword, null);
            FacesMessageUtils.sucess();
        } catch (BusinessException ex) {
            FacesMessageUtils.error(ex);
        }
    }
    
    public void saveSolicitacaoRecuperacaoSenha() {
        try {
            
            SolicitacaoRecuperacaoSenha solicitacaoRecuperacaoSenha = sessaoUsuarioMB.getSolicitacaoRecuperacaoSenha();
            if (solicitacaoRecuperacaoSenha != null) {
                alterPasswordBO.save(solicitacaoRecuperacaoSenha.getUsuario(), password, confirmPassword, null, solicitacaoRecuperacaoSenha);
                sessaoUsuarioMB.setSolicitacaoRecuperacaoSenha(null);
                FacesMessageUtils.info("solicitacaoRecuperacaoSenha.senhaAlteradaSucesso");
                //redirecionar index
                FacesUtils.redirect("/");
            }
        } catch (BusinessException ex) {
            FacesMessageUtils.error(ex);
        }
    }
    

    public void clear() {
        password = null;
        confirmPassword = null;
    }

    public SessaoUsuarioMB getSessaoUsuarioMB() {
        return sessaoUsuarioMB;
    }

    public void setSessaoUsuarioMB(SessaoUsuarioMB sessaoUsuarioMB) {
        this.sessaoUsuarioMB = sessaoUsuarioMB;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }
    
    
    
}
