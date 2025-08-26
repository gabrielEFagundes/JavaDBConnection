package com.connection.dao;

import com.connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {

    public void insert(String nome, String cargo, double salario){
        String query = "INSERT INTO Funcionarios (nome, cargo, salario) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, nome);
            stmt.setString(2, cargo);
            stmt.setDouble(3, salario);
            stmt.executeUpdate();

            System.out.println("\nFuncionário adicionando com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void update(String nome, double salario){
        String query = "UPDATE Funcionarios SET salario = ? WHERE nome = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setDouble(1, salario);
            stmt.setString(2, nome);
            stmt.executeUpdate();

            System.out.println("\nFuncionário atualizado com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(String nome){
        String query = "DELETE * FROM Funcionarios WHERE nome = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, nome);
            stmt.executeUpdate();

            System.err.println("\nFuncionário deletado com sucesso.");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
