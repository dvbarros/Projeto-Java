package controller;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JTextField emailField, senhaField;
    public Login(){
        
        setTitle("Login");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(2,2,5,5);

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
        gbc.gridy++;

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy++;

        JButton logarButton = new JButton("Entrar");
        logarButton.setPreferredSize(new Dimension(150, 30));
        inputPanel.add(logarButton, gbc);

        gbc.gridy++;

        JButton cadastrarUsuarioButton = new JButton("Cadastrar");
        cadastrarUsuarioButton.setPreferredSize(new Dimension(150, 30));
        inputPanel.add(cadastrarUsuarioButton, gbc);

       

        

        getContentPane().add(inputPanel, BorderLayout.CENTER);
    }
}
