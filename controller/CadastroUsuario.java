package controller;
import javax.swing.*;

import java.awt.*;

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
        inputPanel.add(cadastrarUsuarioButton, gbc);

        getContentPane().add(inputPanel, BorderLayout.CENTER);
    }

}
