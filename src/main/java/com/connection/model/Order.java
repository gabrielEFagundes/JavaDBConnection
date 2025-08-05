package com.connection.model;

import java.sql.Date;

public class Order {

    private String cliente;
    private Date data_pedido;
    private double total;

    public Order(String cliente, Date data_pedido, double total){
        this.cliente = cliente;
        this.data_pedido = data_pedido;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
