package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.audit;

import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.audit.Auditing;
import com.xpert.persistence.dao.BaseDAO;
import javax.ejb.Local;

/**
 *
 * @author Ayslan
 */
@Local
public interface AuditingDAO extends BaseDAO<Auditing> {
    
}
