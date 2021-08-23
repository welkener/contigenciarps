package br.ma.gov.imperatriz.contribuinte.contigenterps.dao;

import com.xpert.persistence.dao.BaseDAO;
import javax.ejb.Local;

/**
 *
 * @author Ayslan
 */
@Local
public interface DAO extends BaseDAO {

    public <T> BaseDAO<T> getDAO(Class<T> entity);
}
