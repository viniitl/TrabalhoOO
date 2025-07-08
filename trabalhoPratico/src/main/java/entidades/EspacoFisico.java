/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Eduardo
 */
public class EspacoFisico {
    
    private String data;
    private String espaco;
    private String horario;

    public EspacoFisico(String data, String espaco, String horario) {
        this.data = data;
        this.espaco = espaco;
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return espaco;
    }

    public void setNome(String nome) {
        this.espaco = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
