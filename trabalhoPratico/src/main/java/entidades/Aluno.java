package entidades;

/**
 *
 * @author Eduardo
 */
public class Aluno extends Usuario {
    
    private String curso;

    public Aluno(String nome, String email, String telefone, int senha, String curso) {
        super(nome, email, telefone, senha);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
