package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.controleacesso;

import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.Perfil;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.Usuario;
import com.xpert.persistence.dao.BaseDAO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ayslan
 */
@Local
public interface PerfilDAO extends BaseDAO<Perfil> {

    /**
     * retorn os perfis do usuario
     *
     * @param usuario
     * @return
     */
    public List<Perfil> getPerfis(Usuario usuario);
}
