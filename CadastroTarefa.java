package controller;
import javax.swing.*;

import java.awt.*;

public class CadastroTarefa extends JFrame {
    private JTextField nomeField, diaField, mesField, horaField, minutoField;

    public CadastroTarefa() {

        setTitle("Cadastro de Tarefas");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
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

        JButton cadastrarTarefaButton = new JButton("Cadastrar Tarefa");
        inputPanel.add(cadastrarTarefaButton, gbc);

        getContentPane().add(inputPanel, BorderLayout.CENTER);
    }
}
