package br.ma.gov.imperatriz.contribuinte.contigenterps.mb.padrao;

import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.tabelas.Municipio;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.tabelas.Uf;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.Permissao;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.Usuario;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.configuracao.ErroSistema;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.SituacaoUsuario;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.AcessoSistema;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.email.ConfiguracaoEmail;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.Perfil;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.HistoricoSituacaoUsuario;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.email.ModeloEmail;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.SolicitacaoRecuperacaoSenha;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.email.TipoAssuntoEmail;
import br.ma.gov.imperatriz.contribuinte.contigenterps.modelo.controleacesso.TipoRecuperacaoSenha;
import com.xpert.audit.model.AuditingType;
import com.xpert.audit.model.QueryAuditingType;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClassMB {

    public Class getAcessoSistema() {
        return AcessoSistema.class;
    }

    public Class getErroSistema() {
        return ErroSistema.class;
    }

    public Class getHistoricoSituacaoUsuario() {
        return HistoricoSituacaoUsuario.class;
    }

    public Class getPerfil() {
        return Perfil.class;
    }

    public Class getPermissao() {
        return Permissao.class;
    }

    public Class getSituacaoUsuario() {
        return SituacaoUsuario.class;
    }

    public Class getUsuario() {
        return Usuario.class;
    }

    public Class getTipoAssuntoEmail() {
        return TipoAssuntoEmail.class;
    }

    public Class getModeloEmail() {
        return ModeloEmail.class;
    }

    public Class getSolicitacaoRecuperacaoSenha() {
        return SolicitacaoRecuperacaoSenha.class;
    }

    public Class getTipoRecuperacaoSenha() {
        return TipoRecuperacaoSenha.class;
    }

    public Class getConfiguracaoEmail() {
        return ConfiguracaoEmail.class;
    }

    public Class getMunicipio() {
        return Municipio.class;
    }
    public Class getUf() {
        return Uf.class;
    }
    public Class getAuditingType() {
        return AuditingType.class;
    }
    public Class getQueryAuditingType() {
        return QueryAuditingType.class;
    }

}