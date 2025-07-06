package entidades;

/**
 *
 * @author Eduardo
 */
public class Servidor extends Usuario {
    
    private String matriculaInst;

    public Servidor(String matriculaInst, String nome, String email, String telefone, int senha) {
        super(nome, email, telefone, senha);
        this.matriculaInst = matriculaInst;
    }

    public String getMatriculaInst() {
        return matriculaInst;
    }

    public void setMatriculaInst(String matriculaInst) {
        this.matriculaInst = matriculaInst;
    }
}
