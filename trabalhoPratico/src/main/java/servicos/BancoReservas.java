/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import entidades.EspacoFisico;
import excecoes.HorarioIndisponivelException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class BancoReservas {
    private static final List<EspacoFisico> reservas = new ArrayList<>();
    
public static void adicionarReserva(EspacoFisico novaReserva) throws HorarioIndisponivelException {
    for (EspacoFisico reserva : reservas) {
        if (reserva.getData().equals(novaReserva.getData())
                && reserva.getNome().equals(novaReserva.getNome())
                && reserva.getHorario().equals(novaReserva.getHorario())) {
            throw new HorarioIndisponivelException("Horário já reservado para este espaço.");
        }
    }

    reservas.add(novaReserva);
}
    
    public static List<EspacoFisico> getReservas() {
        return new ArrayList<>(reservas); 
    }
    
    public static void exportarReservasParaTxt(String caminhoArquivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
        for (EspacoFisico reserva : reservas) {
            String linha = "Data: " + reserva.getData()
                    + " | Espaço: " + reserva.getNome()
                    + " | Horário: " + reserva.getHorario();
            writer.write(linha);
            writer.newLine();
        }
        System.out.println("Reservas exportadas com sucesso para: " + caminhoArquivo);
    } catch (IOException e) {
        System.err.println("Erro ao exportar reservas: " + e.getMessage());
    }
}
}
