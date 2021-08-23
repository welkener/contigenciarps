package br.ma.gov.imperatriz.contribuinte.contigenterps.mb.padrao;

import br.ma.gov.imperatriz.contribuinte.contigenterps.constante.Constantes;
import javax.faces.bean.ManagedBean;

/**
 * class que retorna o valor das constantes
 *
 * @author Ayslan
 */
@ManagedBean
public class ConstantesMB {
    
    public int getMinutosRecuperacaoSenha(){
        return Constantes.MINUTOS_VALIDADE_RECUPERACAO_SENHA;
    }
    
}
