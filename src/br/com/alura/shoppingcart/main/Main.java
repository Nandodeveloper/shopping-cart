package br.com.alura.shoppingcart.main;

import br.com.alura.shoppingcart.models.Card;
import br.com.alura.shoppingcart.models.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do cartão");
        double limit = scanner.nextDouble();
        Card card = new Card(limit);
        double resposta = 1;
        while (resposta != 0) {

            System.out.println("Digite a descrição da compra");
            String descricao = scanner.next();
            System.out.println("Digite o valor da compra.");
            double price = scanner.nextDouble();
            Product product = new Product(descricao, price);
            boolean compra = card.compra(product);
            if (compra == false) {
                break;
            }
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
        card.menu();
    }
}