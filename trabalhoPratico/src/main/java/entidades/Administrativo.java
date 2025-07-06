package entidades;

/**
 *
 * @author Eduardo
 */
public class Administrativo extends Servidor {
    
    private String cargo, departamento;

    public Administrativo(String nome, String email, String telefone, int senha, String cargo, String departamento, String matriculaInst) {
        super(matriculaInst, nome, email, telefone, senha);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
