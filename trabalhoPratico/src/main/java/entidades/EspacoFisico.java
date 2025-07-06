package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */

public abstract class EspacoFisico {
    private String nome,localizacao, sala;
    private int capacidade;

    public EspacoFisico(String nome, String localizacao, String sala, int capacidade){
        this.nome = nome;
        this.localizacao = localizacao;
        this.sala = sala;
        this.capacidade = capacidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getNumero() {
        return localizacao;
    }

    public String getSala() {
        return sala;
    }
}
