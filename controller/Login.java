package controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ValidaLoginDAO;
import model.MostraTarefasDAO;

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
        logarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validaLoginUsuario();
            }
        });
        inputPanel.add(logarButton, gbc);

        gbc.gridy++;

        JButton cadastrarUsuarioButton = new JButton("Cadastrar");
        cadastrarUsuarioButton.setPreferredSize(new Dimension(150, 30));
        cadastrarUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                levaCadastro();
            }
        });
        inputPanel.add(cadastrarUsuarioButton, gbc);
        
        getContentPane().add(inputPanel, BorderLayout.CENTER);

    }
    private void validaLoginUsuario(){
        String email = emailField.getText();
        String senha = senhaField.getText();

        ValidaLoginDAO dao = new ValidaLoginDAO();
        boolean sucesso = dao.validaLogin(email, senha);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
            // Redirecionar para a página de cadastro de tarefas (ainda não implementado)
            abrirPaginaCadastroTarefas();
        } else {
            JOptionPane.showMessageDialog(this, "Email ou senha incorretos.");
        }
    }
    private void abrirPaginaCadastroTarefas() {
            CadastroTarefa gui = new CadastroTarefa();
            gui.setVisible(true);
    }
    private void levaCadastro(){
        CadastroUsuario gui = new CadastroUsuario();
        gui.setVisible(true);
    }
}
