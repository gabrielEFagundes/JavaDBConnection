package com.connection.dao;

import com.connection.Conexao;
import com.connection.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    List<User> usuarios = new ArrayList<>();

    public void insert(String nome, String email, String matricula, String curso){
        String query = "INSERT INTO Usuarios (nome, email, matricula, curso) VALUES (?, ?, ?, ?)";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, matricula);
            stmt.setString(4, curso);
            stmt.executeUpdate();

            System.out.println("\nUsuário adicionado com sucesso!");

        }catch(SQLException error){
            error.printStackTrace();
        }
    }

    public void update(String curso, String matricula){
        String query = "UPDATE Usuarios SET curso = ? WHERE matricula = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, curso);
            stmt.setString(2, matricula);
            stmt.executeUpdate();

            System.out.print("\nCurso atualizado com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(String matricula){
        String query = "DELETE * FROM Usuarios WHERE nome = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, matricula);
            stmt.executeUpdate();

            System.err.println("\nUsuário deletado com sucesso.");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<User> listAll(){
        usuarios.clear(); // só pra nao dar dor de cabeca
        String query = "SELECT * FROM Usuarios";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String curso = rs.getString("curso");
                String matricula = rs.getString("matricula");

                User user = new User(id, nome, email, curso, matricula);
                usuarios.add(user);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return usuarios;
    }

    public List<User> listById(int id){
        usuarios.clear();
        String query = "SELECT * FROM Usuarios WHERE id = ?";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String curso = rs.getString("curso");
                String matricula = rs.getString("matricula");

                User usuario = new User(id, nome, email, curso, matricula);
                usuarios.add(usuario);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return usuarios;
    }

    // gotta make this work
    public List<User> findByDomain(String domain){
        usuarios.clear();
        String query = "SELECT * FROM Usuarios WHERE email LIKE '%?%'";

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, domain);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String curso = rs.getString("curso");
                String matricula = rs.getString("matricula");

                User usuario = new User(id, nome, email, curso, matricula);
                usuarios.add(usuario);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return usuarios;
    }

    public int findAmount(){
        String query = "SELECT COUNT(*) from Usuarios";
        int amount = 0;

        try(Connection conn = Conexao.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                amount = rs.getInt(1);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return amount;
    }
}