package entidades;

/**
 *
 * @author Eduardo
 */
public class Usuario {
    
    private String nome, email, telefone;
    private int senha;

    public Usuario(String nome, String email, String telefone, int senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getSenha() {
        return senha;
    }
    
    public boolean podeCadastrar() {
        return false;
    }
}
