package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.tabelas.impl;

import br.ma.gov.imperatriz.contribuinte.contigenterps.application.BaseDAOImpl;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.tabelas.MunicipioDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.tabelas.Municipio;
import javax.ejb.Stateless;

/**
 *
 * @author ayslanms
 */
@Stateless
public class MunicipioDAOImpl extends BaseDAOImpl<Municipio> implements MunicipioDAO {

    @Override
    public Class getEntityClass() {
        return Municipio.class;
    }

}
