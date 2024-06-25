package controller;

import javax.swing.*;

import model.CadastraTarefaDAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTarefa extends JFrame {
    public JTextField nomeField, diaField, horaField;

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
        inputPanel.add(new JLabel("Data da Tarefa:"), gbc);
        gbc.gridy++;
        diaField = new JTextField(20);
        inputPanel.add(diaField, gbc);

        gbc.gridy++;
        inputPanel.add(new JLabel("Horário da Tarefa:"), gbc);
        gbc.gridy++;
        horaField = new JTextField(20);
        inputPanel.add(horaField, gbc);

        gbc.gridy++;
        
        JButton cadastrarTarefaButton = new JButton("Cadastrar Tarefa");
        cadastrarTarefaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarTarefa();
            }
        });
        inputPanel.add(cadastrarTarefaButton, gbc);

        getContentPane().add(inputPanel, BorderLayout.CENTER);
    }

    //Método que irá cadastrar a tarefa
    private void cadastrarTarefa() {
        String nomeTarefa = nomeField.getText();
        String dataTarefa = diaField.getText();
        String horarioTarefa = horaField.getText();

        CadastraTarefaDAO dao = new CadastraTarefaDAO();
        boolean sucesso = dao.inserirTarefa(nomeTarefa, dataTarefa, horarioTarefa);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Tarefa cadastrada com sucesso!");
            // Limpar os campos após o cadastro
            nomeField.setText("");
            diaField.setText("");
            horaField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar tarefa.");
        }
    }
}
