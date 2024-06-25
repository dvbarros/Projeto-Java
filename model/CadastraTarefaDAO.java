package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class CadastraTarefaDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/agendatarefas";
    private String username = "root";
    private String password = "admin";

    public boolean inserirTarefa(String nomeTarefa, String dataTarefa, String horarioTarefa) {
        try {
            Connection conexao = DriverManager.getConnection(jdbcURL, username, password);

            String sql = "INSERT INTO tarefa (nome_tf, data_tf, horario_tf) VALUES (?, ?, ?)";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nomeTarefa);
            stmt.setString(2, dataTarefa);
            stmt.setString(3, horarioTarefa);

            int linhasAfetadas = stmt.executeUpdate();
            stmt.close();
            conexao.close();

            return linhasAfetadas > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + ex.getMessage());
            return false;
        }
    }
}
