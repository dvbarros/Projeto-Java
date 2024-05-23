import javax.swing.SwingUtilities;

public class AgendaGUI extends AgendaApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AgendaApp gui = new AgendaApp();
                gui.setVisible(true);
            }
        });
    }
}
