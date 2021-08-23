package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.email.impl;

import br.ma.gov.imperatriz.contribuinte.contigenterps.application.BaseDAOImpl;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.email.ConfiguracaoEmailDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.email.ConfiguracaoEmail;
import javax.ejb.Stateless;

/**
 *
 * @author ayslan
 */
@Stateless
public class ConfiguracaoEmailDAOImpl extends BaseDAOImpl<ConfiguracaoEmail> implements ConfiguracaoEmailDAO {

    @Override
    public Class getEntityClass() {
        return ConfiguracaoEmail.class;
    }
}
