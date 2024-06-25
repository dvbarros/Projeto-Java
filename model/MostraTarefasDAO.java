package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
public class MostraTarefasDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/agendatarefas";
    private String username = "root";
    private String password = "admin";

     public void mostraTarefas() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);

            String sql = "SELECT * FROM tarefa";
    
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome_tf = resultSet.getString("nome_tf");
                java.sql.Date data_tf = resultSet.getDate("data_tf");
                java.sql.Time horario_tf = resultSet.getTime("horario_tf");

                String mensagem = String.format("ID: %d, Nome: %s, Data: %s, Horário: %s",
                                                id, nome_tf, data_tf.toString(), horario_tf.toString());
                JOptionPane.showMessageDialog(null, mensagem);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. Fechar conexões, resultSet e statements
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
