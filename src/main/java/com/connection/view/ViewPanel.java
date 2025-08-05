package com.connection.view;

import com.connection.model.*;

import java.sql.Date;
import java.util.Scanner;

public class ViewPanel {

    static Scanner scan = new Scanner(System.in);
    User user;
    Product product;
    Order order;

    public int mainMenu(){
        System.out.print("\n--------Menu--------" +
                "\n1- Insert User" +
                "\n2- Insert Product" +
                "\n3- Insert Order" +
                "\n-> ");

        return scan.nextInt();
    }

    public User insertUser(){
        scan.nextLine();

        System.out.print("\nType in the name of the user: ");
        String nome = scan.nextLine();

        System.out.print("\nType in the user's enrollment: ");
        String email = scan.nextLine();

        System.out.print("\nType in the user's coarse: ");
        String curso = scan.nextLine();

        user = new User(nome, email, curso);

        return user;
    }

    public Product insertProduct(){
        scan.nextLine();

        System.out.print("\nType in the name of the product: ");
        String nome = scan.nextLine();

        System.out.print("\nType in the price of the product: ");
        double preco = scan.nextDouble();

        System.out.print("\nType in the amount of the product: ");
        int quantidade = scan.nextInt();

        product = new Product(nome, preco, quantidade);

        return product;
    }

    public Order insertOrder(){
        scan.nextLine();

        System.out.print("\nType in the name of the customer: ");
        String nome = scan.nextLine();

        System.out.print("\nType in the date of the order (yyyy-MM-dd): ");
        String data_pedido = scan.next();

        System.out.print("\nType in the total of the order: ");
        double total = scan.nextDouble();

        Date dataFinal = Date.valueOf(data_pedido);
        order = new Order(nome, dataFinal, total);

        return order;
    }

}
