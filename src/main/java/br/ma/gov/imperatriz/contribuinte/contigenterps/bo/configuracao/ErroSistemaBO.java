package br.ma.gov.imperatriz.contribuinte.contigenterps.bo.configuracao;

import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.configuracao.ErroSistemaDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.controleacesso.PermissaoDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.configuracao.ErroSistema;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.Permissao;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.Usuario;
import com.xpert.core.crud.AbstractBusinessObject;
import com.xpert.core.exception.BusinessException;
import com.xpert.core.validation.UniqueField;
import com.xpert.faces.utils.FacesUtils;
import com.xpert.persistence.dao.BaseDAO;
import com.xpert.persistence.query.Restrictions;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.omnifaces.util.Faces;

/**
 *
 * @author Ayslan
 */
@Stateless
public class ErroSistemaBO extends AbstractBusinessObject<ErroSistema> {

    @EJB
    private ErroSistemaDAO erroSistemaDAO;
    @EJB
    private PermissaoDAO permissaoDAO;

    /**
     * registro o erro baseado na excecao passada por parametro
     *
     * @param throwable
     * @return
     */
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public ErroSistema save(Throwable throwable) {
        return save(null, ErroSistemaBO.getStackTrace(throwable), null);
    }

    /**
     *
     * Método que salva o erro a partir da requisição e da exceção lançada pelo
     * usuário
     *
     * @param usuario
     * @param pilhaErro
     * @param context
     *
     * @return
     */
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public ErroSistema save(Usuario usuario, String pilhaErro, FacesContext context) {
        //salvar o erro

        ErroSistema erroSistema = new ErroSistema();
        erroSistema.setPilhaErro(pilhaErro);
        erroSistema.setUsuario(usuario);
        erroSistema.setData(new Date());
        if (context != null) {
            String browser = FacesUtils.getBrowser();
            erroSistema.setInformacaoNavegador(browser);
        }

        String url = null;
        String queryString = null;
        if (context != null) {
            HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
            url = request.getServletPath();
            queryString = request.getQueryString();
        }

        if (url != null && !url.isEmpty()) {
            //formatar a url para pegar os parametros
            String completeUrl = url;
            if (queryString != null) {
                completeUrl = completeUrl + "?" + queryString;
            }
            erroSistema.setUrl(completeUrl);
            //pegar possiveis funcionalidades a partir da URL atual
            Restrictions restrictions = new Restrictions();
            restrictions.like("url", url);
            List<Permissao> permissoes = permissaoDAO.list(restrictions);
            if (permissoes != null) {
                StringBuilder funcionalidade = new StringBuilder();
                for (Permissao permissao : permissoes) {
                    if (funcionalidade.length() > 0) {
                        funcionalidade.append(", ");
                    }
                    funcionalidade.append(permissao.getDescricao());
                }
                erroSistema.setFuncionalidade(funcionalidade.toString());
            }
        }
        erroSistema = erroSistemaDAO.merge(erroSistema, false);

        return erroSistema;
    }

    public static void printStackTrace(Throwable throwable, StringWriter stringWriter) {
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        if (throwable.getCause() != null) {
            stringWriter.append("<p>Caused by:</p>");
            printStackTrace(throwable.getCause(), stringWriter);
        }
    }

    public static String getStackTrace(Throwable throwable) {

        StringWriter stringWriter = new StringWriter();
        printStackTrace(throwable, stringWriter);

        String pilhaErro = stringWriter.toString();

        String separator = System.getProperty("line.separator");
        pilhaErro = pilhaErro.replace(separator, separator + "<br/>");

        return pilhaErro;
    }

    @Override
    public BaseDAO getDAO() {
        return erroSistemaDAO;
    }

    @Override
    public List<UniqueField> getUniqueFields() {
        return null;
    }

    @Override
    public boolean isAudit() {
        return false;
    }

    @Override
    public void validate(ErroSistema erroSistema) throws BusinessException {
    }
}
