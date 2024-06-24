package view;
import javax.swing.SwingUtilities;

import controller.CadastroTarefa;

public class CadastroTarefaGUI extends CadastroTarefa {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CadastroTarefa gui = new CadastroTarefa();
                gui.setVisible(true);
            }
        });
    }
}
