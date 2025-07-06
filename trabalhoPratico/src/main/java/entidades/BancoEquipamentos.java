package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */

public class BancoEquipamentos {
    private static final List<Equipamento> equipamentos = new ArrayList<>();

    static {
        Equipamento quadro = new Equipamento("quadro");
        Equipamento auditorio = new Equipamento("auditorio");
        Equipamento laboratorio = new Equipamento("laboratorio");
        Equipamento computadores = new Equipamento("computadores");

        equipamentos.add(quadro);
        equipamentos.add(auditorio);
        equipamentos.add(laboratorio);
        equipamentos.add(computadores);
    }
    

    public static List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
}

