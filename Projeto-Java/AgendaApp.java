import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AgendaApp extends JFrame {
    private ArrayList<Tarefa> agenda;
    private JTextField nomeField, diaField, mesField, horaField, minutoField;
    private JTextArea tarefasTextArea;

    public AgendaApp() {
        agenda = new ArrayList<>();

        setTitle("Agenda de Tarefas");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(new JLabel("Nome da Tarefa:"));
        nomeField = new JTextField();
        inputPanel.add(nomeField);

        inputPanel.add(new JLabel("Dia da Tarefa:"));
        diaField = new JTextField();
        inputPanel.add(diaField);

        inputPanel.add(new JLabel("Mês da Tarefa:"));
        mesField = new JTextField();
        inputPanel.add(mesField);

        inputPanel.add(new JLabel("Hora da Tarefa:"));
        horaField = new JTextField();
        inputPanel.add(horaField);

        inputPanel.add(new JLabel("Minuto da Tarefa:"));
        minutoField = new JTextField();
        inputPanel.add(minutoField);

        JButton cadastrarButton = new JButton("Cadastrar Tarefa");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarTarefa();
            }
        });
        inputPanel.add(cadastrarButton);

        add(inputPanel, BorderLayout.NORTH);

        tarefasTextArea = new JTextArea();
        tarefasTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(tarefasTextArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void cadastrarTarefa() {
        try {
            String nome = nomeField.getText();
            int dia = Integer.parseInt(diaField.getText());
            int mes = Integer.parseInt(mesField.getText());
            int hora = Integer.parseInt(horaField.getText());
            int minuto = Integer.parseInt(minutoField.getText());

            Tarefa novaTarefa = new Tarefa(nome, dia, mes, hora, minuto);
            agenda.add(novaTarefa);
            atualizarListaTarefas();
            limparCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarListaTarefas() {
        tarefasTextArea.setText("");
        for (Tarefa tarefa : agenda) {
            tarefasTextArea.append(tarefa.toString() + "\n");
        }
    }

    private void limparCampos() {
        nomeField.setText("");
        diaField.setText("");
        mesField.setText("");
        horaField.setText("");
        minutoField.setText("");
    }

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

