package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.exemplo.impl;

import br.ma.gov.imperatriz.contribuinte.contigenterps.application.BaseDAOImpl;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.exemplo.PessoaExemploDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.exemplo.PessoaExemplo;
import javax.ejb.Stateless;

/**
 *
 * @author ayslan
 */
@Stateless
public class PessoaExemploDAOImpl extends BaseDAOImpl<PessoaExemplo> implements PessoaExemploDAO {

    @Override
    public Class getEntityClass() {
        return PessoaExemplo.class;
    }

}
