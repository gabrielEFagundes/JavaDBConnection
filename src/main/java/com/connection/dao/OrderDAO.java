package com.connection.dao;

import com.connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class OrderDAO {

    public void insert(String cliente, Date data_pedido, double total){
        String query = "INSERT INTO Pedidos (cliente, data_pedido, total) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, cliente);
            stmt.setDate(2, data_pedido);
            stmt.setDouble(3, total);
            stmt.executeUpdate();

            System.out.println("\nPedido adicionado com sucesso!");

        }catch(SQLException error){
            error.printStackTrace();
        }
    }

    public void update(int id, double total){
        String query = "UPDATE pedidos SET total = ? WHERE id = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setDouble(1, total);
            stmt.setInt(2, id);
            stmt.executeUpdate();

            System.out.println("\nPedido atualizado com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(int id){
        String query = "DELETE * FROM Pedidos WHERE id = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.err.println("\nPedido deletado com sucesso.");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}