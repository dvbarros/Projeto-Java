package view;

import javax.swing.SwingUtilities;
import controller.CadastroUsuario;

public class CadastroUsuarioGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CadastroUsuario gui = new CadastroUsuario();
                gui.setVisible(true);
            }
        });
    }
}

