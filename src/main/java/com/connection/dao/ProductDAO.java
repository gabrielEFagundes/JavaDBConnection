package com.connection.dao;

import com.connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {

    public void insert(String nome, double preco, int quantidade){
        String query = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, nome);
            stmt.setDouble(2, preco);
            stmt.setInt(3, quantidade);
            stmt.executeUpdate();

            System.out.println("\nProduct successfully added.");

        }catch(SQLException error){
            error.printStackTrace();
        }
    }

}
