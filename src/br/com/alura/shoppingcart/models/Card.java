package br.com.alura.shoppingcart.models;

public class Card {
    private String user;
    private double limit;

    public Card(String user) {
        this.user = user;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public void compra(double value) {
        limit -= value;
    }
}