package br.com.alura.shoppingcart.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    private double limit;
    private double saldo;
    List<Product> productsArray;

    public Card(double limit) {
        this.limit = limit;
        this.saldo = limit;
        this.productsArray = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }

    public boolean compra(Product p) {
        if (p.getPrice() <= limit) {
            limit -= p.getPrice();
            productsArray.add(p);
            System.out.println("Compra realizada!");
            System.out.println("Saldo do cartão: " + this.getLimit());
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    public void menu() {
        String asteriscos = "\n************************";
        System.out.println(asteriscos + "   \nCOMPRAS REALIZADAS:\n");
        Collections.sort(productsArray);
        for (Product product : productsArray) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
        System.out.println(asteriscos);
        System.out.println("\nSaldo do cartão: " + this.getLimit());
    }
}