package com.connection;

import com.connection.dao.*;
import com.connection.model.*;
import com.connection.view.ViewPanel;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ViewPanel view = new ViewPanel();
        UserDAO userDao = new UserDAO();
        ProductDAO productDao = new ProductDAO();
        OrderDAO orderDao = new OrderDAO();
        LivroDAO livroDao = new LivroDAO();
        FuncionarioDAO funcionarioDao = new FuncionarioDAO();

        int option, insert, update, delete, list;

        do {
            option = view.mainMenu();

            switch (option){
                case 1:
                    insert = view.insertMenu();
                    switch(insert) {
                        case 1 -> {
                            User user = view.insertUser();

                            userDao.insert(user.getNome(), user.getEmail(), user.getCurso(), user.getMatricula());
                        }
                        case 2 -> {
                            Product product = view.insertProduct();

                            productDao.insert(product.getNome(), product.getPreco(), product.getQuantidade());
                        }
                        case 3 -> {
                            Order order = view.insertOrder();

                            orderDao.insert(order.getCliente(), order.getData_pedido(), order.getTotal());
                        }
                        case 4 -> {
                            Livro livro = view.insertLivro();

                            livroDao.insert(livro.getTitulo(), livro.getAutor(), livro.getAno_publicacao());
                        }
                        case 5 -> {
                            Funcionario funcionario = view.insertFuncionario();

                            funcionarioDao.insert(funcionario.getNome(), funcionario.getCargo(), funcionario.getSalario());
                        }
                    }
                    break;

                case 2:
                    update = view.updateMenu();

                    switch (update){
                        case 1 -> {
                            User user = view.updateUser();

                            userDao.update(user.getCurso(), user.getMatricula());
                        }
                        case 2 -> {
                            Product product = view.updateProduct();

                            productDao.update(product.getPreco(), product.getNome());
                        }
                        case 3 -> {
                            Order order = view.updateOrder();

                            orderDao.update(order.getId(), order.getTotal());
                        }
                        case 4 -> {
                            Livro livro = view.updateLivro();

                            livroDao.update(livro.getTitulo(), livro.getAutor());
                        }
                        case 5 -> {
                            Funcionario funcionario = view.updateFuncionario();

                            funcionarioDao.update(funcionario.getNome(), funcionario.getSalario());
                        }
                    }
                    break;

                case 3:
                    delete = view.deleteMenu();

                    switch (delete){
                        case 1 -> {
                            String nome = view.deleteUser();

                            userDao.delete(nome);
                        }
                        case 2 -> {
                            String nome = view.deleteProduct();

                            productDao.delete(nome);
                        }
                        case 3 -> {
                            int id = view.deleteOrder();

                            orderDao.delete(id);
                        }
                        case 4 -> {
                            String titulo = view.deleteLivro();

                            livroDao.delete(titulo);
                        }
                        case 5 -> {
                            String nome = view.deleteFuncionario();

                            funcionarioDao.delete(nome);
                        }
                    }
                    break;

                case 4:
                    list = view.listMenu();

                    switch(list){
                        case 1 -> {
                            List<User> usuarios = userDao.listAll();

                            for(User usuario : usuarios){
                                view.find(usuario);
                            }
                        }
                        case 2 -> {
                            List<User> usuarios = userDao.listById(view.findId());

                            for(User usuario : usuarios){
                                view.find(usuario);
                            }
                        }
                        case 3 -> {
                            String email = view.findDomain();
                            String domain = Main.separateDomain(email);

                            List<User> usuarios = userDao.findByDomain(domain);

                            for(User usuario : usuarios){
                                view.find(usuario);
                            }
                        }
                        case 4 -> {
                            int amount = userDao.findAmount();

                            view.findAmount(amount);
                        }
                    }
            }
        }while(option != 0);
    }
    // lots of fun!
    public static String separateDomain(String email){
        String onlyName = "", onlyDomain = "";
        char[] stringChars = email.toCharArray();
        for(int i = stringChars.length - 1; i == 0; i--){
            if(stringChars[i] != '@'){
                onlyDomain = onlyDomain + stringChars[i];
                stringChars[i] = ' ';
            }else{
                onlyDomain = onlyDomain + stringChars[i];
                stringChars[i] = ' ';
                break;
            }
        }
        return onlyDomain;
    }
}