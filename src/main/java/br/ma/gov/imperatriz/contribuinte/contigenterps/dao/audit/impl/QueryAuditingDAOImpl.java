package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.audit.impl;

import br.ma.gov.imperatriz.contribuinte.contigenterps.application.BaseDAOImpl;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.audit.QueryAuditingDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.audit.QueryAuditing;
import javax.ejb.Stateless;

/**
 *
 * @author Ayslan
 */
@Stateless
public class QueryAuditingDAOImpl extends BaseDAOImpl<QueryAuditing> implements QueryAuditingDAO {

    @Override
    public Class getEntityClass() {
        return QueryAuditing.class;
    }
    
    
    
}
