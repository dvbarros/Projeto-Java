package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CadastraUsuarioDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/agendatarefas";
    private String username = "root";
    private String password = "admin";

    public boolean inserirUsuario(String nome, String email, String senha){
        try {
            Connection conexao = DriverManager.getConnection(jdbcURL, username, password);

            String sql = "INSERT INTO cliente (nome, email, senha) values (?, ?, ?)";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, senha);

            int linhasAfetadas = stmt.executeUpdate();
            stmt.close();
            conexao.close();

            return linhasAfetadas > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + ex.getMessage());
            return false;
        }
    }
}
