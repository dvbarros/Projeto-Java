package view;
import javax.swing.SwingUtilities;

import controller.Login;

public class LoginGUI extends Login {
    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login gui = new Login();
                gui.setVisible(true);
            }
        });
    }
}
