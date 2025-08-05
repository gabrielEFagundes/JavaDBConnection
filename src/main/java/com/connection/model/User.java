package com.connection.model;

public class User {

    private String nome;
    private String curso;
    private String matricula;

    public User(String nome, String curso, String matricula){
        this.nome = nome;
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
}
