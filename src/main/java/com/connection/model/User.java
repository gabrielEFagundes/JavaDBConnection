package com.connection.model;

public class User {

    private int id;
    private String nome;
    private String email;
    private String curso;
    private String matricula;

    public User(int id, String nome, String email, String curso, String matricula){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.matricula = matricula;
    }

    public User(){
        this.nome = null;
        this.curso = null;
        this.matricula = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
