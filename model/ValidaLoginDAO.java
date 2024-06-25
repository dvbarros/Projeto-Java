package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ValidaLoginDAO {
        
    private String jdbcURL = "jdbc:mysql://localhost:3306/agendatarefas";
    private String username = "root";
    private String password = "admin";
        
    public boolean validaLogin(String email, String senha){
        try {
            Connection conexao = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT email, senha FROM cliente WHERE email = ? AND senha = ?";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);

             ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                rs.close();
                stmt.close();
                conexao.close();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Email ou senha incorretos.");
                rs.close();
                stmt.close();
                conexao.close();
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + ex.getMessage());
            return false;
        }
    }   
}
