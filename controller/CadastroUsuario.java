package controller;
import javax.swing.*;

import model.CadastraUsuarioDAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuario extends JFrame {
    private JTextField nomeField, emailField, senhaField;
    public CadastroUsuario(){

        setTitle("Cadastro de Usuário");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(2,2,5,2);

        inputPanel.add(new JLabel("Nome:"), gbc);
        gbc.gridy++;
        nomeField = new JTextField(20);
        inputPanel.add(nomeField, gbc);

        gbc.gridy++;
        inputPanel.add(new JLabel("E-mail:"), gbc);
        gbc.gridy++;
        emailField = new JTextField(20);
        inputPanel.add(emailField, gbc);

        gbc.gridy++;
        inputPanel.add(new JLabel("Senha:"), gbc);
        gbc.gridy++;
        senhaField = new JTextField(20);
        inputPanel.add(senhaField, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy++;

        JButton cadastrarUsuarioButton = new JButton("Cadastrar");
        cadastrarUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });
        inputPanel.add(cadastrarUsuarioButton, gbc);

        getContentPane().add(inputPanel, BorderLayout.CENTER);
    }

    private void cadastrarUsuario(){
        String nome = nomeField.getText();
        String email = emailField.getText();
        String senha = senhaField.getText();

        CadastraUsuarioDAO dao = new CadastraUsuarioDAO();
        boolean sucesso = dao.inserirUsuario(nome, email, senha);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
            // Limpar os campos após o cadastro
            nomeField.setText("");
            emailField.setText("");
            senhaField.setText("");

            abrirPaginaCadastroTarefas();
            
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário.");
        }
    }
    private void abrirPaginaCadastroTarefas() {
        CadastroTarefa gui = new CadastroTarefa();
        gui.setVisible(true);
}

}
