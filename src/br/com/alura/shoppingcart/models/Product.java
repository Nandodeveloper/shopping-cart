package br.com.alura.shoppingcart.models;

import java.util.ArrayList;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    ArrayList<Product> productsArray = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void menu() {
        String asteriscos = "************************";
        System.out.println(asteriscos + "   \nCOMPRAS REALIZADAS:\n\n");
        for (Product product : productsArray) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
        System.out.println();
        System.out.println();
        System.out.println(asteriscos);
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() > o.getPrice()) {
            return -1;
        } else if (this.getPrice() < o.getPrice()){
            return 1;
        } else {
            return 0;
        }
    }
}
