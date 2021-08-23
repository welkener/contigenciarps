package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.controleacesso;

import com.xpert.persistence.dao.BaseDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.AcessoSistema;
import javax.ejb.Local;

/**
 *
 * @author ayslan
 */
@Local
public interface AcessoSistemaDAO extends BaseDAO<AcessoSistema> {
    
}
