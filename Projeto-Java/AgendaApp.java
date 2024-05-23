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
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(2,2,5,2);

        inputPanel.add(new JLabel("Nome da Tarefa:"), gbc);
        gbc.gridy++;
        nomeField = new JTextField(20);
        inputPanel.add(nomeField, gbc);

        gbc.gridy++;
        inputPanel.add(new JLabel("Dia da Tarefa:"), gbc);
        gbc.gridy++;
        diaField = new JTextField(20);
        inputPanel.add(diaField, gbc);

        gbc.gridy++;
        inputPanel.add(new JLabel("Mês da Tarefa:"), gbc);
        gbc.gridy++;
        mesField = new JTextField(20);
        inputPanel.add(mesField, gbc);

        gbc.gridy++;
        inputPanel.add(new JLabel("Hora da Tarefa:"), gbc);
        gbc.gridy++;
        horaField = new JTextField(20);
        inputPanel.add(horaField, gbc);

        gbc.gridy++;
        inputPanel.add(new JLabel("Minuto da Tarefa:"), gbc);
        gbc.gridy++;
        minutoField = new JTextField(20);
        inputPanel.add(minutoField, gbc);

        gbc.gridy++;
        JButton cadastrarButton = new JButton("Cadastrar Tarefa");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarTarefa();
            }
        });
        inputPanel.add(cadastrarButton, gbc);

        gbc.gridy++;
        JButton atualizarButton = new JButton("Atualizar Tarefas");
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarListaTarefas();
            }
        });
        inputPanel.add(atualizarButton, gbc);

        gbc.gridy++;
        JButton limparCamposButton = new JButton("Limpar Campos ");
        limparCamposButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                limparCampos();
            }
        });
        inputPanel.add(limparCamposButton, gbc);

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

