package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.audit.impl;

import br.ma.gov.imperatriz.contribuinte.contigenterps.application.BaseDAOImpl;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.audit.AuditingDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.audit.Auditing;
import javax.ejb.Stateless;

/**
 *
 * @author Ayslan
 */
@Stateless
public class AuditingDAOImpl extends BaseDAOImpl<Auditing> implements AuditingDAO {

    @Override
    public Class getEntityClass() {
        return Auditing.class;
    }

}
