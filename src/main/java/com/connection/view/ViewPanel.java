package com.connection.view;

import com.connection.model.*;

import java.sql.Date;
import java.util.Scanner;

public class ViewPanel {

    static Scanner scan = new Scanner(System.in);
    User user;
    Product product;
    Order order;
    Livro livro;
    Funcionario funcionario;

    public int mainMenu(){
        System.out.print("\n\n--------Menu--------" +
                "\n1- Insert" +
                "\n2- Update" +
                "\n3- Delete" +
                "\n4- Search" +
                "\n-> ");

        return scan.nextInt();
    }

    public int insertMenu(){
        System.out.print("\n--------Menu--------" +
                "\n1- Inserir Usuário" +
                "\n2- Inserir Produto" +
                "\n3- Inserir Pedido" +
                "\n4- Inserir Livro" +
                "\n5- Inserir Funcionário" +
                "\n-> ");

        return scan.nextInt();
    }

    public int updateMenu(){
        System.out.print("\n--------Menu--------" +
                "\n1- Atualizar curso por matrícula" +
                "\n2- Atualizar preço por ID" +
                "\n3- Atualizar total por ID" +
                "\n4- Atualizar autor por título" +
                "\n5- Atualizar salário por nome" +
                "\n-> ");

        return scan.nextInt();
    }

    public int deleteMenu(){
        System.out.print("\n--------Menu--------" +
                "\n1- Deletar Usuário" +
                "\n2- Deletar Produto" +
                "\n3- Deletar Pedido" +
                "\n4- Deletar Livro" +
                "\n5- Deletar Funcionário" +
                "\n-> ");

        return scan.nextInt();
    }

    public int listMenu(){
        System.out.print("\n--------Menu--------" +
                "\n1- Listar Usuários" +
                "\n2- Buscar Usuário por ID" +
                "\n3- Filtrar Usuários por domínio de Email" +
                "\n4- Contar quantidade de Usuários cadastrados" +
                "\n-> ");

        return scan.nextInt();
    }

    public User insertUser(){
        scan.nextLine();

        System.out.print("\nDigite o nome do usuário: ");
        String nome = scan.nextLine();

        System.out.print("\nDigite o email do usuário: ");
        String email = scan.nextLine();

        System.out.print("\nDigite a matrícula: ");
        String matricula = scan.nextLine();

        System.out.print("\nDigite o curso: ");
        String curso = scan.nextLine();

        user = new User(0, nome, email, matricula, curso);

        return user;
    }

    public User updateUser(){
        scan.nextLine();

        System.out.print("\nDigite a matrícula: ");
        String matricula = scan.nextLine();

        System.out.print("\nDigite o novo curso: ");
        String novoCurso = scan.nextLine();

        return new User(0, null, null, novoCurso, matricula);
    }

    public String deleteUser(){
        scan.nextLine();

        System.out.print("\nDigite o nome do usuário que deseja excluir: ");
        return scan.nextLine();
    }

    public int findId(){
        scan.nextLine();

        System.out.print("\nDigite o ID do usuário que você deseja: ");
        return scan.nextInt();
    }
    public String findDomain(){
        scan.nextLine();

        System.out.print("\nDigite o email do usuário que deseja: ");
        return scan.nextLine();
    }

    public void findAmount(int amount){
        System.out.print("\nQuantidade de itens cadastrados: " + amount);
    }

    public void find(User usuario){
        System.out.print("\n" + usuario.getId() + " -> " + usuario.getNome() + " | " + usuario.getEmail() + " | " + usuario.getCurso() + " | " + usuario.getMatricula());
    }

    public Product insertProduct(){
        scan.nextLine();

        System.out.print("\nDigite o nome do produto: ");
        String nome = scan.nextLine();

        System.out.print("\nDigite o preço: ");
        double preco = scan.nextDouble();

        System.out.print("\nDigite a quantidade: ");
        int quantidade = scan.nextInt();

        product = new Product(nome, preco, quantidade);

        return product;
    }

    public Product updateProduct(){
        scan.nextLine();

        System.out.print("\nDigite o nome para atualizar o produto: ");
        String nome = scan.nextLine();

        System.out.print("\nDigite o novo preço: ");
        double novoPreco = scan.nextDouble();

        return new Product(nome, novoPreco, 0);
    }

    public String deleteProduct(){
        scan.nextLine();

        System.out.print("\nDigite o nome do produto que deseja deletar: ");
        return scan.nextLine();
    }

    public Order insertOrder(){
        scan.nextLine();

        System.out.print("\nDigite o nome do pedido: ");
        String nome = scan.nextLine();

        System.out.print("\nDigite a data do pedido: ");
        String data_pedido = scan.next();

        System.out.print("\nDigite o total: ");
        double total = scan.nextDouble();

        Date dataFinal = Date.valueOf(data_pedido);
        order = new Order(0, nome, dataFinal, total);

        return order;
    }

    public Order updateOrder(){
        scan.nextLine();

        System.out.print("\nDigite o ID do pedido: ");
        int id = scan.nextInt();

        System.out.print("\nDigite o novo total: ");
        double novoTotal = scan.nextDouble();

        return new Order(id, null, null, novoTotal);
    }

    public int deleteOrder(){
        scan.nextLine();

        System.out.print("\nDigite o id do pedido que deseja deletar: ");
        return scan.nextInt();
    }

    public Livro insertLivro(){
        scan.nextLine();

        System.out.print("\nDigite o autor do livro: ");
        String autor = scan.nextLine();

        System.out.print("\nDigite o título do livro: ");
        String titulo = scan.nextLine();

        System.out.print("\nDigite a data de publicação do livro (yyyy-mm-dd): ");
        int publicacao = scan.nextInt();

        livro = new Livro(titulo, autor, publicacao);

        return livro;
    }

    public Livro updateLivro(){
        scan.nextLine();

        System.out.print("\nDigite o título do livro: ");
        String titulo = scan.nextLine();

        System.out.print("\nDigite o novo autor do livro: ");
        String novoAutor = scan.nextLine();

        return new Livro(titulo, novoAutor, 0);
    }

    public String deleteLivro(){
        scan.nextLine();

        System.out.print("\nDigite o título do livro para deletar: ");
        return scan.nextLine();
    }

    public Funcionario insertFuncionario(){
        scan.nextLine();

        System.out.print("\nDigite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.print("\nDigite o cargo do funcionário: ");
        String cargo = scan.nextLine();

        System.out.print("\nDigite o salário do funcionário: ");
        double salario = scan.nextDouble();

        funcionario = new Funcionario(nome, cargo, salario);

        return funcionario;
    }

    public Funcionario updateFuncionario(){
        scan.nextLine();

        System.out.print("\nDigite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.print("\nDigite o novo salário: ");
        double novoSalario = scan.nextDouble();

        return new Funcionario(nome, null, novoSalario);
    }

    public String deleteFuncionario(){
        scan.nextLine();

        System.out.print("\nDigite o nome do funcionário que deseja deletar: ");
        return scan.nextLine();
    }
}