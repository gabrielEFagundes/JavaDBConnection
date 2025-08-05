package com.connection.dao;

import com.connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class OrderDAO {

    public void insert(String cliente, Date data_pedido, double total){
        String query = "INSERT INTO pedidos (cliente, data_pedido, total) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, cliente);
            stmt.setDate(2, data_pedido);
            stmt.setDouble(3, total);
            stmt.executeUpdate();

            System.out.println("\nOrder successfully added to the database.");

        }catch(SQLException error){
            error.printStackTrace();
        }

    }

}