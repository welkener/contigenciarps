package br.ma.gov.imperatriz.contribuinte.contigenterps.dao.controleacesso.impl;

import br.ma.gov.imperatriz.contribuinte.contigenterps.application.BaseDAOImpl;
import br.ma.gov.imperatriz.contribuinte.contigenterps.dao.controleacesso.UsuarioDAO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.SituacaoUsuario;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.Usuario;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Ayslan
 */
@Stateless
public class UsuarioDAOImpl extends BaseDAOImpl<Usuario> implements UsuarioDAO {

    @Override
    public Class getEntityClass() {
        return Usuario.class;
    }

    @Override
    public List<Usuario> getUsuariosAtivos() {
        return list("situacaoUsuario", SituacaoUsuario.ATIVO, "nome");
    }
    
    
}
