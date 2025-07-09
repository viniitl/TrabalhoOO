package principal;

import javax.swing.SwingUtilities;
import telas.ViewLogin;

/**
 *
 * @author Eduardo
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SwingUtilities.invokeLater(() -> {
            ViewLogin login = new ViewLogin();
            login.setVisible(true);
        });
    }
}
