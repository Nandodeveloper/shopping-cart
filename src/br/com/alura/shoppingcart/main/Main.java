package br.com.alura.shoppingcart.main;

import br.com.alura.shoppingcart.models.Card;
import br.com.alura.shoppingcart.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> productsArray = new ArrayList<>();


        Card card = new Card("Fernando");
        System.out.println("Digite o limite do cartão");
        double limit = scanner.nextDouble();
        card.setLimit(limit);
        double resposta = -1;
        while (resposta != 0) {
            Product product = new Product();
            System.out.println("Digite a descrição da compra");
            String descricao = scanner.next();
            product.setName(descricao);
            System.out.println("Digite o valor da compra.");
            double price = scanner.nextDouble();
            if (price > card.getLimit()) {
                System.out.println("Saldo insuficiente!");
                break;
            }
            product.setPrice(price);
            productsArray.add(product);
            card.compra(product.getPrice());
            System.out.println("Compra realizada!");
            System.out.println("Digite 0 para sair ou 1 para continuar");
            resposta = scanner.nextInt();
            if (resposta == 0) {
                break;
            } else if (resposta == 1) {
                continue;
            } else {
                System.out.println("Digite um comando valido.");
            }
        }
        String asteriscos = "************************";
        System.out.println(asteriscos + "   \nCOMPRAS REALIZADAS:\n");
        Collections.sort(productsArray);
        for (Product p : productsArray) {
            System.out.println("br.com.alura.shoppingcart.models.Product: " + p.getName() + " (" + p.getPrice() + ")");
        }
        System.out.println();
        System.out.println(asteriscos);
        System.out.println("\nSaldo do cartão: " + card.getLimit());
    }
}