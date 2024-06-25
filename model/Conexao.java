package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/agendatarefas";
        String username = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Conexão bem sucedida!");
            // Aqui você pode realizar operações no banco de dados
        } catch (SQLException e) {
            System.out.println("Falha ao executar conexão.");
            e.printStackTrace();
        }
    }
}
