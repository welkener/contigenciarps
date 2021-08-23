package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.tabelas.impl;

import br.ma.gov.imperatriz.contribuinte.contigenterps.application.BaseDAOImpl;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.tabelas.UfDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.tabelas.Uf;
import javax.ejb.Stateless;

/**
 *
 * @author ayslanms
 */
@Stateless
public class UfDAOImpl extends BaseDAOImpl<Uf> implements UfDAO {

    @Override
    public Class getEntityClass() {
        return Uf.class;
    }

}
