package entidades;

/**
 *
 * @author Luis
 */

public class Equipamento {
    private String nome;

    public Equipamento(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome() {
        return nome;
    }
}
