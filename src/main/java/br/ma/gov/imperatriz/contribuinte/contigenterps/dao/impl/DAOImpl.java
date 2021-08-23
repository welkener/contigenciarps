package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.impl;

import br.ma.gov.imperatriz.contribuinte.contigenterps.application.BaseDAOImpl;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.DAO;
import com.xpert.persistence.dao.BaseDAO;
import javax.ejb.Stateless;

/**
 *
 * @author ayslan
 */
@Stateless
public class DAOImpl extends BaseDAOImpl implements DAO {

    @Override
    public <T> BaseDAO<T> getDAO(Class<T> entity) {
        this.setEntityClass(entity);
        return this;
    }
}
