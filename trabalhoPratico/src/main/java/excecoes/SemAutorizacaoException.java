/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecoes;

import servicos.Sessao;

/**
 *
 * @author Eduardo
 */
public class SemAutorizacaoException extends Exception {
    public SemAutorizacaoException(String mensagem) {
        super(mensagem);
    }
    
    public static void verificarAutorizacaoParaCadastro() throws SemAutorizacaoException {
        if (!Sessao.getUsuarioLogado().podeCadastrar()) {
            throw new SemAutorizacaoException("Você não tem autorização para cadastrar usuários.");
        }
    }

}
