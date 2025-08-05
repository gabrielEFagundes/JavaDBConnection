package com.connection.dao;

import com.connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    public void insert(String nome, String matricula, String curso){
        String query = "INSERT INTO users (nome, matricula, curso) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, nome);
            stmt.setString(2, matricula);
            stmt.setString(3, curso);
            stmt.executeUpdate();

            System.out.println("\nUser successfully added.");

        }catch(SQLException error){
            error.printStackTrace();
        }
    }
}