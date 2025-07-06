/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Eduardo
 */
public class Professor extends Servidor {
    
    private String cursoMinistrado, cargoAcademico;

    public Professor(String nome, String email, String telefone, int senha, String cursoMinistrado, String cargoAcademico, String matriculaInst) {
        super(matriculaInst, nome, email, telefone, senha);
        this.cursoMinistrado = cursoMinistrado;
        this.cargoAcademico = cargoAcademico;
    }


    public String getCursoMinistrado() {
        return cursoMinistrado;
    }

    public void setCursoMinistrado(String cursoMinistrado) {
        this.cursoMinistrado = cursoMinistrado;
    }

    public String getCargoAcademico() {
        return cargoAcademico;
    }

    public void setCargoAcademico(String cargoAcademico) {
        this.cargoAcademico = cargoAcademico;
    }
    
    
}
