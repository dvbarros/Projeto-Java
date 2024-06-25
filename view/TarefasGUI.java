package view;
import javax.swing.SwingUtilities;

import controller.Login;
import model.MostraTarefasDAO;

public class TarefasGUI extends Login {
    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MostraTarefasDAO gui = new MostraTarefasDAO();
                gui.mostraTarefas();
            }
        });
    }
}
