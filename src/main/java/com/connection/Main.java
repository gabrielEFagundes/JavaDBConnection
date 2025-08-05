package com.connection;

import com.connection.dao.*;
import com.connection.model.*;
import com.connection.view.ViewPanel;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ViewPanel view = new ViewPanel();
        UserDAO userDao = new UserDAO();
        ProductDAO productDao = new ProductDAO();
        OrderDAO orderDao = new OrderDAO();

        int option;

        do {
            option = view.mainMenu();

            switch (option){
                case 1 -> {
                    User user = view.insertUser();

                    userDao.insert(user.getNome(), user.getMatricula(), user.getCurso());
                }
                case 2 -> {
                    Product product = view.insertProduct();

                    productDao.insert(product.getNome(), product.getPreco(), product.getQuantidade());
                }
                case 3 -> {
                    Order order = view.insertOrder();

                    orderDao.insert(order.getCliente(), order.getData_pedido(), order.getTotal());
                }
            }
        }while(option != 0);
    }
}