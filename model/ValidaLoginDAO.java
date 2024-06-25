package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ValidaLoginDAO {
        public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/agendatarefas";
        String username = "root";
        String password = "admin";

        try {
            Connection conexao = DriverManager.getConnection(jdbcURL, username, password);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
