package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */

public class BancoUsuarios {
    private static final List<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Aluno("Ana", "ana@email.com", "11111111", 1234, "Engenharia"));
        usuarios.add(new Professor("Carlos", "carlos@email.com", "22222222", 5678, "Cálculo", "Ciências Exatas", "12322"));
        usuarios.add(new Administrativo("Joana", "joana@email.com", "33333333", 9876, "RH", "Pessoal", "123412321"));
        // Adicione outros usuários conforme desejar
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
}

