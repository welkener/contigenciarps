package br.ma.gov.imperatriz.contribuinte.contigenterps.application;

import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.audit.QueryAuditingDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.audit.QueryAuditing;
import br.ma.gov.imperatriz.contribuinte.contigenterps.util.SessaoUtils;
import com.xpert.audit.QueryAuditPersister;
import com.xpert.audit.model.AbstractQueryAuditing;
import javax.ejb.EJB;
import javax.enterprise.inject.Default;
import javax.inject.Named;

/**
 * Implementacao padrao do QueryAuditPersister do xpert-framework utilizando CDI
 *
 * @author ayslanms
 */
@Default
@Named
public class QueryAuditPersisterImpl implements QueryAuditPersister {

    @EJB
    private QueryAuditingDAO queryAuditingDAO;

    @Override
    public void persist(AbstractQueryAuditing abstractQueryAuditing) {
        QueryAuditing queryAuditing = (QueryAuditing) abstractQueryAuditing;
        queryAuditing.setUsuario(SessaoUtils.getUser());
        queryAuditingDAO.save(queryAuditing, false);
    }

    @Override
    public int getSqlStringMaxSize() {
        return AbstractQueryAuditing.SQL_STRING_MAX_SIZE;
    }

    @Override
    public int getParametersMaxSize() {
        return AbstractQueryAuditing.SQL_STRING_MAX_SIZE;
    }

}
