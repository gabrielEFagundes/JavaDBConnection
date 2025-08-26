package com.connection.dao;

import com.connection.Conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {

    public void insert(String titulo, String autor, int ano_publicacao){
        String query = "INSERT INTO Livros (titulo, autor, ano_publicacao) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, titulo);
            stmt.setString(2, autor);
            stmt.setInt(3, ano_publicacao);
            stmt.executeUpdate();

            System.out.println("\nLivro adicionado com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void update(String titulo, String autor){
        String query = "UPDATE Livros SET autor = ? WHERE titulo = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, autor);
            stmt.setString(2, titulo);
            stmt.executeUpdate();

            System.out.println("\nLivro atualizado com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(String titulo){
        String query = "DELETE * FROM Livros WHERE nome = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, titulo);
            stmt.executeUpdate();

            System.err.println("\nLivro deletado com sucesso.");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
