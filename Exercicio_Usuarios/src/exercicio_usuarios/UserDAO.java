/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_usuarios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dougl
 */
public class UserDAO {

    private Conexao conn;

    public UserDAO() {
        conn = new Conexao();
    }

    public void insere(User user) {
        String sql = "INSERT into user values (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = conn.Conecta().prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSobrenome());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getTelefone());
            stmt.setString(5, user.getTipo());
            stmt.setString(6, user.getUser());
            stmt.setString(7, user.getPass());
            stmt.setInt(8, user.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    public ResultSet seleciona(User user) {
        String sql = "SELECT * from user WHERE id=?";
        PreparedStatement stmt;
        try {
            stmt = conn.Conecta().prepareStatement(sql);
            stmt.setInt(1, user.getId());
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return null;
    }

    public void altera(User user) {
        String sql = "UPDATE user set nome=? , sobrenome=?, email=?, telefone=?, tipo=?, user=?, pass=? where id=?";
        PreparedStatement stmt;
        try {
            stmt = conn.Conecta().prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSobrenome());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getTelefone());
            stmt.setString(5, user.getTipo());
            stmt.setString(6, user.getUser());
            stmt.setString(7, user.getPass());
            stmt.setInt(8, user.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    public void remove(User user) {
        String sql = "DELETE from user where id=?";
        PreparedStatement stmt;
        try {
            stmt = conn.Conecta().prepareStatement(sql);
            stmt.setInt(1, user.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
