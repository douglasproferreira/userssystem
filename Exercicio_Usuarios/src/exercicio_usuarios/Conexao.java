/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    protected Connection Conecta() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/banco_users";
        String user = "root";
        String pass = "";

        try {
            Class.forName(driver);
            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro na classe de conexão: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro na conexão: " + ex.getMessage());
        }
        return null;
    }
}

