import javax.swing.*;

public class AgendaApp {
    public static void main(String[] args) {
        // Exibir a tela inicial
        String[] opcoes = {"Adicionar Tarefa", "Ver Tarefas", "Sair"};
        ImageIcon icon = new ImageIcon(AgendaApp.class.getResource("/iconeAgenda.png"));
        int escolha = JOptionPane.showOptionDialog(
                null,
                "AGENDA EM JAVA",
                "Agenda projeto",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                icon,
                opcoes,
                opcoes[0]
        );


        // Processar a escolha do usuário
        switch (escolha) {  
            case 0:
            adicionarTarefa();
            break;
            case 1:
                // Opção "Ver Tarefas"
                // Aqui você pode chamar o código para exibir as tarefas existentes
                JOptionPane.showMessageDialog(null, "Opção selecionada: Ver Tarefas");
                break;
            case 2:
                // Opção "Sair"
                JOptionPane.showMessageDialog(null, "Até logo!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
    // campo de adicionar tarefa, aí voce orienta depois para o tarefa.java

    public static void adicionarTarefa() {
        JTextField nomeField = new JTextField();
        JTextField diaField = new JTextField();
        JTextField mesField = new JTextField();
        JTextField anoField = new JTextField();
        JTextField horaField = new JTextField();
        JTextField minutoField = new JTextField();

        Object[] campos = {
                "Nome da Tarefa:", nomeField,
                "Dia:", diaField,
                "Mês:", mesField,
                "Ano:", anoField,
                "Hora:", horaField,
                "Minuto:", minutoField
        };

        int resultado = JOptionPane.showConfirmDialog(null, campos, "Adicionar Tarefa", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            String nomeTarefa = nomeField.getText();
            int dia = Integer.parseInt(diaField.getText());
            int mes = Integer.parseInt(mesField.getText());
            int ano = Integer.parseInt(anoField.getText());
            int hora = Integer.parseInt(horaField.getText());
            int minuto = Integer.parseInt(minutoField.getText());


        }
    }
}


